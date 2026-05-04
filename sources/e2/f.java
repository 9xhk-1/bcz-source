package e2;

import com.badlogic.gdx.utils.JsonWriter;
import com.badlogic.gdx.utils.a;
import com.badlogic.gdx.utils.l;
import e2.i;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f extends s1.b<e, a> {

    /* renamed from: b, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<l.b<String, i<e>>> f48400b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends r1.c<e> {

        /* renamed from: b, reason: collision with root package name */
        public com.badlogic.gdx.utils.a<f2.d<?>> f48401b;

        public a(com.badlogic.gdx.utils.a<f2.d<?>> aVar) {
            this.f48401b = aVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends r1.c<e> {

        /* renamed from: b, reason: collision with root package name */
        public com.badlogic.gdx.utils.a<f2.d<?>> f48402b;

        /* renamed from: c, reason: collision with root package name */
        public v1.a f48403c;

        /* renamed from: d, reason: collision with root package name */
        public r1.e f48404d;

        /* renamed from: e, reason: collision with root package name */
        public JsonWriter.OutputType f48405e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f48406f;

        public b(v1.a aVar, r1.e eVar, com.badlogic.gdx.utils.a<f2.d<?>> aVar2) {
            this(aVar, eVar, aVar2, JsonWriter.OutputType.minimal, false);
        }

        public b(v1.a aVar, r1.e eVar, com.badlogic.gdx.utils.a<f2.d<?>> aVar2, JsonWriter.OutputType outputType, boolean z11) {
            this.f48402b = aVar2;
            this.f48403c = aVar;
            this.f48404d = eVar;
            this.f48405e = outputType;
            this.f48406f = z11;
        }
    }

    public f(s1.e eVar) {
        super(eVar);
        this.f48400b = new com.badlogic.gdx.utils.a<>();
    }

    public final <T> T f(com.badlogic.gdx.utils.a<?> aVar, Class<T> cls) {
        a.b<?> it = aVar.iterator();
        while (it.hasNext()) {
            T t11 = (T) it.next();
            if (g3.c.y(cls, t11.getClass())) {
                return t11;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [V, e2.i] */
    @Override // s1.a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public com.badlogic.gdx.utils.a<r1.a> a(String str, v1.a aVar, a aVar2) {
        com.badlogic.gdx.utils.a<i.a> e11;
        ?? r02 = (i) new com.badlogic.gdx.utils.f().m(i.class, aVar);
        synchronized (this.f48400b) {
            l.b<String, i<e>> bVar = new l.b<>();
            bVar.f13394a = str;
            bVar.f13395b = r02;
            this.f48400b.a(bVar);
            e11 = r02.e();
        }
        com.badlogic.gdx.utils.a<r1.a> aVar3 = new com.badlogic.gdx.utils.a<>();
        a.b<i.a> it = e11.iterator();
        while (it.hasNext()) {
            i.a next = it.next();
            if (!b(next.f48423a).l()) {
                next.f48423a = aVar.B().a(q1.g.f81382e.a(next.f48423a).z()).C();
            }
            Class<T> cls = next.f48424b;
            if (cls == e.class) {
                aVar3.a(new r1.a(next.f48423a, cls, aVar2));
            } else {
                aVar3.a(new r1.a(next.f48423a, cls));
            }
        }
        return aVar3;
    }

    @Override // s1.b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public e d(r1.e eVar, String str, v1.a aVar, a aVar2) {
        i<e> iVar;
        synchronized (this.f48400b) {
            int i11 = 0;
            while (true) {
                try {
                    com.badlogic.gdx.utils.a<l.b<String, i<e>>> aVar3 = this.f48400b;
                    if (i11 >= aVar3.f13179b) {
                        iVar = null;
                        break;
                    }
                    l.b<String, i<e>> bVar = aVar3.get(i11);
                    if (bVar.f13394a.equals(str)) {
                        iVar = bVar.f13395b;
                        this.f48400b.A(i11);
                        break;
                    }
                    i11++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        iVar.f48422e.b(eVar, iVar);
        if (aVar2 != null) {
            com.badlogic.gdx.utils.a<f2.d<?>> aVar4 = aVar2.f48401b;
            if (aVar4 != null) {
                a.b<f2.d<?>> it = aVar4.iterator();
                while (it.hasNext()) {
                    it.next().b(eVar, iVar);
                }
            }
            iVar.f48422e.V0(aVar2.f48401b);
        }
        return iVar.f48422e;
    }

    public void j(e eVar, b bVar) throws IOException {
        i iVar = new i(eVar);
        eVar.o(bVar.f48404d, iVar);
        com.badlogic.gdx.utils.a<f2.d<?>> aVar = bVar.f48402b;
        if (aVar != null) {
            a.b<f2.d<?>> it = aVar.iterator();
            while (it.hasNext()) {
                f2.d<?> next = it.next();
                a.b<c> it2 = eVar.Z().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (it2.next().f48379d.J0(next)) {
                        next.o(bVar.f48404d, iVar);
                        break;
                    }
                }
            }
        }
        com.badlogic.gdx.utils.f fVar = new com.badlogic.gdx.utils.f(bVar.f48405e);
        if (!bVar.f48406f) {
            fVar.n0(iVar, bVar.f48403c);
        } else {
            bVar.f48403c.X(fVar.x(iVar), false);
        }
    }

    @Override // s1.b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(r1.e eVar, String str, v1.a aVar, a aVar2) {
    }
}
