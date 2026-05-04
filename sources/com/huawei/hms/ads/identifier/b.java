package com.huawei.hms.ads.identifier;

import android.content.Context;
import android.net.Uri;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import com.huawei.hms.ads.identifier.d;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f35336a = new Uri.Builder().scheme("content").authority("com.huawei.hwid.pps.apiprovider").path("/oaid_scp/get").build();

    /* renamed from: b, reason: collision with root package name */
    private static final Uri f35337b = new Uri.Builder().scheme("content").authority("com.huawei.hwid.pps.apiprovider").path("/oaid/query").build();

    /* renamed from: com.huawei.hms.ads.identifier.b$1, reason: invalid class name */
    public static class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d.a f35338a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f35339b;

        public AnonymousClass1(d.a aVar, Context context) {
            this.f35338a = aVar;
            this.f35339b = context;
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    /* renamed from: com.huawei.hms.ads.identifier.b$2, reason: invalid class name */
    public static class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f35340a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d.a f35341b;

        public AnonymousClass2(Context context, d.a aVar) {
            this.f35340a = context;
            this.f35341b = aVar;
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    public static native AdvertisingIdClient.Info a(Context context);

    private static native boolean a(Context context, Uri uri);

    public static native AdvertisingIdClient.Info b(Context context);

    public static native boolean c(Context context);

    /* JADX INFO: Access modifiers changed from: private */
    public static native String e(Context context);
}
