package brash.command
import java.io.File
object FileCommand {
  var presentWorkingDirectory = System.getProperty("user.home")
  object ListSpace extends Command {
    def apply(argumentList: List[String]): Option[String] =
      Some(
        new File(presentWorkingDirectory)
          .listFiles()
          .map(_.toString)
          .mkString("\n")
      )
  }
  object ChangeDirectory extends Command {
    def apply(argumentList: List[String]): Option[String] = {
      presentWorkingDirectory = new File(
        presentWorkingDirectory + "/" + argumentList(0)
      ).getCanonicalPath()
      Some(presentWorkingDirectory)
    }
  }
  object PresentWorkingDirectory extends Command {
    def apply(argumentList: List[String]): Option[String] =
      Some(presentWorkingDirectory)
  }
}
