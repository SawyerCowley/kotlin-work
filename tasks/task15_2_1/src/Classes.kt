// Task 15.2.1: syntax for subclasses
fun main() {

open class Parent

open class Child : Parent()

class GrandChild : Child()

open class Person(val name: String)

class Student(name: String, val degree: String) : Person(name) {}

val s1 = Student("José", "informatica")
println(s1.name)
println(s1.degree)

}