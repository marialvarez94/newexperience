# language: es

Característica: Inicio de sesion en New Experience

  Antecedentes:
    Dado un usuario con una cuenta activa

  @inicioSesionIncorrecto
  Escenario: Iniciar sesión con credenciales incorrectas
    Cuando el envia sus credenciales incorrectas
    Entonces no podrá tener acceso a su cuenta y verá un error

  @inicioSesionCorrecto
  Escenario: Iniciar sesión con credenciales correctas
    Cuando el envia sus credenciales correctas
    Entonces deberá tener acceso para gestionar su cuenta
