# Algoritmos de Ordenamiento

Repositorio de prácticas de **Algoritmos y Estructuras de Datos** implementado en Java. El proyecto reúne diferentes técnicas de ordenamiento sobre arreglos de enteros, permite comparar sus enfoques y sirve como material de estudio para analizar complejidad temporal, uso de memoria, recursividad y estructuras auxiliares.

## Tecnologías y stack

- **Java 8** (Java SE 1.8).
- **JDK** para compilar y ejecutar desde la terminal.
- **Eclipse** como entorno de desarrollo opcional; el repositorio conserva `.project`, `.classpath` y la configuración del compilador.
- Sin frameworks ni dependencias externas.
- Código organizado mediante paquetes Java:
  - `algoritmos`: implementaciones de ordenamiento y programa de demostración.
  - `monticulo`: implementación de montículos mínimo y máximo usados por Heap Sort.

## Funcionalidades

- Ordenamiento ascendente y descendente mediante métodos `sort` y `reverseSort`.
- Ejemplos ejecutables desde una única clase `Main`.
- Trabajo con arreglos de enteros, incluidos valores repetidos.
- Implementación de un montículo genérico a nivel de comportamiento:
  - inserción con flotación;
  - eliminación de la raíz con hundimiento;
  - consulta de la raíz;
  - control de estado vacío y lleno.
- Visualización de los vectores antes y después de cada algoritmo.
- Práctica de algoritmos clásicos y de distribución con distintas características de complejidad.

## Algoritmos incluidos

| Clase | Algoritmo | Idea principal | Mejor caso | Caso promedio | Peor caso | Memoria auxiliar |
|---|---|---|---:|---:|---:|---:|
| `Burbujeo` | Burbuja | Intercambia elementos adyacentes fuera de orden | O(n) | O(n²) | O(n²) | O(1) |
| `Seleccion` | Selección | Busca el menor o mayor elemento de la parte restante | O(n²) | O(n²) | O(n²) | O(1) |
| `Insercion` | Inserción | Inserta cada elemento en la posición correspondiente | O(n) | O(n²) | O(n²) | O(1) |
| `Shell` | Shell | Ordena grupos separados por saltos decrecientes | Depende de la secuencia | Depende de la secuencia | Depende de la secuencia | O(1) |
| `Quicksort` | Quick Sort | Divide alrededor de un pivote y aplica recursividad | O(n log n) | O(n log n) | O(n²) | O(log n) promedio |
| `Fusion` | Merge Sort | Divide el arreglo y fusiona mitades ordenadas | O(n log n) | O(n log n) | O(n log n) | O(n) |
| `CocktailSort` | Cocktail Shaker Sort | Recorre el arreglo en ambos sentidos | O(n) | O(n²) | O(n²) | O(1) |
| `PancakeSort` | Pancake Sort | Ordena mediante inversiones de prefijos | O(n²) | O(n²) | O(n²) | O(1) |
| `HeapSort` | Heap Sort | Usa un montículo mínimo o máximo | O(n log n) | O(n log n) | O(n log n) | O(n) en esta implementación |
| `DistribucionParticular` | Distribución particular | Usa la posición directa de claves consecutivas únicas | O(n + k) | O(n + k) | O(n + k) | O(n) |
| `DistribucionGeneral` | Counting Sort | Cuenta las apariciones de cada clave | O(n + k) | O(n + k) | O(n + k) | O(k) |
| `BogoSort` | Bogo Sort | Baraja aleatoriamente hasta obtener el orden | O(n) teórico | O(n·n!) esperado | No acotado | O(1) |

> En la tabla, `n` es la cantidad de elementos y `k` representa el rango de claves. Las complejidades corresponden al comportamiento conceptual de cada técnica; el código está planteado con fines didácticos y no como una biblioteca de producción.

## Estructuras de datos

El paquete `monticulo` contiene una jerarquía sencilla:

