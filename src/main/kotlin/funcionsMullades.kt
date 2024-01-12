/**
 * Solicita al usuario ingresar el consumo de litros de agua.
 * @author BipperTT
 * @since 10/01/2024
 * @return El consumo de litros de agua ingresado por el usuario.
 */
fun solicitarConsumoAgua(): Int {
    var consumo: Int
    do {
        println("${WHITE}Ingresar el consumo de litros de agua:${RESET}")
        val input = readLine()
        consumo = input?.toIntOrNull() ?: 0
    } while (consumo == 0)
    return consumo
}

/**
 * Solicita al usuario si tiene familia numerosa.
 * @author BipperTT
 * @since 10/01/2024
 * @return True si el usuario tiene familia numerosa, False en caso contrario.
*/
fun solicitarFamiliaNombrosa(): Boolean {
    var respuesta: Int
    do {
        println("${WHITE}¿Tiene familia numerosa? (${GREEN}1: Sí${RESET} / ${RED}2: No${RESET}):${RESET}")
        respuesta = readLine()?.toIntOrNull() ?: 0
    } while (respuesta !in listOf(1, 2))
    return respuesta == 1
}

/**
 * Solicita al usuario si tiene Bono Social.
 * @author BipperTT
 * @since 10/01/2024
 * @return True si el usuario tiene Bono Social, False en caso contrario.
 */
fun solicitarBoSocial(): Boolean {
    var respuesta: Int
    do {
        println("${WHITE}¿Tiene Bono Social? (${GREEN}1: Sí${RESET} / ${RED}2: No${RESET}):${RESET}")
        respuesta = readLine()?.toIntOrNull() ?: 0
    } while (respuesta !in listOf(1, 2))
    return respuesta == 1
}

/**
 * Solicita al usuario ingresar el número de miembros de la familia.
 * @author BipperTT
 * @since 10/01/2024
 * @return El número de miembros de la familia ingresado por el usuario.
 */
fun solicitarNumeroMiembros(): Int {
    var miembros: Int
    do {
        println("${WHITE}¿Cuántos miembros tiene la familia?${RESET}")
        val input = readLine()
        miembros = input?.toIntOrNull() ?: 0
    } while (miembros == 0)
    return miembros
}

/**
 * Calcula el costo de la factura en función de los parámetros dados.
 * @author BipperTT
 * @since 10/01/2024
 * @param consumLitres Consumo de litros de agua.
 * @param familiaNombrosa Indica si la familia es numerosa (1: Sí, 2: No).
 * @param membresFamilia Número de miembros de la familia.
 * @param boSocial Indica si tiene Bono Social (1: Sí, 2: No).
 * @return Un objeto Factura con los detalles del costo.
 */
fun calcularCostoFactura(consumLitres: Int, familiaNombrosa: Int, membresFamilia: Int, boSocial: Int): Factura {
    val quotaFixaManteniment = 6.0
    val preuLitresMenor50 = 0.0
    val preuLitresEntre50i200 = 0.15
    val preuLitresMajor200 = 0.30
    val descompteBoSocial = 0.8
    val quotaFixaReduidaBoSocial = 3.0
    var descompteFamiliaNombrosaTotal= 0.0
    var descompteBoFinal= 0.0
    var quotaFixa = quotaFixaManteniment


    var costConsum = when {
        consumLitres < 50 -> preuLitresMenor50
        consumLitres in 50..200 -> preuLitresEntre50i200 * consumLitres
        else -> preuLitresMajor200 * consumLitres
    }

    var descompteFamiliaNombrosa = if (familiaNombrosa == 1) ( 0.1 * membresFamilia) else 0.0

    if (descompteFamiliaNombrosa>0.5){descompteFamiliaNombrosa=0.5}

    if (boSocial == 1) {
        quotaFixa = quotaFixaReduidaBoSocial
        descompteBoFinal = descompteBoSocial * costConsum
    }else if (boSocial == 2){descompteFamiliaNombrosaTotal = descompteFamiliaNombrosa * costConsum}

    costConsum -= descompteBoFinal
    costConsum -= descompteFamiliaNombrosaTotal

    val totalPagar = quotaFixa + costConsum

    return Factura(quotaFixa, consumLitres.toDouble(), descompteFamiliaNombrosaTotal, costConsum, totalPagar, descompteBoFinal)
}

/**
 * Clase que representa una factura con varios detalles.
 * @author BipperTT
 * @since 10/01/2024
 * @property quotaFixa Cuota fija de mantenimiento.
 * @property consumoLitros Consumo de litros de agua.
 * @property descompteFamiliaNombrosaTotal Descuento total por familia numerosa.
 * @property costoConsumo Costo del consumo de agua.
 * @property totalPagar Total a pagar, incluyendo descuentos y cuota fija.
 * @property descompteBoFinal Descuento final por Bono Social.
 */
data class Factura(
    val quotaFixa: Double,
    val consumoLitros: Double,
    val descompteFamiliaNombrosaTotal: Double,
    val costoConsumo: Double,
    val totalPagar: Double,
    val descompteBoFinal: Double
)

/**
 * Muestra los detalles de la factura en la consola.
 * @author BipperTT
 * @since 10/01/2024
 * @param factura La factura a mostrar.
 */
fun mostrarDetallesFactura(factura: Factura) {
    println("${WHITE_BOLD}\nDetalles de la factura:${RESET}")
    println("${WHITE}Cuota fija de mantenimiento: ${factura.quotaFixa}€${RESET}")
    println("${WHITE}Consumo de litros de agua: ${factura.consumoLitros} litres${RESET}")
    println("${WHITE}Precio de consumo sin descuento: ${factura.costoConsumo + factura.descompteFamiliaNombrosaTotal + factura.descompteBoFinal}€${RESET}")
    if (factura.descompteFamiliaNombrosaTotal > factura.descompteBoFinal) {
        println("${YELLOW}Descuento de familia numerosa: ${factura.descompteFamiliaNombrosaTotal}€${RESET}")
    } else {
        println("${YELLOW}Descuento de Bono Social: ${factura.descompteBoFinal}€${RESET}")
    }
    println("${WHITE}Costo del consumo: ${factura.costoConsumo}€${RESET}")
    println("${WHITE_BOLD}Total a pagar: ${factura.totalPagar}€${RESET}")
}

