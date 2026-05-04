package z0;

import com.airbnb.lottie.model.DocumentData;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class o extends g<DocumentData> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends k1.j<DocumentData> {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k1.b f100521d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ k1.j f100522e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ DocumentData f100523f;

        public a(k1.b bVar, k1.j jVar, DocumentData documentData) {
            this.f100521d = bVar;
            this.f100522e = jVar;
            this.f100523f = documentData;
        }

        @Override // k1.j
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public DocumentData a(k1.b<DocumentData> bVar) {
            this.f100521d.h(bVar.f(), bVar.a(), bVar.g().f9995a, bVar.b().f9995a, bVar.d(), bVar.c(), bVar.e());
            String str = (String) this.f100522e.a(this.f100521d);
            DocumentData b11 = bVar.c() == 1.0f ? bVar.b() : bVar.g();
            this.f100523f.a(str, b11.f9996b, b11.f9997c, b11.f9998d, b11.f9999e, b11.f10000f, b11.f10001g, b11.f10002h, b11.f10003i, b11.f10004j, b11.f10005k);
            return this.f100523f;
        }
    }

    public o(List<k1.a<DocumentData>> list) {
        super(list);
    }

    @Override // z0.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public DocumentData i(k1.a<DocumentData> aVar, float f11) {
        DocumentData documentData;
        k1.j<A> jVar = this.f100480e;
        if (jVar == 0) {
            return (f11 != 1.0f || (documentData = aVar.f64877c) == null) ? aVar.f64876b : documentData;
        }
        float f12 = aVar.f64881g;
        Float f13 = aVar.f64882h;
        float floatValue = f13 == null ? Float.MAX_VALUE : f13.floatValue();
        DocumentData documentData2 = aVar.f64876b;
        DocumentData documentData3 = documentData2;
        DocumentData documentData4 = aVar.f64877c;
        return (DocumentData) jVar.b(f12, floatValue, documentData3, documentData4 == null ? documentData2 : documentData4, f11, d(), f());
    }

    public void q(k1.j<String> jVar) {
        super.n(new a(new k1.b(), jVar, new DocumentData()));
    }
}
