import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            request {
                method POST()
                url($(c("/shippings/${regex(number())}/logistics"), p("/shippings/1/logistics")))
            }
            response {
                status 201
                headers {
                    contentType(applicationJson())
                }
            }
        }

]
