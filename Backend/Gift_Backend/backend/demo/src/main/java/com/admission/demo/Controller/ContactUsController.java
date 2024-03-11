package com.admission.demo.Controller;

import com.admission.demo.Model.ContactUs;
import com.admission.demo.Service.ContactUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:5173/", allowedHeaders = "*")
public class ContactUsController {

    @Autowired
    private ContactUsService contactUsService;

    @GetMapping
    public ResponseEntity<List<ContactUs>> getAllContactUs() {
        return new ResponseEntity<>(contactUsService.getAllContactUs(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ContactUs>> getContactUsById(@PathVariable Long id) {
        return new ResponseEntity<>(contactUsService.getContactUsById(id), HttpStatus.OK);
    }
    @GetMapping("/allcontact")
    public List<ContactUs> getAllFeed() {
        return contactUsService.getAllFeed();
    }

    @PostMapping("/addfeed")
    public ContactUs createcontact(@RequestBody ContactUs contact) {
        return contactUsService.createcontact( contact);
    }
    @PostMapping
    public ResponseEntity<ContactUs> saveContactUs(@RequestBody ContactUs contactUs) {
        return new ResponseEntity<>(contactUsService.saveContactUs(contactUs), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ContactUs> updateContactUs(@PathVariable Long id, @RequestBody ContactUs updatedCourse) {
        return new ResponseEntity<>(contactUsService.updateContactUs(id, updatedCourse), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCourse(@PathVariable Long id) {
        contactUsService.deleteCourse(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
