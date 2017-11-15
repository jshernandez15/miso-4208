# language: es
Característica: Acceso a la aplicación
    Como usuario 
    Yo quiero acceder a la página web de habitica
    Para crear tareas

Esquema del escenario: Acceso con parámetros incorrectos

  Dado que voy a la página principal
    Cuando abro la página de acceso
    Y diligencio mi <email> y <password>
    E intento acceder
    Entonces espero estar en la página de acceso

    Ejemplos:
      | email            | password |
      | miso@gmail.com   |    1234  |

Esquema del escenario: Acceso sin parámetros

  Dado que voy a la página principal
    Cuando abro la página de acceso
    Y diligencio mi <email> y <password>
    E intento acceder
    Entonces espero ver y cerrar una alerta

    Ejemplos:
      | email            | password |
      |                  |          |

Esquema del escenario: Acceso éxitoso

  Dado que voy a la página principal
    Cuando abro la página de acceso
    Y diligencio mi <email> y <password>
    E intento acceder
    Entonces espero acceder a mi página personal

    Ejemplos:
      | email                          | password  |
      | js.hernandez15@uniandes.edu.co | ASDasd123 |