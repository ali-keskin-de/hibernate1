package com.hb06.idgenerationstrategy;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import org.hibernate.annotations.GenericGenerator;
@Entity
public class Student06 {
    @Id
    //@GeneratedValue tek başına kullanılırsa default AUTO strategy seçilir.
    //GenerationType.IDENTITY en kolay id oluşturma yöntemidir. Performans olarak en iyi değildir.
    //veritabanındaki auto increment olayına göre çalışır.
    //@GeneratedValue(strategy = GenerationType.IDENTITY)

    //GenerationType.SEQUENCE performansı daha yüksek. toplu insert işlemlerinde SEQUENCE daha performanslı
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="STD_SEQ")
//	@SequenceGenerator(name="STD_SEQ", initialValue = 1000, allocationSize = 50)

    //8-4-4-4-12 128bit 32 characters
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name="UUID", strategy = "uuid2")
    private String id;

    //	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
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
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    private String name;

    private int grade;


}