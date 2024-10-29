interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun focus()
    fun showOff() = println("I'm focusable!")
}

class Button : Clickable, Focusable {
    override fun click() {
        println("I'm clickable!")
    }
    override fun focus() {
        println("I'm focusable!")
    }

    override fun showOff() {
        println("I'm button!")
    }
}

fun main() {
    Button().click()
}