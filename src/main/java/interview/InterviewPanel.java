package interview;

import interview.domain.Candidate;

public class InterviewPanel {
    protected Round _firstRound;

    public InterviewPanel() {

        var tech = new TechnicalRound();
        var manager = new ManagerRound();
        var hr = new HrRound();

        this._firstRound = tech;

        tech.setNextRound(manager);
        manager.setNextRound(hr);
    }

    public boolean hire(Candidate candidate) {
        return _firstRound.hire(candidate);
    }

}
