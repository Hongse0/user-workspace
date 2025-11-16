//package com.datau.dolbau.cms.error;
//
//import com.datau.dolbau.common.error.ErrorCode;
//import org.springframework.http.HttpStatus;
//
//import java.util.Collections;
//import java.util.List;
//
//public enum CmsErrorImpl implements ErrorCode {
//
//    NOTICE_LIST_NOT_FOUND("19001", HttpStatus.NOT_FOUND, Collections.singletonList("공지사항 목록이 없습니다."));
//
//    private final String code;
//    private final HttpStatus status;
//    private final List<String> messages;
//
//    CmsErrorCode(String code, HttpStatus status, List<String> messages) {
//        this.code = code;
//        this.status = status;
//        this.messages = messages;
//    }
//
//    @Override
//    public String getCode() {
//        return this.code;
//    }
//
//    @Override
//    public HttpStatus getStatus() {
//        return this.status;
//    }
//
//    @Override
//    public List<String> getMessages() {
//        return this.messages;
//    }
//}
