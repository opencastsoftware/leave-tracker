package controllers

import org.scalatest.{MustMatchers, WordSpec}
import play.api.test.Helpers._
import play.api.test.{FakeRequest, Helpers}


class HomeControllerSpec extends WordSpec with MustMatchers {
  "The index action" must {
    "return an OK 200 response" in {
      val controller = new HomeController(Helpers.stubControllerComponents())
      status(controller.index()(FakeRequest())) mustBe OK
    }
  }

}
