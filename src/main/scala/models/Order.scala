package com.nashtech
package models

case class Order(
                  orderId: String,
                  userId: String,
                  items: List[String],
                  status: String,
                  timestamp: Long
                )



