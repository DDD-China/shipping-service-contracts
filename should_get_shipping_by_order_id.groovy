import org.springframework.cloud.contract.spec.Contract

[
    Contract.make {
      request {
        method GET()
        urlPath("/shippings") {
            queryParameters {
                parameter 'orderId': value(consumer(matching("[0-9]+")), producer(1))
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
