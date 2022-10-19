package zkodlamaioProject;

import CourseBase.Category;
import CourseBase.Course;

public class CourseManager{
	public void add(Category category) {
		if(category.equals(category)){
			System.out.println("Kategori mevcut!");
		}else {
			System.out.println("Yeni kategori eklendi.");
		}
				
	}
	public void add(Course course) {
		if(course.equals(course)) {
			System.out.println("Kurs mevcut!");
		}else {
			System.out.println("Yeni kurs eklendi");
		}
	}
}
	
	
	

	
