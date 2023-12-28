import tornadofx.*
import kotlin.reflect.KClassifier

class Application : App() {
    override val primaryView = Calculator::class

    override fun start(stage: Stage) {
        importStylesheet(stylesheet:"/style.css")
        stage.isResizable = false
        super.start(stage)
    }
}