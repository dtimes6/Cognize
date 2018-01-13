package relicfragments.cognize.basic
import scala.collection.mutable.ListBuffer

class HashMap[A,B:Manifest] extends scala.collection.mutable.HashMap[A,B] {
}

class HashMapList[A,B:Manifest] extends HashMap[A, ListBuffer[B]] {
  def find(key:A):ListBuffer[B] = {
    if (!contains(key)) put(key, new ListBuffer[B]);
    apply(key);
  }
}