package $organization$.$name;format="word,lower"$

import scala.scalajs.js
import js.Dynamic.{ global => g }

object $name;format="Camel"$ {
  def main(): Unit = {
    val paragraph = g.document.createElement("p")
    paragraph.innerHTML = "<strong>It works!</strong>"
    g.document.getElementById("playground").appendChild(paragraph)
  }

  /** Computes the square of an integer.
   *  This demonstrates unit testing.
   */
  def square(x: Int): Int = x*x
}
