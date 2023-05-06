//break
for (i in 1..3) {
    println("i :" + i)
    for (j in 1..3) {
        if (j == 2) break
        else println("j: " + j)
    }
}
println("--------continue--------------")
//continue
for (i in 1..3) {
    println("i :" + i)
    for (j in 1..3) {
        if (j == 2) continue
        else println("j: " + j)
    }
}

println("---------return-------------")
//return
fun returnFunction():Unit {
    for (i in 1..3) {
        println("i :" + i)
        for (j in 1..3) {
            if (j == 2) return
            else println("j: " + j)
        }
    }
}
returnFunction()
println("------break + label----------------")
//break + label
loop@for (i in 1..3) {
    println("i :" + i)
    for (j in 1..3) {
        if (j == 2) break@loop
        else println("j: " + j)
    }
}
println("---------continue+label-------------")
//continue+label
loop@for (i in 1..3) {
    println("i :" + i)
    for (j in 1..3) {
        if (j == 2) continue@loop
        else println("j: " + j)
    }
}

println("---------forEach------------")
//foreach는 continue와 break 사용 불가
//라벨과 foreach는 같이 잘 안쓴다.
listOf(1,2,3).forEach loop@{
    if(it==2) return@loop
    else println(it)
}

