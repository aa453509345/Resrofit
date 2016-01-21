package com.benmu.bmreport.model;

import java.util.List;

/**
 * Created by Bruce jing on 12/7/15.
 * 1.1.12	微信复诊数据--24小时数据
 */
public class ReturnVisitData extends BaseModel{


    /**
     * retStatus : 0
     * retMsg : success
     * retSign :
     * result : {"time":["15","14","13","12","11","10","09","08","07","06","05","04","03","02","01","00"],"payNo":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],"clickPageNo":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],"lockNo":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]}
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
        private List<Integer> payNo;
        private List<Integer> clickPageNo;
        private List<Integer> lockNo;

        public void setTime(List<String> time) {
            this.time = time;
        }

        public void setPayNo(List<Integer> payNo) {
            this.payNo = payNo;
        }

        public void setClickPageNo(List<Integer> clickPageNo) {
            this.clickPageNo = clickPageNo;
        }

        public void setLockNo(List<Integer> lockNo) {
            this.lockNo = lockNo;
        }

        public List<String> getTime() {
            return time;
        }

        public List<Integer> getPayNo() {
            return payNo;
        }

        public List<Integer> getClickPageNo() {
            return clickPageNo;
        }

        public List<Integer> getLockNo() {
            return lockNo;
        }
    }
}
