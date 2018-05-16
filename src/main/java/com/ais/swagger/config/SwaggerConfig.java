package com.ais.swagger.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurationSupport{
	
	/**
	 * Configurando a gera��o da documenta��o da API utilizando Swagger (Spring Fox).
	 **/
	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.ais.swagger"))
				.paths(regex("/products.*"))
				.build()
				.apiInfo(info());
	}
	
	
	/**
	 * Inserindo as informa��es sobre a API"
	 */
	private ApiInfo info() {
		return new ApiInfoBuilder()
				.title("API")
				.description("API for Stock Online")
				.contact(new Contact("Wallef", "https://github.com/WallefFA", "wallef.fa@gmail.com"))
				.license("Apache License Version 2.0")
				.licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
				.version("1.0.0")
				.build();
				
	}
	
	/**
	 * Configurando p�gina html da documenta��o Swagger.
	 */
	
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
    }
}
