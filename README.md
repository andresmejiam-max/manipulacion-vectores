# EA1. Manipulación de Vectores en Java

## Objetivo
Practicar operaciones con vectores en Java: búsqueda de valores, determinación de máximos y mínimos, identificación de múltiplos, cálculo de sumas y creación de nuevos vectores a partir de condiciones específicas (números por encima del promedio).

## Descripción del programa
El programa `Main.java`:

1. Crea un vector de 15 números enteros, solicitando cada valor al usuario y validando que esté entre 10 y 100 (si no, pide el número de nuevo).
2. Muestra el vector completo en consola.
3. Solicita un número y busca su posición en el vector (o informa que no está).
4. Determina y muestra el valor mayor y el menor del vector.
5. Solicita un número X y muestra todos los múltiplos de X presentes en el vector (o informa que no hay ninguno).
6. Calcula y muestra la suma total de los valores del vector.
7. Calcula el promedio, crea un nuevo vector con los valores por encima del promedio, y muestra ese vector junto con la cantidad de elementos (o informa que no hay ninguno por encima del promedio).

## Cómo ejecutar
Requiere JDK (Eclipse Temurin recomendado) y VS Code con la extensión de Java.

   javac Main.java
   java Main

## Capturas de pantalla de la consola
Imagen 1: Inicio del programa, esperando el primer valor del vector.
<img width="1492" height="616" alt="image1" src="https://github.com/user-attachments/assets/2cbaa689-171a-4bee-a6e2-43070ffb25a8" />

Imagen 2: Validación de rango — el programa rechaza el número 1 por estar fuera de 10-100 y lo vuelve a pedir.
<img width="1361" height="473" alt="image2" src="https://github.com/user-attachments/assets/62ec92c4-db6a-4cc5-a199-d031e9e28f1f" />

Imagen 3: Continúa el llenado del vector, rechazando también el número 101 por superar el límite.
<img width="1484" height="467" alt="image3" src="https://github.com/user-attachments/assets/d5062285-41d4-44f2-b062-f1136359bb04" />

Imagen 4: Vector completo ya lleno, búsqueda del número 50 (no está en el vector) y detección del mayor (100) y menor (10).
<img width="935" height="402" alt="image4" src="https://github.com/user-attachments/assets/d8a87203-97fe-4b75-ae05-c1b173f598e9" />

Imagen 5: Búsqueda de múltiplos de 11 con resultados, suma total, promedio y vector con los números por encima del promedio.
<img width="855" height="385" alt="image5" src="https://github.com/user-attachments/assets/0fd0a60c-ec57-4c99-9940-3c06b57808e2" />

Imagen 6: Otra corrida completa — búsqueda del número 20 (sí está, en la posición 9), sus múltiplos, suma, promedio y el vector resultante.
<img width="914" height="591" alt="image6" src="https://github.com/user-attachments/assets/cd76d39e-8b48-4e59-a65b-75d0cdb265ea" />



## Video de sustentación
https://drive.google.com/file/d/10ZBVCPMMN0nrOV2VDJObcVhOsHIZEJ6X/view?usp=drive_link
