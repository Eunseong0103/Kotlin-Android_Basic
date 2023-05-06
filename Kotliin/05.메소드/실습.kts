//코틀린은 카멜스타일이다!!
//함수를 선언하는 방법
fun plusNumbers(first_num: Int, second_num: Int): Int {

    val result: Int = first_num + second_num
    return result
}

println(plusNumbers(10, 20))

val result: Int = plusNumbers(first_num = 5, second_num = 7)
println(result)

//기본값이 있는 함수
fun plusNumbersWithDefault(first_num: Int, second_Num: Int = 10): Int {
    return first_num + second_Num
}

val result2: Int = plusNumbersWithDefault(first_num = 10)
println(result2)
val result3: Int = plusNumbersWithDefault(first_num = 10, second_Num = 20)
println(result3)

//반환값이 없는 함수를 선언하는 방법
fun plusNumberWithNoReturn(first_num: Int, second_num: Int): Unit {
    val result: Int = first_num + second_num
    println(result)
}

fun plusNumberWithNoReturn2(first_num: Int, second_num: Int){ // Unit 생략가능
    val result: Int = first_num + second_num
    println(result)
}

plusNumberWithNoReturn2(100,200)

fun plusNumberWithNoReturn3(first_num: Int, second_num: Int) { //return에 아무것도 안써야 한다.
    val result: Int = first_num + second_num
    println(result)
    return
}

//함수선언을 간단하게 하는 방법
fun shortPlusNumbers(firstNum:Int , secondNum:Int) = firstNum+secondNum
val result10:Int = shortPlusNumbers(firstNum = 10 , secondNum = 100)
println(result10)

//가변인자를 가지는 함수
fun plusMultipleNumbers(vararg numbers : Int):Unit{
    println(numbers)
}
plusMultipleNumbers(...numbers:1,2,3,4,5)
