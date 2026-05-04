package mt;

import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public b f73673a;

    /* renamed from: b, reason: collision with root package name */
    public f f73674b;

    /* renamed from: c, reason: collision with root package name */
    public c f73675c;

    /* renamed from: d, reason: collision with root package name */
    public d f73676d;

    public a(f fVar) {
        this.f73674b = fVar;
        this.f73675c = new c(fVar, this);
        this.f73676d = new d(this.f73674b, this);
    }

    @Override // mt.b
    public void a() {
        b bVar = this.f73673a;
        if (bVar != null) {
            bVar.request();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f73674b.f73698l);
        arrayList.addAll(this.f73674b.f73699m);
        arrayList.addAll(this.f73674b.f73691e);
        f fVar = this.f73674b;
        if (fVar.f73692f) {
            if (jt.c.c(fVar.f73687a, g.f73723e)) {
                this.f73674b.f73697k.add(g.f73723e);
            } else {
                arrayList.add(g.f73723e);
            }
        }
        kt.d dVar = this.f73674b.f73702p;
        if (dVar != null) {
            dVar.a(arrayList.isEmpty(), new ArrayList(this.f73674b.f73697k), arrayList);
        }
    }

    @Override // mt.b
    public d b() {
        return this.f73676d;
    }

    @Override // mt.b
    public c d() {
        return this.f73675c;
    }
}
