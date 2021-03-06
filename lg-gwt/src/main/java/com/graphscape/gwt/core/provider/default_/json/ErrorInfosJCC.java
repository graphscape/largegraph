/**
 * Jul 17, 2012
 */
package com.graphscape.gwt.core.provider.default_.json;

import java.util.ArrayList;
import java.util.List;

import com.graphscape.gwt.core.data.ErrorInfoData;
import com.graphscape.gwt.core.data.ErrorInfosData;
import com.graphscape.gwt.core.provider.default_.support.ListJCCSupport;

/**
 * @author wu
 * 
 */
public class ErrorInfosJCC extends ListJCCSupport<ErrorInfosData> {

	/** */
	public ErrorInfosJCC(FactoryI f) {
		super("ES", ErrorInfosData.class, f);

	}

	/* */
	@Override
	protected ErrorInfosData convert(List l) {
		ErrorInfosData rt = new ErrorInfosData();
		for (int i = 0; i < l.size(); i++) {
			rt.add((ErrorInfoData) l.get(i));
		}
		return rt;

	}

	/* */
	@Override
	protected List convert(ErrorInfosData t) {
		List rt = new ArrayList();
		for (ErrorInfoData e : t.getErrorInfoList()) {
			rt.add(e);
		}
		return rt;

	}

}
