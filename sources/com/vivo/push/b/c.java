package com.vivo.push.b;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c extends com.vivo.push.o {

    /* renamed from: a, reason: collision with root package name */
    private String f44892a;

    /* renamed from: b, reason: collision with root package name */
    private String f44893b;

    /* renamed from: c, reason: collision with root package name */
    private long f44894c;

    /* renamed from: d, reason: collision with root package name */
    private int f44895d;

    /* renamed from: e, reason: collision with root package name */
    private int f44896e;

    /* renamed from: f, reason: collision with root package name */
    private String f44897f;

    public c(int i11, String str) {
        super(i11);
        this.f44894c = -1L;
        this.f44895d = -1;
        this.f44892a = null;
        this.f44893b = str;
    }

    public final void a(int i11) {
        this.f44896e = i11;
    }

    public final void b(String str) {
        this.f44892a = str;
    }

    @Override // com.vivo.push.o
    public void c(com.vivo.push.a aVar) {
        aVar.a("req_id", this.f44892a);
        aVar.a("package_name", this.f44893b);
        aVar.a("sdk_version", 323L);
        aVar.a("PUSH_APP_STATUS", this.f44895d);
        if (TextUtils.isEmpty(this.f44897f)) {
            return;
        }
        aVar.a("BaseAppCommand.EXTRA__HYBRIDVERSION", this.f44897f);
    }

    @Override // com.vivo.push.o
    public void d(com.vivo.push.a aVar) {
        this.f44892a = aVar.a("req_id");
        this.f44893b = aVar.a("package_name");
        this.f44894c = aVar.b("sdk_version", 0L);
        this.f44895d = aVar.b("PUSH_APP_STATUS", 0);
        this.f44897f = aVar.a("BaseAppCommand.EXTRA__HYBRIDVERSION");
    }

    public final int f() {
        return this.f44896e;
    }

    public final void g() {
        this.f44897f = null;
    }

    public final String h() {
        return this.f44892a;
    }

    @Override // com.vivo.push.o
    public String toString() {
        return "BaseAppCommand";
    }

    public final int a(Context context) {
        if (this.f44895d == -1) {
            String str = this.f44893b;
            if (TextUtils.isEmpty(str)) {
                com.vivo.push.util.p.a("BaseAppCommand", "pkg name is null");
                str = a();
                if (TextUtils.isEmpty(str)) {
                    com.vivo.push.util.p.a("BaseAppCommand", "src is null");
                    return -1;
                }
            }
            this.f44895d = com.vivo.push.util.t.b(context, str);
            if (!TextUtils.isEmpty(this.f44897f)) {
                this.f44895d = 2;
            }
        }
        return this.f44895d;
    }
}
