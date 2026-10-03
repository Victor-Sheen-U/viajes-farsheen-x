package com.eam.viajes_farsheen.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "API REST Sistema de Gestion de Reservas - Viajes Farsheen",
                version = "1.0.0",
                description = "Documentacion interactiva de los endpoints para administracion de viajes, clientes, destinos y reservas turisticas.",
                contact = @Contact(
                        name = "Victor Sheen - EAM",
                        email = "arias.victor.9253@eam.edu.co"
                )
        ),
        servers = {
                @Server(
                        url = "https://dev.api.viajes-farsheen.com",
                        description = "Entorno de Desarrollo"
                ),
                @Server(
                        url = "https://staging.api.viajes-farsheen.com",
                        description = "Entorno de Staging"
                ),
                @Server(
                        url = "https://api.viajes-farsheen.com",
                        description = "Entorno de Producción"
                ),
                @Server(
                        url = "http://localhost:8080",
                        description = "Servidor Local"
                )
        }
)
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new io.swagger.v3.oas.models.info.Info()
                        .title("API REST Sistema de Gestion de Reservas - Viajes Farsheen")
                        .version("1.0.0")
                        .description("Documentacion interactiva de los endpoints para administracion de viajes, clientes, destinos y reservas turisticas.")
                        .contact(new io.swagger.v3.oas.models.info.Contact()
                                .name("Victor Sheen - EAM")
                                .email("arias.victor.9253@eam.edu.co")))
                .servers(List.of(
                        new io.swagger.v3.oas.models.servers.Server()
                                .url("https://dev.api.viajes-farsheen.com")
                                .description("Entorno de Desarrollo"),
                        new io.swagger.v3.oas.models.servers.Server()
                                .url("https://staging.api.viajes-farsheen.com")
                                .description("Entorno de Staging"),
                        new io.swagger.v3.oas.models.servers.Server()
                                .url("https://api.viajes-farsheen.com")
                                .description("Entorno de Producción"),
                        new io.swagger.v3.oas.models.servers.Server()
                                .url("http://localhost:8080")
                                .description("Servidor Local")
                ));
    }
}
