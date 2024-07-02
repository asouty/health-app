public class Surgeon extends HealthProfessional {

    public Surgeon() {
        this(0);
    }

    public Surgeon(int id) {
        super(id, DoctorType.MedicalAssistant);
    }

}
