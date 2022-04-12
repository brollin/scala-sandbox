package brash.command

import FileCommand._
import lila.base._

object CommandRunner {
  def run(tokenList: List[String]): Unit =
    (tokenList match {
      case "echo" :: argumentList => Echo(argumentList)
      case "ls" :: argumentList   => ListSpace(argumentList)
      case "cd" :: argumentList   => ChangeDirectory(argumentList)
      case "pwd" :: argumentList  => PresentWorkingDirectory(argumentList)
      case _                      => None
    }) foreach (println(_))
}
