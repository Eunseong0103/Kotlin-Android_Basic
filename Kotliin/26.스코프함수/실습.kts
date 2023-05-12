class Person(var name:String? = null , var age: Int? = null){

}
//apply
//-적용하다
//-객체를 초기화할때 사용하면 좋다
val gildong = Person().apply { //
    name="길동"
    age=20
}
//위에랑 같다.
val gildong = Person()
gildong.name="길동"
gildong.age=20

//also
//유효성 검사할 때 좋다.
//이미 객체가 초기화 되어있기 때문에 수신된 객체의 속성을 변경하지 않고 사용할 때 좋다.
val gildong2 = Person("Victor").also { //수신된 객체 -> it을 의미한다.
    //nameIsGildong(it.name)
}

//run
//-기본적으로 apply와 동일하다
//-스코프의 마지막줄을 리턴한다. -> 특정계산 결과가 필요한 경우  // run은 잘안쓴다.
val ageAfter10year = Person("gildong",10).run{
    age!!+10
}
println(ageAfter10year)
val ageAfter10yaer2 = with(Person("gildong",10)){
    age!!+10
}
//-with는 nullable 타입을 받지 못한다.
println(ageAfter10yaer2)

//let
//-기본적으로 also와 동일하다.
//-스코프의 마지막줄을 리턴한다.  // 널러블 검사로도 사용함
val gildong2 = Person("Victor")?.let { //수신된 객체 -> it을 의미한다.

}