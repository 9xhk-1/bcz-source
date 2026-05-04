package wb0;

import rx.exceptions.OnErrorNotImplementedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final C1291m f96135a = new C1291m();

    /* JADX INFO: Add missing generic type declarations: [T4, T5, T6, R, T7, T8, T9, T1, T2, T3] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<R, T1, T2, T3, T4, T5, T6, T7, T8, T9> implements x<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.j f96136a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f96137b;

        public a(wb0.j jVar, Object obj) {
            this.f96136a = jVar;
            this.f96137b = obj;
        }

        @Override // wb0.x
        public R e(T1 t12, T2 t22, T3 t32, T4 t42, T5 t52, T6 t62, T7 t72, T8 t82, T9 t92) {
            this.f96136a.e(t12, t22, t32, t42, t52, t62, t72, t82, t92);
            return (R) this.f96137b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<R> implements y<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.l f96138a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f96139b;

        public b(wb0.l lVar, Object obj) {
            this.f96138a = lVar;
            this.f96139b = obj;
        }

        @Override // wb0.y
        public R call(Object... objArr) {
            this.f96138a.call(objArr);
            return (R) this.f96139b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<R> implements o<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.a f96140a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f96141b;

        public c(wb0.a aVar, Object obj) {
            this.f96140a = aVar;
            this.f96141b = obj;
        }

        @Override // wb0.o, java.util.concurrent.Callable
        public R call() {
            this.f96140a.call();
            return (R) this.f96141b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T1] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<R, T1> implements p<T1, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.b f96142a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f96143b;

        public d(wb0.b bVar, Object obj) {
            this.f96142a = bVar;
            this.f96143b = obj;
        }

        @Override // wb0.p
        public R call(T1 t12) {
            this.f96142a.call(t12);
            return (R) this.f96143b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T1, T2] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e<R, T1, T2> implements q<T1, T2, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.c f96144a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f96145b;

        public e(wb0.c cVar, Object obj) {
            this.f96144a = cVar;
            this.f96145b = obj;
        }

        @Override // wb0.q
        public R call(T1 t12, T2 t22) {
            this.f96144a.call(t12, t22);
            return (R) this.f96145b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T1, T2, T3] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f<R, T1, T2, T3> implements r<T1, T2, T3, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.d f96146a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f96147b;

        public f(wb0.d dVar, Object obj) {
            this.f96146a = dVar;
            this.f96147b = obj;
        }

        @Override // wb0.r
        public R i(T1 t12, T2 t22, T3 t32) {
            this.f96146a.i(t12, t22, t32);
            return (R) this.f96147b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T4, R, T1, T2, T3] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g<R, T1, T2, T3, T4> implements s<T1, T2, T3, T4, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.e f96148a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f96149b;

        public g(wb0.e eVar, Object obj) {
            this.f96148a = eVar;
            this.f96149b = obj;
        }

        @Override // wb0.s
        public R k(T1 t12, T2 t22, T3 t32, T4 t42) {
            this.f96148a.k(t12, t22, t32, t42);
            return (R) this.f96149b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T4, T5, R, T1, T2, T3] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h<R, T1, T2, T3, T4, T5> implements t<T1, T2, T3, T4, T5, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.f f96150a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f96151b;

        public h(wb0.f fVar, Object obj) {
            this.f96150a = fVar;
            this.f96151b = obj;
        }

        @Override // wb0.t
        public R c(T1 t12, T2 t22, T3 t32, T4 t42, T5 t52) {
            this.f96150a.c(t12, t22, t32, t42, t52);
            return (R) this.f96151b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T4, T5, T6, R, T1, T2, T3] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i<R, T1, T2, T3, T4, T5, T6> implements u<T1, T2, T3, T4, T5, T6, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.g f96152a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f96153b;

        public i(wb0.g gVar, Object obj) {
            this.f96152a = gVar;
            this.f96153b = obj;
        }

        @Override // wb0.u
        public R g(T1 t12, T2 t22, T3 t32, T4 t42, T5 t52, T6 t62) {
            this.f96152a.g(t12, t22, t32, t42, t52, t62);
            return (R) this.f96153b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T4, T5, T6, R, T7, T1, T2, T3] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j<R, T1, T2, T3, T4, T5, T6, T7> implements v<T1, T2, T3, T4, T5, T6, T7, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.h f96154a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f96155b;

        public j(wb0.h hVar, Object obj) {
            this.f96154a = hVar;
            this.f96155b = obj;
        }

        @Override // wb0.v
        public R f(T1 t12, T2 t22, T3 t32, T4 t42, T5 t52, T6 t62, T7 t72) {
            this.f96154a.f(t12, t22, t32, t42, t52, t62, t72);
            return (R) this.f96155b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T4, T5, T6, R, T7, T8, T1, T2, T3] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k<R, T1, T2, T3, T4, T5, T6, T7, T8> implements w<T1, T2, T3, T4, T5, T6, T7, T8, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.i f96156a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f96157b;

        public k(wb0.i iVar, Object obj) {
            this.f96156a = iVar;
            this.f96157b = obj;
        }

        @Override // wb0.w
        public R d(T1 t12, T2 t22, T3 t32, T4 t42, T5 t52, T6 t62, T7 t72, T8 t82) {
            this.f96156a.d(t12, t22, t32, t42, t52, t62, t72, t82);
            return (R) this.f96157b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l<T> implements wb0.b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final wb0.a f96158a;

        public l(wb0.a aVar) {
            this.f96158a = aVar;
        }

        @Override // wb0.b
        public void call(T t11) {
            this.f96158a.call();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: wb0.m$m, reason: collision with other inner class name */
    public static final class C1291m<T0, T1, T2, T3, T4, T5, T6, T7, T8> implements wb0.a, wb0.b<T0>, wb0.c<T0, T1>, wb0.d<T0, T1, T2>, wb0.e<T0, T1, T2, T3>, wb0.f<T0, T1, T2, T3, T4>, wb0.g<T0, T1, T2, T3, T4, T5>, wb0.h<T0, T1, T2, T3, T4, T5, T6>, wb0.i<T0, T1, T2, T3, T4, T5, T6, T7>, wb0.j<T0, T1, T2, T3, T4, T5, T6, T7, T8>, wb0.l {
        @Override // wb0.a
        public void call() {
        }

        @Override // wb0.b
        public void call(T0 t02) {
        }

        @Override // wb0.c
        public void call(T0 t02, T1 t12) {
        }

        @Override // wb0.l
        public void call(Object... objArr) {
        }

        @Override // wb0.d
        public void i(T0 t02, T1 t12, T2 t22) {
        }

        @Override // wb0.j
        public void e(T0 t02, T1 t12, T2 t22, T3 t32, T4 t42, T5 t52, T6 t62, T7 t72, T8 t82) {
        }

        @Override // wb0.i
        public void d(T0 t02, T1 t12, T2 t22, T3 t32, T4 t42, T5 t52, T6 t62, T7 t72) {
        }

        @Override // wb0.e
        public void k(T0 t02, T1 t12, T2 t22, T3 t32) {
        }

        @Override // wb0.h
        public void f(T0 t02, T1 t12, T2 t22, T3 t32, T4 t42, T5 t52, T6 t62) {
        }

        @Override // wb0.f
        public void c(T0 t02, T1 t12, T2 t22, T3 t32, T4 t42) {
        }

        @Override // wb0.g
        public void g(T0 t02, T1 t12, T2 t22, T3 t32, T4 t42, T5 t52) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum n implements wb0.b<Throwable> {
        INSTANCE;

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th2) {
            throw new OnErrorNotImplementedException(th2);
        }
    }

    public m() {
        throw new IllegalStateException("No instances!");
    }

    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8> C1291m<T0, T1, T2, T3, T4, T5, T6, T7, T8> a() {
        return f96135a;
    }

    public static wb0.b<Throwable> b() {
        return n.INSTANCE;
    }

    public static <T> wb0.b<T> c(wb0.a aVar) {
        return new l(aVar);
    }

    public static o<Void> d(wb0.a aVar) {
        return e(aVar, null);
    }

    public static <R> o<R> e(wb0.a aVar, R r11) {
        return new c(aVar, r11);
    }

    public static <T1> p<T1, Void> f(wb0.b<T1> bVar) {
        return g(bVar, null);
    }

    public static <T1, R> p<T1, R> g(wb0.b<T1> bVar, R r11) {
        return new d(bVar, r11);
    }

    public static <T1, T2> q<T1, T2, Void> h(wb0.c<T1, T2> cVar) {
        return i(cVar, null);
    }

    public static <T1, T2, R> q<T1, T2, R> i(wb0.c<T1, T2> cVar, R r11) {
        return new e(cVar, r11);
    }

    public static <T1, T2, T3> r<T1, T2, T3, Void> j(wb0.d<T1, T2, T3> dVar) {
        return k(dVar, null);
    }

    public static <T1, T2, T3, R> r<T1, T2, T3, R> k(wb0.d<T1, T2, T3> dVar, R r11) {
        return new f(dVar, r11);
    }

    public static <T1, T2, T3, T4> s<T1, T2, T3, T4, Void> l(wb0.e<T1, T2, T3, T4> eVar) {
        return m(eVar, null);
    }

    public static <T1, T2, T3, T4, R> s<T1, T2, T3, T4, R> m(wb0.e<T1, T2, T3, T4> eVar, R r11) {
        return new g(eVar, r11);
    }

    public static <T1, T2, T3, T4, T5> t<T1, T2, T3, T4, T5, Void> n(wb0.f<T1, T2, T3, T4, T5> fVar) {
        return o(fVar, null);
    }

    public static <T1, T2, T3, T4, T5, R> t<T1, T2, T3, T4, T5, R> o(wb0.f<T1, T2, T3, T4, T5> fVar, R r11) {
        return new h(fVar, r11);
    }

    public static <T1, T2, T3, T4, T5, T6> u<T1, T2, T3, T4, T5, T6, Void> p(wb0.g<T1, T2, T3, T4, T5, T6> gVar) {
        return q(gVar, null);
    }

    public static <T1, T2, T3, T4, T5, T6, R> u<T1, T2, T3, T4, T5, T6, R> q(wb0.g<T1, T2, T3, T4, T5, T6> gVar, R r11) {
        return new i(gVar, r11);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> v<T1, T2, T3, T4, T5, T6, T7, Void> r(wb0.h<T1, T2, T3, T4, T5, T6, T7> hVar) {
        return s(hVar, null);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> v<T1, T2, T3, T4, T5, T6, T7, R> s(wb0.h<T1, T2, T3, T4, T5, T6, T7> hVar, R r11) {
        return new j(hVar, r11);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> w<T1, T2, T3, T4, T5, T6, T7, T8, Void> t(wb0.i<T1, T2, T3, T4, T5, T6, T7, T8> iVar) {
        return u(iVar, null);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> w<T1, T2, T3, T4, T5, T6, T7, T8, R> u(wb0.i<T1, T2, T3, T4, T5, T6, T7, T8> iVar, R r11) {
        return new k(iVar, r11);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> x<T1, T2, T3, T4, T5, T6, T7, T8, T9, Void> v(wb0.j<T1, T2, T3, T4, T5, T6, T7, T8, T9> jVar) {
        return w(jVar, null);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> x<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> w(wb0.j<T1, T2, T3, T4, T5, T6, T7, T8, T9> jVar, R r11) {
        return new a(jVar, r11);
    }

    public static y<Void> x(wb0.l lVar) {
        return y(lVar, null);
    }

    public static <R> y<R> y(wb0.l lVar, R r11) {
        return new b(lVar, r11);
    }
}
