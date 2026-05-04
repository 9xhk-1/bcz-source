package i2;

import e2.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends g<c, f2.c> {

    /* renamed from: n, reason: collision with root package name */
    public boolean f60122n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f60123o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f60124p;

    public d() {
        super(new c());
    }

    @Override // i2.g, e2.d
    public void C0() {
        float f11;
        float f12;
        float f13;
        float f14;
        int i11 = this.f48397a.f48380e.f48329c;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            D d11 = this.f60129m;
            x1.h hVar = ((c) d11).f60118c.f48342f[i12];
            float f15 = this.f60123o ? ((c) d11).f60120e.f48337e[i12] : 1.0f;
            if (this.f60124p) {
                int i14 = ((c) d11).f60121f.f48332c * i12;
                float f16 = ((c) d11).f60121f.f48337e[i14];
                float f17 = ((c) d11).f60121f.f48337e[i14 + 1];
                float f18 = ((c) d11).f60121f.f48337e[i14 + 2];
                f14 = ((c) d11).f60121f.f48337e[i14 + 3];
                f11 = f16;
                f12 = f17;
                f13 = f18;
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
                f13 = 0.0f;
                f14 = 1.0f;
            }
            hVar.f97045e.set(((c) d11).f60127b.f48337e[i13], ((c) d11).f60127b.f48337e[i13 + 1], ((c) d11).f60127b.f48337e[i13 + 2], f11, f12, f13, f14, f15, f15, f15);
            if (this.f60122n) {
                int i15 = ((c) this.f60129m).f60119d.f48332c * i12;
                y1.b bVar = (y1.b) hVar.f97041a.get(0).l(y1.b.f98947g);
                y1.a aVar = (y1.a) hVar.f97041a.get(0).l(y1.a.f98941j);
                com.badlogic.gdx.graphics.b bVar2 = bVar.f98961e;
                D d12 = this.f60129m;
                bVar2.f11544a = ((c) d12).f60119d.f48337e[i15];
                bVar2.f11545b = ((c) d12).f60119d.f48337e[i15 + 1];
                bVar2.f11546c = ((c) d12).f60119d.f48337e[i15 + 2];
                if (aVar != null) {
                    aVar.f98945h = ((c) d12).f60119d.f48337e[i15 + 3];
                }
            }
            i12++;
            i13 += ((c) this.f60129m).f60127b.f48332c;
        }
        super.C0();
    }

    @Override // i2.g
    public boolean J0(f2.d<?> dVar) {
        return dVar instanceof f2.c;
    }

    @Override // e2.d
    public void X() {
        ((c) this.f60129m).f60127b = (a.d) this.f48397a.f48380e.a(e2.b.f48346d);
    }

    @Override // e2.d
    public e2.d Z() {
        return new d((f2.c) this.f60128l);
    }

    @Override // e2.d
    public void init() {
        ((c) this.f60129m).f60118c = (a.f) this.f48397a.f48380e.g(e2.b.f48353k);
        ((c) this.f60129m).f60119d = (a.d) this.f48397a.f48380e.g(e2.b.f48348f);
        ((c) this.f60129m).f60120e = (a.d) this.f48397a.f48380e.g(e2.b.f48352j);
        ((c) this.f60129m).f60121f = (a.d) this.f48397a.f48380e.g(e2.b.f48351i);
        D d11 = this.f60129m;
        this.f60122n = ((c) d11).f60119d != null;
        this.f60123o = ((c) d11).f60120e != null;
        this.f60124p = ((c) d11).f60121f != null;
    }

    public d(f2.c cVar) {
        this();
        Q0(cVar);
    }
}
