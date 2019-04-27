package c.domain.employee;

import javafx.util.Builder;

public class Qualification {


    private int qualificationID;
    private String qualificationName;
    private String instituteName;
    private String qualificationDuration;

    public Qualification(){

    }

    public Qualification(Builder builder){

        this.qualificationID = builder.qualificationID;
        this.qualificationName = builder.qualificationName;
        this.instituteName = builder.instituteName;
        this.qualificationDuration = builder.qualificationDuration;

    }

    public int getQualificationID() {
        return qualificationID;
    }

    public String getQualificationName() {
        return qualificationName;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public String getQualificationDuration() {
        return qualificationDuration;
    }

    public static class Builder{

        private int qualificationID;
        private String qualificationName;
        private String instituteName;
        private String qualificationDuration;


        public Builder qualificationID(int qualificationID){

            this.qualificationID = qualificationID;
            return this;

        }

    }





}
