package com.huawei.hms.support.hwid.tools;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class NetworkTool {
    private static boolean a(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public static String buildNetworkCookie(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Long l11) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        if (!TextUtils.isEmpty(str2)) {
            sb2.append(str2);
        }
        if (a(bool)) {
            sb2.append(";HttpOnly");
        }
        if (a(bool2)) {
            sb2.append(";Secure");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb2.append(";Domain=");
            sb2.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb2.append(";Path=");
            sb2.append(str4);
        }
        if (l11 != null && l11.longValue() > 0) {
            sb2.append(";Max-Age=");
            sb2.append(l11);
        }
        return sb2.toString();
    }

    public static String buildNetworkUrl(String str, Boolean bool) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        String str2 = a(bool) ? "https" : "http";
        StringBuilder sb2 = new StringBuilder(str2.length() + 3 + String.valueOf(str).length());
        sb2.append(str2);
        sb2.append("://");
        sb2.append(str);
        return sb2.toString();
    }
}
