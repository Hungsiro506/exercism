object FlattenArray {
  def flatten(list: List[Any]): List[Any] = list.flatMap{
      case ls: List[_] => flatten(ls)
      case h => List(h)
  }.filter(x => x!= null)
}
