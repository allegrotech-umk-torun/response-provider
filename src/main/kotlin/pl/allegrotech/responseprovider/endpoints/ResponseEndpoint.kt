package pl.allegrotech.responseprovider.endpoints

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import pl.allegrotech.responseprovider.configuration.ResponseConfig
import pl.allegrotech.responseprovider.endpoints.model.ResponseModel

@RestController
@RequestMapping("/response")
class ResponseEndpoint(
    val responseConfig: ResponseConfig
) {

    @GetMapping(
        value = ["/{requestParam}"],
    )
    @ResponseBody
    fun getResponse(@PathVariable("requestParam") requestParam: String): ResponseEntity<ResponseModel> {
        Thread.sleep(responseConfig.delay)
        val responseModel = ResponseModel(requestParam, responseConfig.delay)
        return ResponseEntity.ok().body(responseModel)
    }
}