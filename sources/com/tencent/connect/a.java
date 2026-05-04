package com.tencent.connect;

import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {
    public static boolean a(String str, IUiListener iUiListener) {
        return a(str, iUiListener, -6, Constants.MSG_PERMISSION_NOT_GRANTED, Constants.MSG_PERMISSION_NOT_GRANTED);
    }

    public static boolean a(String str, IUiListener iUiListener, int i11, String str2, String str3) {
        if (!Tencent.isPermissionNotGranted()) {
            return false;
        }
        SLog.i(str, "permission not granted");
        if (iUiListener == null) {
            return true;
        }
        iUiListener.onError(new UiError(i11, str2, str3));
        return true;
    }
}
