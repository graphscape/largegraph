/**
 *  Jan 5, 2013
 */
package com.graphscape.gwt.core.event;

import com.graphscape.gwt.core.ModelI;

/**
 * @author wuzhen
 * 
 */
public class ModelUpdateEvent extends ModelEvent {

	public static final Type<ModelUpdateEvent> TYPE = new Type<ModelUpdateEvent>(
			ModelEvent.TYPE, "update");

	private String key;

	private Object value;

	/**
	 * @param m
	 * @param loc
	 * @param vw
	 */
	public ModelUpdateEvent(Type<? extends ModelUpdateEvent> type, ModelI m,
			String key, Object v) {
		super(type, m);
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public <T> T getValue() {
		return (T) this.value;
	}

}
