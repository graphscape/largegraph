/**
 * All right is from Author of the file.
 * Any usage of the code must be authorized by the the auther.
 * If not sure the detail of the license,please distroy the copies immediately.  
 * Nov 19, 2012
 */
package com.graphscape.gwt.core.util;

import java.util.Date;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.graphscape.gwt.core.UiException;
import com.graphscape.gwt.core.data.basic.DateData;

/**
 * @author wuzhen
 * 
 */
public class DateUtil {
	private static DateTimeFormat FORMAT = DateTimeFormat.getFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

	public static String format(DateData dd) {
		return format(dd, true);
	}

	public static String format(DateData dd, boolean force) {
		if (dd == null) {
			if (force) {
				throw new UiException("null date data");
			}
			return null;
		}
		return FORMAT.format(new Date(dd.getValue()));

	}

	public static DateData parse(String date) {
		Date dt = FORMAT.parse(date);//
		return DateData.valueOf(dt.getTime());//
	}
}
