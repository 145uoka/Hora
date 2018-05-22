package com.olympus.hora.common.util;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class MonthUtil {


    /**
     * 指定した日付の月末日を取得する。
     * @param date 日付
     * @return 月末日
     */
    public static LocalDate getEndDayOfTheMonth(LocalDate date){
        return date.withDayOfMonth(date.lengthOfMonth());
    }

    /**
     * 指定した日付のｘヵ月後の月末日を取得する。
     * @param date 日付
     * @param manyMonths ｘか月後
     * @return ｘか月後の月末日
     */
    public static LocalDate getEndDayOfTheAfterManyMonths(LocalDate date, int manyMonths){
        LocalDate afterManyMonthDate = date.plusMonths(manyMonths);
        return afterManyMonthDate.withDayOfMonth(afterManyMonthDate.lengthOfMonth());
    }

    /**
     * 指定した日付の第何週目の何曜日かが正しいかを判定する。
     * @param localdate 日付
     * @param weekIndex 第何週目
     * @param dayOfWeekinMonth 何曜日（日曜：1・・・・）
     * @return true：正 false：誤
     */
    public static boolean isValidDayOfWeekInMonth(LocalDate localdate, int weekOfMonth, int dayOfWeek){
        Calendar cal = Calendar.getInstance();
        Date date = DateUtil.localDate2Date(localdate);
        cal.setTime(date);

        int calWeekOfMonth = cal.get(Calendar.WEEK_OF_MONTH);
        int calDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        if(calWeekOfMonth == weekOfMonth){
            if(calDayOfWeek == dayOfWeek){
                return true;
            }
        }else if(weekOfMonth == 0){
            if(calDayOfWeek == dayOfWeek){
                return true;
            }
        }

        return false;
    }
}
