package pl;

import a3.d0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d extends s1.b<jl.i, a> {

    /* renamed from: b, reason: collision with root package name */
    public jl.i f80803b;

    public d(s1.e eVar) {
        super(eVar);
    }

    @Override // s1.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.badlogic.gdx.utils.a<r1.a> a(String str, v1.a aVar, @d0 a aVar2) {
        if (aVar2 == null || aVar2.f80805c != null) {
            return null;
        }
        com.badlogic.gdx.utils.a<r1.a> aVar3 = new com.badlogic.gdx.utils.a<>();
        aVar3.a(new r1.a(aVar2.f80804b, com.badlogic.gdx.graphics.g2d.e.class));
        return aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [ol.c] */
    @Override // s1.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void c(r1.e eVar, String str, v1.a aVar, @d0 a aVar2) {
        float f11;
        ol.a aVar3 = null;
        if (aVar2 != null) {
            f11 = aVar2.f80806d;
            ?? r22 = aVar2.f80805c;
            if (r22 != 0) {
                aVar3 = r22;
            } else {
                String str2 = aVar2.f80804b;
                if (str2 != null) {
                    aVar3 = new ol.a((com.badlogic.gdx.graphics.g2d.e) eVar.w0(str2, com.badlogic.gdx.graphics.g2d.e.class));
                }
            }
        } else {
            f11 = 1.0f;
        }
        if (aVar3 == null) {
            aVar3 = new ol.a((com.badlogic.gdx.graphics.g2d.e) eVar.w0(aVar.D() + ".atlas", com.badlogic.gdx.graphics.g2d.e.class));
        }
        if (aVar.m().equalsIgnoreCase("skel")) {
            com.esotericsoftware.spine.f fVar = new com.esotericsoftware.spine.f(aVar3);
            fVar.d(f11);
            this.f80803b = fVar.c(aVar);
        } else {
            com.esotericsoftware.spine.g gVar = new com.esotericsoftware.spine.g(aVar3);
            gVar.d(f11);
            this.f80803b = gVar.c(aVar);
        }
    }

    @Override // s1.b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public jl.i d(r1.e eVar, String str, v1.a aVar, @d0 a aVar2) {
        jl.i iVar = this.f80803b;
        this.f80803b = null;
        return iVar;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends r1.c<jl.i> {

        /* renamed from: b, reason: collision with root package name */
        public String f80804b;

        /* renamed from: c, reason: collision with root package name */
        public ol.c f80805c;

        /* renamed from: d, reason: collision with root package name */
        public float f80806d;

        public a() {
            this.f80806d = 1.0f;
        }

        public a(String str) {
            this.f80806d = 1.0f;
            this.f80804b = str;
        }

        public a(String str, float f11) {
            this.f80804b = str;
            this.f80806d = f11;
        }

        public a(ol.c cVar) {
            this.f80806d = 1.0f;
            this.f80805c = cVar;
        }

        public a(ol.c cVar, float f11) {
            this.f80805c = cVar;
            this.f80806d = f11;
        }
    }
}
