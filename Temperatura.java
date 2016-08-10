public class Temperatura {

  private int[] temperaturas;

  public Temperatura(int[] temperaturas) {
    this.temperaturas = temperaturas;
  }

  private String determinarNombrePorNumeroDeDia(int n) {
    switch (n) {
      case 0: return "Lunes";
      case 1: return "Martes";
      case 2: return "Miércoles";
      case 3: return "Jueves";
      case 4: return "Viernes";
      case 5: return "Sábado";
      case 6: return "Domingo";
      default: return "Desconocido";
    }
  }

  private int obtenerNumeroDeDiaPorTemperatura(int temp) {
    for (int i = 0; i < this.temperaturas.length; i++) {
      if (this.temperaturas[i] == temp) {
        return i;
      }
    }

    // Si no se encuentra la temperatura se retorna un valor imposible,
    // para que el llamador sepa de la situación anómala.
    // La ejecución no debería llegar a este punto.
    return -274;
  }

  // Determina los "n" días más calurosos de la semana.
  public String[] determinarDiasMasCaluroso(int n) {
    // Determinar que la cantidad de días requeridos no sea mayor que la
    // cantidad de días disponibles.

    String[] diasMasCalurosos = new String[n];

    // Se copia el arreglo de temperaturas en otro arreglo, que se utilizará
    // para realizar un ordenamiento de los datos, con el fin de obtener
    // los días con las temperaturas máximas.
    int[] temperaturasOrdenadas = java.util.Arrays.copyOf(this.temperaturas, this.temperaturas.length);

    java.util.Arrays.sort(temperaturasOrdenadas);

    // Una vez ordenadas las temperaturas, se obtienen las mayores,
    // se determina el nombre del día en el que se registraron,
    // y se agregan al arreglo que almacenará la cantidad de temperaturas
    // máximas requeridas.
    for (int i = 0; i < n; i++) {
      int temperaturaBuscada = temperaturasOrdenadas[i];
      int numeroDeDia = this.obtenerNumeroDeDiaPorTemperatura(temperaturaBuscada);
      String nombre = this.determinarNombrePorNumeroDeDia(numeroDeDia);
      diasMasCalurosos[i] = nombre;
    }

    return diasMasCalurosos;
  }

  // Determina los "n" días más fríos de la semana.
  public String[] determinarDiasMasFrios(int n) {
    // Determinar que la cantidad de días requeridos no sea mayor que la
    // cantidad de días disponibles.

    String[] diasMasFrios = new String[n];

    // Se copia el arreglo de temperaturas en otro arreglo, que se utilizará
    // para realizar un ordenamiento de los datos, con el fin de obtener
    // los días con las temperaturas mínimas.
    int[] temperaturasOrdenadas = java.util.Arrays.copyOf(this.temperaturas, this.temperaturas.length);

    java.util.Arrays.sort(temperaturasOrdenadas);

    // Una vez ordenadas las temperaturas, se obtienen las menores,
    // se determina el nombre del día en el que se registraron,
    // y se agregan al arreglo que almacenará la cantidad de temperaturas
    // requeridas.
    for (int i = 0; i < n; i++) {
      int pos = (this.temperaturas.length - i - 1);
      int temperaturaBuscada = temperaturasOrdenadas[pos];
      int numeroDeDia = this.obtenerNumeroDeDiaPorTemperatura(temperaturaBuscada);
      String nombre = this.determinarNombrePorNumeroDeDia(numeroDeDia);
      diasMasFrios[i] = nombre;
    }

    return diasMasFrios;
  }
}
