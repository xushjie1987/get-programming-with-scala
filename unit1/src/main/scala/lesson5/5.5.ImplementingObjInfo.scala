package lesson5

object `5.5.ImplementingObjInfo` {
  def objInfo(param: Any) = param match {
    case n: Int if n > 0 => s"$n is an positive integer"
    case d: Double => s"$d is a double"
    case "ping" => "pong"
    case _: String => "you gave me a string"
    case obj => obj.toString
  }
}
