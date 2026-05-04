package o40;

import kotlin.coroutines.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b implements d.c<b>, d.b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final b f75721a = new b();

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public <R> R fold(R r11, @m80.k x00.p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) d.b.a.a(this, r11, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @m80.l
    public <E extends d.b> E get(@m80.k d.c<E> cVar) {
        return (E) d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @m80.k
    public kotlin.coroutines.d minusKey(@m80.k d.c<?> cVar) {
        return d.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @m80.k
    public kotlin.coroutines.d plus(@m80.k kotlin.coroutines.d dVar) {
        return d.b.a.d(this, dVar);
    }

    @m80.k
    public String toString() {
        return "BackgroundWork";
    }

    @Override // kotlin.coroutines.d.b
    @m80.k
    public d.c<?> getKey() {
        return this;
    }
}
