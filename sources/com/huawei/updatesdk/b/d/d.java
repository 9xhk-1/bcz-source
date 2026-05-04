package com.huawei.updatesdk.b.d;

import android.text.TextUtils;
import java.io.File;
import java.net.HttpURLConnection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f36896a = new d();
    }

    public static d a() {
        return a.f36896a;
    }

    public static String b() {
        String b11 = com.huawei.updatesdk.a.b.a.a.c().b();
        if (TextUtils.isEmpty(b11)) {
            return "";
        }
        String str = b11 + "/updatesdk";
        File file = new File(str);
        return (file.exists() || file.mkdirs()) ? str : "";
    }

    public HttpURLConnection a(String str) {
        HttpURLConnection a11 = com.huawei.updatesdk.a.a.b.b.a(str, com.huawei.updatesdk.a.b.a.a.c().a());
        a11.setConnectTimeout(7000);
        a11.setReadTimeout(10000);
        a11.setUseCaches(false);
        a11.setDoInput(true);
        a11.setRequestProperty("Accept-Encoding", "identity");
        a11.setInstanceFollowRedirects(true);
        return a11;
    }
}
