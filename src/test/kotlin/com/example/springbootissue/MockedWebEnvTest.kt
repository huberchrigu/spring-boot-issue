package com.example.springbootissue

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.reactive.server.WebTestClient

/**
 * Comment out the spring-boot-hateoas-starter to make this work.
 */
@SpringBootTest
@AutoConfigureWebTestClient
class MockedWebEnvTest {
    @Autowired
    private lateinit var webTestClient: WebTestClient

    @Test
    fun contextLoads() {
    }
}
