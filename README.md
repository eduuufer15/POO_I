# Proyecto POO_1 - Java

## 🚀 Introducción

Este repositorio contiene la implementación de un proyecto en **Java** centrado en la **Programación Orientada a Objetos (POO)**. El objetivo de este proyecto es gestionar información sobre **Vehículos**, **Aparatos electrónicos**, y **Herramientas de utilidad** mediante el uso de clases. Las clases creadas permiten representar y manejar estos objetos de manera eficiente.

### ¿Por qué es útil?

Este proyecto es útil para comprender y practicar los conceptos fundamentales de la **Programación Orientada a Objetos (POO)** utilizando **Java**. Este proyecto permite experimentar con la creación de clases, la manipulación de atributos y métodos, y la interacción entre objetos.

---

## 🛠️ Tecnologías utilizadas

### Requisitos

- **Java 23+** instalado en tu máquina.
- **IDE recomendado**: Eclipse o IntelliJ IDEA.

---

## 📦 Instalación

### Pasos para la instalación

1. **Clona el repositorio**:
   - Utiliza el siguiente comando para clonar el repositorio:
     ```bash
     git clone https://github.com/tuusuario/POO_1.git
     ```

2. **Abre el proyecto** en tu IDE favorito:
   ```bash
   cd POO_1

## 🎮 ¿Cómo usar?
 Este proyecto contiene varios paquetes con diferentes clases que puedes utilizar para gestionar Vehículos, Aparatos electrónicos y Herramientas de utilidad. A continuación se describe el propósito de cada paquete.

# 📦 Paquete aparatos
## Clases en aparatos
### Reloj.java
La clase Reloj permite crear un reloj con funcionalidades como:

Mostrar la hora en formato de 24 horas.

Incrementar minutos y horas.

Cambiar el formato entre 24 horas y 12 horas.

Reiniciar el reloj a las 00:00.

### Smartwatch.java
La clase Smartwatch extiende de Reloj y agrega funcionalidades adicionales:

Monitorear la actividad física.

Sincronizar con otros dispositivos.

### Telefono.java
La clase Telefono representa un teléfono móvil con:

Llamar a un número.

Enviar mensajes.

### TestReloj.java
Esta clase de prueba permite verificar las funcionalidades de la clase Reloj.

# 📦 Paquete vehiculos
## Clases en vehiculos
### Automovil.java
La clase Automovil representa un automóvil con:

Matrícula.

Tipo de combustible.

Mostrar información del automóvil.

### Bicicleta.java
La clase Bicicleta representa una bicicleta con atributos como:

Tipo de bicicleta.

Número de marchas.

### Vehiculo.java
La clase Vehiculo es la clase base para vehículos que contiene información básica como:

Matrícula.

Tipo.

Año de fabricación.

### TestVehiculo.java
Esta clase de prueba permite verificar las funcionalidades de la clase Vehiculo.

# 📦 Paquete utilidades
## Clases en utilidades
### Calculadora.java
La clase Calculadora tiene métodos para realizar operaciones matemáticas básicas como:

Suma.

Resta.

Multiplicación.

División.

### GeneradorContrasenias.java
La clase GeneradorContrasenias genera contraseñas aleatorias seguras de longitud configurable.

# 📦 Paquete main
## Clases en main
### EjemploUso.java
Esta clase proporciona un ejemplo de uso para las clases principales del proyecto.

### Main.java
La clase principal que se puede ejecutar para probar el funcionamiento de las clases y paquetes.

# 🌱 Funcionalidades principales
### Funcionalidades de la clase Reloj
Mostrar la hora en formato de 24 horas.

Incrementar minutos y horas.

Cambiar el formato entre 12 horas y 24 horas.

### Funcionalidades de la clase Smartwatch
Monitorear la actividad física.

Sincronización con otros dispositivos.

### Funcionalidades de la clase Vehiculo
Mostrar información de un vehículo.

Actualizar kilometraje.

Calcular antigüedad del vehículo.

# 🌍 Ramas del proyecto
## 🧪 Rama main
### Propósito: Contiene el código funcional y listo para producción.

Cambios realizados: Implementación inicial de las clases Reloj, Smartwatch, Automovil, y Bicicleta.

## 🔧 Rama dev
### Propósito: En esta rama estamos realizando pruebas y desarrollando nuevas funcionalidades.

Cambios realizados:

Añadidos métodos de validación y mejoras en las clases de vehículos y aparatos.

# 🚀 Uso de Ramas
## Rama main
### Propósito: Contiene el código funcional y listo para producción.

## Rama dev
### Propósito: Para realizar pruebas y agregar nuevas características

# 🔒 .gitignore
```bash    
### Archivos de configuración del IDE
.settings/
.idea/
*.iml

### Archivos generados
bin/
target/

### Archivos de sistema
.DS_Store
Thumbs.db 
```
# 📚 Recursos adicionales
- [Documentación oficial de Java](https://docs.oracle.com/en/java/)
- [Tutorial de POO en Java (YouTube)](https://www.youtube.com/playlist?list=PLWtYZ2ejMVJlUu5lq2d3xE6Cs4t73zvPp)
