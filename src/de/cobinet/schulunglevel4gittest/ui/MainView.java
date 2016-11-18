
package de.cobinet.schulunglevel4gittest.ui;

import com.vaadin.ui.CustomComponent;
import com.xdev.ui.XdevButton;
import com.xdev.ui.XdevGridLayout;
import com.xdev.ui.XdevView;

public class MainView extends XdevView {

	/**
	 * 
	 */
	public MainView() {
		super();
		this.initUI();
	}

	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated
	 * by the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.gridLayout = new XdevGridLayout();
		this.button = new XdevButton();
		this.button2 = new XdevButton();
	
		this.button.setCaption("Button");
		this.button2.setCaption("Button");
	
		this.gridLayout.setColumns(3);
		this.gridLayout.setRows(2);
		this.button.setSizeUndefined();
		this.gridLayout.addComponent(this.button, 0, 0);
		this.button2.setSizeUndefined();
		this.gridLayout.addComponent(this.button2, 1, 0);
		CustomComponent gridLayout_hSpacer = new CustomComponent();
		gridLayout_hSpacer.setSizeFull();
		this.gridLayout.addComponent(gridLayout_hSpacer, 2, 0, 2, 0);
		this.gridLayout.setColumnExpandRatio(2, 1.0F);
		CustomComponent gridLayout_vSpacer = new CustomComponent();
		gridLayout_vSpacer.setSizeFull();
		this.gridLayout.addComponent(gridLayout_vSpacer, 0, 1, 1, 1);
		this.gridLayout.setRowExpandRatio(1, 1.0F);
		this.gridLayout.setSizeFull();
		this.setContent(this.gridLayout);
		this.setSizeFull();
	} // </generated-code>

	// <generated-code name="variables">
	private XdevButton button, button2;
	private XdevGridLayout gridLayout; // </generated-code>


}
