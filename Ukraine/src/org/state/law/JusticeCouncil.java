package org.state.law;

import org.state.WorkableOffice;

public class JusticeCouncil implements WorkableOffice {
    private Judge[] judges;
    private Judge headOfCouncil;
    private Court[] courts;

    public JusticeCouncil(Judge[] judges, Judge headOfCouncil, Court[] courts) {
        this.judges = judges;
        this.headOfCouncil = headOfCouncil;
        this.courts = courts;
    }

    @Override
    public void officeWork() {
        assignJudgeToCourt(null, null);
    }

    private void assignJudgeToCourt(Judge judge, Court court) {

    }


}
