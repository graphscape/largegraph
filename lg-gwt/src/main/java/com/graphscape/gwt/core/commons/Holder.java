/**
 * Jun 23, 2012
 */
package com.graphscape.gwt.core.commons;

/**
 * @author wu
 * 
 */
public class Holder<T> {

	private T target;

	public Holder() {

	}

	public Holder(T t) {
		this.target = t;
	}

	public T getTarget() {
		return this.target;
	}

	public void setTarget(T t) {
		this.target = t;
	}
}
