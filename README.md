# 💱 Conversor de Monedas en Java

Este es un proyecto simple de conversor de monedas desarrollado en Java. Permite convertir entre diferentes monedas utilizando tasas de cambio actualizadas.

## 📌 Características
```
- Conversión entre múltiples monedas (USD, EUR, CLP, etc.)
- Interfaz de línea de comandos 
- Posibilidad de usar tasas de cambio actualizadas desde una API externa (como [exchangerate-api.com](https://www.exchangerate-api.com/))
```
## 🛠️ Tecnologías utilizadas
```
- Java 21.
- IDE utilizado: IntelliJ IDEA 
- JSON parser como `Gson`
```
## 📦 Instalación y ejecución
# 1. Clonar el repositorio
```bash
* git clone https://github.com/tu-usuario/conversor-monedas-java.git
cd conversor-monedas-java
```

# 2. Compilar el proyecto
```bash
* javac -d bin src/*.java
```
# 3. Ejecutar el programa
```bash
* java -cp bin Main
```
Asegúrate de que la clase principal se llama Principal.java y contiene el método:
```java
public static void main(String[] args) {
    // tu codigo aqui
}
```

## 💡 Ejemplo de uso
```
Bienvenido al conversor de monedas
Seleccione una opcion: 
1. Consultar tasas disponibles
2. Convertir moneda
3. Historial de consultas
9. Salir

2
Ingrese la moneda de origen (ej: USD):
> MXN
Ingrese la moneda de destino (ej: CLP):
> CLP
Ingrese la cantidad:
> 45000
$45,000 MXN equivalen a CLP $2,191,000.50
```

## 🌐 API utilizada 
Si tu proyecto obtiene tasas de cambio en tiempo real, puedes incluir:
```
API: ExchangeRate API

Endpoint usado: https://v6.exchangerate-api.com/v6/YOUR_API_KEY/pair/(base_code)/(target_code)/
```
## 📂 Estructura del proyecto

``` markdown
conversor-monedas/
│
├── src/
│   ├── Main.java
│   ├── Conversor.java
│   ├── ConvertirMoneda.java
│   ├── ConexionApi.java
│   ├── Formatos.java
│   └── Monedas.java
│
├── bin/
│
├── README.md
│
└── .gitignore
```
## ✅ Tareas pendientes
```
 -Agregar soporte para más monedas
 -Agregar interfaz gráfica.
```

## 🙋‍♂️ Autor
``` markdown
Gerardo Cavieres - @gerardorootsss
```
