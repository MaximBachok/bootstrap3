package com.mf.bootstrap3.exeptions;

import org.springframework.dao.DataIntegrityViolationException;

public class NoSuchUserException extends DataIntegrityViolationException {
    public NoSuchUserException(String msg) {
        super(msg);
    }
}
