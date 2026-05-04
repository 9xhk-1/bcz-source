package com.baicizhan.client.business.thrift;

import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a implements t {

    /* renamed from: e, reason: collision with root package name */
    public static final String f16553e = "%s%s/%s/%d";

    /* renamed from: a, reason: collision with root package name */
    public String f16554a;

    /* renamed from: b, reason: collision with root package name */
    public String f16555b;

    /* renamed from: c, reason: collision with root package name */
    public String f16556c;

    /* renamed from: d, reason: collision with root package name */
    public String f16557d;

    public a(String domain) {
        this(domain, h.a().b(domain));
    }

    @Override // com.baicizhan.client.business.thrift.t
    public String a(int retryCount, int maxRetryCount) {
        long currentTimeMillis = System.currentTimeMillis();
        String str = this.f16556c;
        if (str == null || retryCount % 2 != 1) {
            str = this.f16555b;
        }
        return String.format(Locale.US, f16553e, str, this.f16554a, this.f16557d, Long.valueOf(currentTimeMillis));
    }

    public void b(String masterUrl) {
        this.f16555b = masterUrl;
    }

    public void c(String methodName) {
        this.f16557d = methodName;
    }

    public void d(String slaveUrl) {
        this.f16556c = slaveUrl;
    }

    public a(String domain, String... urls) {
        this.f16554a = domain;
        String str = urls[0];
        this.f16555b = str;
        this.f16556c = urls.length > 1 ? urls[1] : str;
    }
}
