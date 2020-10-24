fun main() {
    println("welcome")
}
fun evenOrOdd(number: Int): String {
    var check = number / 2
    if (check is Int) {
        return "even"
    } 
    else {
        return "odd"
    }
}

evenOrOdd(3)