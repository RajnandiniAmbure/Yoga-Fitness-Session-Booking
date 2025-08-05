
package com.example.AppointmentCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/appointments")
@CrossOrigin(origins = "http://localhost:5500")
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @GetMapping
    public List<AppointmentEntity> getAllAppointments() {
        return service.getAllAppointments();
    }

    @PostMapping
    public AppointmentEntity createAppointment(@RequestBody AppointmentEntity appointment) {
        return service.createAppointment(appointment);
    }

    @PutMapping("/{id}")
    public AppointmentEntity updateStatus(@PathVariable int id, @RequestBody AppointmentEntity updatedData) {
        return service.updateStatus(id, updatedData.getStatus());
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable int id) {
        service.deleteAppointment(id);
    }
}
