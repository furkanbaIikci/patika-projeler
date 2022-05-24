package OgrenciBilgiSistemi;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    void addTeacher(Teacher courseTeacher){
        this.courseTeacher = courseTeacher;
    }

    void printTeacher(){
        System.out.println("Adi: " + courseTeacher.name);
        System.out.println("Telefon No: " + courseTeacher.mpno);
        System.out.println("Bransi: " + courseTeacher.branch);
    }



}
