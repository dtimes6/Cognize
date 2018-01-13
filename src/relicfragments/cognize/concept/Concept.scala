package relicfragments.cognize.concept
import relicfragments.cognize.basic.HashMap
import relicfragments.cognize.basic.HashMapList

class Concept extends HashMapList[Describe.Type,Describe] {
  override def toString():String = toStringAfter();
}

object Concept {
  var table = new HashMapList[String, Concept];
  def find(name:String) = table.find(name);
  override def toString():String = table.toStringAfter("", "\n");
}