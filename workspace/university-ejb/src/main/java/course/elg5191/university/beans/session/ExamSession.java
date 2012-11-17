package course.elg5191.university.beans.session;

/**
 * @author jmccausl
 * @version 1.0
 * @created 16-Nov-2012 11:34:02 AM
 */
public interface ExamSession {

	/**
	 * 
	 * @param examId
	 */
	public Exam getExamByExamId(int examId);

	/**
	 * 
	 * @param exam
	 */
	public void addExam(Exam exam);

}