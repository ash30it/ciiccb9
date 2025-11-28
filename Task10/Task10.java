package Task10;

public class Task10 {
    public static void main(String[] args) {
        Student[] students= new Student[]{
            new Student("Morgan","Freeman"),
            new Student("Brad", "Pitt"),
            new Student("Kevin","Spacy")
        };
        for (Student s:students){
            s.printFullName();
        }
    }
}
