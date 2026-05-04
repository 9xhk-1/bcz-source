package xo;

import com.google.gson.s;
import com.google.gson.stream.JsonToken;
import com.google.gson.t;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a<E> extends s<Object> {

    /* renamed from: c, reason: collision with root package name */
    public static final t f98155c = new C1326a();

    /* renamed from: a, reason: collision with root package name */
    public final Class<E> f98156a;

    /* renamed from: b, reason: collision with root package name */
    public final s<E> f98157b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: xo.a$a, reason: collision with other inner class name */
    public class C1326a implements t {
        @Override // com.google.gson.t
        public <T> s<T> a(com.google.gson.d dVar, bp.a<T> aVar) {
            Type type = aVar.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type g11 = com.google.gson.internal.b.g(type);
            return new a(dVar, dVar.p(bp.a.get(g11)), com.google.gson.internal.b.k(g11));
        }
    }

    public a(com.google.gson.d dVar, s<E> sVar, Class<E> cls) {
        this.f98157b = new m(dVar, sVar, cls);
        this.f98156a = cls;
    }

    @Override // com.google.gson.s
    public Object e(cp.a aVar) throws IOException {
        if (aVar.k0() == JsonToken.NULL) {
            aVar.d0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.E()) {
            arrayList.add(this.f98157b.e(aVar));
        }
        aVar.k();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f98156a, size);
        for (int i11 = 0; i11 < size; i11++) {
            Array.set(newInstance, i11, arrayList.get(i11));
        }
        return newInstance;
    }

    @Override // com.google.gson.s
    public void i(cp.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.L();
            return;
        }
        cVar.e();
        int length = Array.getLength(obj);
        for (int i11 = 0; i11 < length; i11++) {
            this.f98157b.i(cVar, Array.get(obj, i11));
        }
        cVar.j();
    }
}
