`Excerpt from HeadFirst Kotlin
`

The lambda body specifies the criteria that should be used to determine the lowest—or highest—value in the collection. This criteria is normally the name of a property—for example, { it.unitPrice }. It can be any type, just so long as the function can use it to determine which item has the lowest or highest property value.

_minBy and maxBy work with collections that hold any type of object, making them much more flexible than min and max._

---
In practice, min and max work with any type that implements Comparable. Instead of implementing Comparable in your own classes, however, we think that using the minBy and maxBy functions is a better approach as they give you more flexibility.

---
sumBy, sumByDouble

---
filterTo, filterNot

---
map

---
The map function takes the items in a collection, and transforms each one according to some formula that you specify. It returns the results of this transformation as a new List.

---
combine filter and map

`    println("combine filter and map ${grocery.filter { it.unitPrice > 3.00 }.map { it.unitPrice * 2}}")
`    
---
 
forEach

---
groupBy

---
fold

---
reduce

If you want to use the first item in the collection as the initial value, however, an alternative approach is to use the reduce function. This function works in a similar way to fold, except that you don’t have to specify the initial value. It automatically uses the first item in the collection as the initial value.
