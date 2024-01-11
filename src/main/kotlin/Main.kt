fun main() {
    val consumLitres = solicitarConsumoAgua()
    val familiaNombrosa = if (solicitarFamiliaNombrosa()) 1 else 2
    val membresFamilia = if (familiaNombrosa == 1) solicitarNumeroMiembros() else 0
    val boSocial = if (solicitarBoSocial()) 1 else 2
    val factura = calcularCostoFactura(consumLitres, familiaNombrosa, membresFamilia, boSocial)

    mostrarDetallesFactura(factura)
}
