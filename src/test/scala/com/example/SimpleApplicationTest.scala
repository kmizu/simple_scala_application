package com.example
import org.scalatest.FunSuite

class SimpleApplicationTest extends FunSuite {
  test("SimpleApplication.hello returns Hello, World!") {
    assert("Hello, World!" == SimpleApplication.hello)
  }
}
