package s1;

import com.badlogic.gdx.scenes.scene2d.ui.q;
import com.badlogic.gdx.utils.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class l extends b<q, a> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends r1.c<q> {

        /* renamed from: b, reason: collision with root package name */
        public final String f87118b;

        /* renamed from: c, reason: collision with root package name */
        public final com.badlogic.gdx.utils.l<String, Object> f87119c;

        public a() {
            this(null, null);
        }

        public a(com.badlogic.gdx.utils.l<String, Object> lVar) {
            this(null, lVar);
        }

        public a(String str) {
            this(str, null);
        }

        public a(String str, com.badlogic.gdx.utils.l<String, Object> lVar) {
            this.f87118b = str;
            this.f87119c = lVar;
        }
    }

    public l(e eVar) {
        super(eVar);
    }

    @Override // s1.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.badlogic.gdx.utils.a<r1.a> a(String str, v1.a aVar, a aVar2) {
        String str2;
        com.badlogic.gdx.utils.a<r1.a> aVar3 = new com.badlogic.gdx.utils.a<>();
        if (aVar2 != null && (str2 = aVar2.f87118b) != null) {
            if (str2 != null) {
                aVar3.a(new r1.a(str2, com.badlogic.gdx.graphics.g2d.e.class));
            }
            return aVar3;
        }
        aVar3.a(new r1.a(aVar.D() + ".atlas", com.badlogic.gdx.graphics.g2d.e.class));
        return aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s1.b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public q d(r1.e eVar, String str, v1.a aVar, a aVar2) {
        String str2 = aVar.D() + ".atlas";
        com.badlogic.gdx.utils.l<String, Object> lVar = null;
        if (aVar2 != null) {
            String str3 = aVar2.f87118b;
            if (str3 != null) {
                str2 = str3;
            }
            com.badlogic.gdx.utils.l<String, Object> lVar2 = aVar2.f87119c;
            if (lVar2 != null) {
                lVar = lVar2;
            }
        }
        q i11 = i((com.badlogic.gdx.graphics.g2d.e) eVar.w0(str2, com.badlogic.gdx.graphics.g2d.e.class));
        if (lVar != null) {
            l.a<String, Object> it = lVar.g().iterator();
            while (it.hasNext()) {
                l.b next = it.next();
                i11.b((String) next.f13394a, next.f13395b);
            }
        }
        i11.f1(aVar);
        return i11;
    }

    public q i(com.badlogic.gdx.graphics.g2d.e eVar) {
        return new q(eVar);
    }

    @Override // s1.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void c(r1.e eVar, String str, v1.a aVar, a aVar2) {
    }
}
