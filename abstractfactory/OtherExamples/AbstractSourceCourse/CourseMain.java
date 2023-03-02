
public class CourseMain
{
    public static void main(String[] args)
    {
        SourceCourseFactory course = FactoryCreator.getSourceCourseFactory("course");
 
        System.out.println(course.getCourse("programming").getCourseName());
 
        SourceCourseFactory source = FactoryCreator.getSourceCourseFactory("source");
        System.out.println(source.getSource("online").getSourceName());
 
    }
}