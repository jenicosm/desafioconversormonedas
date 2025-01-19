# Conversor de Monedas

Este proyecto es una aplicación en Java que permite convertir montos entre diferentes tipos de monedas. El usuario puede seleccionar entre varias opciones de conversión, y el programa calcula el valor correspondiente basado en tasas de cambio (simuladas en este ejemplo).

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
- Un editor de texto o un IDE como IntelliJ IDEA, Eclipse o NetBeans.
- Una terminal o consola para ejecutar el programa.

---

## Estructura del Proyecto

```plaintext
Challenge-Conversor-De-Monedas/
├── src/
│   ├── Principal.java  # Clase principal del proyecto
├── README.md           # Documentación del proyecto
```

---

## Instalación y Ejecución

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/tuusuario/Challenge-Conversor-De-Monedas.git
   ```

2. **Navegar al directorio del proyecto:**
   ```bash
   cd Challenge-Conversor-De-Monedas
   ```

3. **Compilar el proyecto:**
   ```bash
   javac src/Principal.java -d bin
   ```

4. **Ejecutar el programa:**
   ```bash
   java -cp bin Principal
   ```

---

## Uso

1. Al iniciar el programa, se mostrará un menú con las opciones de conversión disponibles.
2. Selecciona la opción deseada introduciendo el número correspondiente.
3. Ingresa el monto que deseas convertir.
4. El programa calculará y mostrará el resultado basado en la tasa de cambio simulada.

---

## Ejemplo de Ejecución

```plaintext
Bienvenido al Conversor de Monedas
Selecciona una opción:
1. USD a PEN
2. PEN a USD
3. USD a EUR
4. EUR a USD
5. USD a BRL
6. BRL a USD

Ingresa tu elección: 1
Ingresa el monto en USD: 100
El equivalente en PEN es: 380.00
```

---

## Contribución

Si deseas contribuir a este proyecto:

1. Haz un fork del repositorio.
2. Crea una rama nueva para tus cambios:
   ```bash
   git checkout -b feature/nueva-funcionalidad
   ```
3. Realiza tus cambios y haz commit:
   ```bash
   git commit -m "Agrega nueva funcionalidad"
   ```
4. Sube tus cambios a tu repositorio:
   ```bash
   git push origin feature/nueva-funcionalidad
   ```
5. Abre un pull request en el repositorio original.

---

## Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo LICENSE para más detalles.

---

## Contacto

Si tienes alguna duda o sugerencia, no dudes en contactarme:

- **GitHub:** [jenicosm](https://github.com/jenicosm)
- **Email:** nsolismantari@gmail


