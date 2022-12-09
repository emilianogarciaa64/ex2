public class Professor{
    
    private String professorName;
    private String s1;
    private String s2;
    private String s3;

    public Professor(Subject s1, Subject s2, Subject s3,String professorName){
        this.professorName=professorName;
        this.s1=s1.getSubjectName();
        this.s2=s2.getSubjectName();
        this.s3=s3.getSubjectName();
    }

    public double subjectScore(Student student1,Subject sub1,double testScore1,double testScore2,double testScore3){

        double averageScore = (testScore1+testScore2+testScore3)/3;

    

        return averageScore;

    }



    
}
