package relicfragments.cognize.concept
import relicfragments.cognize.basic.HashMapList

trait Attribute { 
}

case class ConceptAttribute(concept:Concept) extends HashMapList[String,Any] with Attribute {
}

case class StringAttribute(word:String) extends Attribute {
  
}