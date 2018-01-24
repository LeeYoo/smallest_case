package com.leyo.springboot.web.result;

/**
 * 泛型结果类<br>
 * 可返回指定类型的结果
 */
public class GenericResult<T> extends Result {

	private static final long serialVersionUID = -2136218943087110047L;

	/** 结果对象 */
	protected T data;

	/**
	 * 获取结果对象 
	 * @return 结果对象
	 */

	public T getData() {
		return data;
	}

	/**
	 * 设置结果对象 
	 * @param data  结果对象
	 */
	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "GenericResult [data=" + data + ", code=" + code + ", msg=" + msg + "]";
	}
}