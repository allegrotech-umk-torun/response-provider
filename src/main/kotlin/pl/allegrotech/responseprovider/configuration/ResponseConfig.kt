package pl.allegrotech.responseprovider.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties("response")
class ResponseConfig(
    var delay: Long = 0
)