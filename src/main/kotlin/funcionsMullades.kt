
fun solicitarConsumoAgua(): Int {
    var consumo: Int
    do {
        println("Ingresar el consumo de litros de agua:")
        val input = readLine()
        consumo = input?.toIntOrNull() ?: 0
    } while (consumo == 0)
    return consumo
}

fun solicitarFamiliaNombrosa(): Boolean {
    var respuesta: Int
    do {
        println("¿Tiene familia numerosa? (1: Sí / 2: No):")
        respuesta = readLine()?.toIntOrNull() ?: 0
    } while (respuesta !in listOf(1, 2))
    return respuesta == 1
}

fun solicitarBoSocial(): Boolean {
    var respuesta: Int
    do {
        println("¿Tiene Bono Social? (1: Sí / 2: No):")
        respuesta = readLine()?.toIntOrNull() ?: 0
    } while (respuesta !in listOf(1, 2))
    return respuesta == 1
}

fun solicitarNumeroMiembros(): Int {
    var miembros: Int
    do {
        println("¿Cuántos miembros tiene la familia?")
        val input = readLine()
        miembros = input?.toIntOrNull() ?: 0
    } while (miembros == 0)
    return miembros
}

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

data class Factura(
    val quotaFixa: Double,
    val consumoLitros: Double,
    val descompteFamiliaNombrosaTotal: Double,
    val costoConsumo: Double,
    val totalPagar: Double,
    val descompteBoFinal: Double
)

fun mostrarDetallesFactura(factura: Factura) {
    println("\nDetalles de la factura:")
    println("Cuota fija de mantenimiento: ${factura.quotaFixa}€")
    println("Consumo de litros de agua: ${factura.consumoLitros} litres")
    println("Precio de consumo sin descuento: ${factura.costoConsumo + factura.descompteFamiliaNombrosaTotal + factura.descompteBoFinal}€")
    if (factura.descompteFamiliaNombrosaTotal > factura.descompteBoFinal){
        println("Descuento de familia numerosa: ${factura.descompteFamiliaNombrosaTotal}€")
    }else{ println("Descuento de Bono Social: ${factura.descompteBoFinal}€")}
    println("Costo del consumo: ${factura.costoConsumo}€")
    println("Total a pagar: ${factura.totalPagar}€")
}

