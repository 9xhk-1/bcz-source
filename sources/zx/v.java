package zx;

import kotlin.coroutines.c;
import kotlin.coroutines.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class v implements kotlin.coroutines.c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final v f103120a = new v();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final d.c<?> f103121b = new b();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> implements j00.c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final kotlin.coroutines.d f103122a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j00.c<T> f103123b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ClassLoader f103124c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(j00.c<? super T> cVar, ClassLoader classLoader) {
            this.f103123b = cVar;
            this.f103124c = classLoader;
            this.f103122a = cVar.getContext();
        }

        @Override // j00.c
        public kotlin.coroutines.d getContext() {
            return this.f103122a;
        }

        @Override // j00.c
        public void resumeWith(Object obj) {
            Thread.currentThread().setContextClassLoader(this.f103124c);
            this.f103123b.resumeWith(obj);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements d.c<v> {
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public <R> R fold(R r11, @m80.k x00.p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) c.a.a(this, r11, pVar);
    }

    @Override // kotlin.coroutines.c, kotlin.coroutines.d.b, kotlin.coroutines.d
    @m80.l
    public <E extends d.b> E get(@m80.k d.c<E> cVar) {
        return (E) c.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    @m80.k
    public d.c<?> getKey() {
        return f103121b;
    }

    @Override // kotlin.coroutines.c
    @m80.k
    public <T> j00.c<T> interceptContinuation(@m80.k j00.c<? super T> continuation) {
        kotlin.jvm.internal.g0.p(continuation, "continuation");
        return new a(continuation, Thread.currentThread().getContextClassLoader());
    }

    @Override // kotlin.coroutines.c, kotlin.coroutines.d.b, kotlin.coroutines.d
    @m80.k
    public kotlin.coroutines.d minusKey(@m80.k d.c<?> cVar) {
        return c.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @m80.k
    public kotlin.coroutines.d plus(@m80.k kotlin.coroutines.d dVar) {
        return c.a.d(this, dVar);
    }

    @Override // kotlin.coroutines.c
    public void releaseInterceptedContinuation(@m80.k j00.c<?> cVar) {
        c.a.e(this, cVar);
    }
}
