package com.huawei.secure.android.common.util;

import android.util.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class SafeString {

    /* renamed from: a, reason: collision with root package name */
    public static final String f36790a = "SafeString";

    /* renamed from: b, reason: collision with root package name */
    public static final String f36791b = "";

    public static String replace(String str, CharSequence charSequence, CharSequence charSequence2) {
        if (str != null && charSequence != null && charSequence2 != null) {
            try {
                return str.replace(charSequence, charSequence2);
            } catch (Exception e11) {
                Log.e(f36790a, "replace: " + e11.getMessage());
            }
        }
        return str;
    }

    public static String substring(String str, int i11) {
        if (str != null && str.length() >= i11 && i11 >= 0) {
            try {
                return str.substring(i11);
            } catch (Exception e11) {
                Log.e(f36790a, "substring exception: " + e11.getMessage());
            }
        }
        return "";
    }

    public static String substring(String str, int i11, int i12) {
        if (str != null && i11 >= 0 && i12 <= str.length() && i12 >= i11) {
            try {
                return str.substring(i11, i12);
            } catch (Exception e11) {
                Log.e(f36790a, "substring: " + e11.getMessage());
            }
        }
        return "";
    }
}
