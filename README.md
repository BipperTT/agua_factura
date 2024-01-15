# Factura del agua
<div align="center">
    <img src= https://github.com/BipperTT/agua_factura/assets/153605976/d995300b-c66b-4447-9649-6a1f39a8c108> 
</div>

<div align="center">    
    <img src= https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white>
    <img src= https://img.shields.io/badge/Kotlin-0095D5?&style=for-the-badge&logo=kotlin&logoColor=white>
</div>

<div align="center">
    <img src= https://img.shields.io/github/repo-size/BipperTT/agua_factura>
    <img src= https://img.shields.io/github/commit-activity/t/BipperTT/agua_factura?color=green>
    <img src= https://img.shields.io/github/last-commit/BipperTT/agua_factura/main?color=green>
</div>

## Descripción de la aplicación

A continuación se puede apreciar una aplicación programada con el pseudocódigo Kotlin, que calcula e informa del gasto de agua al usuario.

## Índice

* [Estructura del proyecto](#estructura-del-proyecto)
* [Resumen del proyecto](#resumen-del-proyecto)
* [Ejecución](#ejecución)
* [Agradecimientos](#agradecimientos)

## Estructura del proyecto

```bash
├── .gitignore
├── .idea
│   ├── .gitignore
│   ├── gradle.xml
│   ├── kotlinc.xml
│   ├── misc.xml
│   ├── vcs.xml
│   └── inspectionProfiles
│       └── Project_Default.xml
├── build.gradle
├── gradle.properties
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── settings.gradle
└── src
    ├── main
    │   └── kotlin
    │       ├── funcionsMullades.kt
    │       ├── Main.kt
    │       ├── consoleColors.kt
    │       └── utilities.kt
    └── test
        └── kotlin
            └── MainKtTest.kt
```
## Resumen del proyecto

- [src/main/kotlin/Main.kt](src/main/kotlin/Main.kt): La función principal del proyecto.
- [src/main/kotlin/funcionsMullades.kt](src/main/kotlin/funcionsMullades.kt): Archivo donde se encuentran las funciones modulares para el funcionamiento óptimo de la aplicación.
- [src/main/kotlin/consoleColors.kt](src/main/kotlin/ConsoleColors.kt): Archivo donde se encuentran constantes para aplicar color a la consola. (Archivo obtenido gracias a raimonizard: https://github.com/raimonizard/kotlin)
- [src/main/kotlin/utilities.kt](src/main/kotlin/Utilities.kt): Archivo donde hay diversas funciones modulares. (Archivo obtenido gracias a raimonizard: https://github.com/raimonizard/kotlin)
- [src/test/kotlin/MainKtTest.kt](src/test/kotlin/MainKtTest.kt): Se testea todas las funciones.

## Ejecución

> [!CAUTION]
> Para ejecutar este programa se recomienda **Amazon Corretto 17 SDK**.



<div style="text-align: center;">
    <h6 align= center>Se piden datos</h6>
    <p align= center style="display: inline-block; margin: 10px;">
        <img src="https://github.com/BipperTT/agua_factura/assets/153605976/74829538-278c-4d4d-bcdc-69f5c35c6306" alt="Ejecucion donde pide los datos" height="258" width="513">
    </p>
    <h6 align= center>Se muestran los resultados</h6>
    <p align= center style="display: inline-block; margin: 10px; align: center;">
        <img src="https://github.com/BipperTT/agua_factura/assets/153605976/f2ba4142-522a-4e54-b206-965c62d96f7f" alt="Enseña los resultados" height="258" width="513">
    </p>
</div>

## Agradecimientos

Muchas gracias por investigar sobre esta aplicación, si tienes alguna sugerencia se escuchará atentamente.
