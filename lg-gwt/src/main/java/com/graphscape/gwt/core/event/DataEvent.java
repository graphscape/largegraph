/**
 * All right is from Author of the file.
 * Any usage of the code must be authorized by the the auther.
 * If not sure the detail of the license,please distroy the copies immediately.  
 * Nov 20, 2012
 */
package com.graphscape.gwt.core.event;

import com.graphscape.gwt.core.core.Event;
import com.graphscape.gwt.core.core.UiObjectI;

/**
 * @author wuzhen
 * 
 */
public class DataEvent extends Event {

	public static final Event.Type<DataEvent> TYPE = new Event.Type<DataEvent>("data");

	private Object data;

	/**
	 * @param type
	 */
	public DataEvent(UiObjectI src, Object data) {
		super(TYPE, src);
		this.data = data;
	}

	public <T> T getData() {
		return (T) this.data;
	}

}
