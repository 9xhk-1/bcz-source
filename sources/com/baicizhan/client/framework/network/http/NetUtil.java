package com.baicizhan.client.framework.network.http;

import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class NetUtil {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum NetTpyeEnmu {
        UNAVAIL,
        WIFI,
        NET,
        WAP
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum NetworkStateInfo {
        UNAVAIL,
        WIFI,
        TwoG,
        ThreeG
    }

    public static final String a() {
        String property = System.getProperty("http.proxyHost");
        if (TextUtils.isEmpty(property)) {
            return null;
        }
        return property;
    }

    public static final int b() {
        if (a() == null) {
            return -1;
        }
        try {
            return Integer.parseInt(System.getProperty("http.proxyPort"));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
