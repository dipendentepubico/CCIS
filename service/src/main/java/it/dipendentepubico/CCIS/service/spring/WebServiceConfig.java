package it.dipendentepubico.CCIS.service.spring;


import it.dipendentepubico.CCIS.service.endpoint.MandatoEndpoint;
import org.apache.ws.commons.schema.resolver.DefaultURIResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.XsdSchemaCollection;
import org.springframework.xml.xsd.commons.CommonsXsdSchemaCollection;

import static it.dipendentepubico.CCIS.domain.Constants.NAMESPACE_URI;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    @Bean(name = "mandati")
    public DefaultWsdl11Definition defaultWsdl11DefinitionM(XsdSchemaCollection mandatiSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("MandatiPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace(NAMESPACE_URI);
        wsdl11Definition.setSchemaCollection(mandatiSchema());
        return wsdl11Definition;
    }

    @Bean
    @Qualifier("mandatiSchemaCollection")
    public XsdSchemaCollection mandatiSchema() {
        CommonsXsdSchemaCollection commonsXsdSchemaCollection = new CommonsXsdSchemaCollection(new ClassPathResource("mandato.xsd"));
        setCollectionSettings(commonsXsdSchemaCollection);
        return commonsXsdSchemaCollection;
    }

    private void setCollectionSettings(CommonsXsdSchemaCollection commonsXsdSchemaCollection) {
        // solves relative path import
        // Caused by: java.lang.IllegalArgumentException: The resource path [/..common_types.xsd] has been normalized to [null] which is not valid
        commonsXsdSchemaCollection.setUriResolver(new DefaultURIResolver());
        commonsXsdSchemaCollection.setInline(true);
    }

    @Bean(name = "fattureElettroniche")
    public DefaultWsdl11Definition defaultWsdl11DefinitionFE(@Autowired @Qualifier("fattureElettronicheSchemaCollection") XsdSchemaCollection fattureElettronicheSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("FattureElettronichePort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace(NAMESPACE_URI);
        wsdl11Definition.setSchemaCollection(fattureElettronicheSchema);
        return wsdl11Definition;
    }

    @Bean
    @Qualifier("fattureElettronicheSchemaCollection")
    public XsdSchemaCollection fattureElettronicheSchema() {
        CommonsXsdSchemaCollection commonsXsdSchemaCollection = new CommonsXsdSchemaCollection(new ClassPathResource("flusso_sdi.xsd"));
        setCollectionSettings(commonsXsdSchemaCollection);
        return commonsXsdSchemaCollection;
    }
}