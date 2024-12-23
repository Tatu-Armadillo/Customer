package com.br.fiap.customer.configuration.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Customer")
                        .description("Customer Microservices")
                        .version("v1")
                        .termsOfService("https://github.com/joaoygorr/customer")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://github.com/joaoygorr/customer")));
    }
}
