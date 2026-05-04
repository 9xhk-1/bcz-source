package com.vivo.push;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.heytap.mcssdk.constant.IntentConstant;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private int f45049a;

    /* renamed from: b, reason: collision with root package name */
    private String f45050b;

    public o(int i11) {
        this.f45049a = -1;
        if (i11 < 0) {
            throw new IllegalArgumentException("PushCommand: the value of command must > 0.");
        }
        this.f45049a = i11;
    }

    private void e(a aVar) {
        aVar.a(IntentConstant.COMMAND, this.f45049a);
        aVar.a("client_pkgname", this.f45050b);
        c(aVar);
    }

    public final String a() {
        return this.f45050b;
    }

    public final int b() {
        return this.f45049a;
    }

    public abstract void c(a aVar);

    public boolean c() {
        return false;
    }

    public abstract void d(a aVar);

    public String toString() {
        return getClass().getSimpleName();
    }

    public final void a(String str) {
        this.f45050b = str;
    }

    public final void b(Intent intent) {
        a a11 = a.a(intent);
        if (a11 == null) {
            com.vivo.push.util.p.b("PushCommand", "bundleWapper is null");
            return;
        }
        a11.a("method", this.f45049a);
        e(a11);
        Bundle b11 = a11.b();
        if (b11 != null) {
            intent.putExtras(b11);
        }
    }

    public final void a(Intent intent) {
        a a11 = a.a(intent);
        if (a11 == null) {
            com.vivo.push.util.p.b("PushCommand", "bundleWapper is null");
            return;
        }
        a(a11);
        Bundle b11 = a11.b();
        if (b11 != null) {
            intent.putExtras(b11);
        }
    }

    public final void a(a aVar) {
        String a11 = p.a(this.f45049a);
        if (a11 == null) {
            a11 = "";
        }
        aVar.a("method", a11);
        e(aVar);
    }

    public final void b(a aVar) {
        String a11 = aVar.a();
        if (!TextUtils.isEmpty(a11)) {
            this.f45050b = a11;
        } else {
            this.f45050b = aVar.a("client_pkgname");
        }
        d(aVar);
    }
}
