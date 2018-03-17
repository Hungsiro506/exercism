object Leap {
  def leapYear(year: Int): Boolean = {
   val result: Boolean =  /*if (year % 4 != 0) false
                          else if (year % 100 != 0 ) true
                          else if( year % 400 == 0 )true
                          else false*/
//                          else if (year % 100 == 0 && year % 400 != 0) false
//                          else if (year % 400 == 0 ) true
//                          else true
     if(year % 400 == 0) true
     else if(year % 4 == 0 && year % 100 != 0) true
     else false
    result
  }
}
