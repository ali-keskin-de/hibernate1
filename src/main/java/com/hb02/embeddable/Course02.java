package com.hb02.embeddable;


import javax.persistence.Embeddable;


// @Embeddable annotation ile bu annotationin sahip oldugu instance variable lari ek
// bir tablo olusturmadan baska bir tabloya koymaya yarar
//Gömülebilir. Bu Annotation ile bir classi baska bir Classtaki olusturulan tabloya gömer.
@Embeddable
public class Course02 {
    private String elective;
    private String mandatory;

    public String getElective() {
        return elective;
    }

    public void setElective(String elective) {
        this.elective = elective;
    }

    public String getMandatory() {
        return mandatory;
    }

    public void setMandatory(String mandatory) {
        this.mandatory = mandatory;
    }

    @Override
    public String toString() {
        return "Course02{" +
                "elective='" + elective + '\'' +
                ", mandatory='" + mandatory + '\'' +
                '}';
    }
}
