package it.dipendentepubico.CCIS.service.spring;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;

@Configuration("serviceConverterConfig")
public class ConverterConfig {
    private final ListableBeanFactory beanFactory;

    public ConverterConfig(ListableBeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }


    @Bean("serviceConversionService")
    public ConversionService conversionService() {
        LoggerFactory.getLogger(ConverterConfig.class).info("ConversionService bean init");
        final FormattingConversionService service = new DefaultFormattingConversionService();
        ApplicationConversionService.addBeans(service, this.beanFactory);
        return service;
    }
}