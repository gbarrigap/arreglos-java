/*
 *
 */
public class Promedio {

  private float[] notas;

  public Promedio(float[] notas) {
    this.notas = notas;
  }

  public float calcularPromedio() {

    float suma = -1;

    if (this.notas != null && this.notas.length > 0) {
      suma = 0;

      for (int i = 0; i < this.notas.length; i++) {
        suma += this.notas[i];
      }
    }

    return suma / this.notas.length;
  }

  public float obtenerNotaMaxima() {
    float max = -1;

    if (this.notas != null && this.notas.length > 0) {
      max = this.notas[0];  // Al comenzar, se asume que la primera nota
                            // es la mayor.

      for (int i = 1; i < this.notas.length; i++) {
        // Como ya se procesó la primera nota, se recorren las notas desde la
        // segunda posición del arreglo.
        if (this.notas[i] > max) {
          max = this.notas[i];
        }
      }
    }

    return max;
  }

  public float obtenerNotaMinima() {
    float min = -1;

    if (this.notas != null && this.notas.length > 0) {
      min = this.notas[0];  // Al comenzar, se asume que la primera nota
                            // es la menor.

      for (int i = 1; i < this.notas.length; i++) {
        // Como ya se procesó la primera nota, se recorren las notas desde la
        // segunda posición del arreglo.
        if (this.notas[i] < min) {
          min = this.notas[i];
        }
      }
    }

    return min;
  }

  public boolean esAprobado() {
    // Se retorna el resultado de la comparación entre el promedio y la nota
    // mínima de aprobación, ya que el operador lógico ">" retorna boolean.
    return (this.calcularPromedio() > 4);
  }
}
