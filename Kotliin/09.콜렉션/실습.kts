//List
val numbers = listOf<Int>(1,2,3)
println(numbers[0])
println(numbers.get(1))
println(numbers.indexOf(2))
println(numbers.last())

val number2 = mutableListOf<Int>(1,2,3)
number2.add(50)
println(number2)
number2.removeAt(0)
println(number2)
number2.addAll(2, listOf<Int>(100,100))
println(number2)


//set
val numbers3 = setOf<Int>(1,1,1,3,3,4)
println(numbers3.contains(3))

val numbers4 = mutableListOf<Int>(1,1,1,3,3,4)

//map
println("-------------------")

val numbers5 = mapOf<Int, String>(1 to "one" , 2 to "two")
println(numbers5.keys)
println(numbers5.values)
println(numbers5.size)
println(numbers5.getOrDefault(1,"notValue"))

val numbers6 = mapOf<Int, String>(Pair(1,"one"),Pair(2,"two"))
println("-------------------")
println(numbers5)
println("-------------------")
println(numbers6)