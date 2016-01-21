package com.benmu.bmreport.model;

import java.util.List;

/**
 * Created by Bruce jing on 12/7/15.
 * 1.1.8	微信挂号数据-实时挂号数接口
 */
public class RealTimeRegisterDatilData extends BaseModel{


    /**
     * retStatus : 0
     * retMsg : success
     * retSign :
     * result : {"backNo":[0,0,0,0,0,0,0,0,0,0],"time":["09","08","07","06","05","04","03","02","01","00"],"payNo":[0,0,0,0,0,0,0,0,0,0],"cancleNo":[0,0,0,0,0,0,0,0,0,0],"lockNo":[0,0,0,0,0,0,0,0,0,0]}
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
        private List<Integer> backNo;
        private List<String> time;
        private List<Integer> payNo;
        private List<Integer> cancleNo;
        private List<Integer> lockNo;

        public void setBackNo(List<Integer> backNo) {
            this.backNo = backNo;
        }

        public void setTime(List<String> time) {
            this.time = time;
        }

        public void setPayNo(List<Integer> payNo) {
            this.payNo = payNo;
        }

        public void setCancleNo(List<Integer> cancleNo) {
            this.cancleNo = cancleNo;
        }

        public void setLockNo(List<Integer> lockNo) {
            this.lockNo = lockNo;
        }

        public List<Integer> getBackNo() {
            return backNo;
        }

        public List<String> getTime() {
            return time;
        }

        public List<Integer> getPayNo() {
            return payNo;
        }

        public List<Integer> getCancleNo() {
            return cancleNo;
        }

        public List<Integer> getLockNo() {
            return lockNo;
        }
    }
}
