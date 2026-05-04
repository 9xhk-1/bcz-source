package com.alipay.sdk.m.o;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieManager;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10880a = "msp";

    /* renamed from: b, reason: collision with root package name */
    public static final String f10881b = "application/octet-stream;binary/octet-stream";

    /* renamed from: c, reason: collision with root package name */
    public static final CookieManager f10882c = new CookieManager();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.alipay.sdk.m.o.a$a, reason: collision with other inner class name */
    public static final class C0171a {

        /* renamed from: a, reason: collision with root package name */
        public final String f10883a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f10884b;

        /* renamed from: c, reason: collision with root package name */
        public final Map<String, String> f10885c;

        public C0171a(String str, Map<String, String> map, byte[] bArr) {
            this.f10883a = str;
            this.f10884b = bArr;
            this.f10885c = map;
        }

        public String toString() {
            return String.format("<UrlConnectionConfigure url=%s headers=%s>", this.f10883a, this.f10885c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Map<String, List<String>> f10886a;

        /* renamed from: b, reason: collision with root package name */
        public final String f10887b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f10888c;

        public b(Map<String, List<String>> map, String str, byte[] bArr) {
            this.f10886a = map;
            this.f10887b = str;
            this.f10888c = bArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alipay.sdk.m.o.a.b a(android.content.Context r11, com.alipay.sdk.m.o.a.C0171a r12) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.o.a.a(android.content.Context, com.alipay.sdk.m.o.a$a):com.alipay.sdk.m.o.a$b");
    }

    public static Proxy b(Context context) {
        String a11 = a(context);
        if (a11 != null && !a11.contains("wap")) {
            return null;
        }
        try {
            String property = System.getProperty("https.proxyHost");
            String property2 = System.getProperty("https.proxyPort");
            if (!TextUtils.isEmpty(property)) {
                return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, Integer.parseInt(property2)));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String a(Context context) {
        try {
            NetworkInfo a11 = com.alipay.sdk.m.w.b.a(null, context);
            if (a11 != null && a11.isAvailable()) {
                return a11.getType() == 1 ? "wifi" : a11.getExtraInfo().toLowerCase();
            }
        } catch (Exception unused) {
        }
        return "none";
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 1024);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
