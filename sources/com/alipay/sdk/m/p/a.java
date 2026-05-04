package com.alipay.sdk.m.p;

import android.text.TextUtils;
import com.alipay.sdk.m.u.i;
import com.huawei.hms.framework.common.ContainerUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split("&");
        if (split.length == 0) {
            return "";
        }
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        for (String str6 : split) {
            if (TextUtils.isEmpty(str2)) {
                str2 = e(str6);
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = d(str6);
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = f(str6);
            }
            if (TextUtils.isEmpty(str5)) {
                str5 = c(str6);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str2)) {
            sb2.append("biz_type=" + str2 + i.f11097b);
        }
        if (!TextUtils.isEmpty(str3)) {
            sb2.append("biz_no=" + str3 + i.f11097b);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb2.append("trade_no=" + str4 + i.f11097b);
        }
        if (!TextUtils.isEmpty(str5)) {
            sb2.append("app_userid=" + str5 + i.f11097b);
        }
        String sb3 = sb2.toString();
        return sb3.endsWith(i.f11097b) ? sb3.substring(0, sb3.length() - 1) : sb3;
    }

    public static String b(String str) {
        String[] split = str.split(ContainerUtils.KEY_VALUE_DELIMITER);
        if (split.length <= 1) {
            return null;
        }
        String str2 = split[1];
        return str2.contains("\"") ? str2.replaceAll("\"", "") : str2;
    }

    public static String c(String str) {
        if (str.contains("app_userid")) {
            return b(str);
        }
        return null;
    }

    public static String d(String str) {
        if (str.contains("biz_no")) {
            return b(str);
        }
        return null;
    }

    public static String e(String str) {
        if (str.contains("biz_type")) {
            return b(str);
        }
        return null;
    }

    public static String f(String str) {
        if (!str.contains(com.alipay.sdk.m.k.b.B0) || str.startsWith(com.alipay.sdk.m.k.b.A0)) {
            return null;
        }
        return b(str);
    }
}
