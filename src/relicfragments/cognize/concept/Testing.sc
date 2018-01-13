package relicfragments.cognize.concept
 
object Testing {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var void  = Concept.find("透明"); void.append(new Concept)
                                                  //> void  : scala.collection.mutable.ListBuffer[relicfragments.cognize.concept.C
                                                  //| oncept] = ListBuffer()
  var descVoid = new Describe                     //> descVoid  : relicfragments.cognize.concept.Describe = 
  var attrVoid = new StringAttribute("无")         //> attrVoid  : relicfragments.cognize.concept.StringAttribute = 无
  descVoid.find("颜色").append(attrVoid)
  void(0).find(Describe.SHOULD_HAVE).append(descVoid)
  var blank = Concept.find("空白"); blank.append(new Concept)
                                                  //> blank  : scala.collection.mutable.ListBuffer[relicfragments.cognize.concept.
                                                  //| Concept] = ListBuffer()
  var desc  = new Describe                        //> desc  : relicfragments.cognize.concept.Describe = 
  var attr0 = new ConceptAttribute("透明", void(0)) //> attr0  : relicfragments.cognize.concept.ConceptAttribute = 透明
  attr0.find("颜色").append("alpha 0的")
  desc.find("字符").append(attr0)
  var attr1 = new StringAttribute("空");           //> attr1  : relicfragments.cognize.concept.StringAttribute = 空
  desc.find("字符").append(attr1)
  desc                                            //> res0: relicfragments.cognize.concept.Describe = 颜色 alpha 0的  透明的
                                                  //| 字符  空的字符  
 	blank(0).find(Describe.IS).append(desc)
 	blank                                     //> res1: scala.collection.mutable.ListBuffer[relicfragments.cognize.concept.Con
                                                  //| cept] = ListBuffer(是 颜色 alpha 0的  透明的字符  空的字符    )
                                                  //| 
  Concept                                         //> res2: relicfragments.cognize.concept.Concept.type = 透明应该有 无的�
                                                  //| �色    
                                                  //| 空白是 颜色 alpha 0的  透明的字符  空的字符    
                                                  //| 
}