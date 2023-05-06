//if
val number1: Int = 10

if (number1 == 10) {//조건식은 무조건 true 또는 false로 결과가 나와야한다.
    println("10 입니다")
} else if (number1 == 20) {
    println("20 입니다")
} else {
    println("10,20 둘다 아닙니다")
}

if (number1 == 10) println("10입니다")
else if (number1 == 20) println("20입니다")
else println("10,20 둘다 아니다")

val number2: Int = 10 + 20 // 값이 오면된다 -> 식이 와도 된다.
val number3: Int = if (number2 > 30) 40 else 50 //코틀린에서는 if가 표현이 아니라 값으로 취급한다.
println(number3)

//표현과 식
//표현 : 어떤 것을 표현하기 위해서 사용되는 문법적인 요소
//-val, var , Int , Short -> 키워드
//식 : 값을 만들어 낸다
//- 10+20 , 10*20

//when
val number4: Int = 5
when(number4){
    5 -> {
        println("5 입니다")
    }
    6 -> {
        println("6입니다")
    }
    else -> {
        println("모르겠습니다.")
    }
}
when(number4){ //대괄호 생략
    5-> println("5입니다")
    6-> println("5입니다")
    else-> println("모르겠습니다.")
}

when(number4){
    4-> println("number is 4")
    "안녕하세여"-> println("boolean")
}

