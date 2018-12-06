package com.pocketpersonaltrainer.API.config;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
    public Docket pocketPersonalTrainerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.pocketpersonaltrainer.API"))
                .paths(PathSelectors.ant("/pocketPersonalTrainer/*"))
                .build()
                .apiInfo(metaInfo());
    }

	private ApiInfo metaInfo() {
		
		return new ApiInfo(
				"PocketPersonalTrainer API REST",
				"API REST do PocketPersonalTrainer.apk e website ",
                "GitHub",
                "1.0",
                new Contact("Gabriel Luis da Silva", "https://github.com/gabrielluis21", "gabrielluis_21@hotmail.com"),
                "APACHE LICENSE 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                Collections.emptyList()
               );          
    }

	
	
}
