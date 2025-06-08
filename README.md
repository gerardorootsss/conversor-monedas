# 💱 Conversor de Monedas en Java

Este es un proyecto simple de conversor de monedas desarrollado en Java. Permite convertir entre diferentes monedas utilizando tasas de cambio actualizadas.

## 📌 Características

- Conversión entre múltiples monedas (USD, EUR, CLP, etc.)
- Interfaz de línea de comandos 
- Posibilidad de usar tasas de cambio actualizadas desde una API externa (como [exchangerate-api.com](https://www.exchangerate-api.com/))

## 🛠️ Tecnologías utilizadas

- Java 21.
- IDE utilizado: IntelliJ IDEA 
- (Opcional) JSON parser como `Gson` o `Jackson`

## 📦 Instalación y ejecución

1. Clonar el repositorio

git clone https://github.com/tu-usuario/conversor-monedas-java.git
cd conversor-monedas-java

2. Compilar el proyecto

javac -d bin src/*.java

3. Ejecutar el programa

java -cp bin Main

Asegúrate de que la clase principal se llama Main.java y contiene el método public static void main.

💡 Ejemplo de uso

Bienvenido al conversor de monedas
Ingrese la moneda de origen (ej: USD):
> USD
Ingrese la moneda de destino (ej: CLP):
> CLP
Ingrese la cantidad:
> 100
Resultado: 100 USD = 93.000 CLP


🌐 API utilizada (opcional)
Si tu proyecto obtiene tasas de cambio en tiempo real, puedes incluir:

API: ExchangeRate API

Endpoint usado: https://v6.exchangerate-api.com/v6/YOUR_API_KEY/pair/USD/CLP

📂 Estructura del proyecto
css
Copiar
Editar
conversor-monedas-java/
│
├── src/
│   ├── Main.java
│   ├── Conversor.java
│   └── ApiService.java
│
├── bin/
│
└── README.md

✅ Tareas pendientes

 -Agregar soporte para más monedas
 -Mejorar manejo de errores
 -Agregar interfaz gráfica.
 

🙋‍♂️ Autor
Tu Nombre - @gerardorootsss
