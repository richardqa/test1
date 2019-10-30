package pe.gob.minsa.mcs.servicio.renhice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import springfox.documentation.spring.web.plugins.Docket;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket defApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("pe.gob.minsa.mcs.servicio.renhice"))
				.paths(regex("/servicio/v1.0.*")).build().apiInfo(metaData());
	}

	private ApiInfo metaData() {
		return new ApiInfoBuilder().title("Microservicio para el registro de Datos Clínicos")
				.description("Api destinada al registro de datos clínicos de un paciente")
				.termsOfServiceUrl("Términos del Servicio").version("1.0")
				.contact(new Contact("Deyvi Daniel. Larico Roman", "www.minsa.gob.pe", "dlarico@minsa.gob.pe"))
				.license("Apache License Version 2.0").licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
				.build();
	}
}
