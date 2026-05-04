package com.huawei.hms.framework.common;

import android.content.ContentResolver;
import android.provider.Settings;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class SettingUtil {
    private static final String TAG = "SettingUtil";

    public static int getSecureInt(ContentResolver contentResolver, String str, int i11) {
        try {
            return Settings.Secure.getInt(contentResolver, str, i11);
        } catch (RuntimeException e11) {
            Logger.e(TAG, "Settings Secure getInt throwFromSystemServer:", e11);
            return i11;
        }
    }

    public static int getSystemInt(ContentResolver contentResolver, String str, int i11) {
        try {
            return Settings.System.getInt(contentResolver, str, i11);
        } catch (RuntimeException e11) {
            Logger.e(TAG, "Settings System getInt throwFromSystemServer:", e11);
            return i11;
        }
    }
}
