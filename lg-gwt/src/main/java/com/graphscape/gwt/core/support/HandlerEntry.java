/**
 *  Dec 24, 2012
 */
package com.graphscape.gwt.core.support;

import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.graphscape.gwt.core.MsgWrapper;
import com.graphscape.gwt.core.commons.Path;
import com.graphscape.gwt.core.logger.UiLoggerFactory;
import com.graphscape.gwt.core.logger.UiLoggerI;
import com.graphscape.gwt.core.message.MessageHandlerI;

/**
 * @author wuzhen
 * 
 */
public class HandlerEntry {

	private static final UiLoggerI LOG = UiLoggerFactory.getLogger(HandlerEntry.class);

	protected Path path;

	protected MessageHandlerI handlers;

	protected boolean strict;

	public HandlerEntry(Path p, boolean includeSubPath, MessageHandlerI hdls) {
		this.path = p;
		this.strict = includeSubPath;
		this.handlers = hdls;
	}

	public boolean tryHandle(boolean dely, Path p, final MsgWrapper md) {
		if (!this.isMatch(p)) {
			return false;
		}
		if (dely) {
			Scheduler.get().scheduleDeferred(new ScheduledCommand() {

				@Override
				public void execute() {
					HandlerEntry.this.doHandle(md);

				}
			});
		} else {
			HandlerEntry.this.doHandle(md);
		}
		return true;
	}

	protected void doHandle(MsgWrapper md) {
		try {
			this.handlers.handle(md);
		} catch (Throwable t) {
			LOG.error("handler exception for msg:" + md, t);
		}
	}

	public boolean isMatch(Path p) {
		if (this.strict) {
			return this.path.equals(p);//
		} else {
			return this.path.isSubPath(p, true);
		}
	}

	/*
	 * Jan 1, 2013
	 */
	@Override
	public String toString() {
		return "{path:" + this.path + ",handler:" + this.handlers + "}";
	}

}
