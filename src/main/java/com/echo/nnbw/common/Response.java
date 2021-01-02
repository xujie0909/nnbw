package com.echo.nnbw.common;

/**
 * @author xujie17
 */
public class Response<T> {

    private Integer resCode;
    private String resMSg;
    private T result;

    public Response(T result) {
        this.resCode = 200;
        this.resMSg = "";
        this.result = result;
    }

    public Response(String resMSg, T result) {
        this.resCode = 200;
        this.resMSg = resMSg;
        this.result = result;
    }
}
