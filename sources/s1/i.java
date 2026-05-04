package s1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i extends n<w1.d, a> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends r1.c<w1.d> {

        /* renamed from: b, reason: collision with root package name */
        public String f87107b;

        /* renamed from: c, reason: collision with root package name */
        public String f87108c;

        /* renamed from: d, reason: collision with root package name */
        public v1.a f87109d;
    }

    public i(e eVar) {
        super(eVar);
    }

    @Override // s1.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.badlogic.gdx.utils.a<r1.a> a(String str, v1.a aVar, a aVar2) {
        if (aVar2 == null || aVar2.f87107b == null) {
            return null;
        }
        com.badlogic.gdx.utils.a<r1.a> aVar3 = new com.badlogic.gdx.utils.a<>();
        aVar3.a(new r1.a(aVar2.f87107b, com.badlogic.gdx.graphics.g2d.e.class));
        return aVar3;
    }

    @Override // s1.n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public w1.d c(r1.e eVar, String str, v1.a aVar, a aVar2) {
        v1.a aVar3;
        String str2;
        w1.d dVar = new w1.d();
        if (aVar2 != null && (str2 = aVar2.f87107b) != null) {
            dVar.n0(aVar, (com.badlogic.gdx.graphics.g2d.e) eVar.w0(str2, com.badlogic.gdx.graphics.g2d.e.class), aVar2.f87108c);
            return dVar;
        }
        if (aVar2 == null || (aVar3 = aVar2.f87109d) == null) {
            dVar.w0(aVar, aVar.B());
            return dVar;
        }
        dVar.w0(aVar, aVar3);
        return dVar;
    }
}
