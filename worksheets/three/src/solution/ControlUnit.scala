package solution

class ControlUnit(sensors: List[Sensor], sensorPoller: SensorPoller) {
  def this() = this(null, null)

  def this(sensors: List[Sensor]) = this(sensors: List[Sensor], null)

  def this(sensorPoller: SensorPoller) = this(null, sensorPoller: SensorPoller)

  def pollSensors = {
    if (sensors != null && sensorPoller != null)
      sensorPoller.poll(sensors)
    else
      println("Control Unit has not been populated with sensors / sensorPoller")
  }


}
