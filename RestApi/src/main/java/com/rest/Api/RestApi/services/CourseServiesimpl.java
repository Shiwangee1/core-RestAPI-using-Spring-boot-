package com.rest.Api.RestApi.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



import org.springframework.stereotype.Service;
import com.rest.Api.RestApi.entities.Coures;

@Service
public class CourseServiesimpl implements CourseServies {

    private List<Coures> list;

    public CourseServiesimpl() {
        list = new ArrayList<>();
        list.add(new Coures(1, "sonam", "up"));
        list.add(new Coures(2, "sonal", "jaunpur"));
        list.add(new Coures(3, "spnu", "mumbai"));
        list.add(new Coures(4, "dev", "delhi"));
    }

    @Override
    public List<Coures> ListAllCoures() {
        return list;
    }

    @Override
    public Coures GetAllCoures(long id) {
        Coures C = null;
        for (Coures course : list) {
            if (course.getId() == id) {
                C = course;
                break;
            }
        }
        return C;
    }

    @Override
    public Coures AddCourse(Coures course) {
        list.add(course);
        return course;
    }

    @Override
    public Coures UpdateCourse(long id, Coures updatedCourse) {
        for (Coures course : list) {
            if (course.getId() == id) {
                // Update the existing course with the new values
                course.setTitile(updatedCourse.getTitile());
                course.setDescription(updatedCourse.getDescription());
                return course;
            }
        }
        return null; // Course with the given ID not found
    }

    @Override
    public void DeleteCourse(long id) {
        Iterator<Coures> iterator = list.iterator();
        while (iterator.hasNext()) {
            Coures course = iterator.next();
            if (course.getId() == id) {
                iterator.remove();
            }
        }
    }
}
