NumLogicExplorer

NumLogicExplorer es un juego de consola desarrollado en Java donde el usuario debe adivinar un número secreto generado aleatoriamente según el nivel de dificultad seleccionado.
El proyecto aplica el patrón MVC (Modelo–Vista–Controlador) para separar la lógica del negocio, la interacción con el usuario y el control del flujo del juego.

Características principales

Selección de niveles de dificultad

Básico: números del 1 al 10

Intermedio: números del 1 al 100

Avanzado: números del 1 al 1000

Validación de entradas numéricas

Mensajes de ayuda (“Es mayor”, “Es menor”)

Conteo de intentos

Medición del tiempo total de juego

Arquitectura basada en MVC

🛠️ Tecnologías utilizadas

Lenguaje: Java

Entrada de datos: Scanner

Generación aleatoria: Random

Control de errores: InputMismatchException

Paradigma: Programación Orientada a Objetos (POO)

Estructura del proyecto
NumLogicExplorer/
│
├── GameModel.java        // Lógica del juego y reglas
├── GameView.java         // Interacción con el usuario
├── GameController.java  // Control del flujo del juego
└── NumLogicExplorer.java// Clase principal (main)

 Descripción de las clases
🔹 GameModel

Encargada de la lógica del juego.

Responsabilidades:

Generar el número secreto

Validar si el número ingresado está dentro del rango

Comparar el número del usuario con el número secreto

Contar intentos

Calcular el tiempo transcurrido

🔹 GameView

Encargada de la interacción con el usuario.

Responsabilidades:

Mostrar mensajes en consola

Solicitar el nivel de dificultad

Leer y validar la entrada del usuario

🔹 GameController

Actúa como intermediario entre el modelo y la vista.

Responsabilidades:

Inicializar el juego

Controlar el ciclo principal

Validar las jugadas

Mostrar resultados finales

🔹 NumLogicExplorer

Clase principal que contiene el método main.

Responsabilidad:

Iniciar la ejecución del programa

 Cómo ejecutar el proyecto

Clona el repositorio:

git clone https://github.com/tu-usuario/NumLogicExplorer.git


Entra a la carpeta del proyecto:

cd NumLogicExplorer


Compila el programa:

javac NumLogicExplorer.java


Ejecuta el juego:

java NumLogicExplorer

Ejemplo de ejecución
Seleccione nivel de dificultad:
1. Básico (1-10)
2. Intermedio (1-100)
3. Avanzado (1-1000)
Ingrese un número: 50
Es menor
Ingrese un número: 25
Es mayor
Ingrese un número: 32
¡Adivinaste!
Intentos: 5
Tiempo: 18 segundos

 Conceptos aplicados

Programación Orientada a Objetos (POO)

Patrón de diseño MVC

Manejo de excepciones

Control de flujo

Buenas prácticas de organización de código
Autor

Janeth Jelitza Pachón Vega
Estudiante de programación
Proyecto académico en Java