/**
 * Created by shep on 10/31/15.
 */
object Game extends App {
  val city: City = City("Metropolis", 100,100)
  println(city.block(1,1) + " -> " + city.block(1,1).totalValue)
  println(city.block(1,2) + " -> " + city.block(1,2).totalValue)

}
