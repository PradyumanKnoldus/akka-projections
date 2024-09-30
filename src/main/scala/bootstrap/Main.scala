package com.nashtech
package bootstrap
import com.nashtech.db.DBConnection
import akka.actor.{ActorSystem, Props}
import com.nashtech.models.Order
import com.nashtech.parsers.Parsers
import scalikejdbc._

object Main extends App {
 implicit val session: DBSession = DBConnection.session

}
