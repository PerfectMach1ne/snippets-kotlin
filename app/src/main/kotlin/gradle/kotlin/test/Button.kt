package gradle.kotlin.test

import java.awt.EventQueue
import javax.swing.GroupLayout
import javax.swing.JButton
import javax.swing.JComponent
import javax.swing.JFrame

import kotlin.system.exitProcess

class Button {
    class CloseButton(title: String) : JFrame() {
        init {
            createUI(title)
        }

        private fun createUI(title: String) {
            setTitle(title)

            val closeBtn = JButton("Close") // Create a button component
            closeBtn.addActionListener { exitProcess(0) } // Add the action listener with a Kotlin terminate
            // app method

            // Child components need to be placed in containers. This function/method does that.
            createLayout(closeBtn)

            defaultCloseOperation = EXIT_ON_CLOSE
            setSize(500,400)
            setLocationRelativeTo(null)
        }

        private fun createLayout(vararg arg: JComponent) {
            /* The content pane of a JFrame is an area where child components are placed. The children are organised by
             specialised non-visible components called layout managers. BorderLayout is the default layout manager of a
             content pane. This manager is very simple and is useful only in limited cases. We use the GroupLayout
             manager which is more powerful and flexible. */
            val gl = GroupLayout(contentPane)
            contentPane.layout = gl

            // Create gaps between components and the edges of the container automatically.
            gl.autoCreateContainerGaps = true

            /* GroupLayout manager defines the layout for each dimension independently. In one step, we lay out
             components alongside the horizontal axis; in the other step, we lay out components along the vertical axis.
              In both kinds of layouts we can arrange components sequentially or in parallel. In a horizontal layout, a
               row of components is called a sequential group and a column of components is called a parallel group. In
               a vertical layout, a column of components is called a sequential group and a row of components a
               parallel group. */
            gl.setHorizontalGroup(
                gl.createSequentialGroup().addComponent(arg[0])
            )

            gl.setVerticalGroup(
                gl.createSequentialGroup().addComponent(arg[0])
            )

            pack()
        }
    }

    private fun createAndShowGUI() {
        val frame = CloseButton("Close button")
        frame.isVisible = true
    }

    init {
        EventQueue.invokeLater(::createAndShowGUI)
    }
}