package com.google.web.bindery.event;

import com.google.web.bindery.event.shared.binder.EventBinderTest;
import com.google.web.bindery.event.gwt.rebind.binder.EventBinderWriterRenamedTest;

import org.junit.runners.Suite;
import org.junit.runner.RunWith;

@RunWith(Suite.class)
@Suite.SuiteClasses({EventBinderTest.class, EventBinderWriterRenamedTest.class})
public class TestSuite {}
