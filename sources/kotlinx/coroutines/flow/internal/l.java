package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l implements kotlin.coroutines.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.d f68272a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final Throwable f68273b;

    public l(@m80.k Throwable th2, @m80.k kotlin.coroutines.d dVar) {
        this.f68272a = dVar;
        this.f68273b = th2;
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r11, @m80.k x00.p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) this.f68272a.fold(r11, pVar);
    }

    @Override // kotlin.coroutines.d
    @m80.l
    public <E extends d.b> E get(@m80.k d.c<E> cVar) {
        return (E) this.f68272a.get(cVar);
    }

    @Override // kotlin.coroutines.d
    @m80.k
    public kotlin.coroutines.d minusKey(@m80.k d.c<?> cVar) {
        return this.f68272a.minusKey(cVar);
    }

    @Override // kotlin.coroutines.d
    @m80.k
    public kotlin.coroutines.d plus(@m80.k kotlin.coroutines.d dVar) {
        return this.f68272a.plus(dVar);
    }
}
