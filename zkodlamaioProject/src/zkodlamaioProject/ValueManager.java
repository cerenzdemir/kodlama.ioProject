package zkodlamaioProject;

import CourseBase.Values;

public class ValueManager {
	public void add(Values values) {
		Validity validity=new Validity();
		if(validity.isValid(values)) {
			System.out.println("Ücret belirlendi");
		}else {
			System.err.println("Geçersiz ücret");
		}
		
	}

}
