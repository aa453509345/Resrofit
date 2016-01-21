package com.benmu.bmreport.model;

import com.github.mikephil.charting.data.BarEntry;

/**
 * Created by Bruce Jing on 12/7/15.
 */
public class HomePageData extends BaseModel {


    /**
     * retStatus : 0
     * retMsg : success
     * retSign :
     * result : {"RegisterNoOfPeople":{"todayRegisterNoOfPeople":0,"lastWeekRegisterNoOfPeople":0},"RegisterNo":{"lastWeekRegisterNo":0,"todayRegisterNo":0},"BindingCardNo":{"lastWeekBindingNo":50,"todayBindingNo":100}}
     */

    private String retStatus;
    private String retMsg;
    private String retSign;
    /**
     * RegisterNoOfPeople : {"todayRegisterNoOfPeople":0,"lastWeekRegisterNoOfPeople":0}
     * RegisterNo : {"lastWeekRegisterNo":0,"todayRegisterNo":0}
     * BindingCardNo : {"lastWeekBindingNo":50,"todayBindingNo":100}
     */

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
         * todayRegisterNoOfPeople : 0
         * lastWeekRegisterNoOfPeople : 0
         */

        private RegisterNoOfPeopleEntity RegisterNoOfPeople;
        /**
         * lastWeekRegisterNo : 0
         * todayRegisterNo : 0
         */

        private RegisterNoEntity RegisterNo;
        /**
         * lastWeekBindingNo : 50
         * todayBindingNo : 100
         */

        private BindingCardNoEntity BindingCardNo;

        public void setRegisterNoOfPeople(RegisterNoOfPeopleEntity RegisterNoOfPeople) {
            this.RegisterNoOfPeople = RegisterNoOfPeople;
        }

        public void setRegisterNo(RegisterNoEntity RegisterNo) {
            this.RegisterNo = RegisterNo;
        }

        public void setBindingCardNo(BindingCardNoEntity BindingCardNo) {
            this.BindingCardNo = BindingCardNo;
        }

        public RegisterNoOfPeopleEntity getRegisterNoOfPeople() {
            return RegisterNoOfPeople;
        }

        public RegisterNoEntity getRegisterNo() {
            return RegisterNo;
        }

        public BindingCardNoEntity getBindingCardNo() {
            return BindingCardNo;
        }

        public static class RegisterNoOfPeopleEntity {
            private int todayRegisterNoOfPeople;
            private int lastWeekRegisterNoOfPeople;

            public void setTodayRegisterNoOfPeople(int todayRegisterNoOfPeople) {
                this.todayRegisterNoOfPeople = todayRegisterNoOfPeople;
            }

            public void setLastWeekRegisterNoOfPeople(int lastWeekRegisterNoOfPeople) {
                this.lastWeekRegisterNoOfPeople = lastWeekRegisterNoOfPeople;
            }

            public int getTodayRegisterNoOfPeople() {
                return todayRegisterNoOfPeople;
            }

            public int getLastWeekRegisterNoOfPeople() {
                return lastWeekRegisterNoOfPeople;
            }


            @Override
            public String toString() {
                return "RegisterNoOfPeopleEntity{" +
                        "todayRegisterNoOfPeople=" + todayRegisterNoOfPeople +
                        ", lastWeekRegisterNoOfPeople=" + lastWeekRegisterNoOfPeople +
                        '}';
            }
        }

        public static class RegisterNoEntity {
            private int lastWeekRegisterNo;
            private int todayRegisterNo;

            public void setLastWeekRegisterNo(int lastWeekRegisterNo) {
                this.lastWeekRegisterNo = lastWeekRegisterNo;
            }

            public void setTodayRegisterNo(int todayRegisterNo) {
                this.todayRegisterNo = todayRegisterNo;
            }

            public int getLastWeekRegisterNo() {
                return lastWeekRegisterNo;
            }

            public int getTodayRegisterNo() {
                return todayRegisterNo;
            }


            @Override
            public String toString() {
                return "RegisterNoEntity{" +
                        "lastWeekRegisterNo=" + lastWeekRegisterNo +
                        ", todayRegisterNo=" + todayRegisterNo +
                        '}';
            }
        }

        public static class BindingCardNoEntity {
            private int lastWeekBindingNo;
            private int todayBindingNo;

            public void setLastWeekBindingNo(int lastWeekBindingNo) {
                this.lastWeekBindingNo = lastWeekBindingNo;
            }

            public void setTodayBindingNo(int todayBindingNo) {
                this.todayBindingNo = todayBindingNo;
            }

            public int getLastWeekBindingNo() {
                return lastWeekBindingNo;
            }

            public int getTodayBindingNo() {
                return todayBindingNo;
            }

            @Override
            public String toString() {
                return "BindingCardNoEntity{" +
                        "lastWeekBindingNo=" + lastWeekBindingNo +
                        ", todayBindingNo=" + todayBindingNo +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "ResultEntity{" +
                    "RegisterNoOfPeople=" + RegisterNoOfPeople +
                    ", RegisterNo=" + RegisterNo +
                    ", BindingCardNo=" + BindingCardNo +
                    '}';
        }
    }


    @Override
    public String toString() {
        return "HomePageData{" +
                "retStatus='" + retStatus + '\'' +
                ", retMsg='" + retMsg + '\'' +
                ", retSign='" + retSign + '\'' +
                ", result=" + result +
                '}';
    }
}
