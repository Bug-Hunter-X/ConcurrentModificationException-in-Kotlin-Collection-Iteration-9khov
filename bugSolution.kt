```kotlin
fun main() {
    val arrayList = arrayListOf<Int>(1, 2, 3, 4, 5)

    // Solution 1: Using an iterator
    val iterator = arrayList.iterator()
    while (iterator.hasNext()) {
        val item = iterator.next()
        if (item % 2 == 0) {
            iterator.remove()
        }
    }
    println("Solution 1 (Iterator): $arrayList")

    // Solution 2: Create a new list
    val arrayList2 = arrayListOf<Int>(1, 2, 3, 4, 5)
    val newList = arrayList2.filter { it % 2 != 0 }
    println("Solution 2 (New List): $newList") 
    
    // Solution 3: Using removeIf (for MutableList, MutableSet, MutableMap)
    val arrayList3 = arrayListOf<Int>(1,2,3,4,5)
    arrayList3.removeIf { it % 2 == 0 }
    println("Solution 3 (removeIf): $arrayList3")
}
```