package com.benmu.bmreport.model;

import java.util.List;

/**
 * Created by Bruce jing on 12/7/15.
 * 微信关注数据
 */
public class WXAttentionData extends BaseModel{


    /**
     * retStatus : 0
     * retMsg : success
     * retSign :
     * result : {"attentionEveryDays":[{"date_time":"2015-11-22","new_user":"137","cancel_user":"48"},{"date_time":"2015-11-23","new_user":"223","cancel_user":"46"},{"date_time":"2015-11-24","new_user":"217","cancel_user":"48"},{"date_time":"2015-11-25","new_user":"290","cancel_user":"37"},{"date_time":"2015-11-26","new_user":"274","cancel_user":"49"},{"date_time":"2015-11-27","new_user":"225","cancel_user":"67"},{"date_time":"2015-11-28","new_user":"176","cancel_user":"38"},{"date_time":"2015-11-29","new_user":"156","cancel_user":"28"},{"date_time":"2015-11-30","new_user":"333","cancel_user":"49"},{"date_time":"2015-12-01","new_user":"348","cancel_user":"240"},{"date_time":"2015-12-02","new_user":"302","cancel_user":"72"},{"date_time":"2015-12-03","new_user":"265","cancel_user":"53"},{"date_time":"2015-12-04","new_user":"239","cancel_user":"59"},{"date_time":"2015-12-05","new_user":"200","cancel_user":"41"},{"date_time":"2015-12-06","new_user":"183","cancel_user":"41"}]}
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
         * date_time : 2015-11-22
         * new_user : 137
         * cancel_user : 48
         */

        private List<AttentionEveryDaysEntity> attentionEveryDays;

        public void setAttentionEveryDays(List<AttentionEveryDaysEntity> attentionEveryDays) {
            this.attentionEveryDays = attentionEveryDays;
        }

        public List<AttentionEveryDaysEntity> getAttentionEveryDays() {
            return attentionEveryDays;
        }

        public static class AttentionEveryDaysEntity {
            private String date_time;
            private String new_user;
            private String cancel_user;

            public void setDate_time(String date_time) {
                this.date_time = date_time;
            }

            public void setNew_user(String new_user) {
                this.new_user = new_user;
            }

            public void setCancel_user(String cancel_user) {
                this.cancel_user = cancel_user;
            }

            public String getDate_time() {
                return date_time;
            }

            public String getNew_user() {
                return new_user;
            }

            public String getCancel_user() {
                return cancel_user;
            }
        }
    }
}
