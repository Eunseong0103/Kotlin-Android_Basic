//#1
var a: Int = 2
var b: Int = 3
//var c = a == b
var c: Boolean = if (a == b) true else false
println(c)

//#2
var a1: Int = 3
var b1: Int = a1 * 2
println(b1)

//#3
var score: Int = 84
if (score >= 90) {
    println("A학점")
} else if (score >= 80) {
    println("B학점")
} else if (score >= 70) {
    println("C학점")
} else {
    println("F학점")
}

when (score) {
    in 90..100 -> println("a학점")
    in 70..89 -> println("b학점")
}

//#4
var corNum: Int = 5
when (corNum) {

}

fun gradeTest(correctCount: Int): Int {
    return correctCount * 5
}
println(gradeTest(10))



//#5
fun nullVar(first: Int?, second: Int?): Int {
    if (first == null || second == null) {
        return 0
    } else {
        return first + second
    }
}
println(nullVar(10, null))


fun plusTwoNumbers(firstNum: Int?, secondNum: Int?): Int {
    //함수에서 받은 인자는 firstNum은 val이다

    var first : Int = if(firstNum==null) 0 else firstNum
    var second : Int = if(secondNum==null) 0 else secondNum

    return first+second
}
println(plusTwoNumbers(10, null))

