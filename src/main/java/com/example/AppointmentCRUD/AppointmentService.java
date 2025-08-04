package com.example.AppointmentCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;
    
    public List<AppointmentEntity> getAllAppointments() {
        return appointmentRepository.findAll();
    }


    public AppointmentEntity createAppointment(AppointmentEntity appointment) {
        return appointmentRepository.save(appointment);
    }

    public Optional<AppointmentEntity> getAppointmentById(int id) {
        return appointmentRepository.findById(id);
    }

    public AppointmentEntity updateStatus(int id, String status) {
        AppointmentEntity existing = appointmentRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Appointment not found with id: " + id));
        existing.setStatus(status);
        return appointmentRepository.save(existing);
    }

    public void deleteAppointment(int id) {
        appointmentRepository.deleteById(id);
    }
}
