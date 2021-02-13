package org.xflax.operations

object Transformations {

  def transformElementInMap(elements: Set[String]): Set[String]={
    val mapOfTranslations = Map("prop.city"->"city")
    var set = scala.collection.mutable.Set[String]()
    elements.foreach( e => {
      if(mapOfTranslations.contains(e)){
        set+= mapOfTranslations.get(e).get
      }else{
        set+=e
      }
    })
    set.toSet
  }



}
