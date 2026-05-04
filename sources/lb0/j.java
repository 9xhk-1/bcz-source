package lb0;

import com.badlogic.gdx.Net;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import lb0.d0;
import t50.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class j<ResponseT, ReturnT> extends a0<ReturnT> {

    /* renamed from: a, reason: collision with root package name */
    public final x f70882a;

    /* renamed from: b, reason: collision with root package name */
    public final b.a f70883b;

    /* renamed from: c, reason: collision with root package name */
    public final f<okhttp3.o, ResponseT> f70884c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<ResponseT, ReturnT> extends j<ResponseT, ReturnT> {

        /* renamed from: d, reason: collision with root package name */
        public final lb0.c<ResponseT, ReturnT> f70885d;

        public a(x xVar, b.a aVar, f<okhttp3.o, ResponseT> fVar, lb0.c<ResponseT, ReturnT> cVar) {
            super(xVar, aVar, fVar);
            this.f70885d = cVar;
        }

        @Override // lb0.j
        public ReturnT c(lb0.b<ResponseT> bVar, Object[] objArr) {
            return this.f70885d.a(bVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<ResponseT> extends j<ResponseT, Object> {

        /* renamed from: d, reason: collision with root package name */
        public final lb0.c<ResponseT, lb0.b<ResponseT>> f70886d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f70887e;

        public b(x xVar, b.a aVar, f<okhttp3.o, ResponseT> fVar, lb0.c<ResponseT, lb0.b<ResponseT>> cVar, boolean z11) {
            super(xVar, aVar, fVar);
            this.f70886d = cVar;
            this.f70887e = z11;
        }

        @Override // lb0.j
        public Object c(lb0.b<ResponseT> bVar, Object[] objArr) {
            lb0.b<ResponseT> a11 = this.f70886d.a(bVar);
            j00.c cVar = (j00.c) objArr[objArr.length - 1];
            try {
                return this.f70887e ? l.b(a11, cVar) : l.a(a11, cVar);
            } catch (Exception e11) {
                return l.e(e11, cVar);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<ResponseT> extends j<ResponseT, Object> {

        /* renamed from: d, reason: collision with root package name */
        public final lb0.c<ResponseT, lb0.b<ResponseT>> f70888d;

        public c(x xVar, b.a aVar, f<okhttp3.o, ResponseT> fVar, lb0.c<ResponseT, lb0.b<ResponseT>> cVar) {
            super(xVar, aVar, fVar);
            this.f70888d = cVar;
        }

        @Override // lb0.j
        public Object c(lb0.b<ResponseT> bVar, Object[] objArr) {
            lb0.b<ResponseT> a11 = this.f70888d.a(bVar);
            j00.c cVar = (j00.c) objArr[objArr.length - 1];
            try {
                return l.c(a11, cVar);
            } catch (Exception e11) {
                return l.e(e11, cVar);
            }
        }
    }

    public j(x xVar, b.a aVar, f<okhttp3.o, ResponseT> fVar) {
        this.f70882a = xVar;
        this.f70883b = aVar;
        this.f70884c = fVar;
    }

    public static <ResponseT, ReturnT> lb0.c<ResponseT, ReturnT> d(z zVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (lb0.c<ResponseT, ReturnT>) zVar.b(type, annotationArr);
        } catch (RuntimeException e11) {
            throw d0.n(method, e11, "Unable to create call adapter for %s", type);
        }
    }

    public static <ResponseT> f<okhttp3.o, ResponseT> e(z zVar, Method method, Type type) {
        try {
            return zVar.n(type, method.getAnnotations());
        } catch (RuntimeException e11) {
            throw d0.n(method, e11, "Unable to create converter for %s", type);
        }
    }

    public static <ResponseT, ReturnT> j<ResponseT, ReturnT> f(z zVar, Method method, x xVar) {
        Type genericReturnType;
        boolean z11;
        boolean z12 = xVar.f70995k;
        Annotation[] annotations = method.getAnnotations();
        if (z12) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f11 = d0.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (d0.h(f11) == y.class && (f11 instanceof ParameterizedType)) {
                f11 = d0.g(0, (ParameterizedType) f11);
                z11 = true;
            } else {
                z11 = false;
            }
            genericReturnType = new d0.b(null, lb0.b.class, f11);
            annotations = c0.a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z11 = false;
        }
        lb0.c d11 = d(zVar, method, genericReturnType, annotations);
        Type b11 = d11.b();
        if (b11 == okhttp3.n.class) {
            throw d0.m(method, "'" + d0.h(b11).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (b11 == y.class) {
            throw d0.m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (xVar.f70987c.equals(Net.a.f11462a) && !Void.class.equals(b11)) {
            throw d0.m(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        f e11 = e(zVar, method, b11);
        b.a aVar = zVar.f71026b;
        return !z12 ? new a(xVar, aVar, e11, d11) : z11 ? new c(xVar, aVar, e11, d11) : new b(xVar, aVar, e11, d11, false);
    }

    @Override // lb0.a0
    @Nullable
    public final ReturnT a(Object[] objArr) {
        return c(new m(this.f70882a, objArr, this.f70883b, this.f70884c), objArr);
    }

    @Nullable
    public abstract ReturnT c(lb0.b<ResponseT> bVar, Object[] objArr);
}
