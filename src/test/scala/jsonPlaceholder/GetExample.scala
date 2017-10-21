package jsonPlaceholder

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class GetExample extends Simulation with Configuration {

  var num_User = numOfUser
  var base_url = "http://jsonplaceholder.typicode.com"

  val httpConf = http
    .baseURL(base_url)

  val scn = scenario("GET")
    .exec(http("post_1_reqeust")
      .get("/posts/1")
      .header("Content-Type", "application/json")
      .check(status.not(404), status.not(500), status.is(200)))
    .pause(5)

  setUp(scn.inject(atOnceUsers(num_User))
    .protocols(httpConf))
    .assertions(global.successfulRequests.percent.is(100))
}