package pl;

import a3.j0;
import com.esotericsoftware.spine.Skeleton;
import com.esotericsoftware.spine.a;
import jl.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b extends j0<pl.a> {

    /* renamed from: d, reason: collision with root package name */
    public k f80786d;

    /* renamed from: e, reason: collision with root package name */
    public jl.i f80787e;

    /* renamed from: f, reason: collision with root package name */
    public jl.a f80788f;

    /* renamed from: g, reason: collision with root package name */
    public final j0<Skeleton> f80789g;

    /* renamed from: h, reason: collision with root package name */
    public final j0<com.esotericsoftware.spine.a> f80790h;

    /* renamed from: i, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<pl.a> f80791i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends j0<Skeleton> {
        public a(int i11, int i12) {
            super(i11, i12);
        }

        @Override // a3.j0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Skeleton g() {
            return new Skeleton(b.this.f80787e);
        }

        @Override // a3.j0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(Skeleton skeleton) {
            skeleton.G(com.badlogic.gdx.graphics.b.f11522e);
            skeleton.J(1.0f, 1.0f);
            skeleton.M(null);
            skeleton.M(b.this.f80787e.m());
            skeleton.Q();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: pl.b$b, reason: collision with other inner class name */
    public class C0992b extends j0<com.esotericsoftware.spine.a> {
        public C0992b(int i11, int i12) {
            super(i11, i12);
        }

        @Override // a3.j0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public com.esotericsoftware.spine.a g() {
            return new com.esotericsoftware.spine.a(b.this.f80788f);
        }

        @Override // a3.j0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(com.esotericsoftware.spine.a aVar) {
            aVar.n();
            aVar.k();
        }
    }

    public b(k kVar, jl.i iVar, jl.a aVar) {
        this(kVar, iVar, aVar, 16, Integer.MAX_VALUE);
    }

    public void j() {
        com.badlogic.gdx.utils.a<pl.a> aVar = this.f80791i;
        pl.a[] aVarArr = aVar.f13178a;
        for (int i11 = aVar.f13179b - 1; i11 >= 0; i11--) {
            pl.a aVar2 = aVarArr[i11];
            com.badlogic.gdx.utils.a<a.g> t11 = aVar2.f80784w.t();
            int i12 = t11.f13179b;
            int i13 = 0;
            while (true) {
                if (i13 >= i12) {
                    d(aVar2);
                    break;
                } else if (t11.get(i13) != null) {
                    break;
                } else {
                    i13++;
                }
            }
        }
    }

    public com.badlogic.gdx.utils.a<pl.a> k() {
        return this.f80791i;
    }

    @Override // a3.j0
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public pl.a g() {
        pl.a aVar = new pl.a();
        aVar.f3(this.f80786d);
        return aVar;
    }

    @Override // a3.j0
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public pl.a h() {
        pl.a aVar = (pl.a) super.h();
        aVar.h3(this.f80789g.h());
        aVar.e3(this.f80790h.h());
        this.f80791i.a(aVar);
        return aVar;
    }

    @Override // a3.j0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void i(pl.a aVar) {
        aVar.j2();
        this.f80791i.C(aVar, true);
        this.f80789g.d(aVar.d3());
        this.f80790h.d(aVar.a3());
    }

    public b(k kVar, jl.i iVar, jl.a aVar, int i11, int i12) {
        super(i11, i12);
        this.f80786d = kVar;
        this.f80787e = iVar;
        this.f80788f = aVar;
        this.f80791i = new com.badlogic.gdx.utils.a<>(false, i11);
        this.f80789g = new a(i11, i12);
        this.f80790h = new C0992b(i11, i12);
    }
}
