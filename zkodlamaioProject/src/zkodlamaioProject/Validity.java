package zkodlamaioProject;

import CourseBase.Values;

public class Validity {
	public boolean isValid(Values values) {
		if((values.price>=0)) {
			return true;
		}else {
			return false;
		}
	}

}
