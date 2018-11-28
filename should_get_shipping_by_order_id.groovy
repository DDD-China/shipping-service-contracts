import org.springframework.cloud.contract.spec.Contract

[
    Contract.make {
      request {
        method GET()
        urlPath("/shippings") {
            queryParameters {
                parameter 'orderId': $(c(matching("[0-9]+")), p(1))
            }
        }
      }
      response {
          status 200
          headers {
              contentType(applicationJson())
          }
          body(file("shippings_response.json"))
      }
    }

]
