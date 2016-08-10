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