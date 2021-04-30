package io.github.jacopogobbi

import java.util.UUID

import scala.io.StdIn

// Significant whitespaces, quiet syntax:
// https://dotty.epfl.ch/docs/reference/other-new-features/control-syntax
object Main:
  // Opaque types: https://dotty.epfl.ch/docs/reference/other-new-features/opaques-details.html
  opaque type UserId = UUID
  opaque type Email = String
  opaque type Password = String
  val expectedUserEmail: Email = "ciao@email.com"
  val expectedUserId: UserId = UUID.fromString("8d7bd8b3-2f9d-4e77-8ddd-c60be4ab955e")
  val expectedPassword: Password = "secret"

  // Main method: https://dotty.epfl.ch/docs/reference/changed-features/main-functions.html
  @main def start: Unit =
    println("\nAuthentication example with Scala 3 (Dotty). Starting authentication...")
    // Dropped do-while: https://dotty.epfl.ch/docs/reference/dropped-features/do-while.html
    while
      val (emailOrUser, password) = getUserData
      !authenticate(emailOrUser, password)
    do ()

  // Union types: https://dotty.epfl.ch/docs/reference/new-types/union-types.html
  def getUserData: (Email | UserId, Password) =
    println("Insert your username or email:\n")
    val emailOrUser: String = StdIn.readLine
    println("Insert your password:\n")
    val password: String = StdIn.readLine
    (emailOrUser, password)

  // Union types: https://dotty.epfl.ch/docs/reference/new-types/union-types.html
  def authenticate(emailOrId: Email | UserId, password: Password): Boolean =
    val username: Option[String] = emailOrId match
      case email: Email if email == expectedUserEmail =>
        Some(email.toString)
      case id: UserId if id == expectedUserId =>
        Some(id.toString)
      case _ =>
        None

    val isAuthenticated =
      username.isDefined && password == expectedPassword

    if (!isAuthenticated)
    then println("Authentication was not successful.")
    else println(s"Authentication successful, welcome $username")

    isAuthenticated