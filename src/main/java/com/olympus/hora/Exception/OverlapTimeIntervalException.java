package com.olympus.hora.Exception;

/**
 * 時間帯重複例外を発生させるクラス．
 *
 * @author hasegawa_m
 *
 */
public class OverlapTimeIntervalException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * 時間帯重複例外。
     *
     */
    public OverlapTimeIntervalException() {
        super("時間帯が重複しています。");
    }

}
