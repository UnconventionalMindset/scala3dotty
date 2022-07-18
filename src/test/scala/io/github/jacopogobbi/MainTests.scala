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
    with Matchers:
  // Experimental: Variant: Indentation Marker, https://docs.scala-lang.org/scala3/reference/other-new-features/indentation.html#variant-indentation-marker-
  import language.experimental.fewerBraces

  val password = "secret"
  behavior of("Main.authenticate")
  it should "authenticate using the correct user ID" in:
    Main.authenticate(Main.expectedUserId, expectedPassword) shouldBe true
  it should "authenticate using the correct user email" in:
    Main.authenticate(Main.expectedUserEmail, expectedPassword) shouldBe true
  it should "not authenticate if only the password is correct" in:
    val id = UUID.fromString("a76807ce-2011-45a3-89b1-d16afcdca28f").asInstanceOf[UserId]
    Main.authenticate(id, expectedPassword) shouldBe false
    Main.authenticate("ciao".asInstanceOf[Email], expectedPassword) shouldBe false
  it should "not authenticate if only the user is correct" in:
    Main.authenticate(Main.expectedUserEmail, "ciao".asInstanceOf[Password]) shouldBe false
  it should "not authenticate if the data is incorrect" in:
    val id = UUID.fromString("a76807ce-2011-45a3-89b1-d16afcdca28f").asInstanceOf[UserId]
    Main.authenticate(id, "ciao".asInstanceOf[Password]) shouldBe false
    Main.authenticate("ciao".asInstanceOf[Email], "ciao".asInstanceOf[Password]) shouldBe false
