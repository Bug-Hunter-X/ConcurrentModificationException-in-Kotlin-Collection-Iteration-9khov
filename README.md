# ConcurrentModificationException in Kotlin Collection Iteration

This repository demonstrates a common error in Kotlin when modifying a collection (List, Map, Set) while iterating through it using a traditional `for` loop. This action leads to a `ConcurrentModificationException`. The provided code showcases the issue and offers a corrected solution.

## Problem

The `bug.kt` file contains code that attempts to remove even numbers from a list while iterating through it using a standard `for` loop. This approach is unsafe and throws a `ConcurrentModificationException` because the underlying collection's structure is altered during iteration.

## Solution

The `bugSolution.kt` file demonstrates safe ways to modify collections during iteration, either by using iterators or by creating a new collection.

## How to Run

1. Clone this repository.
2. Open the project in your favorite Kotlin IDE (IntelliJ IDEA, Android Studio).
3. Run the Kotlin files.

Observe the difference in behavior between the buggy and the corrected code.