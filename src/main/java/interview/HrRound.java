package interview;

import interview.domain.Candidate;

public class HrRound extends Round {
    @Override
    public boolean hire(Candidate candidate) {
        return candidate.getScore() > 80;
    }
}