- `Monticulo`: clase abstracta con la lógica común de almacenamiento, inserción, eliminación y recorrido.
- `MonticuloMinimo`: prioriza el menor valor.
- `MonticuloMaximo`: prioriza el mayor valor.

`HeapSort` utiliza un montículo mínimo para ordenar de forma ascendente y uno máximo para ordenar de forma descendente. El montículo usa un arreglo indexado desde la posición `1`, una decisión habitual para simplificar el cálculo de padres e hijos.

## Organización del repositorio

```text
.
├── src/
│   ├── algoritmos/
│   │   ├── Main.java
│   │   ├── Burbujeo.java
│   │   ├── Seleccion.java
│   │   ├── Insercion.java
│   │   ├── Shell.java
│   │   ├── Quicksort.java
│   │   ├── Fusion.java
│   │   ├── CocktailSort.java
│   │   ├── PancakeSort.java
│   │   ├── HeapSort.java
│   │   ├── BogoSort.java
│   │   ├── DistribucionParticular.java
│   │   └── DistribucionGeneral.java
│   └── monticulo/
│       ├── Monticulo.java
│       ├── MonticuloMinimo.java
│       └── MonticuloMaximo.java
├── .classpath
├── .project
└── README.md
```

## Cómo ejecutar

### Requisitos

- JDK 8 o una versión compatible con el código fuente Java 8.
- `javac` y `java` disponibles en el `PATH`.

### Compilar y ejecutar desde la terminal

Desde la raíz del repositorio:

```bash
mkdir -p bin
javac -encoding ISO-8859-1 -d bin $(find src -name "*.java")
java -cp bin algoritmos.Main
```

El programa imprime un vector inicial y muestra el resultado ascendente y descendente de cada algoritmo. También ejecuta casos de distribución particular con claves consecutivas no repetidas y distribución general con claves repetidas.

### Ejecutar desde Eclipse

1. Importar el proyecto existente como **Existing Projects into Workspace**.
2. Seleccionar la clase `src/algoritmos/Main.java`.
3. Ejecutar mediante **Run As → Java Application**.

## Ejemplo de uso

Las clases exponen métodos estáticos y trabajan directamente sobre el arreglo recibido:

```java
int[] valores = { 6, 5, 3, 1, 8, 7, 2, 4 };

Quicksort.sort(valores);        // Orden ascendente
Quicksort.reverseSort(valores); // Orden descendente
```

Los métodos modifican el arreglo **in situ**, por lo que conviene clonarlo si se necesita conservar el orden original:

```java
int[] copia = valores.clone();
Fusion.sort(copia);
```

## Prácticas y objetivos de aprendizaje

Este repositorio permite practicar:

- notación Big O y comparación entre casos mejor, promedio y peor;
- algoritmos iterativos y recursivos;
- estrategia de divide y vencerás;
- estabilidad y comportamiento con elementos repetidos;
- ordenamientos in situ frente a ordenamientos que usan memoria auxiliar;
- selección de pivotes y particionado;
- conteo y distribución de claves;
- diseño y uso de estructuras de prioridad basadas en montículos;
- validación de resultados ascendentes y descendentes.

`BogoSort` se incluye como contraste didáctico: su rendimiento es deliberadamente impráctico y ayuda a entender por qué la elección del algoritmo resulta importante.

## Limitaciones conocidas

- El proyecto está enfocado en enteros (`int[]`); no incluye comparadores ni genéricos.
- No incorpora Maven, Gradle ni una suite automatizada de pruebas.
- La capacidad del montículo se define al construirlo y no crece dinámicamente.
- Los algoritmos de distribución requieren que el rango de claves sea razonable; un rango muy grande puede consumir mucha memoria.
- `BogoSort` debe usarse únicamente con vectores pequeños debido a su comportamiento aleatorio.

## Licencia

No se ha definido una licencia de distribución para este repositorio. Antes de reutilizarlo o publicarlo como dependencia, conviene acordar y añadir un archivo `LICENSE`.
