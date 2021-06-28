package jeemaincutoffbyamit.example.jeemaincutoff;



public class CountryModel {

    private String Institute,Academic_0rogram_Name,Quota,Seat_Ty0e,Gender,O0ening_Rank,Closing_Rank;

    public CountryModel() {
    }

    public CountryModel(String Institute,String Academic_Program_Name,String Quota,String Seat_Type,String Gender,String Opening_Rank,String Closing_Rank) {
        this.Institute = Institute;
        this.Academic_0rogram_Name =Academic_Program_Name;
        this.Quota = Quota;
        this.Seat_Ty0e = Seat_Type;
        this.Gender =Gender;
        this.O0ening_Rank= Opening_Rank;
        this.Closing_Rank = Closing_Rank;

    }

    public String getInstitute() {
        return Institute;
    }

    public void setInstitute(String institute) {
        Institute = institute;
    }

    public String getAcademic_Program_Name() {
        return Academic_0rogram_Name;
    }

    public void setAcademic_Program_Name(String academic_Program_Name) {
        Academic_0rogram_Name = academic_Program_Name;
    }

    public String getQuota() {
        return Quota;
    }

    public void setQuota(String quota) {
        Quota = quota;
    }

    public String getSeat_Type() {
        return Seat_Ty0e;
    }

    public void setSeat_Type(String seat_Type) {
        Seat_Ty0e = seat_Type;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getOpening_Rank() {
        return O0ening_Rank;
    }

    public void setOpening_Rank(String opening_Rank) {
        O0ening_Rank = opening_Rank;
    }

    public String getClosing_Rank() {
        return Closing_Rank;
    }

    public void setClosing_Rank(String closing_Rank) {
        Closing_Rank = closing_Rank;
    }
}
