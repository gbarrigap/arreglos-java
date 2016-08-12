public class Edificio {
    
    private int[][][] departamentos;
    
    public Edificio() {
        // Dado que se conoce la estructura del edificio,
        // se puede inicializar al momento de instaciar la clase.
        int[][][] departamentos = {
            { // Piso 5
                {0, 0}, // Deptos. N y NO
                {0} // Depto. S
            },
            { // Piso 4
                {0, 0}, // Deptos. N y NO
                {0} // Depto. S
            },
            { // Piso 3
                {0, 0}, // Deptos. N y NO
                {0} // Depto. S
            },
            { // Piso 2
                {0, 0}, // Deptos. N y NO
                {0} // Depto. S
            },
            { // Piso 1
                {0, 0}, // Deptos. N y NO
                {0} // Depto. S
            }
        };
        
        // Una vez inicializada la estructura, se asignara de forma aleatoria
        // la cantidad de habitantes por departamento; de 1 a 4.
        for (int i = 0; i < departamentos.length; i++) {
            for (int j = 0; j < departamentos[i].length; j++) {
                for (int k = 0; k < departamentos[i][j].length; k++) {
                    departamentos[i][j][k] = ((int)(Math.random() * 5) + 1);
                }
            }
        }
        
        this.departamentos = departamentos;
    }
    
    public void mostrarEdificio() {
        System.out.println("############");
        System.out.println("# Edificio #");
        System.out.println("############");
        
        for (int i = 0; i < departamentos.length; i++) {
            for (int j = 0; j < departamentos[i].length; j++) {
                for (int k = 0; k < departamentos[i][j].length; k++) {
                    System.out.print(departamentos[i][j][k]);
                }
            }
            System.out.println();
        }
    }
    
    public void calcularNumeroDeHabitantesPorPiso() {
        for (int i = 0; i < departamentos.length; i++) {
            int suma = 0;
            for (int j = 0; j < departamentos[i].length; j++) {
                for (int k = 0; k < departamentos[i][j].length; k++) {
                    suma += departamentos[i][j][k];
                }
            }
            System.out.format("Hay %d habitantes en el piso %d\n", suma, (i+1));
        }
    }
    
    public void determinarNumeroDeDepartamentosConSolPorLaTarde() {
        // Para esta pregunta, supondremos que los departamentos con vista
        // norte y noroeste serán iluminados por el sol durante la tarde,
        // por lo que consideraremos que los departamentos con índices
        // (0,0) y (0,1) de cada piso serán considerados para el conteo.
        int totalDepartamentosIluminados = 0;
        for (int i = 0; i < departamentos.length; i++) {
            for (int j = 0; j < departamentos[i].length; j++) {
                for (int k = 0; k < departamentos[i][j].length; k++) {
                    if (j == 0 && (k == 0 || k == 1)) {
                        totalDepartamentosIluminados++;
                    }
                }
            }
        }
        
        System.out.format("Hay %d departamentos iluminados por el sol durante la tarde.\n", totalDepartamentosIluminados);
    }
    
    public void calcularNumeroDeHabitantesPorLado() {
        // Se definen variables para contener el total de habitantes por cada
        // lado del edificio.
        int totalHabitantesLadoN = 0; // Habitantes lado norte.
        int totalHabitantesLadoNO = 0; // Habitantes lado noroeste.
        int totalHabitantesLadoS = 0; // Habitantes lado sur.
        
        for (int i = 0; i < departamentos.length; i++) {
            for (int j = 0; j < departamentos[i].length; j++) {
                for (int k = 0; k < departamentos[i][j].length; k++) {
                    if (j == 0 && k == 1) { // Norte
                        totalHabitantesLadoN += departamentos[i][j][k];
                    }
                    else if (j == 0 && k == 0) { // Noroeste
                        totalHabitantesLadoNO += departamentos[i][j][k];
                    }
                    else if (j == 1 && k == 0) { // Sur
                        totalHabitantesLadoS += departamentos[i][j][k];
                    }
                }
            }
        }
        
        System.out.format("Hay %d habitantes en el lado norte.\n", totalHabitantesLadoN);
        System.out.format("Hay %d habitantes en el lado noroeste.\n", totalHabitantesLadoNO);
        System.out.format("Hay %d habitantes en el lado sur.\n", totalHabitantesLadoS);
    }
}