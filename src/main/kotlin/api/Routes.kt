package api

import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.*

fun applyRoutes(app: Javalin) {
    app.routes {
        get("/") {ctx -> ctx.result("Greetings World!")}
    }
}