package com.benmu.bmreport.model;

import java.util.List;

/**
 * Created by Bruce jing on 12/7/15.
 * 1.1.15	整体数据-实时绑卡数
 */
public class RealTimeBindCard extends BaseModel{


    /**
     * retStatus : 0
     * retMsg : success
     * retSign :
     * result : {"yesterdayNo":[0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0],"time":["17","16","15","14","13","12","11","10","09","08","07","06","05","04","03","02","01","00"],"todayNo":[0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0],"lastWeekNo":[1,0,1,2,0,2,0,1,0,0,0,0,0,0,0,0,0,0]}
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
        private List<Integer> yesterdayNo;
        private List<String> time;
        private List<Integer> todayNo;
        private List<Integer> lastWeekNo;

        public void setYesterdayNo(List<Integer> yesterdayNo) {
            this.yesterdayNo = yesterdayNo;
        }

        public void setTime(List<String> time) {
            this.time = time;
        }

        public void setTodayNo(List<Integer> todayNo) {
            this.todayNo = todayNo;
        }

        public void setLastWeekNo(List<Integer> lastWeekNo) {
            this.lastWeekNo = lastWeekNo;
        }

        public List<Integer> getYesterdayNo() {
            return yesterdayNo;
        }

        public List<String> getTime() {
            return time;
        }

        public List<Integer> getTodayNo() {
            return todayNo;
        }

        public List<Integer> getLastWeekNo() {
            return lastWeekNo;
        }
    }
}
