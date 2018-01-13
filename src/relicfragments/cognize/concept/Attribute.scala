package relicfragments.cognize.concept
import relicfragments.cognize.basic.HashMapList

trait Attribute {
}

case class ConceptAttribute(word:String, concept:Concept) extends HashMapList[String,Any] with Attribute {
  override def toString():String = toStringAfter() + word;
}

case class StringAttribute(word:String) extends Attribute {
  override def toString():String = word;
}