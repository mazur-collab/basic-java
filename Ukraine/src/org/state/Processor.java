package org.state;

import org.state.executive.MinistryCabinet;
import org.state.law.JusticeCouncil;

public class Processor {

    public static void main(String[] args) {
        MinistryCabinet ministryCabinet = new MinistryCabinet(null);
        JusticeCouncil justiceCouncil = ministryCabinet.createJusticeCouncil();
        justiceCouncil.officeWork();

        WorkableOffice[] workableOffices = new WorkableOffice[]{ministryCabinet, justiceCouncil};
        workableOffices[0].officeWork();
    }
}
