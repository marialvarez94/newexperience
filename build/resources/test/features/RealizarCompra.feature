# language: es

Característica: Realizar una Compra en New Experience

  Antecedentes:
    Dado un usuario con una cuenta activa e inicia sesión

  @realizarCompra
  Escenario: Realizar una Compra
    Cuando agrega 3 productos al carrito y realiza el flujo de compra
    Entonces verá su orden completada
