// https://zetcode.com/kotlin/swing/
package gradle.kotlin.test

import java.awt.EventQueue
import javax.swing.JFrame
class SwingTest {
    init {
        EventQueue.invokeLater(::createAndShowGUI)
    }

    private fun createAndShowGUI() {
        val frame = PlainAssWindow("Helo ther")
        frame.isVisible = true
    }
}

class PlainAssWindow(title: String) : JFrame() {
    init { createUI(title) }

    private fun createUI(title: String) {
        setTitle(title)

        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(500, 700)
        setLocationRelativeTo(null)
    }
}