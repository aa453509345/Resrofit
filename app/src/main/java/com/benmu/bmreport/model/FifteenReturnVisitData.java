package com.benmu.bmreport.model;

import java.util.List;

/**
 * Created by Bruce jing on 12/7/15.
 * 1.1.13	微信复诊数据--详细数据
 */
public class FifteenReturnVisitData extends BaseModel{


    /**
     * retStatus : 0
     * retMsg : success
     * retSign :
     * result : {"dataStatistics":[{"todayRegisterNo":0,"subscribeRegisterNo":0,"returnVisitRegisterNo":0,"allRegisterNo":0,"dateTime":"2015-12-03","number":0,"lockNo":0,"payNo":0,"cancelNo":0,"backNo":0,"clickNo":0,"bindNo":0,"attentionNo":0,"payNoOfPeople":0,"returnVisitNo":"17"},{"todayRegisterNo":0,"subscribeRegisterNo":0,"returnVisitRegisterNo":0,"allRegisterNo":0,"dateTime":"2015-12-02","number":0,"lockNo":0,"payNo":0,"cancelNo":0,"backNo":0,"clickNo":0,"bindNo":0,"attentionNo":0,"payNoOfPeople":0,"returnVisitNo":"-"},{"todayRegisterNo":0,"subscribeRegisterNo":0,"returnVisitRegisterNo":0,"allRegisterNo":0,"dateTime":"2015-12-01","number":0,"lockNo":0,"payNo":0,"cancelNo":0,"backNo":0,"clickNo":0,"bindNo":0,"attentionNo":0,"payNoOfPeople":0,"returnVisitNo":"-"},{"todayRegisterNo":0,"subscribeRegisterNo":0,"returnVisitRegisterNo":0,"allRegisterNo":0,"dateTime":"2015-11-30","number":0,"lockNo":0,"payNo":0,"cancelNo":0,"backNo":0,"clickNo":0,"bindNo":0,"attentionNo":0,"payNoOfPeople":0,"returnVisitNo":"-"},{"todayRegisterNo":0,"subscribeRegisterNo":0,"returnVisitRegisterNo":0,"allRegisterNo":0,"dateTime":"2015-11-29","number":0,"lockNo":0,"payNo":0,"cancelNo":0,"backNo":0,"clickNo":0,"bindNo":0,"attentionNo":0,"payNoOfPeople":0,"returnVisitNo":"-"},{"todayRegisterNo":0,"subscribeRegisterNo":0,"returnVisitRegisterNo":0,"allRegisterNo":0,"dateTime":"2015-11-28","number":0,"lockNo":0,"payNo":0,"cancelNo":0,"backNo":0,"clickNo":0,"bindNo":0,"attentionNo":0,"payNoOfPeople":0,"returnVisitNo":"-"},{"todayRegisterNo":0,"subscribeRegisterNo":0,"returnVisitRegisterNo":0,"allRegisterNo":0,"dateTime":"2015-11-27","number":0,"lockNo":7,"payNo":4,"cancelNo":0,"backNo":0,"clickNo":0,"bindNo":0,"attentionNo":0,"payNoOfPeople":0,"returnVisitNo":"-"},{"todayRegisterNo":0,"subscribeRegisterNo":0,"returnVisitRegisterNo":0,"allRegisterNo":0,"dateTime":"2015-11-26","number":0,"lockNo":10,"payNo":7,"cancelNo":0,"backNo":0,"clickNo":0,"bindNo":0,"attentionNo":0,"payNoOfPeople":0,"returnVisitNo":"-"},{"todayRegisterNo":0,"subscribeRegisterNo":0,"returnVisitRegisterNo":0,"allRegisterNo":0,"dateTime":"2015-11-25","number":0,"lockNo":2,"payNo":1,"cancelNo":0,"backNo":0,"clickNo":0,"bindNo":0,"attentionNo":0,"payNoOfPeople":0,"returnVisitNo":"-"},{"todayRegisterNo":0,"subscribeRegisterNo":0,"returnVisitRegisterNo":0,"allRegisterNo":0,"dateTime":"2015-11-24","number":0,"lockNo":0,"payNo":0,"cancelNo":0,"backNo":0,"clickNo":0,"bindNo":0,"attentionNo":0,"payNoOfPeople":0,"returnVisitNo":"-"},{"todayRegisterNo":0,"subscribeRegisterNo":0,"returnVisitRegisterNo":0,"allRegisterNo":0,"dateTime":"2015-11-23","number":0,"lockNo":0,"payNo":0,"cancelNo":0,"backNo":0,"clickNo":0,"bindNo":0,"attentionNo":0,"payNoOfPeople":0,"returnVisitNo":"-"},{"todayRegisterNo":0,"subscribeRegisterNo":0,"returnVisitRegisterNo":0,"allRegisterNo":0,"dateTime":"2015-11-22","number":0,"lockNo":0,"payNo":0,"cancelNo":0,"backNo":0,"clickNo":0,"bindNo":0,"attentionNo":0,"payNoOfPeople":0,"returnVisitNo":"-"},{"todayRegisterNo":0,"subscribeRegisterNo":0,"returnVisitRegisterNo":0,"allRegisterNo":0,"dateTime":"2015-11-21","number":0,"lockNo":0,"payNo":0,"cancelNo":0,"backNo":0,"clickNo":0,"bindNo":0,"attentionNo":0,"payNoOfPeople":0,"returnVisitNo":"-"},{"todayRegisterNo":0,"subscribeRegisterNo":0,"returnVisitRegisterNo":0,"allRegisterNo":0,"dateTime":"2015-11-20","number":0,"lockNo":0,"payNo":0,"cancelNo":0,"backNo":0,"clickNo":0,"bindNo":0,"attentionNo":0,"payNoOfPeople":0,"returnVisitNo":"-"},{"todayRegisterNo":0,"subscribeRegisterNo":0,"returnVisitRegisterNo":0,"allRegisterNo":0,"dateTime":"2015-11-19","number":0,"lockNo":0,"payNo":0,"cancelNo":0,"backNo":0,"clickNo":0,"bindNo":0,"attentionNo":0,"payNoOfPeople":0,"returnVisitNo":"-"},{"todayRegisterNo":0,"subscribeRegisterNo":0,"returnVisitRegisterNo":0,"allRegisterNo":0,"dateTime":"2015-11-18","number":0,"lockNo":0,"payNo":0,"cancelNo":0,"backNo":0,"clickNo":1,"bindNo":0,"attentionNo":0,"payNoOfPeople":0,"returnVisitNo":"-"}]}
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
        /**
         * todayRegisterNo : 0
         * subscribeRegisterNo : 0
         * returnVisitRegisterNo : 0
         * allRegisterNo : 0
         * dateTime : 2015-12-03
         * number : 0
         * lockNo : 0
         * payNo : 0
         * cancelNo : 0
         * backNo : 0
         * clickNo : 0
         * bindNo : 0
         * attentionNo : 0
         * payNoOfPeople : 0
         * returnVisitNo : 17
         */

