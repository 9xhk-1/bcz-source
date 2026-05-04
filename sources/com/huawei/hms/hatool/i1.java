package com.huawei.hms.hatool;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class i1 {

    /* renamed from: a, reason: collision with root package name */
    private String f35823a;

    /* renamed from: b, reason: collision with root package name */
    private String f35824b;

    /* renamed from: c, reason: collision with root package name */
    private String f35825c;

    /* renamed from: d, reason: collision with root package name */
    private String f35826d;

    /* renamed from: e, reason: collision with root package name */
    private long f35827e;

    public i1(String str, String str2, String str3, String str4, long j11) {
        this.f35823a = str;
        this.f35824b = str2;
        this.f35825c = str3;
        this.f35826d = str4;
        this.f35827e = j11;
    }

    public void a() {
        v.c("StreamEventHandler", "Begin to handle stream events...");
        b1 b1Var = new b1();
        b1Var.b(this.f35825c);
        b1Var.d(this.f35824b);
        b1Var.a(this.f35826d);
        b1Var.c(String.valueOf(this.f35827e));
        if ("oper".equals(this.f35824b) && z.i(this.f35823a, "oper")) {
            p0 a11 = y.a().a(this.f35823a, this.f35827e);
            String a12 = a11.a();
            Boolean valueOf = Boolean.valueOf(a11.b());
            b1Var.f(a12);
            b1Var.e(String.valueOf(valueOf));
        }
        String replace = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(b1Var);
        new l0(this.f35823a, this.f35824b, q0.g(), arrayList, replace).a();
    }
}
