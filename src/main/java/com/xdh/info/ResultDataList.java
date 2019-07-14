package com.xdh.info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * 返回结果的包装类。内部包装了一个List。
 * 
 * @author ly 2019-01-23
 *
 * @param <T> 集合中的元素类型。
 */
@XmlRootElement(name = "data")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResultDataList<T> {
	@XmlAnyElement(lax = true)
	private List<T> data;

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public ResultDataList() {
		super();
	}

	public ResultDataList(List<T> data) {
		super();
		this.data = data;
	}

}
