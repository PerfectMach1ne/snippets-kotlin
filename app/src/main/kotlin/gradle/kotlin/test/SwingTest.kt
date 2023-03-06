// https://zetcode.com/kotlin/swing/
package gradle.kotlin.test

import java.awt.EventQueue
import javax.swing.JFrame
class SwingTest {
    init {
        EventQueue.invokeLater(::createAndShowGUI)
    }

    private fun createAndShowGUI() {
        val frame = PlainAssWindow("Helo ther") // Create app frame
        frame.isVisible = true // Show it on the screen
    }
}

class PlainAssWindow(title: String) : JFrame() { // Inherit JFrame, a top-level container
    init { createUI(title) }

    private fun createUI(title: String) {
        setTitle(title)

        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(700, 500)
        setLocationRelativeTo(null) // Center window on the screen (wasn't there a better way to do this?)
    }
}