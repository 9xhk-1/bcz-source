package s1;

import a3.q;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial;
import com.badlogic.gdx.utils.a;
import com.badlogic.gdx.utils.l;
import java.util.Iterator;
import l2.s;
import s1.g.a;
import s1.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class g<P extends a> extends b<x1.e, P> {

    /* renamed from: b, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<l.b<String, d2.b>> f87103b;

    /* renamed from: c, reason: collision with root package name */
    public a f87104c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends r1.c<x1.e> {

        /* renamed from: b, reason: collision with root package name */
        public p.b f87105b;

        public a() {
            p.b bVar = new p.b();
            this.f87105b = bVar;
            Texture.TextureFilter textureFilter = Texture.TextureFilter.Linear;
            bVar.f87132g = textureFilter;
            bVar.f87131f = textureFilter;
            Texture.TextureWrap textureWrap = Texture.TextureWrap.Repeat;
            bVar.f87134i = textureWrap;
            bVar.f87133h = textureWrap;
        }
    }

    public g(e eVar) {
        super(eVar);
        this.f87103b = new com.badlogic.gdx.utils.a<>();
        this.f87104c = new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [V, d2.b] */
    @Override // s1.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.badlogic.gdx.utils.a<r1.a> a(String str, v1.a aVar, P p11) {
        com.badlogic.gdx.utils.a<r1.a> aVar2 = new com.badlogic.gdx.utils.a<>();
        ?? m11 = m(aVar, p11);
        if (m11 != 0) {
            l.b<String, d2.b> bVar = new l.b<>();
            bVar.f13394a = str;
            bVar.f13395b = m11;
            synchronized (this.f87103b) {
                this.f87103b.a(bVar);
            }
            p.b bVar2 = p11 != null ? p11.f87105b : this.f87104c.f87105b;
            a.b<ModelMaterial> it = m11.f47019d.iterator();
            while (it.hasNext()) {
                com.badlogic.gdx.utils.a<d2.i> aVar3 = it.next().f12153j;
                if (aVar3 != null) {
                    a.b<d2.i> it2 = aVar3.iterator();
                    while (it2.hasNext()) {
                        aVar2.a(new r1.a(it2.next().f47058b, Texture.class, bVar2));
                    }
                }
            }
        }
        return aVar2;
    }

    public x1.e h(v1.a aVar) {
        return j(aVar, new s.b(), null);
    }

    public x1.e i(v1.a aVar, s sVar) {
        return j(aVar, sVar, null);
    }

    public x1.e j(v1.a aVar, s sVar, P p11) {
        d2.b m11 = m(aVar, p11);
        if (m11 == null) {
            return null;
        }
        return new x1.e(m11, sVar);
    }

    public x1.e k(v1.a aVar, P p11) {
        return j(aVar, new s.b(), p11);
    }

    public d2.b l(v1.a aVar) {
        return m(aVar, null);
    }

    public abstract d2.b m(v1.a aVar, P p11);

    @Override // s1.b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public x1.e d(r1.e eVar, String str, v1.a aVar, P p11) {
        d2.b bVar;
        synchronized (this.f87103b) {
            int i11 = 0;
            bVar = null;
            while (true) {
                try {
                    com.badlogic.gdx.utils.a<l.b<String, d2.b>> aVar2 = this.f87103b;
                    if (i11 >= aVar2.f13179b) {
                        break;
                    }
                    if (aVar2.get(i11).f13394a.equals(str)) {
                        bVar = this.f87103b.get(i11).f13395b;
                        this.f87103b.A(i11);
                    }
                    i11++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (bVar == null) {
            return null;
        }
        x1.e eVar2 = new x1.e(bVar, new s.a(eVar));
        Iterator<q> it = eVar2.Z().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof Texture) {
                it.remove();
            }
        }
        return eVar2;
    }

    @Override // s1.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void c(r1.e eVar, String str, v1.a aVar, P p11) {
    }
}
