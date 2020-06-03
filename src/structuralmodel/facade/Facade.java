package structuralmodel.facade;

public class Facade {

    private SubjectOne subjectOne = new SubjectOne();
    private SubjectTwo subjectTwo = new SubjectTwo();
    private SubjectThree subjectThree = new SubjectThree();

    public void visit(){
            subjectOne.methodOne();
            subjectTwo.methodTwo();
            subjectThree.methodThree();
    }

}
