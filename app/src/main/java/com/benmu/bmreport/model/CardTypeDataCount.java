package com.benmu.bmreport.model;

import java.util.List;

/**
 * Created by Bruce jing on 12/7/15.
 * <p/>
 * 1.1.7	整体--详细绑卡数据
 */
public class CardTypeDataCount extends BaseModel {


    /**
     * retStatus : 0
     * retMsg : success
     * retSign :
     * result : {"cardDatas":[{"dateTime":"2015-12-02","sheBaoCardNo":1,"yuYueCardNo":1,"jytCardNo":1,"tmpCardNo":10,"tmpChangesheBaoCardNo":0,"tmpChangejytCardNo":0,"number":0},{"dateTime":"2015-12-01","sheBaoCardNo":1,"yuYueCardNo":1,"jytCardNo":2,"tmpCardNo":2,"tmpChangesheBaoCardNo":0,"tmpChangejytCardNo":0,"number":0},{"dateTime":"2015-11-30","sheBaoCardNo":0,"yuYueCardNo":0,"jytCardNo":0,"tmpCardNo":1,"tmpChangesheBaoCardNo":0,"tmpChangejytCardNo":0,"number":0},{"dateTime":"2015-11-29","sheBaoCardNo":0,"yuYueCardNo":0,"jytCardNo":0,"tmpCardNo":0,"tmpChangesheBaoCardNo":0,"tmpChangejytCardNo":0,"number":0},{"dateTime":"2015-11-28","sheBaoCardNo":0,"yuYueCardNo":0,"jytCardNo":0,"tmpCardNo":0,"tmpChangesheBaoCardNo":0,"tmpChangejytCardNo":0,"number":0},{"dateTime":"2015-11-27","sheBaoCardNo":2,"yuYueCardNo":0,"jytCardNo":1,"tmpCardNo":0,"tmpChangesheBaoCardNo":0,"tmpChangejytCardNo":0,"number":0},{"dateTime":"2015-11-26","sheBaoCardNo":0,"yuYueCardNo":3,"jytCardNo":4,"tmpCardNo":11,"tmpChangesheBaoCardNo":0,"tmpChangejytCardNo":0,"number":0},{"dateTime":"2015-11-25","sheBaoCardNo":0,"yuYueCardNo":2,"jytCardNo":1,"tmpCardNo":4,"tmpChangesheBaoCardNo":0,"tmpChangejytCardNo":0,"number":0},{"dateTime":"2015-11-24","sheBaoCardNo":0,"yuYueCardNo":0,"jytCardNo":3,"tmpCardNo":0,"tmpChangesheBaoCardNo":0,"tmpChangejytCardNo":0,"number":0},{"dateTime":"2015-11-23","sheBaoCardNo":0,"yuYueCardNo":3,"jytCardNo":1,"tmpCardNo":3,"tmpChangesheBaoCardNo":0,"tmpChangejytCardNo":0,"number":0},{"dateTime":"2015-11-22","sheBaoCardNo":0,"yuYueCardNo":0,"jytCardNo":0,"tmpCardNo":0,"tmpChangesheBaoCardNo":0,"tmpChangejytCardNo":0,"number":0},{"dateTime":"2015-11-21","sheBaoCardNo":0,"yuYueCardNo":0,"jytCardNo":0,"tmpCardNo":0,"tmpChangesheBaoCardNo":0,"tmpChangejytCardNo":0,"number":0},{"dateTime":"2015-11-20","sheBaoCardNo":0,"yuYueCardNo":1,"jytCardNo":1,"tmpCardNo":1,"tmpChangesheBaoCardNo":0,"tmpChangejytCardNo":0,"number":0},{"dateTime":"2015-11-19","sheBaoCardNo":0,"yuYueCardNo":0,"jytCardNo":0,"tmpCardNo":0,"tmpChangesheBaoCardNo":0,"tmpChangejytCardNo":0,"number":0},{"dateTime":"2015-11-18","sheBaoCardNo":0,"yuYueCardNo":0,"jytCardNo":0,"tmpCardNo":0,"tmpChangesheBaoCardNo":0,"tmpChangejytCardNo":0,"number":0},{"dateTime":"2015-11-17","sheBaoCardNo":0,"yuYueCardNo":0,"jytCardNo":0,"tmpCardNo":1,"tmpChangesheBaoCardNo":0,"tmpChangejytCardNo":0,"number":0}]}
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
         * dateTime : 2015-12-02
         * sheBaoCardNo : 1
         * yuYueCardNo : 1
         * jytCardNo : 1
         * tmpCardNo : 10
         * tmpChangesheBaoCardNo : 0
         * tmpChangejytCardNo : 0
         * number : 0
         */

        private List<CardDatasEntity> cardDatas;

        public void setCardDatas(List<CardDatasEntity> cardDatas) {
            this.cardDatas = cardDatas;
        }

        public List<CardDatasEntity> getCardDatas() {
            return cardDatas;
        }

        public static class CardDatasEntity {
            private String dateTime;
            private int sheBaoCardNo;
            private int yuYueCardNo;
            private int jytCardNo;
            private int tmpCardNo;
            private int tmpChangesheBaoCardNo;
            private int tmpChangejytCardNo;
            private int number;

            public void setDateTime(String dateTime) {
                this.dateTime = dateTime;
            }

            public void setSheBaoCardNo(int sheBaoCardNo) {
                this.sheBaoCardNo = sheBaoCardNo;
            }

            public void setYuYueCardNo(int yuYueCardNo) {
                this.yuYueCardNo = yuYueCardNo;
            }

            public void setJytCardNo(int jytCardNo) {
                this.jytCardNo = jytCardNo;
            }

            public void setTmpCardNo(int tmpCardNo) {
                this.tmpCardNo = tmpCardNo;
            }

            public void setTmpChangesheBaoCardNo(int tmpChangesheBaoCardNo) {
                this.tmpChangesheBaoCardNo = tmpChangesheBaoCardNo;
            }

            public void setTmpChangejytCardNo(int tmpChangejytCardNo) {
                this.tmpChangejytCardNo = tmpChangejytCardNo;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            public String getDateTime() {
                return dateTime;
            }

            public int getSheBaoCardNo() {
                return sheBaoCardNo;
            }

            public int getYuYueCardNo() {
                return yuYueCardNo;
            }

            public int getJytCardNo() {
                return jytCardNo;
            }

            public int getTmpCardNo() {
                return tmpCardNo;
            }

            public int getTmpChangesheBaoCardNo() {
                return tmpChangesheBaoCardNo;
            }

            public int getTmpChangejytCardNo() {
                return tmpChangejytCardNo;
            }

            public int getNumber() {
                return number;
            }
        }

        @Override
        public String toString() {
            return "ResultEntity{" +
                    "cardDatas=" + cardDatas +
                    '}';
        }
    }


    @Override
    public String toString() {
        return "CardTypeDataCount{" +
                "retStatus='" + retStatus + '\'' +
                ", retMsg='" + retMsg + '\'' +
                ", retSign='" + retSign + '\'' +
                ", result=" + result +
                '}';
    }
}
