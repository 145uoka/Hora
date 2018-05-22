package com.olympus.hora.common.util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.apache.commons.lang3.StringUtils;

/**
 * 入力チェックの共通処理
 */
public class TimeUtils {

    /**
     * Utilクラスのコンストラクタはインスタンスを生成させない為抑止
     */
    private TimeUtils() {
    }

    /** 時刻のフォーマット HH:mm */
    public static final String TIME_FORMAT_HHMM = "HH:mm";


    /**
     * 文字列が時刻に変換できるか判定
     * @param str 文字列
     * @return 時刻変換できるときtrue、できないときfalse
     */
    public static boolean isValidTimeFormat(String str) {
        try {
            LocalTime.parse(str, DateTimeFormatter.ofPattern(TIME_FORMAT_HHMM));
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }

    /**
     * 文字列が時刻に変換できるか判定
     * @param str 文字列
     * @param format フォーマット
     * @return 時刻変換できるときtrue、できないときfalse
     */
    public static boolean isValidTimeFormat(String str, String format) {
        try {
            LocalTime.parse(str, DateTimeFormatter.ofPattern(format));
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }

    /**
     * 文字列時刻からLocalTime型に変換します
     * 文字列時刻は、時刻として正しいことを前提に処理を行っています
     * 時刻フォーマット指定あり
     *
     * @param stime 文字列時刻
     * @param format 時刻フォーマット
     * @return LocalTime型時刻
     */
    public static LocalTime convertToLocalTime(String stime, String format) {
        return LocalTime.parse(stime, DateTimeFormatter.ofPattern(format));
    }

    /**
     * 文字列時刻からLocalTime型に変換します
     * 文字列時刻は、時刻として正しいことを前提に処理を行っています
     *
     * @param sDate 文字列時刻(HH:mm)
     * @return LocalTime型時刻
     */
    public static LocalTime convertToLocalTime(String stime) {
        return convertToLocalTime(stime, TIME_FORMAT_HHMM);
    }

    /**
     * 文字列時刻からLocalTime型に変換します
     * 文字列時刻は、日付として正しいことを前提に処理を行っています
     * 文字列がnullの場合はnullを返却します
     *
     * @param stime
     * @return
     */
    public static LocalTime convertToLocalTimeOrNull(String stime){
        if(StringUtils.isEmpty(stime)){
            return null;
        } else {
            return convertToLocalTime(stime, TIME_FORMAT_HHMM);
        }
    }

    /**
     * LocalTime型からString型へ変換する。
     *
     * @param time LocalTime型の時刻
     * @return String型の時刻
     */
    public static String convertToString(LocalTime time) {
        return time.format( DateTimeFormatter.ofPattern(TIME_FORMAT_HHMM));
    }

    /**
     * 時刻の前後チェックを行う。
     *
     * @param startTime 開始時刻
     * @param endTime 終了時刻
     * @return 正しい：true エラー有：false
     */
    public static boolean isValidTimeTerm(LocalTime startTime, LocalTime endTime) {
        if (startTime.isBefore(endTime)) {
            return true;
        }
        return false;
    }

}
