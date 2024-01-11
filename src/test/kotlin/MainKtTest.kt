import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import java.io.ByteArrayInputStream

class MainKtTest {

    @Test
    fun testSolicitarConsumoAgua() {
        val input = "123\n"
        System.setIn(ByteArrayInputStream(input.toByteArray()))

        assertEquals(123, solicitarConsumoAgua())
    }

    @Test
    fun testSolicitarFamiliaNombrosa() {
        val input = "1\n"
        System.setIn(ByteArrayInputStream(input.toByteArray()))

        assertTrue(solicitarFamiliaNombrosa())
    }

    @Test
    fun testSolicitarBoSocial() {
        val input = "2\n"
        System.setIn(ByteArrayInputStream(input.toByteArray()))

        assertFalse(solicitarBoSocial())
    }

    @Test
    fun testSolicitarNumeroMiembros() {
        val input = "4\n"
        System.setIn(ByteArrayInputStream(input.toByteArray()))

        assertEquals(4, solicitarNumeroMiembros())
    }

    @Test
    fun testOtroEjemploParaSolicitarConsumoAgua() {
        val input = "987\n"
        System.setIn(ByteArrayInputStream(input.toByteArray()))

        assertEquals(987, solicitarConsumoAgua())
    }

    @Test
    fun testSolicitarFamiliaNombrosaFalse() {
        val input = "0\n"
        System.setIn(ByteArrayInputStream(input.toByteArray()))

        assertFalse(solicitarFamiliaNombrosa())
    }

    @Test
    fun testSolicitarBoSocialTrue() {
        val input = "1\n"
        System.setIn(ByteArrayInputStream(input.toByteArray()))

        assertTrue(solicitarBoSocial())
    }

    @Test
    fun testSolicitarNumeroMiembrosZero() {
        val input = "0\n"
        System.setIn(ByteArrayInputStream(input.toByteArray()))

        assertEquals(0, solicitarNumeroMiembros())
    }
}
