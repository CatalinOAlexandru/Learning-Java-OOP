
public class Patient extends Person
{
    private String MedicalHistory;
    
    public Patient(String name,String dateofbirth, String medicalhistory)
    {
        super(name, dateofbirth);
        MedicalHistory = medicalhistory;
    }

    String getMedicalHistory()
    {return MedicalHistory;}
    
    void updateMedicalHistory(String med)
    {MedicalHistory=MedicalHistory+med;}
}
