public class Exportador {

  private String[] mercados = {"New York", "Miami", "San Francisco", "Luisiana"};

  private String[] productos = {"Manzana", "Pera", "Durazno", "Uva"};

  private int[][] preciosProductosPorMercado = {
    // New York
    {18, 21, 19, 22},
    // Miami
    {22, 18, 21, 19},
    // San Francisco
    {18, 20, 18, 21},
    // Luisiana
    {19, 22, 21, 15}
  };

  public String determinarMejorMercadorPorProducto(int j) {
    // Se recorren los mercados, y se obtiene el mercado con el mayor precio
    // para el producto recibido.
    int mejorPrecio = this.preciosProductosPorMercado[0][j];
    String nombre = this.mercados[0];

    for (int i = 1; i < this.mercados.length; i++) {
      if (this.preciosProductosPorMercado[i][j] > mejorPrecio) {
        mejorPrecio = this.preciosProductosPorMercado[i][j];
        nombre = this.mercados[i];
      }
    }

    return nombre;
  }

  public void mostrarMercadosAExportarPorProducto() {
    // Se recorren los productos.
    for (int i = 0; i < this.productos.length; i++) {
      String producto = this.productos[i];
      String mercado = this.determinarMejorMercadorPorProducto(i);
      System.out.println(producto + " -> " + mercado);
    }
  }
}
