private fun main(): Unit {
    println("하이하이요")

    var points: Int = 3
    println("first points $points")

    points = 1
    println("second points $points")

    val valImmutable: Float = 3.4f
    println("val immutable $valImmutable")

    val s2: IntProgression = 1..10 step 3
    println(s2.step(2).toList())
    println(s2::class.simpleName)
    println(s2)
    println(s2.first)
    println(s2.last)
    println(s2.step)
    println(s2.toString())
    println(s2.toList())
    println(s2.count())
    println(s2.indexOf(4))

    var flag: Boolean = true
    var condExp: String =
        if (flag) {
            "flag true"
        }
        else {
            "flag false"
        }

    println(flag)
    println(condExp)
    flag = false
    println(flag)
    println(condExp)
}
