/**
 * All right is from Author of the file,to be explained in comming days.
 * Jan 2, 2013
 */
package com.graphscape.gwt.commons.user;

import com.graphscape.gwt.core.core.UiObjectI;

/**
 * @author wu
 * 
 */
public interface UserInfoI extends UiObjectI {

	public String getAccountId();

	public String getSessionId();

	public boolean isAnonymous();
}
