package com.getui.gtc.a.a;

import android.net.Network;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class d extends f {

    /* renamed from: o, reason: collision with root package name */
    private final int f29691o;

    /* renamed from: p, reason: collision with root package name */
    private final k f29692p;

    public d(String str, k kVar, Network network) {
        super(str);
        this.f29691o = 1;
        this.f29704l = true;
        this.f29692p = kVar;
        this.f29695c = network;
    }

    @Override // com.getui.gtc.a.a.f
    public final void a() {
        try {
            com.getui.gtc.i.c.a.a("exceptionHandler type = " + this.f29691o);
            if (this.f29697e != null) {
                j jVar = new j();
                jVar.f29723c = this.f29691o;
                jVar.f29724d = this.f29692p;
                this.f29697e.a(jVar);
            }
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
        }
    }

    @Override // com.getui.gtc.a.a.f
    public final void a(int i11) {
        try {
            com.getui.gtc.i.c.a.a("requestFailed type = ".concat(String.valueOf(i11)));
            if (this.f29697e != null) {
                j jVar = new j();
                jVar.f29723c = this.f29691o;
                jVar.f29724d = this.f29692p;
                this.f29697e.a(jVar);
            }
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
        }
    }

    @Override // com.getui.gtc.a.a.f
    public final void a(Map<String, List<String>> map, byte[] bArr) {
        try {
            String str = new String(bArr, "UTF-8");
            if (this.f29697e != null) {
                j jVar = new j();
                jVar.f29723c = this.f29691o;
                jVar.f29724d = this.f29692p;
                jVar.f29721a = map;
                jVar.f29722b = str;
                this.f29697e.a(jVar);
            }
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
        }
    }
}
