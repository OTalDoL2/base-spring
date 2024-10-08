// package com.produtos.apirest.config;

// import java.util.ArrayList;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.context.support.RequestHandledEvent;

// import springfox.documentation.builders.RequestHandlerSelectors;
// import springfox.documentation.service.ApiInfo;
// import springfox.documentation.service.Contact;
// import springfox.documentation.service.Documentation;
// import springfox.documentation.service.VendorExtension;
// import springfox.documentation.spi.DocumentationType;
// import springfox.documentation.spring.web.plugins.Docket;
// import springfox.documentation.swagger2.annotations.EnableSwagger2;

// @Configuration
// @EnableSwagger2
// public class SwaggerConfig {
//     @Bean
//     public Docket productApi(){
//         return new Docket(DocumentationType.SWAGGER_2)
//         .select()
//         .apis(RequestHandlerSelectors.basePackage("com.produtos.apirest"))
//         .paths(regex("/api.*"))
//         .build()
//         .ApiInfo(metaInfo());
//     }

//     private ApiInfo metaInfo(){
//         ApiInfo = new ApiInfo("Produtos API REST", 
//         "API REST de cadastro de produtos", 
//         "1.0", "Terms of Service"
//         , new Contact("Michelli Brito", "otaldol2.github.io", "lucas.ramos_Dev@outlook.com"), 
//         "Apache License 2.0", 
//         "https://www.apache.org/license.html",
//         new ArrayList<VendorExtension>())
//     }
// }
