package com.khalil.restful.jpa.mysql.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(content = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Setter@Getter
public class ApiErrorVO {

    private String errorCode;
    private String message;
    private String status;

    public ApiErrorVO(String errorCode, String message, String status) {
        super();
        this.errorCode = errorCode;
        this.message = message;
        this.status = status;
    }

    public ApiErrorVO() {
        super();
    }

}
