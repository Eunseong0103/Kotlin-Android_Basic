val number: Int? = null //null이 들어갈 수 있는 변수 -> nullable 한다
//val number2: Int = null // null이 들어갈 수 없는 변수 -> non-null

val number2 : Int? = 2+5
val number3 : Int? = 10

val number4: Int? = number2+number3 // 어떻게 될까?

//변수 선언 + 할당
val number5: Int = 10

if(null==5){// == 비교 연산은 가능하다.
    println("same")
}else{
    println("not same")
}
if(null==null){ // 값을 비교한것이 아닌 상태를 물어본거다.
    println("same")
}else{
    println("not same")
}