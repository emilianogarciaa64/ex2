public class Main {

    public static void main(String arg[]){
        

       /*  Subject s[] = new Subject[9]; */


       
        //definimos las materias como objetos
        Subject algebra = new Subject("Algebra");
        Subject fisica = new Subject("Fisica");
        Subject calculo_1 = new Subject("Calculo 1");
        Subject ingles = new Subject("Ingles");
        Subject programacion_2 = new Subject("Programacion 2");
        Subject metodos_numericos = new Subject("Metodos Numericos");
        Subject vision = new Subject("Vision");
        Subject redes = new Subject("Redes");
        Subject bases_de_datos = new Subject("Bases de Datos");

        //2 alumnos
        Student juan = new Student(algebra, fisica, calculo_1, ingles, programacion_2, "Juan");

        Student pedro = new Student(metodos_numericos, vision, redes, bases_de_datos, programacion_2, "Pedro");


        //3 profesores
        Professor felix = new Professor(programacion_2, vision, redes, "Felix");

        Professor nandinni = new Professor(algebra, ingles, fisica, "Nandinni");

        Professor rocha = new Professor(calculo_1, bases_de_datos, metodos_numericos, "Rocha");

        //definicion de calificaciones de juan
        juan.setS1Score(nandinni.subjectScore(juan, algebra, 6.9, 6.4, 6.6));
        juan.setS2Score(nandinni.subjectScore(juan, fisica, 6.9, 8.4, 9.6));
        juan.setS3Score(rocha.subjectScore(juan, calculo_1, 9.0, 9.8, 10.0));
        juan.setS4Score(nandinni.subjectScore(juan, ingles, 7.8, 8.4, 7.6));
        juan.setS5Score(felix.subjectScore(juan, programacion_2, 7.0, 7.4, 6.6));

        //definicion de calificaciones de pedro

        pedro.setS1Score(rocha.subjectScore(pedro, metodos_numericos, 3.9, 2.4, 1.6));
        pedro.setS2Score(felix.subjectScore(pedro, vision, 3.9, 2.4, 9.6));
        pedro.setS3Score(felix.subjectScore(pedro, redes, 9.0, 9.8, 10.0));
        pedro.setS4Score(rocha.subjectScore(pedro, bases_de_datos, 7.8, 8.4, 7.6));
        pedro.setS5Score(felix.subjectScore(pedro, programacion_2, 7.0, 7.4, 6.6));







       

       

        System.out.println(juan.toString());
        System.out.println(pedro.toString());



        
        
    }
    
}
