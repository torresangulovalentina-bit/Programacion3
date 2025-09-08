# Mini-Proyecto: Casillero Oficina de Correos (Consola - Java)

Este proyecto implementa una solución **en Java** para el mini-proyecto "Casillero Oficina de Correos",
cumpliendo los requisitos de **Menú principal (3.1)**, **Asignación de casilleros (3.1.1)** y **Consideraciones Internas (3.2)**.

## Cómo compilar y ejecutar
```bash
cd src
javac Main.java
java Main
```

## Decisiones técnicas
- **Arreglos**: se usa una **matriz (Package[][])** para modelar la grilla de casilleros.
- **Método de burbuja**: se implementa **Bubble Sort** para ordenar los paquetes por **fecha** o **destinatario** al consultarlos.
- **Integridad**: no se permite asignar dos paquetes al mismo casillero; hay validaciones y mensajes de advertencia.
- **Esquema**: se muestra una matriz con **[ ]** (disponible) y **[X]** (ocupado).
- **Terminación**: la aplicación finaliza cuando el usuario lo elige desde el menú.

## Sugerencias
- Si la disposición de casilleros cambia (p. ej., no todos iguales), puede ajustar las filas/columnas o deshabilitar posiciones (ver constante `DISABLED_SLOTS`).
