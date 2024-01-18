package com.rest.Api.RestApi.services;

import java.util.List;
import com.rest.Api.RestApi.entities.Coures;

public interface CourseServies {
	List<Coures> ListAllCoures();

	Coures GetAllCoures(long id);

	Coures AddCourse(Coures course);

	Coures UpdateCourse(long id, Coures course);

	void DeleteCourse(long id);
}
