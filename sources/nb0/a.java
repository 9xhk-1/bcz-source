package nb0;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import lb0.f;
import lb0.z;
import okhttp3.m;
import okhttp3.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a extends f.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.d f75043a;

    public a(com.google.gson.d dVar) {
        this.f75043a = dVar;
    }

    public static a f() {
        return g(new com.google.gson.d());
    }

    public static a g(com.google.gson.d dVar) {
        if (dVar != null) {
            return new a(dVar);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // lb0.f.a
    public f<?, m> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, z zVar) {
        return new b(this.f75043a, this.f75043a.p(bp.a.get(type)));
    }

    @Override // lb0.f.a
    public f<o, ?> d(Type type, Annotation[] annotationArr, z zVar) {
        return new c(this.f75043a, this.f75043a.p(bp.a.get(type)));
    }
}
