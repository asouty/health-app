public class GeneralPractitioner extends HealthProfessional{

    public GeneralPractitioner() {
        this(0);
    }

    public GeneralPractitioner(int id) {
        super(id, DoctorType.GeneralPractitioner);
    }
}
