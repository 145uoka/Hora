package com.olympus.hora.Exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.olympus.hora.constants.SystemCodeConstants.MessageType;


public class GlobalExceptionResolver implements HandlerExceptionResolver {
	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionResolver.class);

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object object,
			Exception ex) {

	    logger.error("例外をキャッチしました。", ex);
	    ModelAndView mav = new ModelAndView();

		if (ex instanceof MultipartException) {
			// JSPに表示するメッセージをセットします。
			mav.addObject("message", "アップロードファイルが大きすぎます。");

		} else if(ex instanceof RecordNotFoundException){

            RecordNotFoundException recordNotEx = (RecordNotFoundException) ex;

            // JSPに表示するメッセージをセットします。
            if(recordNotEx.getExceptionMessage() != null){
                String exceptionMessage = recordNotEx.getExceptionMessage();
                mav.addObject(MessageType.ERROR, exceptionMessage);
            }else{
                mav.addObject(MessageType.ERROR, "対象のレコードが検出されませんでした。");
            }

		} else {
			// JSPに表示するメッセージをセットします。
			mav.addObject(MessageType.ERROR, "予期せぬエラーが発生しました。");
		}

		// 遷移先のJSPを指定します。(error.jspに遷移します。)
		mav.setViewName("./error");
        return mav;
	}
}
