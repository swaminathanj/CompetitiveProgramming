
public class SourceFactory extends SourceCourseFactory
{
   
 
    @Override
    public Source getSource(String sourceType)
    {
        if(sourceType.equalsIgnoreCase("online"))
        {
            return new Online();
        }
        else if(sourceType.equalsIgnoreCase("offline"))
        {
            return new Offline();
        }
        else
        {
            return null;
        }   
    }

	@Override
	public Course getCourse(String courseType) {
		// TODO Auto-generated method stub
		return null;
	}

	
}