package com.zz.fashion.vo;

public class ResultVo {
	
	private int code;
	private String msg;
	private Object data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	public static ResultVo setOK(Object data) {
		ResultVo rVo = new ResultVo();
		rVo.setCode(0);
		rVo.setMsg("ok");
		rVo.setData(data);
		return rVo;
		
	}
	
	public static ResultVo setERROR() {
		ResultVo rVo = new ResultVo();
		rVo.setCode(1);
		rVo.setMsg("error");
		
		return rVo;
		
	}
	


}
