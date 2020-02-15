package com.google.web.bindery.event.shared.binder.impl;

import java.util.List;

public class SuperclassExtracted  extends SuperclassExtractedRenamed {

    protected String attr1_renamed;
    private String attr2;
    private String attr3_renamed;

    public SuperclassExtracted() {
        super();
    }

    public SuperclassExtracted(String attr1, String attr2, String attr3) {
        super();
        this.attr1_renamed = attr1;
        this.attr2 = attr2;
        this.attr3_renamed = attr3;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    public void publicMethod() {

    }

    public void publicMethod(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }

    protected void protectedMethod(List<String> listString) {
        for (String aString : listString) {
            System.out.println(aString);
        }
    }

    private String getAttr1_renamed() {
        return attr1_renamed;
    }

    private void setAttr1_renamed(String attr1_renamed) {
        this.attr1_renamed = attr1_renamed;
    }

    private void privateMethodRenamed() {
        System.out.println("Doing");
        System.out.println("something");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println(getAttr1_renamed());
        System.out.println("...");
        System.out.println("Doing");
        System.out.println("something");
    }
}
