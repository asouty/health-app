import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Part 3 - Using classes and object
        final List<HealthProfessional> professionals = new ArrayList<>();
        professionals.add(new GeneralPractitioner(1));
        professionals.add(new GeneralPractitioner(2));
        professionals.add(new GeneralPractitioner(3));

        professionals.add(new Surgeon(4));
        professionals.add(new Surgeon(5));
        professionals.forEach(System.out::println);
        System.out.println("--------------------------------");

        // Part 5 - Collection of Appointment
        final List<Appointment> appointments = new ArrayList<>();
        try {
            appointments.add(Appointment.CreateAppointment(professionals.get(0), new Patient("Patient 1", "(777)333-0000"), PreferredTime._0800));
            appointments.add(Appointment.CreateAppointment(professionals.get(1), new Patient("Patient 2", "(888)333-0000"), PreferredTime._1000));
            appointments.add(Appointment.CreateAppointment(professionals.get(3), new Patient("Patient 3", "(888)333-0000"), PreferredTime._1430));
            appointments.add(Appointment.CreateAppointment(professionals.get(4), new Patient("Patient 4", "(999)333-0000"), PreferredTime._0800));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Display all appointments");
        Appointment.PrintExistingAppointment(appointments);
        Appointment.CancelBooking(appointments, "(999)333-0000");
        System.out.println("Display all appointments after remove (999)333-0000");
        Appointment.PrintExistingAppointment(appointments);
        Appointment.CancelBooking(appointments, "Unknown");
        System.out.println("Display all appointments after remove unknown number");
        Appointment.PrintExistingAppointment(appointments);
        System.out.println("--------------------------------");
    }
}
