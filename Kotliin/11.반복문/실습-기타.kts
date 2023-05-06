val numbers = intArrayOf(5,10,15)

//값만 필요함
for(number in numbers){
    println(number)
}

println("---------------")
//값과 인덱스 모두 필요할 때
for((index ,value) in numbers.withIndex()){
    println(index)
    println(value)
}

println("------------------")
//인덱스만 필요할때 , 코드를 명시적으로 적는게 좋다. 의도를 알 수 있게
for(index in numbers.indices){
    println(index)
}

//본문에서 사용될 변수 이름을 기본제공으로 사용
numbers.forEachIndexed{index , i ->

}
//본문에서 사용될 변수이름을 변경해서 사용
numbers.forEachIndexed{ index, value ->

}