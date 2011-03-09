package com.breskeby.bean;

import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.junit.Before;
import org.junit.Test;

public class PointTest {

	//class under test
	private Point cut;
	
	@Before public void setup(){
		cut = new Point();
	}
	
	@Test
	public void testPropertyChangeSupportEnabled(){
		PropertyChangeListener changeListenerMock = mock(PropertyChangeListener.class);
		cut.addPropertyChangeListener(changeListenerMock);
		cut.setX(1);
		verify(changeListenerMock, times(1)).propertyChange((PropertyChangeEvent) anyObject());
	}
}
