package com.olympus.hora.constants;

import org.apache.commons.lang3.StringUtils;

public class SystemCodeConstants {

    /** エンコード */
    public static final String CHARACTER_ENCODING = "UTF-8";

    public static final String PLEASE_SELECT_MSG = "－－－－";

    public static final String ENABLED = "有効";
    public static final String DISABLE = "無効";

    public static class PATTERN {
        public static final String NUMERIC = "0-9";
        public static final String ALPHABET_LOWERCASE = "a-z";
        public static final String ALPHABET_UPPERCASE = "A-Z";
    }    /**
     * 有効終了日が設定されていない場合の定数
     */
    public static class EffectiveEndDateCode {
        public static final String EFFECTIVE_END_DATE = "-";
    }

    /** 営業日詳細定義レコード定数 */
    public static final Integer WOKING_DETAIL_RECORD_NUM = 10;

    /** 営業日マスタ 登録期間定数（ｘか月先） */
    public static final Integer WOKING_STORE_MONTHS_NUM = 1;



    /**
     * フラグ関連定数。
     */
    public enum Flag {
        ON("1", 1, true),
        OFF("0", 0, false);

        final String stringValue;
        final Integer integerValue;
        final boolean boolValue;
        private Flag(String stringValue, Integer integerValue, boolean boolValue) {
            this.stringValue = stringValue;
            this.integerValue = integerValue;
            this.boolValue = boolValue;
        }

        public static Flag getFlagByIntegerValue(Integer integerValue){

            for(Flag flag : Flag.values()) {
                if (flag.getIntegerValue().compareTo(integerValue) == 0) {
                    return flag;
                }
            }

            return OFF;
        }

        public static Flag getFlagByStringValue(String value){

            for(Flag flag : Flag.values()) {
                if (StringUtils.equals(flag.getStringValue(), value)) {
                    return flag;
                }
            }

            return null;
        }
        public static Flag getFlagByBooleanValue(Boolean value){

            if (value == null) {
                return null;
            }

            for(Flag flag : Flag.values()) {
                if (flag.boolValue == value) {
                    return flag;
                }
            }

            return null;
        }

        /**
         * stringValueを取得。
         * @return stringValue
         */
        public String getStringValue() {
            return stringValue;
        }
        /**
         * integerValueを取得。
         * @return integerValue
         */
        public Integer getIntegerValue() {
            return integerValue;
        }
        /**
         * boolValueを取得。
         * @return boolValue
         */
        public boolean isBoolValue() {
            return boolValue;
        }
    }


    /**
     * メッセージタイプ。
     */
    public static class MessageType {
        /** 成功 */
        public static final String SUCCESS = "successMessages";
        /** 通知 */
        public static final String INFO = "infoMessages";
        /** 警告 */
        public static final String WARN = "warnMessages";
        /** エラー */
        public static final String ERROR = "errorMessages";
    }
}
