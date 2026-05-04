package mb0;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import lb0.c;
import lb0.y;
import lb0.z;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class h extends c.a {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final rx.d f73090a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f73091b;

    public h(@Nullable rx.d dVar, boolean z11) {
        this.f73090a = dVar;
        this.f73091b = z11;
    }

    public static h d() {
        return new h(null, false);
    }

    public static h e() {
        return new h(null, true);
    }

    public static h f(rx.d dVar) {
        if (dVar != null) {
            return new h(dVar, false);
        }
        throw new NullPointerException("scheduler == null");
    }

    @Override // lb0.c.a
    @Nullable
    public lb0.c<?, ?> a(Type type, Annotation[] annotationArr, z zVar) {
        Type type2;
        boolean z11;
        boolean z12;
        Class<?> c11 = c.a.c(type);
        boolean z13 = c11 == rx.e.class;
        boolean z14 = c11 == rx.b.class;
        if (c11 != rx.c.class && !z13 && !z14) {
            return null;
        }
        if (z14) {
            return new g(Void.class, this.f73090a, this.f73091b, false, true, false, true);
        }
        if (!(type instanceof ParameterizedType)) {
            String str = z13 ? "Single" : "Observable";
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type b11 = c.a.b(0, (ParameterizedType) type);
        Class<?> c12 = c.a.c(b11);
        if (c12 == y.class) {
            if (!(b11 instanceof ParameterizedType)) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            type2 = c.a.b(0, (ParameterizedType) b11);
            z12 = false;
            z11 = false;
        } else if (c12 != e.class) {
            type2 = b11;
            z11 = true;
            z12 = false;
        } else {
            if (!(b11 instanceof ParameterizedType)) {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            type2 = c.a.b(0, (ParameterizedType) b11);
            z12 = true;
            z11 = false;
        }
        return new g(type2, this.f73090a, this.f73091b, z12, z11, z13, false);
    }
}
