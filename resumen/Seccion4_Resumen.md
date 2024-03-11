# Resumen de la sección 4: clases de negocio @Service

En esta sección aprendimos a crear la primera clase de negocio @Service en el proyecto, inyectarla al @Controller y mostrar una lista de objetos usando Thymeleaf.

### @Service

**Las clases de negocio son aquellas que contienen métodos que resuelven el flujo principal del negocio de nuestra aplicación**. En estos métodos se resulven, por ejemplo, la validación de datos de un cliente, la coordinación de llamadas para guardar información en la base de datos, el envio de un email si se aprueba el registro de un usuario, etc.

Las clases de negocio no acceden directamente a los datos (esto lo hacen los @Repository, que veremos más adelante), ni tampoco se encargan de dibujar los datos al usuario (esto lo hacen la páginas HTML junto a los @Controller).

**Las clases de negocio se anotan con @Service en Spring**, quien las levantará en su contexto para poder inyectarla en donde sea necesario.

Los @Service son clases comunes, con métodos públicos que contienen la lógica de negocio.


### Inyección de dependencias

En el @Controller pudimos agregar un atributo y dejar que Spring realice la inyección de dependencias por nosotros. **Spring realizará la inyección de dependencias de todos los objetos que gestione**, ya sean @Controller, @Service, @Repository y otros.

Para indicarle a Spring que realice la inyección de dependencias de una clase, basta con:

1. Agregar un atributo final a la clase que será inyectada

2. Agregar un constructor que reciba una instancia de dicho atributo, y la setee. 

Alternativamente, se puede reemplazar el constructor usando la anotación @Autowired sobre el atributo, aunque no es la forma que Spring recomienda utilizar actualmente.


### Thymeleaf

**Thymeleaf es una librería de presentación** que nos permite generar HTML de forma dinámica. Es decir, el HTML se generá en el servidor, a partir de las plantillas HTML que armemos.

Thymeleaf es muy útil para crear páginas con información que venga de otros objetos (como de la base de datos), armar listados, crear títulos dinámicos, y más.

Thymeleaf utiliza tags y atributos especiales (que empiezan con el prefijo *th:*) para procesar el HTML.

Más info:

* [Web oficial de Thymeleaf](https://www.thymeleaf.org/)

* [Documentación oficial](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html)

* [Thymeleaf en la Wikipedia](https://es.wikipedia.org/wiki/Thymeleaf)
