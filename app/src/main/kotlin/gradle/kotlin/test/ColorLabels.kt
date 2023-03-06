// The example shows thirteen JLabel components; each of the labels has a different background colour. JLabel is
// usually used to display text; but it can display colours, too.
package gradle.kotlin.test

import java.awt.Color
import java.awt.Dimension
import java.awt.EventQueue
import javax.swing.GroupLayout
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.SwingConstants.LEADING

class ColorLabels {
    class StandardColors(title: String) : JFrame() {
        init {
            createUI(title)
        }

        private fun createUI(title: String) {
            val stdCols = arrayOf<Color>( // Built in Kotlin inline that returns an array of specified elements
                Color.black, Color.blue, Color.cyan, Color.darkGray,
                Color.gray, Color.green, Color.lightGray, Color.magenta,
                Color.orange, Color.pink, Color.red, Color.white, Color.yellow
            )

            /*** Learn more about these Kotlin inliners ***/
            val labels = stdCols.map { // Builtin Kt inline; returns list. read intellij documentation
                JLabel("", null, LEADING).apply {
                    minimumSize = Dimension(90, 40)
                    background = it
                    isOpaque = true
                }
            }

            createLayout(labels)

            setTitle(title)
            defaultCloseOperation = EXIT_ON_CLOSE
            setLocationRelativeTo(null)
        }

        private fun createLayout(labels: List<JLabel>) {
            val gl = GroupLayout(contentPane)
            contentPane.layout = gl

            gl.autoCreateContainerGaps = true
            gl.autoCreateGaps = true

            /*** Research this in Swing docs ***/
            gl.setHorizontalGroup(
                gl.createParallelGroup()
                    .addGroup(
                        gl.createSequentialGroup()
                            .addComponent(labels[0])
                            .addComponent(labels[1])
                            .addComponent(labels[2])
                            .addComponent(labels[3])
                    )
                    .addGroup(
                        gl.createSequentialGroup()
                            .addComponent(labels[4])
                            .addComponent(labels[5])
                            .addComponent(labels[6])
                            .addComponent(labels[7])
                    )
                    .addGroup(
                        gl.createSequentialGroup()
                            .addComponent(labels[8])
                            .addComponent(labels[9])
                            .addComponent(labels[10])
                            .addComponent(labels[11])
                    )
                    .addComponent(labels[12])
            )

            gl.setVerticalGroup(
                gl.createSequentialGroup()
                    .addGroup(
                        gl.createParallelGroup()
                            .addComponent(labels[0])
                            .addComponent(labels[1])
                            .addComponent(labels[2])
                            .addComponent(labels[3])
                    )
                    .addGroup(
                        gl.createParallelGroup()
                            .addComponent(labels[4])
                            .addComponent(labels[5])
                            .addComponent(labels[6])
                            .addComponent(labels[7])
                    )
                    .addGroup(
                        gl.createParallelGroup()
                            .addComponent(labels[8])
                            .addComponent(labels[9])
                            .addComponent(labels[10])
                            .addComponent(labels[11])
                    )
                    .addComponent(labels[12])
            )

            pack()
        }
    }

    private fun createAndShowGUI() {
        val frame = StandardColors("Close button")
        frame.isVisible = true
    }

    init {
        EventQueue.invokeLater(::createAndShowGUI)
    }
}