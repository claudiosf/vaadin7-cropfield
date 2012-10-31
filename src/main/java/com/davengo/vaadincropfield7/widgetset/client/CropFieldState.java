package com.davengo.vaadincropfield7.widgetset.client;

import com.vaadin.server.Resource;
import com.vaadin.shared.ComponentState;

public class CropFieldState extends ComponentState {
	
	public Resource imageSrc; 
	public String selectionWidth;
	public String selectionHeight;
	public int trueImageWidth;
	public int trueImageHeight;
	public int minSelectionWidth;
	public Integer animateToDuration;
	public String[] animateToSelection;
	public float selectionAspectRatio;
	public int maxSelectionHeight;
	public int maxSelectionWidth;
	public int minSelectionHeight;
	public String[] value;
	
}
