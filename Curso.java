public class Curso {

    // Se consideran cada fila como una asignatura,
    // y cada columna de esa fila...
    private float[][] notas = {
        {6.6f, 5.5f},
        {4.5f, 3.5f, 6.6f},
        {6.7f},
        {4.5f, 5.7f, 6.3f, 2.3f}
    };

    public void calcularPromediosPorAlumno() {
        // Como se deben obtener los promedios por cada alumno,
        // se debe recorrer, por cada alumno, sus notas.
        for (int i = 0; i < notas.length; i++) {
            float suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += this.notas[i][j];
            }
            float promedio = suma / notas[i].length;
            // Se muestran las notas utilizando formateo; en este caso,
            // el formateo trunca la nota a un decimal.
            System.out.format("Promedio alumno %d: %.1f\n", (i+1), promedio);
        }
    }

    public void calcularPromediosPorAsignatura() {
      // Dado que el arreglo es irregular, se creará una versión regular,
      // para poder obtener de forma sencilla los promedios por asignatura.
      // Dado que la cantidad de alumnos es conocida (notas.length),
      // lo principal es conocer la cantidad total de asignaturas.
      // Para esto, se buscará el alumno con más notas, entendiéndose que esa
      // mayor cantidad de notas, equivale al total de asignaturas.
      int totalAsignaturas = this.notas[0].length;
      for (int i = 1; i < this.notas.length; i++) {
        if (this.notas[i].length > totalAsignaturas) {
          totalAsignaturas = this.notas[i].length;
        }
      }

      // Una vez determinado el total de asignaturas, se crea un arreglo
      // multidimensional regular, con la misma cantidad de files que el
      // arrego irregular de notas, pero con una cantidad determinada de
      // columnas, siendo esta cantidad de columnas dada por la cantidad
      // total de asignaturas.
      // Ya que se trata de un arreglo que almacena datos de tipo float,
      // es decir un tipo primitivo, todas las posiciones serán inicializadas
      // en el valor por defecto (0.0).
      float[][] notasRegulares = new float[this.notas.length][totalAsignaturas];

      // Luego, se inicializa el arreglo regular, a partir del irregular.
      for (int i = 0; i < this.notas.length; i++) {
        for (int j = 0; j < this.notas[i].length; j++) {
          notasRegulares[i][j] = this.notas[i][j];
        }
      }

      //mostrarArregloBidimensional(notasRegulares);

      // Ahora que tenemos acceso a un arreglo regular, podemos realizar un
      // recorrido de los datos comenzando por las columnas.
      // Para lograr esto, en lugar de utilizar el índice incrementado en el
      // ciclo exterior y luego el índice incrementado en el ciclo interior,
      // como se hizo al calcular los promedios por alumno, en este caso,
      // se accederá al valor primero utilizando el índice incrementado en el
      // ciclo interior y luego el índice incrementado en el ciclo exterior.
      for (int i = 0; i < notasRegulares.length; i++) {
        float suma = 0;
        int asignatura = 0;
        int totalNotasAsignatura = 0;

        for (int j = 0; j < notasRegulares[i].length; j++) {
          // Dado que hay alumnos que no tienen notas en todas las
          // asignaturas, y si consideramos que la nota mínima es cero,
          // se entenderá que si en el arreglo bidimensional regular
          // se lee un valor cero, se trata de una nota no promediable,
          // por lo tanto no se considerará.
          if (notasRegulares[j][i] > 0) {
            suma += notasRegulares[j][i];
            totalNotasAsignatura++;
          }
        }

        float promedio = suma / totalNotasAsignatura;
        System.out.format("Promedio asignatura %d: %.1f\n", (i+1), promedio);
      }
    }

    public void calcularPromedioCurso() {
        // En este caso, sólo se obtiene la suma de todas las notas,
        // y se obtiene su promedio.
        float suma = 0;
        int total = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
                total++;
            }
        }
        float promedio = suma / total;
        System.out.format("Promedio del curso: %.1f\n", promedio);
    }
}
