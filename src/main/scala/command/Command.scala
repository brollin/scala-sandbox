package brash.command

abstract class Command {
  def apply(argumentList: List[String]): Option[String]
}

object Echo {
  def apply(argumentList: List[String]): Option[String] =
    Some(argumentList.mkString(" "))
}
