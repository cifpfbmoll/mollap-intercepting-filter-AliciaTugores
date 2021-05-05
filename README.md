# Autograding Example: Java
##### Este kata es un simulacro de examen de programación del fo dual de desarrollo web y está diseñado por David Gelpi (https://github.com/dfleta)

### Consiste en:
En Palma ha comenzado a operar una nueva start-up que promueve el uso compartido de coches eléctricos.

Un vez que un usuario/a se da de alta en el sistema, la empresa proporciona una aplicación para el móvil llamada mollapp que permite acceder a los coches que la empresa y los usuarios/as estacionan en diversos lugares de Palma.

Cuando una persona quiere utilizar uno de los vehículos, la aplicación del móvil envía una petición al sistema, que solicita su autenticación con el nombre del usuario/a, y el sistema autoriza el acceso al coche. Después, el sistema envía al vehículo la señal inalámbrica de abrir la puerta del vehículo.

Construye la arquitectura del sistema de tal manera que la app móvil solicite las dos comprobaciones especificadas al sistema, que estas sean ejecutadas por el sistema y que este envíe la señal de abrir la puerta del vehículo, teniendo en cuenta que:

El orden de ejecución de las tareas es definido en el instante de configurar el sistema.
Como el sistema de la start-up está en período de pruebas, todos los usuarios/as tienen el acceso permitido y no se debe programar la lógica de la autenticación y la autorización.
El mensaje al vehículo, en el caso expuesto, será solo un texto por consola.
Dado que se trata de una start-up, el producto se encuentra en desarrollo, motivo por el cual, en cuestión de semanas, nuevas tareas serán implementadas en el sistema y serán exigidas a la app móvil. Además, la intención es conectar el sistema a otras aplicaciones cliente. También se quiere extender el negocio a bicicletas y patinetes. Diseña su solución de tal manera que añadir nuevas tareas, nuevas apps clientes y/o nuevos vehículos, resulte posible sin modificar la estructura del sistema y el código.

El script principal ha de producir la siguiente salida por consola:

Autenticación OK para Francesc
Autorización OK para Francesc
Puerta abierta Francesc!

### Código
#### SOLID
1.Garantiza que tu solución satisfaga los 5 principios SOLID:

2.Las clases y métodos solo han de tener una motivo para cambiar.
3.Para añadir nuevos componentes al sistema no debe ser necesario reescribir el código.
4.Utiliza el polimorfismo para que cada objeto muestre su comportamiento en tiempo de ejecución.
5.Invierte las dependencias para desacoplar el código de los detalles de bajo nivel y del resto de componentes.