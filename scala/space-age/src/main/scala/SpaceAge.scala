import scala.math.BigDecimal.RoundingMode

class SpaceAge {


}
object SpaceAge{

  private val  yearEarth = 31557600
  def roundYear(time: Double) = BigDecimal.decimal(time).setScale(2,RoundingMode.HALF_UP).toDouble
  def spaceAge(time: Double, scale: Double) = roundYear(time/(yearEarth * scale))

  def onEarth(d: Double) = spaceAge(d,1)
  def onMercury(time: Double) = spaceAge(time,0.2408467)
  def onVenus(time: Double) = spaceAge(time,0.61519726)
  def onMars(time: Double) = spaceAge(time,1.8808158)
  def onJupiter(time: Double) = spaceAge(time,11.862615)
  def onSaturn(time: Double) = spaceAge(time,29.447498)
  def onUranus(time: Double) = spaceAge(time,84.016846)
  def onNeptune(time: Double) = spaceAge(time,164.79132)

}
