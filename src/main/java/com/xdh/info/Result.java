package com.xdh.info;

import javax.xml.bind.annotation.*;

/**
 * 返回结果的统一封装类。
 * 
 * @author ly 2019-04-28
 * @version 1.0
 *
 * @param <T> 返回结果集合中的元素类型，若无具体类型或者多类型，可以指定为Object。
 */
@XmlRootElement(name = "result")
@XmlSeeAlso({
			})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "resultCode", "resultInfo", "data" })
public class Result<T> {
	/**
	 * 服务执行结果代码。<br>
	 * 通常是：0、1。
	 */
	@XmlElement(required = true)
	private String resultCode;
	/**
	 * 服务执行结果描述信息。
	 */
	@XmlElement(required = true)
	private String resultInfo;

	/**
	 * 服务返回的集合信息，非必须。
	 */
	private ResultDataList<T> data;

	public Result() {
	}

	public Result(String resultCode, String resultInfo, ResultDataList<T> data) {
		super();
		this.resultCode = resultCode;
		this.resultInfo = resultInfo;
		this.data = data;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultInfo() {
		return resultInfo;
	}

	public void setResultInfo(String resultInfo) {
		this.resultInfo = resultInfo;
	}

	public ResultDataList<T> getData() {
		return data;
	}

	public void setData(ResultDataList<T> data) {
		this.data = data;
	}

}