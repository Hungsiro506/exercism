import scala.collection.mutable.ArrayBuffer

object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {
    val a = factors.map(x => getAllMultipler(x,limit)).flatMap(x => x).toSet
    val result = if(a.size == 0) 0 else a.foldRight(0){(acc,c) => acc +c}
    result
  }

  def getAllMultipler(factor: Int, limit: Int)  = {
    val buff = new ArrayBuffer[Int]()
    var value = factor
    var multi = 1
    while(value < limit){
      buff.append(value)
      multi += 1
      value = factor * multi
    }
    buff.toSet
  }



}

