package com.hihonor.ads.identifier;

import android.content.Context;

/* loaded from: classes7.dex */
public class AdvertisingIdClient {

    public static final class Info {

        /* renamed from: id, reason: collision with root package name */
        public String f35188id;
        public boolean isLimit;
    }

    public static native Info getAdvertisingIdInfo(Context context);

    public static native boolean isAdvertisingIdAvailable(Context context);
}
