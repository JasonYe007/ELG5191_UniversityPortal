package course.elg5191.university.beans.session;

/**
 * @author jmccausl
 * @version 1.0
 * @created 16-Nov-2012 11:34:03 AM
 */
public interface StudentCourseRegistrationSession {

	/**
	 * 
	 * @param registrationId
	 */
	public StudentCourseRegistration getStudentCourseRegistrationByRegistrationId(int registrationId);

	/**
	 * 
	 * @param studentCourseRegistration
	 */
	public void addStudentCourseRegistration(StudentCourseRegistration studentCourseRegistration);

}