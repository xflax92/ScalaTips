package org.xflax

import scala.beans.BeanProperty

case class MapListaData(
                       @BeanProperty list: String,
                       @BeanProperty fields: FieldByList,
                       @BeanProperty playerPairSeq: Seq[PlayerNumberPair],
                       )

case class PlayerNumberPair(
                           @BeanProperty name: String,
                           @BeanProperty number: Int,
                           )

case class FieldByList(
                      @BeanProperty cityField:String,
                      @BeanProperty cityValue:String,
                      @BeanProperty dataField:String,
                      @BeanProperty dataValue:String,
                      )

