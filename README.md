# challenge-conversor-de-monedas

🚀 Funcionalidades

Conversión de monedas soportadas:

💵 Dólar (USD) ↔ Peso Argentino (ARS)

💵 Peso Argentino (ARS) ↔ Dólar (USD)

💵 Dólar (USD) ↔ Real Brasileño (BRL)

💵 Real Brasileño (BRL) ↔ Dólar (USD)

💵 Dólar (USD) ↔ Peso Colombiano (COP)

💵 Peso Colombiano (COP) ↔ Dólar (USD)

Interfaz interactiva en la terminal para seleccionar la conversión deseada.

Conexión a una API de tasas de cambio en tiempo real para garantizar la precisión.

Manejo de excepciones para entradas inválidas y errores de conexión.

🗂️ Estructura del Proyecto

El proyecto sigue una estructura modular para facilitar la mantenibilidad y escalabilidad:

📦 Paquetes

com.alura.conversormonedas.principal

Contiene la clase principal Principal para ejecutar el programa.

com.alura.conversormonedas.calculos

Contiene la lógica de conversión en la clase CalcularMonedas.

com.alura.conversormonedas.conexionhttp

Gestiona la comunicación con la API de tasas de cambio en ConsultaMonedas.

com.alura.conversormonedas.modelos

Incluye las clases Moneda y MonedasAPI que representan las tasas de cambio y monedas.

✅ Requisitos

Java 17 o superior.

Conexión a Internet (para consultar las tasas de cambio).

💻 Uso

Clona este repositorio:

git clone https://github.com/uptzav/challenge-conversor-de-monedas.git

Compila el proyecto:

javac -d bin $(find . -name "*.java")

Ejecuta el programa:

java -cp bin com.alura.conversormonedas.principal.Principal

Sigue las instrucciones en pantalla para seleccionar la conversión deseada y proporciona los datos requeridos.

🌐 API Utilizada

Este proyecto utiliza la API ExchangeRate-API para obtener tasas de cambio en tiempo real.

📝 Nota:

La clave de API está incluida directamente en el código (ConsultaMonedas.java). Si deseas usar tu propia clave, reemplázala en la variable API_KEY.

🤝 Contribuciones

Si deseas contribuir al proyecto:

Haz un fork del repositorio.

Crea una rama nueva para tus cambios:

git checkout -b feature/nueva-funcionalidad

Realiza tus cambios y realiza un commit:

git commit -m "Agregada nueva funcionalidad"

Envía tus cambios al repositorio remoto:

git push origin feature/nueva-funcionalidad

Abre un pull request y describe tus cambios.



👤 Autor

Desarrollado por Luis Zavala.
