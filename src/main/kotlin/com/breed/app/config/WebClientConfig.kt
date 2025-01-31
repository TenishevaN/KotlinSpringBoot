package com.breed.app.config

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class WebClientConfig {

    @Bean
    fun webClientFrBreed(): WebClient {
        return WebClient.builder()
            .baseUrl("https://dog.ceo/api")
            .build()
    }
}