import BlockType.BlockType

import scala.Int
import scala.util.Random

/**
 * Created by shep on 10/31/15.
 */
case class Block(street: String, basePrice: Double, blockType: BlockType) {
  def totalValue:Double = {
    basePrice * (blockType.id match {
      case 0 => .2
      case x:Int => blockType.id
      case _ => println("Unknown block type, reverting to 1")
        1
    })
  }
}
object BlockType extends Enumeration {
  val r:Random = new Random()
  type BlockType = Value
  val EMPTY,SLUM,MIDDLE,UPPER,RICH = Value
  def random: BlockType = {
    BlockType(r.nextInt(BlockType.values.size))
  }
}
