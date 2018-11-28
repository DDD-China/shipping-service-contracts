import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            request {
                method POST()
                url($(c("/shippings/${regex(number())}/logistics"), p("/shippings/1/logistics")))
                headers {
                    contentType(applicationJson())
                }
                body("""
                    {
                        "orderId": 1,
                        "express": "方通快递",
                        "info": "已经出库",
                        "updateAt": 1234567
                    }
                """)
            }
            response {
                status 201
            }
        }

]
