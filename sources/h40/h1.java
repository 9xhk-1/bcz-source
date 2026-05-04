package h40;

import c40.m3;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h1<T> implements m3<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f58225a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final ThreadLocal<T> f58226b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final d.c<?> f58227c;

    public h1(T t11, @m80.k ThreadLocal<T> threadLocal) {
        this.f58225a = t11;
        this.f58226b = threadLocal;
        this.f58227c = new i1(threadLocal);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public <R> R fold(R r11, @m80.k x00.p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) m3.a.a(this, r11, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @m80.l
    public <E extends d.b> E get(@m80.k d.c<E> cVar) {
        if (!kotlin.jvm.internal.g0.g(getKey(), cVar)) {
            return null;
        }
        kotlin.jvm.internal.g0.n(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
        return this;
    }

    @Override // kotlin.coroutines.d.b
    @m80.k
    public d.c<?> getKey() {
        return this.f58227c;
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @m80.k
    public kotlin.coroutines.d minusKey(@m80.k d.c<?> cVar) {
        return kotlin.jvm.internal.g0.g(getKey(), cVar) ? EmptyCoroutineContext.INSTANCE : this;
    }

    @Override // kotlin.coroutines.d
    @m80.k
    public kotlin.coroutines.d plus(@m80.k kotlin.coroutines.d dVar) {
        return m3.a.d(this, dVar);
    }

    @Override // c40.m3
    public void restoreThreadContext(@m80.k kotlin.coroutines.d dVar, T t11) {
        this.f58226b.set(t11);
    }

    @m80.k
    public String toString() {
        return "ThreadLocal(value=" + this.f58225a + ", threadLocal = " + this.f58226b + ')';
    }

    @Override // c40.m3
    public T updateThreadContext(@m80.k kotlin.coroutines.d dVar) {
        T t11 = this.f58226b.get();
        this.f58226b.set(this.f58225a);
        return t11;
    }
}
