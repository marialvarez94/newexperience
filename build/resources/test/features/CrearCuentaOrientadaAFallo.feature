# language: es

Característica: Crear una cuenta en New Experience
  orientada a fallo

  Antecedentes:
    Dado un usuario que desea crear una cuenta

  @emailInvalido
  Escenario: Comprobar la funcionalidad de crear una cuenta con email invalido
    Cuando registra un email invalido
    Entonces el debera ver un mensaje de error

  @NoRegistraCampos
  Escenario: Comprobar la funcionalidad de crear una cuenta con email valido pero sin llenar los campos requeridos
    Cuando no llena los campos requeridos
    Entonces vera un mensaje de error con los campos requeridos