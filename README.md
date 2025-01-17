# Conversor de Monedas

Este es un proyecto de un **conversor de monedas** desarrollado en **Java 17**. La aplicación permite convertir cantidades de dinero entre diferentes monedas utilizando tasas de cambio obtenidas en tiempo real desde una API externa.

## 🚀 **Funcionalidades**

- **Conversión de monedas soportadas:**
  - 💵 Dólar (USD) ↔ Peso Argentino (ARS)
  - 💵 Peso Argentino (ARS) ↔ Dólar (USD)
  - 💵 Dólar (USD) ↔ Real Brasileño (BRL)
  - 💵 Real Brasileño (BRL) ↔ Dólar (USD)
  - 💵 Dólar (USD) ↔ Peso Colombiano (COP)
  - 💵 Peso Colombiano (COP) ↔ Dólar (USD)
- **Interfaz interactiva** en la terminal para seleccionar la conversión deseada.
- **Conexión a una API** de tasas de cambio en tiempo real para garantizar la precisión.
- **Manejo de excepciones** para entradas inválidas y errores de conexión.

## 🗂️ **Estructura del Proyecto**

### 📦 **Paquetes**

- **`com.alura.conversormonedas.principal`**
  - Contiene la clase principal `Principal` para ejecutar el programa.
- **`com.alura.conversormonedas.calculos`**
  - Contiene la lógica de conversión en la clase `CalcularMonedas`.
- **`com.alura.conversormonedas.conexionhttp`**
  - Gestiona la comunicación con la API de tasas de cambio en `ConsultaMonedas`.
- **`com.alura.conversormonedas.modelos`**
  - Incluye las clases `Moneda` y `MonedasAPI` que representan las tasas de cambio y monedas.

## ✅ **Requisitos**

- **Java 17** o superior.
- Conexión a Internet (para consultar las tasas de cambio).

## 💻 **Uso**

1. **Clona este repositorio:**

   ```bash
   git clone https://github.com/uptzav/challenge-conversor-de-monedas.git
   ```

2. **Compila el proyecto:**

   ```bash
   javac -d bin $(find . -name "*.java")
   ```

3. **Ejecuta el programa:**

   ```bash
   java -cp bin com.alura.conversormonedas.principal.Principal
   ```

4. Sigue las instrucciones en pantalla para seleccionar la conversión deseada y proporciona los datos requeridos.

## 🌐 **API Utilizada**

Este proyecto utiliza la API [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener tasas de cambio en tiempo real.

### 📝 **Nota:**
- La clave de API no está incluida directamente en el código (`ConsultaMonedas.java`). Si deseas usar tu propia clave, reemplázala en la variable `API_KEY`.


## 👤 **Autor**

Desarrollado por [Luis Zavala](https://github.com/uptzav).
