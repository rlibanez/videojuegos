# Resumen de la sección 8: formulario de alta para crear datos
En esta sección aprendimos a crear un formulario en HTML que envie datos a un Controller de Spring MVC para guardar un objeto. 



### FORM en HTML con Bootstrap

Los FORM en HTML se usan para recibir información del usuario y poder procesarla.

Bootstrap provee [varios ejemplos de FORM](https://getbootstrap.com/docs/4.4/components/forms/) que nos permite crear formularios rápidos y atractivos.

Un FORM está compuesto de:

* El atributo METHOD, que indica cómo se enviará la información al servidor. Puede ser GET o POST. Con GET los valores se envían directamente en la URL, de manera que el usuario puede guardar la página para consultar más tarde. Con POST los valores se envian en el cuerpo del mensaje HTTP, y por lo tanto no se ven en la URL.

* El atributo ACTION, que indica a qué URL se deberá enviar la información.

* Elementos que permiten la entrada de datos del usuario. Suelen ser INPUT, SELECT o TEXTAREA. Cada uno de estos elementos tiene un atributo NAME, que permite indicar el nombre del valor que se enviará. 



### Asociar un FORM a un objeto del modelo

Podemos asociar un objeto del Model a un FORM y sus elementos. De esta manera, Thymeleaf se encargará de crear los atributos NAME y VALUE del elemento HTML, de forma automática.

Sobre el FORM agregamos el atributo **th:object="${miObjeto}"** para asociar un objeto del Model al formulario. Luego, usamos **th:field="*{atributo}"** sobre cada INPUT, SELECT o TEXTAREA que queremos asociar a un atributo en particular. 



### Recibir datos de un FORM con Spring MVC

Podemos crear métodos en un @Controller que reciben datos de un formulario, tanto por GET o POST.

Usamos las anotaciones @GetMapping() o @PostMapping() para indicar la URL que queremos procesar.

El método puede recibir un objeto cualquiera, que Spring MVC cargará con los datos del FORM que se envia. Se asociará cada atributo del objeto a un elemento del FORM que tenga el mismo nombre. 



### Ejemplo de FORM con Thymeleaf

```html
<form th:action="@{/guardar}" th:object="${persona}" method="post">
    <input type="text" th:field="*{nombre}" />
    <input type="text" th:field="*{apellido}" />
    <textarea th:field="*{observaciones}"></textarea>
    <input type="submit" value="Guardar" />
</form>
```


### Guardar objetos con Spring Data JPA

Spring Data JPA brinda el método **save()** para crear o actualizar objetos en la base de datos.

Si el objeto a guardar tiene su id en null, JPA realizará un INSERT en la base de datos. El id de la clase además indica la estrategia que se usará para obtener un nuevo id. Generalmente, se delega esta tarea a la base de datos (estrategia conocida como IDENTITY).

Si el objeto a guardar tiene un valor en su atributo id, entonces JPA realizará un UPDATE en la base de datos. 