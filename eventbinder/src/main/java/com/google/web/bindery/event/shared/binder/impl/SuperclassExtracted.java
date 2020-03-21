package com.google.web.bindery.event.shared.binder.impl;

import java.util.List;

public class SuperclassExtracted extends SuperClassExtractedRenamed {

	private String attr2;
	private String attr3_renamed;
	protected String attr1_renamed;
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
	
	/**
	 * @deprecated Use {@link GenericEventType#publicMethod(String)} instead
	 */
	public static void publicMethod(String name) {
		GenericEventType.publicMethod(name);
	}
	
	protected void protectedMethod(List<String> listString) {
		for (String aString : listString) {
			System.out.println(aString);
		}
	}

	protected String getAttr1() {
		return attr1_renamed;
	}

	private void setAttr1(String attr1) {
		this.attr1_renamed = attr1;
	}
	
	

}