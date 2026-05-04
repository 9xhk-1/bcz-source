package xo;

import com.google.gson.s;
import com.google.gson.stream.JsonToken;
import com.google.gson.t;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.internal.c f98158a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<E> extends s<Collection<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final s<E> f98159a;

        /* renamed from: b, reason: collision with root package name */
        public final com.google.gson.internal.h<? extends Collection<E>> f98160b;

        public a(com.google.gson.d dVar, Type type, s<E> sVar, com.google.gson.internal.h<? extends Collection<E>> hVar) {
            this.f98159a = new m(dVar, sVar, type);
            this.f98160b = hVar;
        }

        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Collection<E> e(cp.a aVar) throws IOException {
            if (aVar.k0() == JsonToken.NULL) {
                aVar.d0();
                return null;
            }
            Collection<E> a11 = this.f98160b.a();
            aVar.a();
            while (aVar.E()) {
                a11.add(this.f98159a.e(aVar));
            }
            aVar.k();
            return a11;
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.L();
                return;
            }
            cVar.e();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f98159a.i(cVar, it.next());
            }
            cVar.j();
        }
    }

    public b(com.google.gson.internal.c cVar) {
        this.f98158a = cVar;
    }

    @Override // com.google.gson.t
    public <T> s<T> a(com.google.gson.d dVar, bp.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type h11 = com.google.gson.internal.b.h(type, rawType);
        return new a(dVar, h11, dVar.p(bp.a.get(h11)), this.f98158a.a(aVar));
    }
}
