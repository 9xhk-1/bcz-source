package com.huawei.hms.hatool;

import android.content.Context;
import android.util.Pair;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class v0 implements g {

    /* renamed from: a, reason: collision with root package name */
    private Context f35929a = q0.i();

    /* renamed from: b, reason: collision with root package name */
    private String f35930b;

    /* renamed from: c, reason: collision with root package name */
    private String f35931c;

    /* renamed from: d, reason: collision with root package name */
    private String f35932d;

    public v0(String str, String str2, String str3) {
        this.f35930b = str;
        this.f35931c = str2;
        this.f35932d = str3;
    }

    private void a(String str, List<b1> list) {
        Pair<String, String> a11 = n1.a(str);
        new u(list, (String) a11.first, (String) a11.second, this.f35932d).a();
    }

    @Override // java.lang.Runnable
    public void run() {
        Map<String, List<b1>> a11;
        v.c("hmsSdk", "eventReportTask is running");
        boolean a12 = c0.a(this.f35929a);
        if (a12) {
            v.c("hmsSdk", "workKey is refresh,begin report all data");
            this.f35931c = "alltype";
        }
        try {
            try {
                a11 = c1.a(this.f35929a, this.f35930b, this.f35931c);
            } catch (IllegalArgumentException e11) {
                v.e("hmsSdk", "readEventRecords handData IllegalArgumentException:" + e11.getMessage());
                if ("alltype".equals(this.f35931c)) {
                    d.a(this.f35929a, "stat_v2_1", new String[0]);
                    d.a(this.f35929a, "cached_v2_1", new String[0]);
                } else {
                    String a13 = n1.a(this.f35930b, this.f35931c);
                    d.a(this.f35929a, "stat_v2_1", a13);
                    d.a(this.f35929a, "cached_v2_1", a13);
                }
            } catch (Exception e12) {
                v.e("hmsSdk", "readEventRecords handData Exception:" + e12.getMessage());
                if ("alltype".equals(this.f35931c)) {
                    d.a(this.f35929a, "stat_v2_1", new String[0]);
                    d.a(this.f35929a, "cached_v2_1", new String[0]);
                } else {
                    String a14 = n1.a(this.f35930b, this.f35931c);
                    d.a(this.f35929a, "stat_v2_1", a14);
                    d.a(this.f35929a, "cached_v2_1", a14);
                }
            }
            if (a11.size() == 0) {
                v.b("hmsSdk", "no have events to report: tag:%s : type:%s", this.f35930b, this.f35931c);
                if ("alltype".equals(this.f35931c)) {
                    d.a(this.f35929a, "stat_v2_1", new String[0]);
                    d.a(this.f35929a, "cached_v2_1", new String[0]);
                    return;
                } else {
                    String a15 = n1.a(this.f35930b, this.f35931c);
                    d.a(this.f35929a, "stat_v2_1", a15);
                    d.a(this.f35929a, "cached_v2_1", a15);
                    return;
                }
            }
            for (Map.Entry<String, List<b1>> entry : a11.entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
            if ("alltype".equals(this.f35931c)) {
                d.a(this.f35929a, "stat_v2_1", new String[0]);
                d.a(this.f35929a, "cached_v2_1", new String[0]);
            } else {
                String a16 = n1.a(this.f35930b, this.f35931c);
                d.a(this.f35929a, "stat_v2_1", a16);
                d.a(this.f35929a, "cached_v2_1", a16);
            }
            if (a12) {
                v.c("hmsSdk", "refresh local key");
                o0.d().b();
            }
        } catch (Throwable th2) {
            if ("alltype".equals(this.f35931c)) {
                d.a(this.f35929a, "stat_v2_1", new String[0]);
                d.a(this.f35929a, "cached_v2_1", new String[0]);
            } else {
                String a17 = n1.a(this.f35930b, this.f35931c);
                d.a(this.f35929a, "stat_v2_1", a17);
                d.a(this.f35929a, "cached_v2_1", a17);
            }
            throw th2;
        }
    }
}
