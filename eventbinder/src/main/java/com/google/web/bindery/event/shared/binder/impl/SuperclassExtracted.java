package com.google.web.bindery.event.shared.binder.impl;

import com.google.gwt.event.shared.GwtEvent;
import com.google.web.bindery.event.shared.binder.EventBinder;
import com.google.web.bindery.event.shared.binder.GenericEvent;

import java.util.List;

public class SuperclassExtracted extends GwtEvent.Type<GenericEventHandler> {

    public static final String CONST = "123465789";
    private String attr1;
    private String attr2;
    private String attr3;

    public SuperclassExtracted() {
        super();
    }

    public SuperclassExtracted(String attr1, String attr2, String attr3) {
        super();
        this.attr1 = attr1;
        this.attr2 = attr2;
        this.attr3 = attr3;
    }

    /**
     * Creates a new EventType for the given event class. Repeated invocations of
     * this method for the same type will return the same object. This method is
     * called by generated {@link EventBinder}s and shouldn't normally have to be
     * called directly by users.
     */
    public static <T extends GenericEvent> GenericEventType getTypeOf(Class<T> clazz) {

      GenericEventType eventType = GenericEventType.TYPE_MAP.get(clazz);

      if (eventType == null) {
        eventType = new GenericEventType();
        GenericEventType.TYPE_MAP.put(clazz, eventType);
      }

      return eventType;
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
        System.out.println(getAttr1());
        System.out.println("...");
        System.out.println("Doing");
        System.out.println("something");
    }

    protected void protectedMethod(List<String> listString) {
        for (String aString : listString) {
            System.out.println(aString);
        }
    }

    private String getAttr1() {
        return attr1;
    }

    private void setAttr1(String attr1) {
        this.attr1 = attr1;
    }
}
