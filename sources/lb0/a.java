package lb0;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import lb0.f;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a extends f.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f70845a = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: lb0.a$a, reason: collision with other inner class name */
    public static final class C0850a implements lb0.f<okhttp3.o, okhttp3.o> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0850a f70846a = new C0850a();

        @Override // lb0.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public okhttp3.o convert(okhttp3.o oVar) throws IOException {
            try {
                return d0.a(oVar);
            } finally {
                oVar.close();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements lb0.f<Object, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f70849a = new d();

        @Override // lb0.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements lb0.f<okhttp3.o, g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f70850a = new e();

        @Override // lb0.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g2 convert(okhttp3.o oVar) {
            oVar.close();
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements lb0.f<okhttp3.o, Void> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f70851a = new f();

        @Override // lb0.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void convert(okhttp3.o oVar) {
            oVar.close();
            return null;
        }
    }

    @Override // lb0.f.a
    @Nullable
    public lb0.f<?, okhttp3.m> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, z zVar) {
        if (okhttp3.m.class.isAssignableFrom(d0.h(type))) {
            return b.f70847a;
        }
        return null;
    }

    @Override // lb0.f.a
    @Nullable
    public lb0.f<okhttp3.o, ?> d(Type type, Annotation[] annotationArr, z zVar) {
        if (type == okhttp3.o.class) {
            return d0.l(annotationArr, ob0.w.class) ? c.f70848a : C0850a.f70846a;
        }
        if (type == Void.class) {
            return f.f70851a;
        }
        if (!this.f70845a || type != g2.class) {
            return null;
        }
        try {
            return e.f70850a;
        } catch (NoClassDefFoundError unused) {
            this.f70845a = false;
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements lb0.f<okhttp3.m, okhttp3.m> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f70847a = new b();

        @Override // lb0.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public okhttp3.m convert(okhttp3.m mVar) {
            return mVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements lb0.f<okhttp3.o, okhttp3.o> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f70848a = new c();

        @Override // lb0.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public okhttp3.o convert(okhttp3.o oVar) {
            return oVar;
        }
    }
}
