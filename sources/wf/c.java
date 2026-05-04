package wf;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f96197e = "ReviewStrategy";

    /* renamed from: f, reason: collision with root package name */
    public static final c f96198f = new c();

    /* renamed from: c, reason: collision with root package name */
    public b f96201c;

    /* renamed from: d, reason: collision with root package name */
    public a f96202d;

    /* renamed from: b, reason: collision with root package name */
    public List<d> f96200b = new ArrayList(0);

    /* renamed from: a, reason: collision with root package name */
    public l f96199a = new l();

    public static c e() {
        return f96198f;
    }

    public void a() {
        this.f96199a.J();
        b bVar = this.f96201c;
        if (bVar != null) {
            bVar.release();
            this.f96201c = null;
        }
        if (this.f96202d != null) {
            this.f96202d = null;
        }
    }

    public void b(d asset) {
        if (this.f96200b.remove(asset)) {
            qb.c.i(f96197e, "review again %s", asset.toString());
            this.f96199a.I(asset);
        } else {
            qb.c.i(f96197e, "%s", asset.toString());
            this.f96201c.a(asset.d().f(), asset.d().e() + 1);
        }
    }

    public void c(d asset) {
        qb.c.i(f96197e, "%s", asset.toString());
        this.f96199a.I(asset);
    }

    public int d() {
        return 3;
    }

    public int f() {
        return this.f96199a.r();
    }

    public int g() {
        return this.f96199a.s();
    }

    public void h(d asset) {
        qb.c.i(f96197e, "%s", asset.toString());
        this.f96200b.add(asset);
    }

    public void i(a loader, b learning) {
        this.f96199a.t();
        this.f96202d = loader;
        this.f96201c = learning;
    }

    public rx.c<d> j(Context context, rx.d observeOn) {
        return this.f96199a.v(context, this.f96202d, observeOn);
    }

    public void k(d asset) {
        this.f96199a.H(asset);
    }
}
