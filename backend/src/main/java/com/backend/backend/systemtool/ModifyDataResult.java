package com.backend.backend.systemtool;

import java.util.ArrayList;
import java.util.List;

public class ModifyDataResult<T> {
    private String UpDateStatus;
    private String UpDateMsg;
    private List<T> ResultList = new ArrayList<>();

    public String getUpDateStatus() {
        return UpDateStatus;
    }

    public void setUpDateStatus(String upDateStatus) {
        UpDateStatus = upDateStatus;
    }

    public String getUpDateMsg() {
        return UpDateMsg;
    }

    public void setUpDateMsg(String upDateMsg) {
        UpDateMsg = upDateMsg;
    }

    public List<T> getResultList() {
        return ResultList;
    }

    public void setResultList(List<T> resultList) {
        ResultList = resultList;
    }
}
