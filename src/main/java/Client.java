import interview.InterviewPanel;
import interview.domain.Candidate;

public class Client {
    public static void main(String[] args) {
        Candidate candidate = Candidate.builder()
                .name("Thomas")
                .score(85)
                .build();

        InterviewPanel panel = new InterviewPanel();
        boolean hire = panel.hire(candidate);
        System.out.println(hire);
    }
}
