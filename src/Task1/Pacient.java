package Task1;

public class Pacient {
    int id;
    private String surname;
    private String name;
       private String secondname;

    private String mobile;

    private int numberMedicalCard;

    private String diagnoz;

    Pacient(int id, String name, String surname, String secondname, String mobile, int numberMedicalCard, String diagnoz) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.secondname = secondname;
        this.mobile = mobile;
        this.numberMedicalCard = numberMedicalCard;
        this.diagnoz = diagnoz;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId(int id) {
        this.id = id;
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.name;
    }

    public String getSecondname() {
        return this.secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getMobile() {

        return this.mobile;
    }
    public void setMobile(){
        this.mobile=mobile;
    }
    public int getNumberMedicalCard(){
        return this.numberMedicalCard;
    }
    public void setNumberMedicalCard(int numberMedicalCard){
        this.numberMedicalCard=numberMedicalCard;
    }
    public String getDiagnoz(){
        return this.diagnoz;
    }
    public void  setDiagnoz(String diagnoz){
        this.diagnoz=diagnoz;
    }
    public String toString(){
        return "id: "+id+"\t Имя:"+name+"\t Фамилия: "+surname+"\t Отчество: "+secondname+"\t Телефон: "+mobile+
                "" + "\t Номер медицинской Карты "+numberMedicalCard+"\t Диагноз: "+diagnoz;
    }
}
