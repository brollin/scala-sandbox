package brash.repl

import brash.command._
import scala.io.StdIn.readLine

object Repl {
  def run: Unit = {
    print("> ")
    val command = tokenize(readLine())
    CommandRunner.run(command)
    run
  }
  def tokenize(input: String): List[String] = input split ' ' toList
}
