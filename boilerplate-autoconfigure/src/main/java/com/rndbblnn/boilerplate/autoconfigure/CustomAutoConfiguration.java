package com.rndbblnn.boilerplate.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(CustomProperties.class)
@ConditionalOnProperty(
        value="rndbblnn.http.enabled",
        havingValue = "true")
public class CustomAutoConfiguration {

    private CustomProperties customProperties;

    public CustomAutoConfiguration(final CustomProperties customProperties) {
        this.customProperties = customProperties;
    }

//    @Bean
//    @ConditionalOnMissingBean
//    public RestTemplate restTemplate(){
//        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder(customRestTemplateCustomizer());
//        return restTemplateBuilder.build();
//    }
//
//    @Bean
//    @ConditionalOnMissingBean
//    public CustomRestTemplateCustomizer customRestTemplateCustomizer(){
//        return new CustomRestTemplateCustomizer(customProperties.getHeaders());
//    }

}
