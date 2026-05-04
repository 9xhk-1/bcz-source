package com.badlogic.gdx.scenes.scene2d.ui;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final k f12900a = new k(0.0f);

    /* renamed from: b, reason: collision with root package name */
    public static c0 f12901b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static c0 f12902c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static c0 f12903d = new d();

    /* renamed from: e, reason: collision with root package name */
    public static c0 f12904e = new e();

    /* renamed from: f, reason: collision with root package name */
    public static c0 f12905f = new f();

    /* renamed from: g, reason: collision with root package name */
    public static c0 f12906g = new g();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends c0 {

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ com.badlogic.gdx.scenes.scene2d.a f12907h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ float f12908i;

        public a(com.badlogic.gdx.scenes.scene2d.a aVar, float f11) {
            this.f12907h = aVar;
            this.f12908i = f11;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.c0
        public float b(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            return this.f12907h.v1() * this.f12908i;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends c0 {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.badlogic.gdx.scenes.scene2d.ui.c0
        public float b(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            if (aVar instanceof z2.l) {
                return ((z2.l) aVar).b();
            }
            if (aVar == 0) {
                return 0.0f;
            }
            return aVar.J1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends c0 {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.badlogic.gdx.scenes.scene2d.ui.c0
        public float b(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            if (aVar instanceof z2.l) {
                return ((z2.l) aVar).o();
            }
            if (aVar == 0) {
                return 0.0f;
            }
            return aVar.v1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends c0 {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.badlogic.gdx.scenes.scene2d.ui.c0
        public float b(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            if (aVar instanceof z2.l) {
                return ((z2.l) aVar).n0();
            }
            if (aVar == 0) {
                return 0.0f;
            }
            return aVar.J1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends c0 {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.badlogic.gdx.scenes.scene2d.ui.c0
        public float b(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            if (aVar instanceof z2.l) {
                return ((z2.l) aVar).R();
            }
            if (aVar == 0) {
                return 0.0f;
            }
            return aVar.v1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends c0 {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.badlogic.gdx.scenes.scene2d.ui.c0
        public float b(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            if (aVar instanceof z2.l) {
                return ((z2.l) aVar).w0();
            }
            if (aVar == 0) {
                return 0.0f;
            }
            return aVar.J1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends c0 {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.badlogic.gdx.scenes.scene2d.ui.c0
        public float b(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            if (aVar instanceof z2.l) {
                return ((z2.l) aVar).V0();
            }
            if (aVar == 0) {
                return 0.0f;
            }
            return aVar.v1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h extends c0 {

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f12909h;

        public h(float f11) {
            this.f12909h = f11;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.c0
        public float b(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            return aVar.J1() * this.f12909h;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i extends c0 {

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f12910h;

        public i(float f11) {
            this.f12910h = f11;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.c0
        public float b(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            return aVar.v1() * this.f12910h;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j extends c0 {

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ com.badlogic.gdx.scenes.scene2d.a f12911h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ float f12912i;

        public j(com.badlogic.gdx.scenes.scene2d.a aVar, float f11) {
            this.f12911h = aVar;
            this.f12912i = f11;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.c0
        public float b(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            return this.f12911h.J1() * this.f12912i;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k extends c0 {

        /* renamed from: i, reason: collision with root package name */
        public static final k[] f12913i = new k[111];

        /* renamed from: h, reason: collision with root package name */
        public final float f12914h;

        public k(float f11) {
            this.f12914h = f11;
        }

        public static k g(float f11) {
            if (f11 == 0.0f) {
                return c0.f12900a;
            }
            if (f11 >= -10.0f && f11 <= 100.0f) {
                int i11 = (int) f11;
                if (f11 == i11) {
                    k[] kVarArr = f12913i;
                    int i12 = i11 + 10;
                    k kVar = kVarArr[i12];
                    if (kVar != null) {
                        return kVar;
                    }
                    k kVar2 = new k(f11);
                    kVarArr[i12] = kVar2;
                    return kVar2;
                }
            }
            return new k(f11);
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.c0
        public float b(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            return this.f12914h;
        }

        public String toString() {
            return Float.toString(this.f12914h);
        }
    }

    public static c0 c(float f11) {
        return new i(f11);
    }

    public static c0 d(float f11, com.badlogic.gdx.scenes.scene2d.a aVar) {
        if (aVar != null) {
            return new a(aVar, f11);
        }
        throw new IllegalArgumentException("actor cannot be null.");
    }

    public static c0 e(float f11) {
        return new h(f11);
    }

    public static c0 f(float f11, com.badlogic.gdx.scenes.scene2d.a aVar) {
        if (aVar != null) {
            return new j(aVar, f11);
        }
        throw new IllegalArgumentException("actor cannot be null.");
    }

    public float a() {
        return b(null);
    }

    public abstract float b(@a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar);
}
