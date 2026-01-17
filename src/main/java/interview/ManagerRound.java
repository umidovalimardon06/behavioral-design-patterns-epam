package interview;

import interview.domain.Candidate;

public class ManagerRound extends Round{
    private Round _next;
    @Override
    public boolean hire(Candidate candidate) {
        if (candidate.getScore() <= 80) {
            System.out.println("manager::Failed");
            return false;
        }
        System.out.println("manager::Pass");

        if (_next == null) return true;
        return _next.hire(candidate);
    }

    public void setNextRound(Round round) {
        this._next = round;
    }
}
