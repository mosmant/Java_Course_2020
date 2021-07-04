package Gun36._01_Constructor;

public class Okul {
    // Bir Student sınıfı oluşturunuz
    // (id, name, surName, classroom) ve
    // bundan 7 adet öğrenci oluşturunuz.

    public static void main(String[] args) {

        // 1.Yöntem Nesne oluşturmak
        Student ogr1=new Student();
        ogr1.id = 1;
        ogr1.name="Gülcan";
        ogr1.surName="Bergstein";
        ogr1.classroom=9;
        System.out.println("ogr1.name = " + ogr1.name);

        //2.Yöntem Nesne oluşturma
        Student ogr2 = Student.createStudent(2,"Elif", "Grifflinberg", 8);
        System.out.println("ogr2.name = " + ogr2.name);

        //3.Yöntem yeni!!!!
        Student ogr3= new Student(3, "Bige", "Denizhan", 4); // tanımlama anında çalışan metodlar var aslında
                                     // ama sen kullanmadığın için bende göstermiyorum.

        System.out.println("ogr3.name = " + ogr3.name);

        Student ogr4= new Student(3, "Buket", "Denizhan");
        Student ogr5= new Student(3, "Cayda");
        Student ogr6= new Student(3);


    }


}
