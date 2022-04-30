package it.dipendentepubico.CCIS.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.dipendentepubico.CCIS.domain.model.*;
import it.dipendentepubico.CCIS.usecase.repository.IAdapterRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.IfProfileValue;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.ws.test.server.MockWebServiceClient;
import org.springframework.xml.transform.StringSource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Source;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.ws.test.server.RequestCreators.withPayload;
import static org.springframework.ws.test.server.ResponseMatchers.payload;

@SpringBootTest
@AutoConfigureMockMvc
class CiccioCappuccioInterexchangeServiceApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	private MockWebServiceClient mockClient;

	@Autowired
	private IAdapterRepository repository;


	@BeforeEach
	public void createClient() {
		mockClient = MockWebServiceClient.createClient(applicationContext);
	}

	@Test
	void mandatoTest()  throws Exception {
		ObjectFactory objectFactory = new ObjectFactory();
		MandatoRequest mandatoRequest = new MandatoRequest();
		MandatoType m1 = objectFactory.createMandatoType();
		MandatoType.Anno anno = objectFactory.createMandatoTypeAnno();
		anno.setOp(OperationNumberEnumType.EQ);
		anno.setValue(new BigInteger("2021"));
		m1.setAnno(anno);
		mandatoRequest.setAnd(new MandatoRequest.And());
		mandatoRequest.getAnd().getMandato().add(m1);
		MandatoType m2 = objectFactory.createMandatoType();
		MandatoType.Codice codice = objectFactory.createMandatoTypeCodice();
		codice.setOp(OperationNumberEnumType.GT);
		codice.setValue(new BigInteger("55"));
		m2.setCodice(codice);
		mandatoRequest.getAnd().getMandato().add(m2);

		mandatoRequest.setOr(new MandatoRequest.Or());
		MandatoType m3 = objectFactory.createMandatoType();
		BeneficiarioType b3 = objectFactory.createBeneficiarioType();
		CodiceFiscaleType cf1 = objectFactory.createCodiceFiscaleType();
		cf1.setOp(OperationStringEnumType.EQ);
		cf1.setValue("RSSMRA80A01H501U");
		b3.setCodiceFiscale(cf1);
		m3.setBeneficiario(b3);
		mandatoRequest.getOr().getMandato().add(m3);

		PagingType pagingType = objectFactory.createPagingType();
		pagingType.setOffset(BigInteger.ZERO);
		pagingType.setPageSize(BigInteger.TEN);
		mandatoRequest.setPaging(pagingType);


		ByteArrayOutputStream baos = getByteArrayOutputStream(mandatoRequest, MandatoRequest.class);


		Source requestPayload = new StringSource(baos.toString());
		Source expectedResponsePayload = new StringSource(
				"<ns2:mandatoResponse xmlns:ns2=\"https://dipendentepubico.it/ccis\">" +
							"<ns2:mandato>" +
								"<ns2:codice>56</ns2:codice>" +
								"<ns2:anno>2021</ns2:anno>" +
							"</ns2:mandato>" +
						"</ns2:mandatoResponse>" );

		mockClient.sendRequest(withPayload(requestPayload))
				.andExpect( (request, response) -> {response.writeTo(System.out);} )
				.andExpect(payload(expectedResponsePayload));
	}

	private ByteArrayOutputStream getByteArrayOutputStream(MandatoRequest mandatoRequest, Class clazz) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance( clazz );
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.marshal(mandatoRequest, System.out );
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		jaxbMarshaller.marshal(mandatoRequest, baos);
		return baos;
	}

}
