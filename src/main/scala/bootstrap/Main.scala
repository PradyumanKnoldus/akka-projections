package com.nashtech
package bootstrap

import akka.actor.{ActorSystem, Props}
import scalikejdbc.DBConnection

object Main extends App {
  // Initialize DB connection
  DBConnection.init()

  val system = ActorSystem("EcommerceSystem")

  // Create an OrderActor
  val orderActor = system.actorOf(Props(new OrderActor("order-1")), "order-actor")

  // Send PlaceOrder and ShipOrder commands to the actor
  orderActor ! OrderActor.PlaceOrder("user-1", "order-1", List("apple", "banana"))
  orderActor ! OrderActor.ShipOrder("order-1")

  // Shutdown the system
  system.terminate()
}
