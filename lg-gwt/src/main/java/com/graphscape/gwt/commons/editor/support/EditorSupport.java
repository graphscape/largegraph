/**
 * Jun 30, 2012
 */
package com.graphscape.gwt.commons.editor.support;

import com.google.gwt.user.client.Element;
import com.graphscape.gwt.commons.widget.EditorI;
import com.graphscape.gwt.commons.widget.event.ChangeEvent;
import com.graphscape.gwt.commons.widget.support.LayoutSupport;
import com.graphscape.gwt.core.ContainerI;
import com.graphscape.gwt.core.commons.UiPropertiesI;
import com.graphscape.gwt.core.util.ObjectUtil;

/**
 * @author wu
 * 
 */
public class EditorSupport<T> extends LayoutSupport implements EditorI<T> {

	protected T data;

	public EditorSupport(ContainerI c, String name, Element ele) {
		this(c, name, ele, null);
	}

	/** */
	public EditorSupport(ContainerI c, String name, Element ele, UiPropertiesI pts) {
		super(c, name, ele, pts);
		this.data = this.newData();
	}

	/* */
	@Override
	public T getData() {
		return this.data;
	}

	protected T newData() {
		return null;
	}

	/* */
	@Override
	public void input(T d) {
		this.setData(d, true);//
	}

	@Override
	public void setData(T d) {
		this.setData(d, true);//
	}

	protected boolean setData(T d, boolean dispatch) {
		return this.setData(d, true, dispatch);
	}

	protected boolean setData(T d, boolean checkSame, boolean dispatch) {
		if (checkSame) {
			boolean same = ObjectUtil.nullSafeEquals(d, this.data);

			if (same) {
				return false;
			}
		}

		this.data = d;

		if (dispatch) {// TODO
			new ChangeEvent(this).dispatch();
		}
		return true;
	}

}
