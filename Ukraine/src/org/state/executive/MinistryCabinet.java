package org.state.executive;

import org.state.WorkableOffice;
import org.state.law.JusticeCouncil;

public class MinistryCabinet implements WorkableOffice {
    private Ministry[] ministries;

    public MinistryCabinet(Ministry[] ministries) {
        this.ministries = ministries;
    }

    public JusticeCouncil createJusticeCouncil() {
        return new JusticeCouncil(null, null, null);
    }

    @Override
    public void officeWork() {

    }
}
