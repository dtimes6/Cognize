package relicfragments.cognize.basic
import scala.collection.mutable.ListBuffer

class HashMap[A,B:Manifest] extends scala.collection.mutable.HashMap[A,B] {
  def toStringAfter(s:String = " ", sp:String = "  "):String = {
    var res:String = "";
    for ((k,v) <- this) {
      res += k.toString() + s + v.toString() + sp;
    }
    res
  }
  def toStringBefore(s:String = " ", sp:String = "  "):String = {
    var res:String = "";
    for ((k,v) <- this) {
      res += v.toString() + s + k.toString() + sp;
    }
    res
  }
}

class HashMapList[A,B:Manifest] extends HashMap[A, ListBuffer[B]] {
  def find(key:A):ListBuffer[B] = {
    if (!contains(key)) put(key, new ListBuffer[B]);
    apply(key);
  }
  override def toStringAfter(s:String = " ", sp:String = "  "):String = {
    var res:String = "";
    for ((k,v) <- this) {
      for (i <- v) {
        res += k.toString() + s + i.toString() + sp;
      }
    }
    res
  }
  override def toStringBefore(s:String = " ", sp:String = "  "):String = {
    var res:String = "";
    for ((k,v) <- this) {
      for (i <- v) {
        res += i.toString() + s + k.toString() + sp;
      }
    }
    res
  }
}