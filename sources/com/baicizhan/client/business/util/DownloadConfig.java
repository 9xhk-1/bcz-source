package com.baicizhan.client.business.util;

import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class DownloadConfig {
    public static final int DEFAULT_CONN_TIMEOUT = 3000;
    public static final int DEFAULT_MAX_RETRY = 2;
    public static final int DEFAULT_READ_TIMEOUT = 5000;
    public static final int MODE_LIMIT = 0;
    public static final int MODE_LOOSE_2G = 8;
    public static final int MODE_LOOSE_3G = 4;
    public static final int MODE_LOOSE_4G = 2;
    public static final int MODE_LOOSE_ALL = 15;
    public static final int MODE_LOOSE_WIFI = 1;

    private DownloadConfig() {
    }

    public static boolean canDownload(Context context, int mode) {
        if (!rb.d.f(context) || mode == 0) {
            return false;
        }
        int b11 = rb.d.b(context);
        if (b11 != 0) {
            return b11 != 1 ? b11 != 2 ? b11 == 3 && mode >= 8 : mode >= 4 : mode >= 2;
        }
        return true;
    }
}
