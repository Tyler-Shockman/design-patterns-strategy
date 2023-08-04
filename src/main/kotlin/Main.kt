import io.javalin.Javalin

fun main() {
    Javalin.create()
        .get("/") {ctx -> ctx.result("Greetings World!")}
        .start(7070)
}