/**
 * All right is from Author of the file.
 * Any usage of the code must be authorized by the the auther.
 * If not sure the detail of the license,please distroy the copies immediately.  
 * Nov 16, 2012
 */
package com.graphscape.gwt.commons.provider.default_.editor.file;

import com.graphscape.gwt.commons.editor.image.ImageFileUrlDataEditorI;
import com.graphscape.gwt.commons.editor.support.FileUrlDataEditorSupport;
import com.graphscape.gwt.core.ContainerI;
import com.graphscape.gwt.core.commons.UiPropertiesI;

/**
 * @author wuzhen
 * 
 */
public class ImageFileUrlDataEditorImpl extends FileUrlDataEditorSupport implements ImageFileUrlDataEditorI {
	// private Element image;

	/**
	 * @param ele
	 */
	public ImageFileUrlDataEditorImpl(ContainerI c, String name, UiPropertiesI<Object> pts) {
		super(c, name, pts);

	}

}
