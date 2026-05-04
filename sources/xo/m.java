package xo;

import com.google.gson.s;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import xo.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class m<T> extends s<T> {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.d f98220a;

    /* renamed from: b, reason: collision with root package name */
    public final s<T> f98221b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f98222c;

    public m(com.google.gson.d dVar, s<T> sVar, Type type) {
        this.f98220a = dVar;
        this.f98221b = sVar;
        this.f98222c = type;
    }

    @Override // com.google.gson.s
    public T e(cp.a aVar) throws IOException {
        return this.f98221b.e(aVar);
    }

    @Override // com.google.gson.s
    public void i(cp.c cVar, T t11) throws IOException {
        s<T> sVar = this.f98221b;
        Type j11 = j(this.f98222c, t11);
        if (j11 != this.f98222c) {
            sVar = this.f98220a.p(bp.a.get(j11));
            if (sVar instanceof k.b) {
                s<T> sVar2 = this.f98221b;
                if (!(sVar2 instanceof k.b)) {
                    sVar = sVar2;
                }
            }
        }
        sVar.i(cVar, t11);
    }

    public final Type j(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }
}
