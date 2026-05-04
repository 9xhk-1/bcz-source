package s1;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.e;
import com.badlogic.gdx.utils.a;
import s1.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class o extends n<com.badlogic.gdx.graphics.g2d.e, a> {

    /* renamed from: b, reason: collision with root package name */
    public e.c f87121b;

    public o(e eVar) {
        super(eVar);
    }

    @Override // s1.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.badlogic.gdx.utils.a<r1.a> a(String str, v1.a aVar, a aVar2) {
        v1.a B = aVar.B();
        if (aVar2 != null) {
            this.f87121b = new e.c(aVar, B, aVar2.f87122b);
        } else {
            this.f87121b = new e.c(aVar, B, false);
        }
        com.badlogic.gdx.utils.a<r1.a> aVar3 = new com.badlogic.gdx.utils.a<>();
        a.b<e.c.p> it = this.f87121b.a().iterator();
        while (it.hasNext()) {
            e.c.p next = it.next();
            p.b bVar = new p.b();
            bVar.f87127b = next.f12122g;
            bVar.f87128c = next.f12121f;
            bVar.f87131f = next.f12123h;
            bVar.f87132g = next.f12124i;
            aVar3.a(new r1.a(next.f12117b, Texture.class, bVar));
        }
        return aVar3;
    }

    @Override // s1.n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.badlogic.gdx.graphics.g2d.e c(r1.e eVar, String str, v1.a aVar, a aVar2) {
        a.b<e.c.p> it = this.f87121b.a().iterator();
        while (it.hasNext()) {
            e.c.p next = it.next();
            next.f12118c = (Texture) eVar.w0(next.f12117b.C().replaceAll("\\\\", "/"), Texture.class);
        }
        com.badlogic.gdx.graphics.g2d.e eVar2 = new com.badlogic.gdx.graphics.g2d.e(this.f87121b);
        this.f87121b = null;
        return eVar2;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends r1.c<com.badlogic.gdx.graphics.g2d.e> {

        /* renamed from: b, reason: collision with root package name */
        public boolean f87122b;

        public a() {
            this.f87122b = false;
        }

        public a(boolean z11) {
            this.f87122b = z11;
        }
    }
}
