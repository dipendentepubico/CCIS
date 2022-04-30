package it.dipendentepubico.CCIS.usecase.spring;

import it.dipendentepubico.CCIS.usecase.Interpreter;
import it.dipendentepubico.CCIS.usecase.xhmapping.Xml2HQLMapping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.InputStream;

@Configuration
public class UsecaseSpringConfig {
    @Bean
    public Interpreter getInterpreter(){
        return new Interpreter();
    }

    @Bean
    @Scope(value = "singleton")
    public Xml2HQLMapping getXml2HQLMappingYaml(){
        // Transpilazione (???) XML -> HQL
        Yaml yaml = new Yaml(new Constructor(Xml2HQLMapping.class));
        InputStream inputStream = Interpreter.class
                .getClassLoader()
                .getResourceAsStream("Xml2HQLMapping.yaml");
        return yaml.load(inputStream);
    }
}
