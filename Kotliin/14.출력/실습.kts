//1.문자열을 직접 전달하는 방법
println("안녕하세요")

//2.변수를 출력하는 방법
val name="이름"
val myName="홍길동"
println("내 $name 은 $myName 입니다")

val number1 = 10
val number2 = 100
println("$number1 더하기 $number2 = ${number1+number2}")

//특수문자 출력하는 방법
println("$myName")
println("\$myName")

println(""+number1+"더하기"+number2+"는"+"${number1+number2}")

//주의
//println(10+"문자열")   => 숫자 더하기 문자열은 오류가 난다.
println("문자열"+10)  // => 문자열 더하기 숫자는 오류가 안난다.