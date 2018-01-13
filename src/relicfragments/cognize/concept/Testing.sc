package relicfragments.cognize.concept
 
object Testing {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var void  = Concept.find("空");   void.append(new Concept)
                                                  //> void  : scala.collection.mutable.ListBuffer[relicfragments.cognize.concept.C
                                                  //| oncept] = ListBuffer(Map())
  var blank = Concept.find("空白"); blank.append(new Concept)
                                                  //> blank  : scala.collection.mutable.ListBuffer[relicfragments.cognize.concept.
                                                  //| Concept] = ListBuffer(Map())
  var desc  = new Describe                        //> desc  : relicfragments.cognize.concept.Describe = Map()
  var attr0 = new ConceptAttribute(void(0))       //> attr0  : relicfragments.cognize.concept.ConceptAttribute = Map()
  desc.find("字符").append(attr0)
  var attr1 = new StringAttribute("空");           //> attr1  : relicfragments.cognize.concept.StringAttribute = StringAttribute(�
                                                  //| �)
  desc.find("字符").append(attr1)
 	blank(0).find(Describe.IS).append(desc)
 	blank                                     //> res0: scala.collection.mutable.ListBuffer[relicfragments.cognize.concept.Con
                                                  //| cept] = ListBuffer(Map(是 -> ListBuffer(Map(字符 -> ListBuffer(Map(), Str
                                                  //| ingAttribute(空))))))
}