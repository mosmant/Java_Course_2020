package Gun36._02_Constructor;

public class Kitap {
    String name;
    int publishYear;
    String author;

    public Kitap(String name, int publishYear,  String author)
    {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
    }

    public Kitap(String name, int publishYear)
    {
        //this(name, publishYear,"");
        this.name = name;
        this.publishYear = publishYear;
        this.author = "";
    }
    public Kitap()
    {
        //this("","",0);
        this.name = "";
        this.author = "";
        this.publishYear = 0;
    }

    // genel metod adı , string hali
    public String toString(){
        return name+" "+publishYear+" "+author;
    }


    public void goster()
    {
        System.out.println(name+" "+publishYear+" "+author);
    }



}
