```kotlin
fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val map = mutableMapOf<String, Int>("a" to 1, "b" to 2, "c" to 3)
    map.removeIf { it.value % 2 == 0 }
    println(map) // Output: {a=1, c=3}

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set.removeIf { it % 2 == 0 }
    println(set) // Output: [1, 3, 5]

    //This code will cause ConcurrentModificationException
    val arrayList = arrayListOf<Int>(1,2,3,4,5)
    for (item in arrayList){
        if (item %2 == 0) arrayList.remove(item)
    }
    println(arrayList)
}
```