package multitestrepro.kotestspringmultitestrunnerrepro

import io.kotest.core.extensions.ApplyExtension
import io.kotest.core.spec.style.StringSpec
import io.kotest.extensions.spring.SpringExtension
import io.kotest.matchers.shouldBe
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest

// This annotation makes the two tests run together
// @SpringBootTest
// This annotation makes the two tests run together
// @WebMvcTest
// This annotation makes the two tests run together
// @DataJpaTest
// This annotation does not have this issue
//@ContextConfiguration
@ApplyExtension(SpringExtension::class)
class MultiTest : StringSpec({
    "something makes these tests run altogether" {
        1 + 1 shouldBe 2
    }

    "when I run this the first runs too, or the other way around" {
        1 + 1 shouldBe 2
    }
})