        private List<DataStatisticsEntity> dataStatistics;

        public void setDataStatistics(List<DataStatisticsEntity> dataStatistics) {
            this.dataStatistics = dataStatistics;
        }

        public List<DataStatisticsEntity> getDataStatistics() {
            return dataStatistics;
        }

        public static class DataStatisticsEntity {
            private int todayRegisterNo;
            private int subscribeRegisterNo;
            private int returnVisitRegisterNo;
            private int allRegisterNo;
            private String dateTime;
            private int number;
            private int lockNo;
            private int payNo;
            private int cancelNo;
            private int backNo;
            private int clickNo;
            private int bindNo;
            private int attentionNo;
            private int payNoOfPeople;
            private String returnVisitNo;

            public void setTodayRegisterNo(int todayRegisterNo) {
                this.todayRegisterNo = todayRegisterNo;
            }

            public void setSubscribeRegisterNo(int subscribeRegisterNo) {
                this.subscribeRegisterNo = subscribeRegisterNo;
            }

            public void setReturnVisitRegisterNo(int returnVisitRegisterNo) {
                this.returnVisitRegisterNo = returnVisitRegisterNo;
            }

            public void setAllRegisterNo(int allRegisterNo) {
                this.allRegisterNo = allRegisterNo;
            }

            public void setDateTime(String dateTime) {
                this.dateTime = dateTime;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            public void setLockNo(int lockNo) {
                this.lockNo = lockNo;
            }

            public void setPayNo(int payNo) {
                this.payNo = payNo;
            }

            public void setCancelNo(int cancelNo) {
                this.cancelNo = cancelNo;
            }

            public void setBackNo(int backNo) {
                this.backNo = backNo;
            }

            public void setClickNo(int clickNo) {
                this.clickNo = clickNo;
            }

            public void setBindNo(int bindNo) {
                this.bindNo = bindNo;
            }

            public void setAttentionNo(int attentionNo) {
                this.attentionNo = attentionNo;
            }

            public void setPayNoOfPeople(int payNoOfPeople) {
                this.payNoOfPeople = payNoOfPeople;
            }

            public void setReturnVisitNo(String returnVisitNo) {
                this.returnVisitNo = returnVisitNo;
            }

            public int getTodayRegisterNo() {
                return todayRegisterNo;
            }

            public int getSubscribeRegisterNo() {
                return subscribeRegisterNo;
            }

            public int getReturnVisitRegisterNo() {
                return returnVisitRegisterNo;
            }

            public int getAllRegisterNo() {
                return allRegisterNo;
            }

            public String getDateTime() {
                return dateTime;
            }

            public int getNumber() {
                return number;
            }

            public int getLockNo() {
                return lockNo;
            }

            public int getPayNo() {
                return payNo;
            }

            public int getCancelNo() {
                return cancelNo;
            }

            public int getBackNo() {
                return backNo;
            }

            public int getClickNo() {
                return clickNo;
            }

            public int getBindNo() {
                return bindNo;
            }

            public int getAttentionNo() {
                return attentionNo;
            }

            public int getPayNoOfPeople() {
                return payNoOfPeople;
            }

            public String getReturnVisitNo() {
                return returnVisitNo;
            }
        }
    }
}
