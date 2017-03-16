package com.jdcloud;

class MyException extends Exception
{
	protected int code;
	protected Object debugInfo;
	
	public MyException(int code, Object debugInfo, String msg)
	{
		super(msg == null? JDApiBase.GetErrInfo(code): msg);
		this.code = code;
		this.debugInfo = debugInfo;
	}
	public MyException(int code, Object debugInfo) {
		this(code, debugInfo, null);
	}
	public MyException(int code) {
		this(code, null, null);
	}
	
	public int getCode()
	{
		return code;
	}
	public Object getDebugInfo()
	{
		return debugInfo;
	}
}

