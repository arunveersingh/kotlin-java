package builtinhigherorderfunctions

data class Grocery(val name: String, val category: String,
                   val unit: String, val unitPrice: Double,
                   val quantity: Int)


fun main(){
    val grocery = listOf(
        Grocery("Mushroom", "Veggie", "kg", 5.00, 3),
        Grocery("Patty", "Bakery", "Pack", 1.5, 1),
        Grocery("Olive Oil", "Pantry", "Bottle", 4.0, 1),
        Grocery("Ice Cream", "Frozen", "Pack", 3.0, 2),
        Grocery("Tomato", "Veggie", "kg", 6.0, 2)
    )

    val ints = listOf(1, 2, 3, 5, 7 ,0, 11)
    val alphabets = listOf("apple", "b", "cake", "ebay", "z", "x")

    println(ints.max())
    println(ints.min())
    println(ints.first())

    println(alphabets.max())
    println(alphabets.min())
    println(alphabets.first())
    println(alphabets.sorted())

    println("grocery with max unit price ${grocery.maxBy { i: Grocery -> i.unitPrice }}")
    println("grocery with max quantity ${grocery.maxBy { i -> i.quantity }}")
    println("grocery with max unit price ${grocery.maxBy { it.unitPrice }}")

    println("sum of unit price is ${grocery.sumByDouble { it.unitPrice }}")
    println("sum of quantity is ${grocery.sumBy { it.quantity }}")

    val vegetables = grocery.filter { it.category == "Veggie" }
    println("vegetables are $vegetables")

    val unitPriceOver3 = grocery.filter { it.unitPrice > 3.00 }
    println("unit price over 3 : $unitPriceOver3")

    val list = mutableListOf<Grocery>()
    list.add(Grocery("Green Tomato", "Veggie", "kg", 6.0, 2))

    // Appends filtered elements to the list
    val filterTo = grocery.filterTo(list, { it.unitPrice > 3.00 })
    println("filterTo mutable list is $filterTo")

    val intsToDoubles = ints.map { it * 1.00 }
    println("ints to doubles $intsToDoubles")

    val groceryNames = grocery.map { it.name }
    println("grocery names $groceryNames")

    println("combine filter and map ${grocery.filter { it.unitPrice > 3.00 }.map { it.unitPrice * 2}}")

    grocery.forEach { println(it.name)}

    grocery.groupBy { it.category }.forEach{ println("key is ${it.key}")}
    grocery.groupBy { it.category }.forEach{ println("value is ${it.value}")}

    val groupByCategory = grocery.groupBy { it.category }
    println("groupByCategory --- $groupByCategory")
    println("type of groupByCategory ${groupByCategory::class.java}")

    val sumOfInts = ints.fold(1){initial, item -> initial + item}
    println("sum of ints $sumOfInts")

    val groceryNamesConcat = grocery.fold(""){initial, item -> "$initial ${item.name},"}
    println(groceryNamesConcat)
}