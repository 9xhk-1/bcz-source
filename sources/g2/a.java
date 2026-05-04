package g2;

import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.f;
import e2.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a extends d implements f.c {

    /* renamed from: l, reason: collision with root package name */
    public int f52560l;

    /* renamed from: m, reason: collision with root package name */
    public int f52561m = 4;

    /* renamed from: n, reason: collision with root package name */
    public float f52562n;

    public a(a aVar) {
        a1(aVar);
    }

    @Override // e2.d, com.badlogic.gdx.utils.f.c
    public void D(f fVar, JsonValue jsonValue) {
        Class cls = Integer.TYPE;
        this.f52560l = ((Integer) fVar.M("minParticleCount", cls, jsonValue)).intValue();
        this.f52561m = ((Integer) fVar.M("maxParticleCount", cls, jsonValue)).intValue();
    }

    public int J0() {
        return this.f52561m;
    }

    public int Q0() {
        return this.f52560l;
    }

    public boolean V0() {
        return this.f52562n >= 1.0f;
    }

    public void a1(a aVar) {
        this.f52560l = aVar.f52560l;
        this.f52561m = aVar.f52561m;
    }

    public void b1(int i11) {
        this.f52561m = i11;
    }

    public void c1(int i11) {
        this.f52560l = i11;
    }

    public void d1(int i11, int i12) {
        c1(i11);
        b1(i12);
    }

    @Override // e2.d
    public void end() {
        this.f48397a.f48380e.f48329c = 0;
    }

    @Override // e2.d
    public void init() {
        this.f48397a.f48380e.f48329c = 0;
    }

    @Override // e2.d, com.badlogic.gdx.utils.f.c
    public void z(f fVar) {
        fVar.F0("minParticleCount", Integer.valueOf(this.f52560l));
        fVar.F0("maxParticleCount", Integer.valueOf(this.f52561m));
    }

    public a() {
    }
}
