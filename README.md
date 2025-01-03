# Proyecto - Polimorfismo

Plantilla básica para proyecto de Java con Autograding

## Diagrama de clases
[Editor en línea](https://mermaid.live/)
```mermaid
---
title: Clase
---
classDiagram
      class Animal {
        <<abstract>>
        -String name
        +Animal(String name)
        +void makeSound()
        +void move()
    }

    class Dog {
        +Dog(String name)
        +void makeSound()
        +void move()
    }

    class Cat {
        +Cat(String name)
        +void makeSound()
        +void move()
    }

    Animal <|-- Dog
    Animal <|-- Cat
```
```mermaid
---
title: Clase
---
classDiagram
    class Throwable {
        <<abstract>>
        +String message
        +Throwable(String message)
        +String getMessage()
        +void printStackTrace()
    }

    class Error {
        +Error(String message)
    }

    class Exception {
        +Exception(String message)
    }

    Throwable <|-- Error
    Throwable <|-- Exception

    class OutOfMemoryError {
        +OutOfMemoryError(String message)
    }

    class StackOverflowError {
        +StackOverflowError(String message)
    }

    Error <|-- OutOfMemoryError
    Error <|-- StackOverflowError

    class IOException {
        +IOException(String message)
    }

    class NullPointerException {
        +NullPointerException(String message)
    }

    Exception <|-- IOException
    Exception <|-- NullPointerException

```

[Referencia-Mermaid](https://mermaid.js.org/syntax/classDiagram.html)

## Diagrama de clases UML con draw.io
El repositorio está configurado para crear Diagramas de clases UML con ```draw.io```. Para usarlo simplemente agrega un archivo con extensión ```.drawio.png```, das doble clic sobre el mismo y se activará el editor ```draw.io``` incrustado en ```VSCode``` para edición. Asegúrate de agregar las formas UML en el menú de formas del lado izquierdo (opción ```+Más formas```).

## Uso del proyecto con make

### Default - Compilar+Probar+Ejecutar
```
make
```
### Compilar
```
make compile
```
### Probar todo
```
make test
```
### Ejecutar App
```
make run
```
### Limpiar binarios
```
make clean
```
## Comandos Git-Cambios y envío a Autograding

### Por cada cambio importante que haga, actualice su historia usando los comandos:
```
git add .
git commit -m "Descripción del cambio"
```
### Envíe sus actualizaciones a GitHub para Autograding con el comando:
```
git push origin main
```
## Comandos individuales
### Compilar

```
find ./ -type f -name "*.java" > compfiles.txt
javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```
Ejecutar ambos comandos en 1 sólo paso:

```
find ./ -type f -name "*.java" > compfiles.txt ; javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```


### Ejecutar Todas la pruebas locales de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-class miTest.AppTest
```
### Ejecutar 1 prueba local de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-method miTest.AppTest#appHasAGreeting
```
### Ejecutar App
```
java -cp build miPrincipal.Principal
```
Los comandos anteriores están considerados para un ambiente Linux. [Referencia.](https://www.baeldung.com/junit-run-from-command-line)
