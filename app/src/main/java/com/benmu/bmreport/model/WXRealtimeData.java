package com.benmu.bmreport.model;

import java.util.List;

/**
 * Created by Bruce jing on 12/7/15.
 *
 * 微信核心数据 24小时数据
 */
public class WXRealtimeData extends BaseModel{


    /**
     * retStatus : 0
     * retMsg : success
     * retSign :
     * result : {"time":["18","17","16","15","14","13","12","11","10","09","08","07","06","05","04","03","02","01","00"],"bindNo":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],"registerNoOfPeople":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],"registerNo":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]}
     */

    private String retStatus;
    private String retMsg;
    private String retSign;
    private ResultEntity result;

    public void setRetStatus(String retStatus) {
        this.retStatus = retStatus;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public void setRetSign(String retSign) {
        this.retSign = retSign;
    }

    public void setResult(ResultEntity result) {
        this.result = result;
    }

    public String getRetStatus() {
        return retStatus;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public String getRetSign() {
        return retSign;
    }

    public ResultEntity getResult() {
        return result;
    }

    public static class ResultEntity {
        private List<String> time;
        private List<Integer> bindNo;
        private List<Integer> registerNoOfPeople;
        private List<Integer> registerNo;

        public void setTime(List<String> time) {
            this.time = time;
        }

        public void setBindNo(List<Integer> bindNo) {
            this.bindNo = bindNo;
        }

        public void setRegisterNoOfPeople(List<Integer> registerNoOfPeople) {
            this.registerNoOfPeople = registerNoOfPeople;
        }

        public void setRegisterNo(List<Integer> registerNo) {
            this.registerNo = registerNo;
        }

        public List<String> getTime() {
            return time;
        }

        public List<Integer> getBindNo() {
            return bindNo;
        }

        public List<Integer> getRegisterNoOfPeople() {
            return registerNoOfPeople;
        }

        public List<Integer> getRegisterNo() {
            return registerNo;
        }
    }
}
