import api.applyRoutes
import io.javalin.Javalin

const val port = 7070

fun main() {
    val app = Javalin.create()
    applyRoutes(app)
    app.start(port)
}