package interview;

import interview.domain.Candidate;

public class ManagerRound extends Round{

    @Override
    public boolean hire(Candidate candidate) {
        return candidate.getScore() > 80;
    }

}
