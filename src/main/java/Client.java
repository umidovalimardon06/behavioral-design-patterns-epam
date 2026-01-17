import interview.HrRound;
import interview.ManagerRound;
import interview.TechnicalRound;
import interview.domain.Candidate;

public class Client {
    public static void main(String[] args) {
        Candidate candidate = Candidate.builder()
                .name("Thomas")
                .score(85)
                .build();

        var technicalRound = new TechnicalRound();
        var managerRound = new ManagerRound();
        var hrRound = new HrRound();

        var tech = technicalRound.hire(candidate);
        var man = managerRound.hire(candidate);
        var hr = hrRound.hire(candidate);

        if (hr) System.out.println("Pass");
        else System.out.println("Failed");
    }
}
