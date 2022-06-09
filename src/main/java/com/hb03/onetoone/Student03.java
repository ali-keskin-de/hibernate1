package com.hb03.onetoone;

import javax.persistence.Column;
import javax.persistence.*;

@Entity
public class Student03 {
    @Id
    private int id;

    //@Column annotasyonu mecburi değildir. Fakat custom bir kolon ismi vermek istenirse o zaman mecburidir.
    @Column(name="std_name")
    private String name;

    //@Transient annotationu koyduğumuz değişken tabloda bir kolon olarak oluşmaz.
    //@Transient ne zaman bu Annotation kullanilr
    // eger sinifimizin icerisinde sabit bir data tutuyorsak ve bunun tabloda görünmesini istemiyorsak kullaniriz
    private int grade;

    @OneToOne(mappedBy = "student")
    private Diary diary;



    @Override
    public String toString() {
        return "Student03 [id=" + id + ", name=" + name + ", grade=" + grade + "]";
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public int getGrade() {
        return grade;
    }



    public void setGrade(int grade) {
        this.grade = grade;
    }



    public Diary getDiary() {
        return diary;
    }



    public void setDiary(Diary diary) {
        this.diary = diary;
    }





}