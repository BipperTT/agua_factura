import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MainKtTest {
    private fun provideInput(input: String, testFunction: () -> Unit) {
        System.setIn(input.byteInputStream())
        testFunction()
        System.setIn(System.`in`)
    }

    @Test
    fun testSolicitarConsumoAgua() {
        val input = "123\n"
        provideInput(input) {
            assertEquals(123, solicitarConsumoAgua())
        }
    }

    @Test
    fun testSolicitarFamiliaNombrosa() {
        val input = "1\n"
        provideInput(input) {
            assertTrue(solicitarFamiliaNombrosa())
        }
    }

    @Test
    fun testSolicitarBoSocial() {
        val input = "2\n"
        provideInput(input) {
            assertFalse(solicitarBoSocial())
        }
    }

    @Test
    fun testSolicitarNumeroMiembros() {
        val input = "4\n"
        provideInput(input) {
            assertEquals(4, solicitarNumeroMiembros())
        }
    }

    @Test
    fun testOtroEjemploParaSolicitarConsumoAgua() {
        val input = "987\n"
        provideInput(input) {
            assertEquals(987, solicitarConsumoAgua())
        }
    }

    @Test
    fun testSolicitarFamiliaNombrosaFalse() {
        val input = "0\n"
        provideInput(input) {
            assertFalse(solicitarFamiliaNombrosa())
        }
    }

    @Test
    fun testSolicitarBoSocialTrue() {
        val input = "1\n"
        provideInput(input) {
            assertTrue(solicitarBoSocial())
        }
    }

    @Test
    fun testSolicitarNumeroMiembrosZero() {
        val input = "0\n"
        provideInput(input) {
            assertEquals(0, solicitarNumeroMiembros())
        }
    }
}
