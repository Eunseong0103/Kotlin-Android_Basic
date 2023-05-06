println("#1-----------------------")

for (count in 1..3) {
    println("반복")
}
println("#2------------------------")
var i = 10
var sum = 0
for (num in 1..i) {
    sum += num
}
println(sum)
println("#3------------------------")
var sum1 = 0
for (num in 1..100) {
    if (num % 7 == 0) {
        sum1 += num
    }
}
println(sum1)
println("#4------------------------????")

//fun increaseOne(numberUnder100:Int){  //오류가 난다 , 파라미터 값은 value취급이여서 증감이 안된다.
//    while(numberUnder100<100){        // 변수 취급이 안된다 , 파라미터는
//        numberUnder100++
//    }
//    return
//}
fun increaseOne(numberUnder100: Int): Int {  //오류가 난다 , 파라미터 값은 value취급이여서 증감이 안된다.
    var givenNumber: Int = numberUnder100
    while (givenNumber < 100) {        // 변수 취급이 안된다 , 파라미터는
        givenNumber++
    }
    return givenNumber
}
println(increaseOne(99))

//var selectNum = 80
//var sumTo100 = 0
//for(count in 1..selectNum){ //
//    sumTo100+=count
//    if(sumTo100==100){
//        println(sumTo100)
//        break
//    }
//}
println("#5------------------------")
//var testScore = arrayOf<Int>(70,71,72,77,78,79,80,82,90,99)
//var testResult = Array<String>(10,{""})
//for(score in testScore){
//    if(score>=80) println("true :"+score)
//    else println("false :"+score)
//}

fun checkPassOrNot(examScores: List<Int>): BooleanArray {
    val resultArray = BooleanArray(examScores.size, { false })
    examScores.forEachIndexed { index, score ->
        if (score >= 80) resultArray[index] = true
    }
    return resultArray
}

var result = checkPassOrNot(listOf<Int>(70, 71, 72, 77, 78, 79, 80, 82, 90, 99))
result.forEach {
    println(it)
}


println("#6------------------------")
//var dice1 = arrayOf<Int>(1, 2, 3, 4, 5, 6)
//var dice2 = arrayOf<Int>(1, 2, 3, 4, 5, 6)
//fun dicePlus(firstNum: Array<Int>, secondNum: Array<Int>) {
//    for (i in firstNum) {
//        for (j in secondNum) {
//            if ((i + j) == 6)
//                print(i)
//            print(j)
//            println()
//        }
//    }
//}
//dicePlus(dice1, dice2)

fun findSumIsSixFromDice(): List<List<Int>> {
    val resultList = mutableListOf<List<Int>>()
    for (i in 1..6) {
        for (j in 1..6) {
            if (i + j == 6) {
                val temp = listOf<Int>(i, j)
                resultList.add(temp)
            }
        }
    }
    return resultList
}
println(findSumIsSixFromDice())

println("#7------------------------")

fun eatUntilNotHungry(totalCount: Int, currentCount: Int) {
    var currentCountCopy: Int = currentCount
    do {
        println("밥을 먹었다")
        currentCountCopy++
    } while (currentCount < totalCount)
    println("배가 부르다")
}
eatUntilNotHungry(10, 11)

println("#8-----------------------")

//fun killNthArmy(
//    firstArmy:List<String> ,
//    secondArmy:List<String>,
//    killNth:Int
//):List<List<String>>{
//    if(firstArmy.size<killNth || secondArmy.size<killNth) return null
//
//}

println("#9-----------------------")
fun guguDan(dan: Int) {
    val numbers = mutableListOf<Int>()
    for (i in 1..9) {
        numbers.add(dan * i)
    }
    println(numbers)
}
guguDan(8)

println("#10-----------------------")

fun splitNumbers(firstIntList: List<Int>, secondIntList: List<Int>): Map<String, List<Int>> {
    val result = mutableMapOf<String, List<Int>>()
    val totalIntList = mutableListOf<Int>()
    totalIntList.addAll(firstIntList)
    totalIntList.addAll(secondIntList)

    val eventNumber = mutableListOf<Int>()
    val oddNumber = mutableListOf<Int>()


    totalIntList.forEach { number ->
        if (number % 2 == 0) eventNumber.add(number)
        else oddNumber.add(number)
    }
    result.put("짝수", eventNumber)
    result.put("홀수", oddNumber)
    return result
}
println(
    splitNumbers(
        listOf<Int>(1, 2, 3, 4, 5), listOf<Int>(6, 7, 8, 9, 10)
    )
)