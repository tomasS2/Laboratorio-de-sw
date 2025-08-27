import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vacuna> vacunas = new ArrayList<Vacuna>();
        for (int i = 0 ; i < 4 ; i++) {
            vacunas.add(new Vacuna("vacuna "+i, "pais origen "+i, "enfermedad que previene "+i, 1));
        }
        System.out.println(vacunas);

        Vacuna otraVacuna = new Vacuna("otra vacuna", "pais origen", "enfermedad", 1);
        System.out.println(vacunas.get(0).equals(otraVacuna));
        //en el manifest se le especifica al archivo jar cuál es el main

        VacunaPatogenoIntegro vpi = new VacunaPatogenoIntegro("otra vacuna", "pais origen", "enfermedad", 1, "virus covid");
        VacunaSubunidadAntigenica vsa = new VacunaSubunidadAntigenica  ("otra vacuna", "pais origen", "enfermedad", 1, 11, "proceso 1");
        VacunaGenetica vg = new VacunaGenetica("otra vacuna", "pais origen", "enfermedad", 1, "30 GRADOS", "20 GRADOS");



        System.out.println(vpi.toString());
        System.out.println(vsa.toString());
        System.out.println(vg.toString());

        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();
        //al ser estatico el logger, solo hay una instancia de este. por eso log1 y log2 son la misma instancia (anotación aparte del ejercicio)
        System.out.println(log1);
        System.out.println(log2);

        log1.logInfo(vpi.toString());
        log1.logError(vpi.toString());
        log1.logWarning(vpi.toString());




    }
}