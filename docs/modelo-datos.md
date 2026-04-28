# Modelo de Datos - Sorbos

##   Descripción

La base de datos está diseñada para gestionar productos, ventas y usuarios del sistema.

---

##   Tabla: usuarios

Almacena la información de acceso al sistema.

* id_usuario: identificador único
* usuario: nombre de usuario
* contraseña: clave de acceso

---

##   Tabla: productos

Contiene los productos disponibles para la venta.

* id_producto: identificador único
* nombre: nombre del producto
* precio: precio de venta
* stock: cantidad disponible

---

##   Tabla: ventas

Registra cada venta realizada.

* id_venta: identificador único
* fecha: fecha de la venta
* total: monto total

---

##   Tabla: detalle_venta

Relaciona productos con una venta.

* id_detalle: identificador único
* id_venta: referencia a la venta
* id_producto: referencia al producto
* cantidad: cantidad vendida
* subtotal: importe parcial

---

##   Relaciones

* Una venta puede tener varios productos.
* Un producto puede aparecer en varias ventas.
* La relación se maneja mediante la tabla detalle_venta.
