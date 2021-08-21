# language: es

Característica: Crear una cuenta en New Experience

  Antecedentes:
    Dado un usuario que desea crear una cuenta

  @crearCuenta
  Escenario: Comprobar la funcionalidad de crear una cuenta con la información personal
    Cuando ingresa su información personal
    Entonces el debera tener acceso a su cuenta
