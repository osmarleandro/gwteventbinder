package com.google.web.bindery.event.shared.binder.impl;

import com.google.gwt.event.shared.GwtEvent;

import java.util.List;

public class SuperclassExtracted extends GwtEvent.Type<GenericEventHandler> {

    public SuperclassExtracted() {
        super();
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

    private void privateMethod() {
        System.out.println("Doing");
        System.out.println("something");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Doing");
        System.out.println("something");
    }

    protected void protectedMethod(List<String> listString) {
        for (String aString : listString) {
            System.out.println(aString);
        }
    }
}
