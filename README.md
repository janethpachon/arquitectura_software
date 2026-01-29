# NumLogic Explorer 
- NumLogic Explorer es una aplicación educativa desarrollada en Java como programa de consola, cuyo objetivo es fortalecer el razonamiento lógico del usuario mediante un juego de adivinanza de números. El sistema permite interactuar de forma sencilla, recibir retroalimentación inmediata y analizar el desempeño del usuario a través de métricas básicas.

- Este proyecto fue desarrollado como parte de la asignatura **Arquitectura de Software**, aplicando buenas prácticas de diseño, el patrón arquitectónico Modelo–Vista–Controlador (MVC) y un ciclo de vida de desarrollo de software completo.
---
## Funcionalidades principales

- Generación de un número secreto de forma aleatoria.
- Selección de niveles de dificultad (básico, intermedio y avanzado).
- Validación de entradas no numéricas.
- Control de valores fuera del rango permitido.
- Comparación del número ingresado con el número secreto.
- Mensajes de retroalimentación (“es mayor”, “es menor”).
- Conteo de intentos realizados.
- Cálculo del tiempo transcurrido durante la partida.
- Visualización del resultado final del juego.
---
## Arquitectura del sistema

El sistema está diseñado siguiendo el patrón **Modelo–Vista–Controlador (MVC)**, lo que permite una clara separación de responsabilidades:

- **Modelo:** gestiona la lógica del negocio, incluyendo el número secreto, los intentos y el tiempo.
- **Vista:** maneja la interacción con el usuario a través de la consola.
- **Controlador:** coordina el flujo del sistema y la comunicación entre el modelo y la vista.

Esta arquitectura facilita la mantenibilidad y la evolución del sistema.
---
##  Tecnologías utilizadas
- Lenguaje de programación: **Java**
- Tipo de aplicación: **Consola**
- Paradigma: **Programación Orientada a Objetos**
- Diagramación: **UML**
- Control de versiones: **Git / GitHub**

---
## Ejecución del programa
1. Clona el repositorio:
   ```bash
   git clone https://github.com/janethpachon/arquitectura_software
---
2. Accede al directorio del proyecto:
- cd NumLogicExplorer
3. Compila el programa:
- javac NumLogicExplorer.java
4. Ejecuta la aplicación:
- java NumLogicExplorer

---
## Pruebas del sistema
El sistema fue validado mediante pruebas unitarias y pruebas de frontera, incluyendo:
- Ingreso de valores no numéricos.
- Ingreso de números fuera del rango permitido.
- Validación del incremento del contador de intentos.
- Verificación del cálculo del tiempo transcurrido.
- Comprobación del resultado final del juego.
Las evidencias de estas pruebas se documentan en el informe académico asociado al proyecto.
---
## Documentación
La documentación completa del proyecto incluye:
- Especificación de requisitos.
- Diseño de software (diagramas UML).
- Implementación del sistema.
- Pruebas y evidencias.
- Conclusiones.
---
## Autor
- Janeth Jelitza Pachon vega
---
## licencia
E- ste proyecto se desarrolla con fines académicos y educativos.

