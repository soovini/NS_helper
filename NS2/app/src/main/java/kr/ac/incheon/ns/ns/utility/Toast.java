package kr.ac.incheon.ns.ns.utility;

import android.text.TextUtils;

import kr.ac.incheon.ns.ns.MyApp;

public class Toast {

    /************************************************
     *  일반 Toast 메시지
     ************************************************/
    private static android.widget.Toast mCurrentToast;
    public static void showToast(CharSequence text) {
        if (null != mCurrentToast) {
            mCurrentToast.cancel();
        }

        if(!TextUtils.isEmpty(text)){
            mCurrentToast = android.widget.Toast.makeText(MyApp.getApplicationCtx(), text, android.widget.Toast.LENGTH_SHORT);
            mCurrentToast.show();
        }
    }
}