package s1;

import n2.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class k extends b<w, a> {

    /* renamed from: b, reason: collision with root package name */
    public String f87111b;

    /* renamed from: c, reason: collision with root package name */
    public String f87112c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends r1.c<w> {

        /* renamed from: b, reason: collision with root package name */
        public String f87113b;

        /* renamed from: c, reason: collision with root package name */
        public String f87114c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f87115d = true;

        /* renamed from: e, reason: collision with root package name */
        public String f87116e;

        /* renamed from: f, reason: collision with root package name */
        public String f87117f;
    }

    public k(e eVar) {
        super(eVar);
        this.f87111b = ".vert";
        this.f87112c = ".frag";
    }

    @Override // s1.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.badlogic.gdx.utils.a<r1.a> a(String str, v1.a aVar, a aVar2) {
        return null;
    }

    @Override // s1.b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public w d(r1.e eVar, String str, v1.a aVar, a aVar2) {
        String str2;
        String str3 = null;
        if (aVar2 != null) {
            String str4 = aVar2.f87113b;
            if (str4 == null) {
                str4 = null;
            }
            str2 = aVar2.f87114c;
            if (str2 == null) {
                str2 = null;
            }
            str3 = str4;
        } else {
            str2 = null;
        }
        if (str3 == null && str.endsWith(this.f87112c)) {
            str3 = str.substring(0, str.length() - this.f87112c.length()) + this.f87111b;
        }
        if (str2 == null && str.endsWith(this.f87111b)) {
            str2 = str.substring(0, str.length() - this.f87111b.length()) + this.f87112c;
        }
        v1.a b11 = str3 == null ? aVar : b(str3);
        if (str2 != null) {
            aVar = b(str2);
        }
        String I = b11.I();
        String I2 = b11.equals(aVar) ? I : aVar.I();
        if (aVar2 != null) {
            if (aVar2.f87116e != null) {
                I = aVar2.f87116e + I;
            }
            if (aVar2.f87117f != null) {
                I2 = aVar2.f87117f + I2;
            }
        }
        w wVar = new w(I, I2);
        if ((aVar2 == null || aVar2.f87115d) && !wVar.q1()) {
            eVar.j1().c("ShaderProgram " + str + " failed to compile:\n" + wVar.f1());
        }
        return wVar;
    }

    public k(e eVar, String str, String str2) {
        super(eVar);
        this.f87111b = str;
        this.f87112c = str2;
    }

    @Override // s1.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void c(r1.e eVar, String str, v1.a aVar, a aVar2) {
    }
}
