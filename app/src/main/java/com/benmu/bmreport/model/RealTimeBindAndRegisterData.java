package com.benmu.bmreport.model;

import java.util.List;

/**
 * Created by Bruce jing on 12/7/15.
 *
 * 1.1.10	微信绑卡数据--24小时数据数据接
 */
public class RealTimeBindAndRegisterData extends BaseModel{


    /**
     * retStatus : 0
     * retMsg : success
     * retSign :
     * result : {"time":["11","10","09","08","07","06","05","04","03","02","01","00"],"unbindNo":[0,1,0,0,0,0,0,0,0,0,0,0],"bindNo":[1,0,0,0,0,0,0,0,0,0,0,0],"registerNo":[0,0,0,0,0,0,0,0,0,0,0,0]}
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
        private List<Integer> unbindNo;
        private List<Integer> bindNo;
        private List<Integer> registerNo;

        public void setTime(List<String> time) {
            this.time = time;
        }

        public void setUnbindNo(List<Integer> unbindNo) {
            this.unbindNo = unbindNo;
        }

        public void setBindNo(List<Integer> bindNo) {
            this.bindNo = bindNo;
        }

        public void setRegisterNo(List<Integer> registerNo) {
            this.registerNo = registerNo;
        }

        public List<String> getTime() {
            return time;
        }

        public List<Integer> getUnbindNo() {
            return unbindNo;
        }

        public List<Integer> getBindNo() {
            return bindNo;
        }

        public List<Integer> getRegisterNo() {
            return registerNo;
        }
    }
}
