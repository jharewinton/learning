def calculate(cost: Double, tip: Double, tax: Double): Double = {
  cost + ((cost / 100) * tip) + ((cost / 100) * tax)
}

calculate(12, 20, 8).toInt

