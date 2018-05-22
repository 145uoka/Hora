/*
* 全著作権を、株式会社GSIが所有します。
* 日本の法律では、著作権は創作の時点で自動的に発生しています。
*
* ソフトウェアは、株式会社GSIによって提供されます。
* ソフトウェアは現存するままの状態で、明示であるか暗黙であるかを問わず
* 何らの保証もなく提供されます。
* ここでいう保証とは、商品性、特定の目的への適合性、および権利非侵害に
* ついての保証も含みますが、それに限定されるものではありません。
* 著者または著作権者は、いかなる主張（このソフトウェアまたはその派生物を
* 使うか、修正するか、配布することの結果として被認可者が受ける損害賠償）
* に対しても責任を負わないものとします。
*/
package com.olympus.hora.service;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

/**
 * ログ出力サービスクラス。
 *
 * @author hasegawa_m
 *
 */
@Service
public class LoggerService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected MessageSource messageSource;

    /**
     * ログ出力。
     *
     * メッセージIDの先頭文字を基に、ログレベルを設定します。<br>
     * I・・・INFO
     * E・・・ERROR
     * W・・・WARN
     * その他・・・DEBUG
     *
     * @param msgId メッセージID
     * @param args バインドパラメータ
     */
    public void outLog(String msgId, Object[] args) {
        String message = messageSource.getMessage(msgId, args, Locale.getDefault());

        if (msgId.startsWith("I")) {
            logger.info(message);
        } else if (msgId.startsWith("W")) {
            logger.warn(message);
        } else if (msgId.startsWith("E")) {
            logger.error(message);
        } else {
            logger.debug(message);
        }
    }

}
