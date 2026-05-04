package com.baicizhan.client.business.thrift;

import android.content.Context;
import com.baicizhan.client.business.util.ChannelUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b implements e {

    /* renamed from: d, reason: collision with root package name */
    public static final String f16558d = "device_name";

    /* renamed from: e, reason: collision with root package name */
    public static final String f16559e = "device_id";

    /* renamed from: f, reason: collision with root package name */
    public static final String f16560f = "app_name";

    /* renamed from: g, reason: collision with root package name */
    public static final String f16561g = "channel";

    /* renamed from: h, reason: collision with root package name */
    public static final String f16562h = "serial";

    /* renamed from: i, reason: collision with root package name */
    public static final String f16563i = "version";

    /* renamed from: j, reason: collision with root package name */
    public static final String f16564j = "time_zone";

    /* renamed from: k, reason: collision with root package name */
    public static final String f16565k = "access_token";

    /* renamed from: l, reason: collision with root package name */
    public static final String f16566l = "client_time";

    /* renamed from: m, reason: collision with root package name */
    public static final String f16567m = "device_version";

    /* renamed from: n, reason: collision with root package name */
    public static final String f16568n = "Pay-Support-H5";

    /* renamed from: o, reason: collision with root package name */
    public static final int f16569o = 5;

    /* renamed from: b, reason: collision with root package name */
    public String f16571b;

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, String> f16570a = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final DateFormat f16572c = new SimpleDateFormat("ddHHmmss", Locale.US);

    public b(Context context) {
        put("device_name", "android/" + nb.a.f75039b.replace(" ", ""));
        put("version", nb.a.f75038a);
        put("app_name", Integer.toString(xb.o.g(context)));
        put("channel", ChannelUtils.getChannel(context));
    }

    @Override // com.baicizhan.client.business.thrift.e
    public String a() {
        put("client_time", String.valueOf(System.currentTimeMillis() / 1000));
        c();
        put("serial", d());
        put("time_zone", TimeZone.getDefault().getID());
        StringBuilder sb2 = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = this.f16570a.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        try {
            sb2.append(next.getKey());
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(URLEncoder.encode(next.getValue(), "utf-8"));
            while (it.hasNext()) {
                Map.Entry<String, String> next2 = it.next();
                sb2.append("; ");
                sb2.append(next2.getKey());
                sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb2.append(URLEncoder.encode(next2.getValue() == null ? "null" : next2.getValue(), "utf-8"));
            }
        } catch (Exception e11) {
            qb.c.c("BaicizhanCookieInflator", "", e11);
        }
        return sb2.toString();
    }

    @Override // com.baicizhan.client.business.thrift.e
    public boolean b(String key) {
        return this.f16570a.containsKey(key);
    }

    public final String c() {
        if (this.f16571b == null) {
            String a11 = xb.o.a(pb.a.a());
            this.f16571b = a11;
            put("device_id", a11);
        }
        return this.f16571b;
    }

    public final String d() {
        String str;
        if (this.f16571b.length() >= 5) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f16571b.substring(0, 5));
            String str2 = this.f16571b;
            sb2.append(str2.substring(str2.length() - 5));
            str = sb2.toString();
        } else {
            str = this.f16571b;
        }
        return str + this.f16572c.format(Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.baicizhan.client.business.thrift.e
    public void put(String key, String value) {
        this.f16570a.put(key, value);
    }

    @Override // com.baicizhan.client.business.thrift.e
    public void remove(String key) {
        this.f16570a.remove(key);
    }
}
