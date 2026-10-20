// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    "median of 1 is 1"{
        val list = listOf(1f)
        median(list) shouldBe 1
    }

    "median of 1,2 is 1.5"{
        val list = listOf(1f,2f)
        median(list) shouldBe 1.5f
    }

    "median of 1,2,3 is 2"{
        val list = listOf(1f,2f,3f)
        median(list) shouldBe 2
    }

    "median of 1,2,3,4 is 2.5"{
        val list = listOf(1f,2f,3f,4f)
        median(list) shouldBe 2.5f
    }

})


