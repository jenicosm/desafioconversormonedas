# Conversor de Monedas

Este proyecto es una aplicación en Java que permite convertir montos entre diferentes tipos de monedas. El usuario puede seleccionar entre varias opciones de conversión y el programa calcula el valor correspondiente basado en tasas de cambio (simuladas en este ejemplo).

---

## Características

- **Opciones de conversión**:
  - Dólar (USD) a Sol (PEN)
  - Sol (PEN) a Dólar (USD)
  - Dólar (USD) a Euro (EUR)
  - Euro (EUR) a Dólar (USD)
  - Dólar (USD) a Real Brasileño (BRL)
  - Real Brasileño (BRL) a Dólar (USD)
- Validación de opciones: si el usuario elige una opción inválida, el programa le pedirá que intente nuevamente.
- Cálculo en tiempo real con tasas simuladas.
- Interfaz sencilla y basada en texto.

---

## Requisitos

Para ejecutar este proyecto, necesitas:

- **Java Development Kit (JDK)** versión 8 o superior.
- Un editor de texto o un IDE como IntelliJ IDEA, Eclipse, o NetBeans.
- Una terminal o consola para ejecutar el programa.

---

## Estructura del Proyecto

```plaintext
Challenge-Conversor-De-Monedas/
├── src/
│   ├── Principal.java  # Clase principal del proyecto
│   ├── ConsultaConversion.java  # Lógica para realizar la conversión
│   ├── Conversion.java  # Clase para representar los resultados
├── .gitignore           # Archivo para excluir archivos innecesarios en Git
└── README.md            # Documentación del proyecto
