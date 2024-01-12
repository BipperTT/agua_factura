# Factura del agua
<p align="center">
    <img src= https://github.com/BipperTT/agua_factura/assets/153605976/d995300b-c66b-4447-9649-6a1f39a8c108> 
</p>

## Descripción de la aplicación

A continuación se puede apreciar una aplicación programada con el pseudolenguaje Kotlin que calcula e informa el gasto de agua al usuario.

## Índice

* [Estructura del proyecto](#estructura-del-proyecto)
* [Resumen del proyecto](#resumen-del-proyecto)

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
- [src/main/kotlin/funcionsMullades.kt](src/main/kotlin/Functions.kt): Archivo donde se encuentran las funciones modulares para el funcionamiento óptimo de la aplicación.
- [src/main/kotlin/consoleColors.kt](src/main/kotlin/ConsoleColors.kt): Archivo donde se encuentran constantes para aplicar color a la consola. (Archivo obtenido gracias a raimonizard: https://github.com/raimonizard/kotlin)
- [src/main/kotlin/utilities.kt](src/main/kotlin/Utilities.kt): Archivo donde hay diversas funciones modulares. (Archivo obtenido gracias a raimonizard: https://github.com/raimonizard/kotlin)
- [src/test/kotlin/FunctionsKtTest.kt](src/test/kotlin/MainKtTest.kt): Se testea todas las funciones.




