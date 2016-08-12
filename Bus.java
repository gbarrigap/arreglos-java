public class Bus {

  private boolean[][][] asientos = {
    { // Piso 1
      {true, true, true, true, true, true, true, true}, // Ventana izquierda
      {false, false, true, false, true, true, false, true}, // Pasillo izquierdo
      {false, false, false, false, false, false, false, true}, // Corredor
      {false, true, true, false, true, false, true, true}, // Pasillo derecho
      {true, true, false, true, false, true, true, false} // Ventana derecha
    },
    { // Piso 2
      {true, true, true, false, true, true, true, true}, // Ventana izquierda
      {true, false, false, true, false, false, true, false}, // Pasillo izquierdo
      {false, false, false, false, false, false, false, true}, // Corredor
      {true, true, false, false, true, true, false, true}, // Pasillo derecho
      {true, true, true, true, true, true, true, false}
    }
  };

  // Calcula y muestra la cantidad de asientos ocupados del pasillo  izuierdo,
  // y luego realiza la misma operación para el pasillo derecho.
  public void calcularCantidadDeAsientosOcupadosPasillo() {
    int totalAsientosOcupadosPasilloIzquierdoP1 = 0;
    int totalAsientosOcupadosPasilloDerechoP1 = 0;
    int totalAsientosOcupadosPasilloIzquierdoP2 = 0;
    int totalAsientosOcupadosPasilloDerechoP2 = 0;

    for (int i = 0; i < asientos.length; i++) {
      for (int j = 0; j < asientos[i].length; j++) {
        for (int k = 0; k < asientos[i][j].length; k++) {
          // Se compara el valor de las variables "i" y "j", ya que indica qué
          // grupo de asientos se está accediendo, y luego se obtendrá el valor
          // de uso del asiento referenciado por las coordenadas "i, j, k",
          // ya que almacenan un valor "boolean", por lo que que no se necesita
          // realizar ninguna comparación extra.
          if (i == 0 && j == 1 && asientos[i][j][k]) { // Piso 1, pasillo izquierdo
            totalAsientosOcupadosPasilloIzquierdoP1++;
          }
          else if (i == 1 && j == 1 && asientos[i][j][k]) { // Piso 2, pasillo izquierdo
            totalAsientosOcupadosPasilloIzquierdoP2++;
          }
          else if (i == 0 && j == 3 && asientos[i][j][k]) { // Piso 1, pasillo derecho
            totalAsientosOcupadosPasilloDerechoP1++;
          }
          else if (i == 1 && j == 3 && asientos[i][j][k]) { // Piso 2, pasillo derecho
            totalAsientosOcupadosPasilloDerechoP2++;
          }
        }
      }
    }

    System.out.format("Asientos ocupados pasillo izquierdo primer piso: %d\n", totalAsientosOcupadosPasilloIzquierdoP1);
    System.out.format("Asientos ocupados pasillo izquierdo segundo piso: %d\n", totalAsientosOcupadosPasilloIzquierdoP2);
    System.out.format("Asientos ocupados pasillo derecho primer piso: %d\n", totalAsientosOcupadosPasilloDerechoP1);
    System.out.format("Asientos ocupados pasillo derecho segundo piso: %d\n", totalAsientosOcupadosPasilloDerechoP1);
  }

  public void calcularCantidadDeAsientosOcupadosVentana() {
    int totalAsientosOcupadosVentanaIzquierdaP1 = 0;
    int totalAsientosOcupadosVentanaDerechaP1 = 0;
    int totalAsientosOcupadosVentanaIzquierdaP2 = 0;
    int totalAsientosOcupadosVentanaDerechaP2 = 0;

    for (int i = 0; i < asientos.length; i++) {
      for (int j = 0; j < asientos[i].length; j++) {
        for (int k = 0; k < asientos[i][j].length; k++) {
          // Se compara el valor de las variables "i" y "j", ya que indica qué
          // grupo de asientos se está accediendo, y luego se obtendrá el valor
          // de uso del asiento referenciado por las coordenadas "i, j, k",
          // ya que almacenan un valor "boolean", por lo que que no se necesita
          // realizar ninguna comparación extra.
          if (i == 0 && j == 0 && asientos[i][j][k]) { // Piso 1, ventana izquierda
            totalAsientosOcupadosVentanaIzquierdaP1++;
          }
          else if (i == 1 && j == 0 && asientos[i][j][k]) { // Piso 2, ventana izquierda
            totalAsientosOcupadosVentanaIzquierdaP2++;
          }
          else if (i == 0 && j == 4 && asientos[i][j][k]) { // Piso 1, ventana derecha
            totalAsientosOcupadosVentanaDerechaP1++;
          }
          else if (i == 1 && j == 4 && asientos[i][j][k]) { // Piso 2, ventana derecha
            totalAsientosOcupadosVentanaDerechaP2++;
          }
        }
      }
    }

    System.out.format("Asientos ocupados ventana izquierda primer piso: %d\n", totalAsientosOcupadosVentanaIzquierdaP1);
    System.out.format("Asientos ocupados ventana izquierda segundo piso: %d\n", totalAsientosOcupadosVentanaIzquierdaP2);
    System.out.format("Asientos ocupados ventana derecha primer piso: %d\n", totalAsientosOcupadosVentanaDerechaP1);
    System.out.format("Asientos ocupados ventana derecha segundo piso: %d\n", totalAsientosOcupadosVentanaDerechaP2);
  }

}
