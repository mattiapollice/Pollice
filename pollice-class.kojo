clear()

class BouncingRect (x: Int, y: Int) {
  val pic = Picture.rectangle(50,50)
  pic.setFillColor(blu)
  var vel = Vector2D(2,10)

  def draw() {
    pic.draw()

    }
}

val br = new BouncingRect(-70, -70)

br.draw()