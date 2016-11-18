
package de.cobinet.schulunglevel4gittest.ui;

import com.xdev.ui.XdevButton;
import com.xdev.ui.XdevGridLayout;
import com.xdev.ui.XdevView;
import com.xdev.ui.entitycomponent.table.XdevTable;

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
		this.table = new XdevTable<>();
	
		this.button.setCaption("Button");
		this.button2.setCaption("Button");
	
		this.gridLayout.setColumns(2);
		this.gridLayout.setRows(2);
		this.button.setSizeUndefined();
		this.gridLayout.addComponent(this.button, 0, 0);
		this.button2.setSizeUndefined();
		this.gridLayout.addComponent(this.button2, 1, 0);
		this.table.setSizeFull();
		this.gridLayout.addComponent(this.table, 0, 1, 1, 1);
		this.gridLayout.setColumnExpandRatio(0, 10.0F);
		this.gridLayout.setColumnExpandRatio(1, 10.0F);
		this.gridLayout.setRowExpandRatio(1, 100.0F);
		this.gridLayout.setSizeFull();
		this.setContent(this.gridLayout);
		this.setSizeFull();
	} // </generated-code>

	// <generated-code name="variables">
	private XdevButton button, button2;
	private XdevTable<?> table;
	private XdevGridLayout gridLayout; // </generated-code>


}
