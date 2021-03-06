public class Demo {

  public static void main(String[] args) {
    int[] temperaturas = new int[] {21, 18, 14, 22, 35, 28, 35};
    Temperatura temperatura = new Temperatura(temperaturas);

    String[] dias = temperatura.determinarDiasMasCaluroso(3);
    for (int i = 0; i < dias.length; i++) {
      System.out.println(dias[i]);
    }

    dias = temperatura.determinarDiasMasFrios(3);
    for (int i = 0; i < dias.length; i++) {
      System.out.println(dias[i]);
    }

    Exportador e = new Exportador();
    e.mostrarMercadosAExportarPorProducto();

    Curso c = new Curso();
    c.calcularPromediosPorAlumno();
    c.calcularPromediosPorAsignatura();
    c.calcularPromedioCurso();

    /************/
    /* Edificio */
    /************/
    Edificio ed = new Edificio();
    ed.mostrarEdificio();
    ed.calcularNumeroDeHabitantesPorPiso();
    ed.determinarNumeroDeDepartamentosConSolPorLaTarde();
    ed.calcularNumeroDeHabitantesPorLado();

    /*******/
    /* Bus */
    /*******/
    Bus bus = new Bus();
    bus.calcularCantidadDeAsientosOcupadosPasillo();
    bus.calcularCantidadDeAsientosOcupadosVentana();
  }
}
