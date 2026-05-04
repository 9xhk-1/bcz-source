package com.huawei.hms.base.ui;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class LogUtil {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f35482a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    private static String a(String str, boolean z11) {
        StringBuilder sb2 = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            if (z11) {
                sb2.append(a(str));
            } else {
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public static void e(String str, String str2, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, a(str2, z11));
    }

    public static void e(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, a(str2, false));
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i11 = 1;
        if (1 == length) {
            return String.valueOf('*');
        }
        StringBuilder sb2 = new StringBuilder(length);
        for (int i12 = 0; i12 < length; i12++) {
            char charAt = str.charAt(i12);
            if (f35482a.matcher(String.valueOf(charAt)).matches()) {
                if (i11 % 2 == 0) {
                    charAt = '*';
                }
                i11++;
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }
}
