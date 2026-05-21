## Parque Turistico de Dinosaurios

## Descripcion del proyecto
Simulacion secuencial de un parque turistico de dinosaurios desarrollado en Java 17 con Maven.

El sistema simula el comportamiento de visitantes, dinosaurios, zonas del parque y eventos aleatorios en una ejecucion por pasos.

---

## Arquitectura del sistema

El sistema esta compuesto por los siguientes modulos:

### SimulationEngine
Motor principal que controla la simulacion por pasos

### Zones
Representan las areas del parque como CentralHub Arrival Bathroom Observation y PowerPlant

### Model
Incluye entidades como Tourist y Dinosaur

### EventManager
Genera y ejecuta eventos aleatorios durante la simulacion

### ParkMonitor
Muestra el estado del parque en tiempo real por cada paso

### DatabaseManager
Simula el almacenamiento de ingresos gastos y eventos del parque

---

## Tecnologias utilizadas
- Java 17
- Maven
- IntelliJ IDEA
- GitHub

---

## Patrones de diseño utilizados

### Singleton
Utilizado en ParkConfig para manejar configuracion global del sistema

### Factory Pattern
Utilizado en DinosaurFactory para crear dinosaurios carnivoros y herbivoros de manera centralizada

### Herencia y Polimorfismo
Aplicado en la jerarquia de Dinosaur y sus tipos derivados

---

## Funcionamiento del sistema
La simulacion se ejecuta en pasos consecutivos

En cada paso ocurren las siguientes acciones:

- Llegada de turistas al parque
- Distribucion en zonas
- Interaccion con dinosaurios
- Consumo de energia del parque
- Ejecucion de eventos aleatorios
- Registro de ingresos en base de datos
- Monitoreo del estado del parque

---

## Eventos aleatorios
Durante la simulacion pueden ocurrir:

- Tormentas
- Apagones masivos
- Escape de dinosaurios

---

## Sistema de monitoreo
El sistema muestra en cada paso:

- Visitantes por zona
- Energia del parque
- Estado general de la simulacion

---

## Ejecucion del proyecto
Ejecutar la clase Main

---

## Requisitos
- Java 17 o superior
- Maven configurado

---

## Autor
Juan Pablo Monroy Martinez