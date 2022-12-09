public class Student{

    private String studentName;
    private String s1;
    private String s2;
    private String s3;
    private String s4;
    private String s5;
    private double s1Score;
    private double s2Score;
    private double s3Score;
    private double s4Score;
    private double s5Score;
    

    public Student(Subject s1, Subject s2, Subject s3,Subject s4, Subject s5, String studentName){
        this.studentName=studentName;
        this.s1=s1.getSubjectName();
        this.s2=s2.getSubjectName();
        this.s3=s3.getSubjectName();
        this.s4=s4.getSubjectName();
        this.s5=s5.getSubjectName();
       
    }

    public void setS1Score(double s1Score) {
        this.s1Score = s1Score;
    }

    public void setS2Score(double s2Score) {
        this.s2Score = s2Score;
    }
    
    public void setS3Score(double s3Score) {
        this.s3Score = s3Score;
    }

    public void setS4Score(double s4Score) {
        this.s4Score = s4Score;
    }

    public void setS5Score(double s5Score) {
        this.s5Score = s5Score;
    }



     public boolean passCourse(){

        boolean flag = false;

        if(s1Score>=5.5 && s2Score>=5.5 && s3Score>=5.5 && s4Score>=5.5 && s5Score>=5.5)
        flag=true;

        

        return flag;


    } 

   


    

    @Override
    public String toString()
    {

        if(passCourse()==true){

            return "\nSi paso el alumnno: " + this.studentName;


        }else{
            return "\nNo paso el alumnno: " + this.studentName;
        }
        
    }

}