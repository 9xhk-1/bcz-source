package cn.hugo.android.scanner.camera;

import android.content.SharedPreferences;
import v.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public enum FrontLightMode {
    ON,
    AUTO,
    OFF;

    private static FrontLightMode parse(String modeString) {
        return modeString == null ? OFF : valueOf(modeString);
    }

    public static FrontLightMode readPref(SharedPreferences sharedPrefs) {
        return parse(sharedPrefs.getString(a.f92793l, null));
    }
}
