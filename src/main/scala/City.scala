import scala.util.Random

/**
 * Created by shep on 10/31/15.
 */
case class City(name: String, x: Int, y: Int) {
  private val r: Random = new Random()
  private val city: Array[Array[Block]] = {
    val c = Array.ofDim[Block](x,y)
    for(xCoordinate <- 0 to x-1) {
      for(yCoordinate <- 0 to y-1) {
        c(xCoordinate)(yCoordinate) = Block("adfasdf",randomBasePrice,BlockType.random)
      }
    }
    c
  }

  def apply(x: Int, y: Int) = {

  }

  def block(x: Int, y: Int): Block = city(x)(y)

  def randomBasePrice: Double = {
    60 + (r.nextInt(10) * 10)
  }
}
