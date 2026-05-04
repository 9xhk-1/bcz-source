package tz;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class b0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f91239a = new HashMap();

    public b0() {
        b();
    }

    private void b() {
        this.f91239a.put("cF", "certFinger");
        this.f91239a.put("aI", "apkInfo");
        this.f91239a.put("pbR", "pbReaded");
        this.f91239a.put("pbH", "pbHtml");
        this.f91239a.put("pbT", "pbText");
        this.f91239a.put("gR", "gReferrer");
        this.f91239a.put("Pk", com.igexin.push.core.b.aC);
        this.f91239a.put("ul", "url");
        this.f91239a.put("ts", com.alipay.sdk.m.t.a.f11034k);
        this.f91239a.put("iI", "installId");
        this.f91239a.put("mA", "macAddress");
        this.f91239a.put("sN", "serialNumber");
        this.f91239a.put("andI", "androidId");
        this.f91239a.put("md", "model");
        this.f91239a.put("bI", "buildId");
        this.f91239a.put("bd", Constants.PHONE_BRAND);
        this.f91239a.put("buiD", "buildDisplay");
        this.f91239a.put("ver", "version");
        this.f91239a.put("verI", "versionCode");
        this.f91239a.put("apV", com.alipay.sdk.m.l.c.f10753m);
        this.f91239a.put("im", "imei");
        this.f91239a.put("oa", "oaid");
        this.f91239a.put("ga", "gaid");
        this.f91239a.put("loI", "localIP");
        this.f91239a.put("im2", "imei2");
        this.f91239a.put("si", "simulator");
        this.f91239a.put("waU", "wakeupUrl");
        this.f91239a.put("verS", "versionName");
    }

    @Override // tz.a0
    public String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = (String) this.f91239a.get(str);
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            return URLEncoder.encode(str2, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @Override // tz.a0
    public String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
