package com.graphscape.gwt.commons.provider.default_.mvc;

import com.graphscape.gwt.commons.mvc.ControlI;
import com.graphscape.gwt.commons.mvc.ControlManagerI;
import com.graphscape.gwt.core.ContainerI;
import com.graphscape.gwt.core.support.UiObjectSupport;

/**
 * 
 * @author wu
 * 
 */
public class ControlManagerImpl extends UiObjectSupport implements ControlManagerI {

	/**
	 * @param c
	 */
	public ControlManagerImpl(ContainerI c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ControlManagerI addControl(ControlI c) {

		this.child(c);//
		return this;
	}

	@Override
	public <T extends ControlI> T getControl(Class<T> cls, String name, boolean force) {
		return this.getChild(cls, name, force);
	}

	@Override
	public <T extends ControlI> T getControl(Class<T> cls, boolean force) {
		return this.getChild(cls, null, force);
	}

}
