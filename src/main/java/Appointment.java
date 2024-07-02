import java.util.List;

public class Appointment {
    private HealthProfessional doctor;
    private Patient patient;
    private PreferredTime preferredTime;

    public Appointment() {
        this(new HealthProfessional(), new Patient(), PreferredTime._0800);
    }

    public Appointment(final HealthProfessional doctor, final Patient patient, final PreferredTime preferredTime) {
        this.doctor = doctor;
        this.patient = patient;
        this.preferredTime = preferredTime;
    }

    public static Appointment CreateAppointment(final HealthProfessional doctor, final Patient patient, final PreferredTime preferredTime) throws Exception {
        if (doctor != null && !doctor.isInitialized()){
            throw new Exception("Doctor is not initialized");
        }
        if (patient != null && !patient.isInitialized()){
            throw new Exception("Patient is not initialized");
        }
        return new Appointment(doctor, patient, preferredTime);
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "doctor=" + doctor +
                ", patient=" + patient +
                ", preferredTime=" + preferredTime +
                '}';
    }

    public static void PrintExistingAppointment(final List<Appointment> appointments){
        if(appointments.isEmpty()){
            System.out.println("No booked Appointment");
        } else {
            appointments.forEach(System.out::println);
        }
    }

    public static void CancelBooking(final List<Appointment> appointments, final String patientPhone){
        int bookingNumber = appointments.size();
        appointments.removeIf(appointment -> appointment.patient.mobile().equals(patientPhone));
        if(bookingNumber != appointments.size()){
            System.out.println("No booked Appointment for the patient phone " + patientPhone);
        }
    }
}
