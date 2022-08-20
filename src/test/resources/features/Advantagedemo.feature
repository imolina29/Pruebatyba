#language: es


Característica: Crear nuevo usuario
  Como un nuevo usuario
  Quiere ingresar a la pagina AdvantageDemo
  Para registrar un usuario

  @EscenarioCrearRegistro
  Escenario: Crear nuevo registro
    Dado  que Paul accede a la web de Advantage
    Cuando el introduce sus datos personales
      | username | email            | password | confirmPwd | firstName | lastName | phone      | country  | city     | address  | state   | postalCode |
      | Paul36   | paul36@yahoo.com | Paul2022 | Paul2022   | Paul      | Barrios  | 3005007070 | Colombia | Monteria | cl 9 123 | Cordoba | 050048     |
    Entonces el valida que se creo un nuevo resgistro


    @EscenarioCompraArticulo
    Escenario: Comprar un articulo
      Dado que Paul accede a la web de Advantage
      Cuando Paul realiza el login en la pagina con los datos
        | username |password |
        | Paul35   |Paul2022 |
      Y realiza la compra del producto BOSE SOUNDLINK BLUETOOTH SPEAKER III
      Entonces Paul valida que haya comprado el producto
