package relicfragments.cognize.concept
import relicfragments.cognize.basic.HashMap
import relicfragments.cognize.basic.HashMapList

class Concept extends HashMapList[Describe.Type,Describe] {
}

object Concept {
  var table = new HashMapList[String, Concept];
  def find(name:String) = table.find(name);
}