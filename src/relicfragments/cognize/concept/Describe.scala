package relicfragments.cognize.concept
import relicfragments.cognize.basic.HashMapList

class Describe extends HashMapList[String,Attribute] {
}

object Describe extends Enumeration {
  type Type       = Value;
  val IS          = Value("是");
  val SHOULD_HAVE = Value("应该有");
  val CAN_HAVE    = Value("可以有");
}