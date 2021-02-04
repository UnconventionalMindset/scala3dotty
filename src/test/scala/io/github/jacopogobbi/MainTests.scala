package io.github.jacopogobbi

import org.scalatest.ParallelTestExecution
import org.scalatest.flatspec.AnyFlatSpec
import Main.expectedPassword
import Main.UserId
import Main.Email
import Main.Password
import org.scalatest.matchers.should.Matchers

import java.util.UUID

class MainTests
  extends AnyFlatSpec
    with ParallelTestExecution
    with Matchers {
  val password = "secret"
  behavior of("Main.authenticate")
  it should "authenticate using the correct user ID" in {
    Main.authenticate(Main.expectedUserId, expectedPassword) shouldBe true
  }
  it should "authenticate using the correct user email" in {
    Main.authenticate(Main.expectedUserEmail, expectedPassword) shouldBe true
  }
  it should "not authenticate if only the user is incorrect" in {
    Main.authenticate(UUID.randomUUID.asInstanceOf[UserId], expectedPassword) shouldBe false
    Main.authenticate("ciao".asInstanceOf[Email], expectedPassword) shouldBe false
  }
  it should "not authenticate if only the password is incorrect" in {
    Main.authenticate(Main.expectedUserEmail, "ciao".asInstanceOf[Password]) shouldBe false
  }
  it should "not authenticate if both the user and password are incorrect" in {
    Main.authenticate(UUID.randomUUID.asInstanceOf[UserId], "ciao".asInstanceOf[Password]) shouldBe false
    Main.authenticate("ciao".asInstanceOf[Email], "ciao".asInstanceOf[Password]) shouldBe false
  }
}