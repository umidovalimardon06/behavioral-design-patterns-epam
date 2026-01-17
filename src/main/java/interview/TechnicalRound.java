package interview;

import interview.domain.Candidate;

public class TechnicalRound extends Round{

    @Override
    public boolean hire(Candidate candidate) {
        return candidate.getScore() > 80;
    }

}
