# Large Logic for Mathematics and Statistics
¡Bienvenido al Lenguaje Llms para Estadística Lógica y Matemática! Este lenguaje está diseñado para facilitar la creación y manipulación de construcciones lógicas y matemáticas, específicamente dirigidas a operaciones y condiciones en dominios de estadística y aprendizaje automático. Este proyecto utiliza el framework Eclipse Xtext para definir su sintaxis y semántica.
## Características
- Operaciones: Defina clases con diversas funciones, variables, condicionales, bucles, sentencias de impresión y operaciones de aprendizaje automático.
- Funciones: Soporte para definir funciones con parámetros de entrada y salida.
- Variables: Soporte para definir variables con tipos de datos específicos.
- Bucles: Implementación de bucles for y while.
- Condicionales: Implementación de sentencias if, else-if y else.
- Sentencias de impresión: Impresión de varios tipos de datos.
- Aprendizaje automático: Definición de modelos de reconocimiento de imágenes con capas, funciones de activación, optimizadores y funciones de pérdida.
## Gramática
- Operations
- Functions
- Parameters Output
- Parameters Function
- Variable or Call
- Bodies
- Variable Parameter Arguments
- Assignment
- Loops
- For Loops
- While Loops
- Conditionals
- If Statements
- Else If Statements
- Else Statements
- Data Types
- Call Function
- Generic Variable
- Calls
- Call Variable
- Only Variable
- Logical Parameters
- Logical Operators
- Equality Condition
- Logical Operators 2
- Operation
- Arithmetic Operation
- Operators
- Primary Integers
- Data Types
- Primary Integers 2
- Numbers
- Strings
- Booleans
- Doubles
- Print Statements
- Tuples
- Activation Functions
- Softmax
- Sigmoid
- Relu
- Optimizer
- Adam
- SGD
- Loss Functions
- Sparse Categorical Crossentropy
- Machine Learning
- Image Recognition
## Cómo empezar
### Requisitos previos
- Kit de desarrollo de Java (JDK)
- IDE Eclipse con el plugin Xtext
## Instalación
1. Clone el repositorio:
   https://github.com/tarnishedAlexander/large-logic-for-mathematics-and-statistics.git
2. Abrir Eclipse IDE e importe el proyecto
3. Generar los artefactos Xtext:
   - Haga clic con el botón derecho en el proyecto en Eclipse.
   - Seleccione "Ejecutar como" > "Generar artefactos Xtext".
4. Ejecute el proyecto como una aplicación Eclipse para probar el editor de lenguaje Llms.
## Uso
- Cree un nuevo archivo Llms en el IDE de Eclipse.
- Defina sus clases, funciones, variables, bucles, condicionales y modelos de aprendizaje automático utilizando la gramática proporcionada.
## Ejemplos
### Definir una clase con una función
Class MyClass {
    function [result:int] <- myFunction(a:int, b:int) -> {
        a + b
    }
}
### For Loop
for (i:int : 10) -> {
    print(i)
}
### If-Else Conditionals
if (a < b) -> {
    print("a is less than b")
} else-if (a > b) -> {
    print("a is greater than b")
} else -> {
    print("a is equal to b")
}
### Machine Learning Model
@ML(im)
(t1:int, t2:int) <- ImageRecognition(genVar: int) Shape <- (32, 32, 3) -> (Features)[
    epochs <- 10,
    layer <- (nroNeurons <- 128, ActFunc <- relu, Dropout <- 0.5),
    layer <- (nroNeurons <- 10, ActFunc <- Softmax)
][Compiler
    Optimazer <- Adam,
    Loss <- SpareCategoricalCrossentropy
]

## Creadores
Este lenguaje fue creado por:

- Natalia Bilbao Cano, estudiante de 9no semestre de la carrera de Ingeniería en Sistemas Computacionales de la Universidad Privada Boliviana.
- Alexander Cruz Mamani, estudiante de 5to semestre de la carrera de Ingeniería en Sistemas Computacionales de la Universidad Privada Boliviana.
- 
Ambos autores han desarrollado este proyecto con la intención de facilitar la creación y manipulación de constructos lógicos y matemáticos, especialmente en el ámbito de la estadística y el aprendizaje automático.

Gracias por utilizar el lenguaje Llms para Lógica y Estadística Matemática! ¡Feliz programación!
