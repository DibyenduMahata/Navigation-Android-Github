package com.androidactivity.navigation_android_github

data class Person(
    val id: Int,
    val name: String,
    val age: Int,
    val email: String
)

val listOfPersons = listOf(
    Person(
        id = 100,
        name = "Person A",
        age = 10,
        email = "test_01@test.com"
    ),
    Person(
        id = 101,
        name = "Person B",
        age = 20,
        email = "test_02@test.com"
    ),
    Person(
        id = 102,
        name = "Person C",
        age = 30,
        email = "test_03@test.com"
    )
)