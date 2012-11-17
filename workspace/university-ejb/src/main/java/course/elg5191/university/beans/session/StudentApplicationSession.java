package course.elg5191.university.beans.session;

/**
 * @author jmccausl
 * @version 1.0
 * @created 16-Nov-2012 11:34:03 AM
 */
public interface StudentApplicationSession {

	/**
	 * 
	 * @param recordId
	 */
	public StudentApplication getStudentApplicationByRecordId(int recordId);

	/**
	 * 
	 * @param studentApplication
	 */
	public void addStudentApplication(StudentApplication studentApplication);

}