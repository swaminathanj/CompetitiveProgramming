
public class FactoryCreator {
	
	
	public static SourceCourseFactory getSourceCourseFactory(String type) {
		
		
		if(type.equals("course")){
			return new CourseFactory();
			
		}
		else if(type.equals("source")){
			return new SourceFactory();
			
		}else {
			return null;}
		
	}

}


