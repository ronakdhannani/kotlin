package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

data class DataClass(yield: String) {
    init {
        testRenamed("yield", { yield })
    }
}

fun box(): String {
    DataClass("123")

    return "OK"
}