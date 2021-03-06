package com.healthy.vision.common.exception;

import java.util.logging.Level;

import com.healthy.vision.common.enums.SysResponseEnum;


public class BusinessException extends RuntimeException {

    /**
   * 
   */
  private static final long serialVersionUID = 1L;

    /**
     *
     * @Description: 构造函数
     * @param code 异常编码
     * @author Micro
     * @date 2018/7/5 9:29
     *
     */

    public BusinessException(int code, String message, String data, Level level) {
        this.message = message;
        this.code = code;
        this.data = data;
        this.level = level;
    }

    @io.swagger.annotations.ApiModelProperty(value = "提示消息")
    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 提示消息
     */
    private String message;

    @io.swagger.annotations.ApiModelProperty(value = "异常编码")
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    private int code = SysResponseEnum.SUCCESS.getCode();

    @io.swagger.annotations.ApiModelProperty(value = "消息数据")
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    /**
     * 返回数据
     */
    private String data;

    @io.swagger.annotations.ApiModelProperty(value = "消息级别", notes = "级别高低顺序：FINE<INFO<WARNING<SEVERE")
    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    /**
     * 消息级别
     */
    private Level level = Level.INFO;

    public BusinessException(String message) {
        super(message);
        this.message = message;
    }

    public BusinessException(String message, Level level) {
        super(message);
        this.message = message;
        this.level = level;
    }

    public BusinessException(String message, String data, Level level) {
        super(message);
        this.message = message;
        this.data = data;
        this.level = level;
    }
}
