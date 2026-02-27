package com.harishIT.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenApiConfig {
    @Bean
    OpenAPI bookManagementOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("Book Management REST API")
                        .description("REST API for performing CRUD operations on Book entity")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Chaitanya K")
                                .email("chaitanya@example.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0")))
                .addServersItem(new Server()
                        .url("http://")
                        .description("Local Development Server"));
    }
}
