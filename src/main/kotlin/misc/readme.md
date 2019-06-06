`Excerpt from Head First Kotlin
`

Visibility modifiers - public, private, protected and internal

---

**_public_**	Makes the declaration visible everywhere. This is applied by default, so it can be omitted.

**_private_**	Makes the declaration visible to code inside its source file, but invisible elsewhere.

**_internal_**	Makes the declaration visible inside the same module, but invisible elsewhere. A module is a set of Kotlin files that are compiled together, such as an IntelliJ IDEA module.

**_protected_**	Makes the member visible inside the class, and any of its subclasses.


---
enum class 

---
sealed class to overcome the drawbacks of enum

1. Each value is a constant which only exists as a single instance. You can’t, say, change the msg property of the value in one situation, as this change will be seen everywhere else in your application.
2. Each value must have the same properties and functions. It might be useful to add an Exception property to the FAILURE value so that you can examine what went wrong, but an enum class won’t let you.

`enum class MessageType(var status: String){
    SUCCESS("Yay!"),
    FAILURE("Boo!")
}`

---

