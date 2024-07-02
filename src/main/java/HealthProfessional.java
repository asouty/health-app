public class HealthProfessional {
    private final int id;
    private final DoctorType type;

    public HealthProfessional() {
        this(0, DoctorType.Unknown);
    }
    public HealthProfessional(final int id, final DoctorType type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public String toString() {
        return "The doctor details are: " +
                "id=" + id +
                ", type=" + type;
    }

    public boolean isInitialized(){
        return this.id > 0 && this.type != DoctorType.Unknown;
    }
}
