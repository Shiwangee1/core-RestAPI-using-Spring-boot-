package com.rest.Api.RestApi.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.rest.Api.RestApi.entities.Coures;
import com.rest.Api.RestApi.services.CourseServies;

@RestController
public class myController {

    @Autowired
    private CourseServies courseServies;

    @GetMapping("/home")
    public String home() {
        return "This is home page";
    }

    @GetMapping("/coures")
    public List<Coures> getCourses() {
        return this.courseServies.ListAllCoures();
    }

    @GetMapping("/coures/{id}")
    public ResponseEntity<Coures> getCoursById(@PathVariable long id) {
        Coures course = this.courseServies.GetAllCoures(id);
        if (course != null) {
            return ResponseEntity.ok(course);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/coures")
    public Coures addCourses(@RequestBody Coures course) {
        return this.courseServies.AddCourse(course);
    }
    @PutMapping("/coures/{id}")
    public ResponseEntity<Coures> updateCourse(@PathVariable long id, @RequestBody Coures updatedCourse) {
        Coures course = this.courseServies.UpdateCourse(id, updatedCourse);
        if (course != null) {
            return ResponseEntity.ok(course);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/coures/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable long id) {
        this.courseServies.DeleteCourse(id);
        return ResponseEntity.noContent().build();
    }
}
