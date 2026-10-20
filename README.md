Este programa está diseñado para modelar y gestionar la lectura y conversión de temperatura mediante un **termómetro inteligente (IoT)** utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

* **Define la clase `TermometroIoT`:** Modela el dispositivo sensor resguardando su atributo principal de manera privada (`temperaturaCelsius`).
* **Incorpora el constructor:** Permite inicializar el objeto asignándole un valor de temperatura inicial en grados Celsius al momento de crearlo.
* **Calcula la conversión (`obtenerFahrenheit`):** Implementa un método que aplica la fórmula matemática de conversión ($F = C \times \frac{9}{5} + 32$) para transformar el valor almacenado a grados Fahrenheit y retornar el resultado.
* **Ejecuta la prueba (`main`):** Instancia el objeto de tipo `TermometroIoT` con un valor térmico específico, ejecuta la conversión de unidades y muestra ambos valores térmicos por consola.
