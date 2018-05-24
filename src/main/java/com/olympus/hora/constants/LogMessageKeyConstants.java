package com.olympus.hora.constants;

/**
 * メッセージKeyの定数クラス
 *
 * @author ishigouoka_k
 * $Id$
 */
public class LogMessageKeyConstants {

    /**
     * INFOログのメッセージID。
     */
    public static class Info {
        /** [{0}]を登録しました。ID = [{1}] 名称 = [{2}] */
        public static final String I_99_0001 = "I_99_0001";
        /** [{0}]を更新しました。ID = [{1}] 名称 = [{2}] */
        public static final String I_99_0002 = "I_99_0002";
        /** [{0}]を削除しました。ID = [{1}] 名称 = [{2}] */
        public static final String I_99_0003 = "I_99_0003";
        /** [{0}]を登録しました。ID = [{1}] */
        public static final String I_99_0004 = "I_99_0004";
        /** [{0}]を登録しました。データ数 = [{1}] */
        public static final String I_99_0005 = "I_99_0005";
    }

    /**
     * WARNログのメッセージID。
     */
    public static class Warn {
        /** 対象の[{0}]が見つかりませんでした。ID = [{1}] */
        public static final String W_99_0001 = "W_99_0001";
        /** 対象の[{0}]が見つかりませんでした。 */
        public static final String W_99_0002 = "W_99_0002";
    }

    /**
     * ERRORログのメッセージID。
     */
    public static class Error {
        /** 同日の時間帯重複エラー 日付：[{0}] */
        public static final String E_99_0001 = "E_99_0001";
    }

}
