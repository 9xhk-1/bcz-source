package p40;

import c40.n0;
import kotlin.coroutines.d;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f78908a = a.f78903a;

    public boolean equals(@l Object obj) {
        return (obj instanceof b) || (obj instanceof a);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public <R> R fold(R r11, @k p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) this.f78908a.fold(r11, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @l
    public <E extends d.b> E get(@k d.c<E> cVar) {
        return (E) this.f78908a.get(cVar);
    }

    @Override // kotlin.coroutines.d.b
    @k
    public d.c<?> getKey() {
        return this.f78908a.getKey();
    }

    @Override // c40.n0
    public void handleException(@k kotlin.coroutines.d dVar, @k Throwable th2) {
        this.f78908a.handleException(dVar, th2);
    }

    public int hashCode() {
        return a.f78903a.hashCode();
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @k
    public kotlin.coroutines.d minusKey(@k d.c<?> cVar) {
        return this.f78908a.minusKey(cVar);
    }

    @Override // kotlin.coroutines.d
    @k
    public kotlin.coroutines.d plus(@k kotlin.coroutines.d dVar) {
        return this.f78908a.plus(dVar);
    }
}
