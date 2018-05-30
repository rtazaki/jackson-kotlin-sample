package test

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

data class Test(val first: TestNode, val second: TestNode, val third: TestNode)
data class TestNode(var oldpara: Double, var oldpara2: Double, var newpara: DoubleArray)
data class Test2(val first: TestNode2, val second: TestNode2, val third: TestNode2)
data class TestNode2(var oldpara: String, var oldpara2: String, var newpara: Array<String>)
data class Test3(val n1: TestNode3, val n2: TestNode3, val n3: TestNode3,
                 val n4: TestNode3, val n5: TestNode3, val n6: TestNode3)

data class TestNode3(var oldpara: Any, var oldpara2: Any, var newpara: Array<Any>)

fun main(args: Array<String>) {
    println("Hello")
    val mapper = jacksonObjectMapper()
    val test = mapper.readValue<Test>(ClassLoader.getSystemResource("Test.json"))
    val test2 = mapper.readValue<Test2>(ClassLoader.getSystemResource("Test2.json"))
    val test3 = mapper.readValue<Test3>(ClassLoader.getSystemResource("Test3.json"))
    println(test)
    println(test2)
    println(test3)
//    test.first.oldpara = 1.2
//    test2.first.oldpara2 = "hoge"
//    test3.n1.oldpara = 3.14
//    test3.n4.oldpara2 = "aaaaaaaa"
//    mapper.writerWithDefaultPrettyPrinter().writeValueAsString(test)
//    mapper.writerWithDefaultPrettyPrinter().writeValueAsString(test2)
//    mapper.writerWithDefaultPrettyPrinter().writeValueAsString(test3)
//    mapper.writeValue(ClassLoader.getSystemResource("Test.json"), test)
//    test.first.newpara = [1.2, 2.3]
//    test3.n1.newpara = [9.8, 4.2, 3.14]
}