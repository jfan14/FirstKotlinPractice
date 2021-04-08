fun findMaxFromThree(): Int {
    println("Enter First Number: ")
    var n1:Int = readLine()!!.toInt()
    println("Enter Second Number: ")
    var n2 = readLine()!!.toInt()
    println("Enter Third Number: ")
    var n3 = readLine()!!.toInt()

    val nums = arrayOf<Int>(n1,n2,n3)

    var max: Int = 0
    for(num:Int in nums) {
        if(num > max) max = num
    }

    return max
}

fun printNumbers() {
    println("Enter 1 to continue, 0 to quit")
    var command:Int = readLine()!!.toInt()
    val members = mutableListOf<Int>()
    while(command == 1) {
        println("Enter a number: ")
        members.add(readLine()!!.toInt())
        println("Enter 1 to continue, 0 to quit")
        command = readLine()!!.toInt()
    }
    println("Total counts: ${members.size}")
    print("Numbers are: ${members}")
}

fun main() {
    println("Max among three numbers is ${findMaxFromThree()}")
    println("==================Second Part==================")
    printNumbers()
}

