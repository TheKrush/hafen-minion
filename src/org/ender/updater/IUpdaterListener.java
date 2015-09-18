package org.ender.updater;

public abstract interface IUpdaterListener {

	public abstract void log();

	public abstract void log(String paramString);

	public abstract void finished(boolean success);

	public abstract void progress(long paramLong1, long paramLong2);

	public abstract void progressFinished();
}
