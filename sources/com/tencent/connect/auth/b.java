package com.tencent.connect.auth;

import com.tencent.tauth.IUiListener;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static b f42788a = null;

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f42789d = true;

    /* renamed from: e, reason: collision with root package name */
    private static int f42790e;

    /* renamed from: b, reason: collision with root package name */
    public HashMap<String, a> f42791b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final String f42792c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public IUiListener f42793a;

        /* renamed from: b, reason: collision with root package name */
        public com.tencent.connect.auth.a f42794b;

        /* renamed from: c, reason: collision with root package name */
        public String f42795c;
    }

    public static b a() {
        if (f42788a == null) {
            f42788a = new b();
        }
        return f42788a;
    }

    public static int b() {
        int i11 = f42790e + 1;
        f42790e = i11;
        return i11;
    }

    public String c() {
        int ceil = (int) Math.ceil((Math.random() * 20.0d) + 3.0d);
        char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        int length = charArray.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < ceil; i11++) {
            stringBuffer.append(charArray[(int) (Math.random() * length)]);
        }
        return stringBuffer.toString();
    }

    public String a(a aVar) {
        int b11 = b();
        try {
            this.f42791b.put("" + b11, aVar);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return "" + b11;
    }
}
