package br.com.alurafood.pagamentos.config;

import org.modelmapper.ModelMapper;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.commons.util.InetUtilsProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracao {

    @Bean
    public ModelMapper obterModelMapper() {
        return new ModelMapper();
    }

    @Bean
    public InetUtils inetUtils() {
        return new InetUtils(new InetUtilsProperties());
    }
}
