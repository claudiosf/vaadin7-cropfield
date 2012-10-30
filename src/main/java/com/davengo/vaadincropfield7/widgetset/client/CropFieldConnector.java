package com.davengo.vaadincropfield7.widgetset.client;

import com.davengo.vaadincropfield7.widgetset.client.ui.VCropField;
import com.davengo.vaadincropfield7.CropField;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.GWT;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;

/**
 *
 * @author cferrete
 */
@Connect(CropField.class)
public class CropFieldConnector extends AbstractComponentConnector {

	@Override
	public VCropField getWidget() {
		return (VCropField) super.getWidget();
	}
	
	 @Override
    protected Widget createWidget() {
        return GWT.create(CropField.class);
    }
}
