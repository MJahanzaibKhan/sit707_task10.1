package tasksubmission;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TaskSubmissionTest {

    private TaskSubmission taskSubmission;

    @Before
    public void setUp() {
        taskSubmission = new TaskSubmission();
    }

    @Test
    public void testSubmitTask() {
        String result = taskSubmission.submitTask(
            "SIT707", "SQT Assignment", "SQT_assignment.pdf", "2024-06-01"
        );
        assertEquals("Task has been submitted successfully", result);
    }

    @Test
    public void testViewTaskStatus() {
        taskSubmission.submitTask("SIT707", "SQT Assignment", "SQT_assignment.pdf", "2024-06-01");
        String status = taskSubmission.viewTaskStatus("SIT707");
        assertEquals("submitted", status);
    }

    @Test
    public void testProvideFeedback() {
        taskSubmission.submitTask("SIT707", "SQT Assignment", "SQT_assignment.pdf", "2024-06-01");
        String feedbackResult = taskSubmission.provideFeedback("SIT707", "Great work, but needs to be demonstrate.");
        assertEquals("Feedback provided successfully", feedbackResult);
    }
}
