import CourseBase.Course;
import CourseBase.Values;
import zkodlamaioProject.CourseManager;
import zkodlamaioProject.DatabaseManager;
import zkodlamaioProject.ValueManager;

public class Main {

	public static void main(String[] args) {
		Values values=new Values();
		ValueManager valueManager= new ValueManager();
		valueManager.add(values);
		CourseManager courseManager=new CourseManager();
		courseManager.add(course);
		courseManager.add(category);
		DatabaseManager databaseManager=new DatabaseManager();
		
		values.price=-1;
		
		Course.course="java";
		Course.course="java";
		System.out.println(values);
		System.out.println(courseManager);
		

	}

}
