package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    protected d f35662a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35663b;

    /* renamed from: c, reason: collision with root package name */
    private final c f35664c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35665d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f35666e;

    /* renamed from: f, reason: collision with root package name */
    private final String f35667f;

    /* renamed from: g, reason: collision with root package name */
    private final GrsBaseInfo f35668g;

    /* renamed from: h, reason: collision with root package name */
    private final com.huawei.hms.framework.network.grs.e.c f35669h;

    public a(String str, int i11, c cVar, Context context, String str2, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.c cVar2) {
        this.f35663b = str;
        this.f35664c = cVar;
        this.f35665d = i11;
        this.f35666e = context;
        this.f35667f = str2;
        this.f35668g = grsBaseInfo;
        this.f35669h = cVar2;
    }

    public Context a() {
        return this.f35666e;
    }

    public c b() {
        return this.f35664c;
    }

    public String c() {
        return this.f35663b;
    }

    public int d() {
        return this.f35665d;
    }

    public String e() {
        return this.f35667f;
    }

    public com.huawei.hms.framework.network.grs.e.c f() {
        return this.f35669h;
    }

    public Callable<d> g() {
        return new f(this.f35663b, this.f35665d, this.f35664c, this.f35666e, this.f35667f, this.f35668g, this.f35669h);
    }
}
