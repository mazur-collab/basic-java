package org.state;

public abstract class HeadOfOffice {
    private String name;

    public HeadOfOffice(String name) {
        this.name = name;
    }
    public void work(){
        hire(new Object());
    }


    protected abstract void hire(Object o);
}
