package pl.allegrotech.responseprovider.endpoints

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import pl.allegrotech.responseprovider.configuration.ResponseConfig

@RestController
class ConfigEndpoint(
    val responseConfig: ResponseConfig
) {

    @GetMapping(
        value = ["/setDelay/{delay}"],
    )
    @ResponseBody
    fun setDelay(@PathVariable("delay") requestDelay: Long): ResponseEntity<String> {

        val newDelay = if (requestDelay > 5000) 5000
        else
            if (requestDelay < 0) 0 else requestDelay

        responseConfig.delay = newDelay
        return ResponseEntity.ok().body("Set delay to ${responseConfig.delay}")
    }
}