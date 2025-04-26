# 📱 Laboratorio Calificado 01 - Programación en Móviles

Proyecto realizado para el curso de **Programación en Móviles**.  
El objetivo del laboratorio fue desarrollar un proyecto Android usando **Kotlin**, **LinearLayouts**, **algoritmos básicos** y **diseño de formularios responsivos**.

---

## 🛠️ Tecnologías utilizadas

- Android Studio
- Kotlin
- SDK mínimo: API 24 (Android 7.0 - Lollipop)
- LinearLayout y ConstraintLayout
- Gradle
- XML (Layouts)

---


## 🧮 Algoritmos Kotlin

Se desarrollaron dos algoritmos básicos de práctica en Kotlin:

- **Ejercicio01Kotlin:**  
  Función para encontrar el número mayor entre tres números enteros.
  
- **Ejercicio02Kotlin:**  
  Función para verificar si una palabra es un palíndromo (se lee igual de adelante hacia atrás).

Ambos algoritmos fueron probados mediante funciones `main()` con `println` para validar los resultados de manera manual.

---

## 🎨 Diseño de Interfaces

Se desarrolló el **formulario** mostrado en el esquema de diseño:

- `TextView`: Formulario.
- `TextView`: Nombre, Apellido y Correo (informativos).
- `EditText`: Ingreso de Nombre y Apellido (en una fila).
- `EditText`: Ingreso de Correo (campo único).
- `Button`: Botón "Registrar".

El diseño fue hecho respetando:
- LinearLayouts anidados.
- Uso de `weightSum`.
- Margen uniforme (`16dp`) alrededor.
- Buenas prácticas de Android y accesibilidad.

---

## 📸 Capturas de pantalla esperadas

- Previsualización en:
  - 📱 Dispositivo Celular
  - 📱 Tablet
  - 📺 TV

Cada vista debe mostrar el formulario correctamente adaptado a cada pantalla.

---

## 🚀 ¿Cómo correr el proyecto?

1. Clonar el repositorio:
    ```bash
    git clone https://github.com/FrancoCabelloDev/Lab_calificada01
    ```
2. Abrir el proyecto en Android Studio.
3. Sincronizar Gradle.
4. Ejecutar en emulador o dispositivo físico.

---

## 🧠 Observaciones

- Se aplicaron buenas prácticas de desarrollo móvil.
- Se corrigieron advertencias de accesibilidad importantes (`inputType`, `autofill`, `strings.xml`).
- Se respetaron los márgenes y pesos en los diseños.
- No se utilizaron librerías externas.
- Todos los textos fueron extraídos a `strings.xml` para seguir buenas prácticas de localización.

---

## ✅ Estado del proyecto

Proyecto finalizado y listo para entrega.

---