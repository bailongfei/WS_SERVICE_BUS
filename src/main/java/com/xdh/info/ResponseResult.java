package com.xdh.info;

import javax.xml.bind.annotation.*;

/**
 * @Package: com.xdh.info
 * @ClassName: Result
 * @Description: TODO
 * @Author: LaoShiRen
 * @CreateDate: 2019-07-13 17:26
 * @Version: 1.0
 */
@XmlRootElement(name = "ResponseResult")
@XmlSeeAlso({

})

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "resultCode", "resultInfo", "data" })
public class ResponseResult<T> {

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

    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResponseResult(){

    }

    public ResponseResult(String resultCode, String resultInfo, T data) {
        super();
        this.resultCode = resultCode;
        this.resultInfo = resultInfo;
        this.data = data;
    }

}
