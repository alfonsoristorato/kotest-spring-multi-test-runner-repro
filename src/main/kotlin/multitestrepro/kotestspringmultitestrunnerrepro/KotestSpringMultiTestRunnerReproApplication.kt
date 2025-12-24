package multitestrepro.kotestspringmultitestrunnerrepro

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotestSpringMultiTestRunnerReproApplication

fun main(args: Array<String>) {
    runApplication<KotestSpringMultiTestRunnerReproApplication>(*args)
}
