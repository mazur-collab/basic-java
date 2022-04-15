package org.state.executive;

import org.state.WorkableOffice;

public class Ministry implements WorkableOffice {
    private String name;
    private Minister minister;

    public Ministry(String name, Minister minister) {
        this.name = name;
        this.minister = minister;
    }

    @Override
    public void officeWork() {

    }
}
