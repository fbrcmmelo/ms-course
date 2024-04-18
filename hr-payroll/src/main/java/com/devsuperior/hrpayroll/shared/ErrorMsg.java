package com.devsuperior.hrpayroll.shared;

import java.io.Serializable;
import java.util.Collection;

@SuppressWarnings("serial")
public class ErrorMsg implements Serializable {

    private Integer code;
    private Collection<String> messages;
    
    public ErrorMsg(Integer code, Collection<String> messages) {
        this.code = code;
        this.messages = messages;
    }

    public Integer getCode() {
        return code;
    }

    public Collection<String> getMessages() {
        return messages;
    }

}
