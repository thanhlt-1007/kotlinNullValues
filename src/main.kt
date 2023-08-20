class Wolf {
  var hunger = 10
  val food = "meat"

  fun eat() {
    println("The Wolf is eating $food")
  }
}

class MyWolf {
  var wolf: Wolf? = Wolf()

  fun myFunction() {
    wolf?.eat()
  }
}

fun getAlphaWolf() : Wolf? {
  return Wolf()
}

fun main() {
  var w: Wolf? = Wolf()

  if (w != null) {
    w.eat()
  }

  var x = w?.hunger
  println("The value of x is $x")

  // Use the Elvis operator to set y to the value of hunger if w is not null.
  // If w is null, it sets y to -1
  var y = w?.hunger ?: -1
  println("The value of y is $y")

  var myWolf = MyWolf()
  myWolf?.wolf?.hunger = 8
  println("The value of myWolf?.wolf?.hunger is ${myWolf?.wolf?.hunger}")

  var myArray = arrayOf("Hi", "Hello", null)
  for (item in myArray) {
    // This prints the non-null items in the array
    item?.let { println(it) }
  }

  getAlphaWolf()?.let { it.eat() }

  w = null
  println("The value of w is $w")
  // This will throw a NullPointerException as w is null
  var z = w!!.toString()
  println("The value of z is $z")
}
