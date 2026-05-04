package kotlin.coroutines;

import kotlin.coroutines.d;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.p;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
/* loaded from: classes8.dex */
public abstract class a implements d.b {

    @k
    private final d.c<?> key;

    public a(@k d.c<?> key) {
        g0.p(key, "key");
        this.key = key;
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public /* bridge */ <R> R fold(R r11, @k p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) d.b.a.a(this, r11, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @l
    public /* bridge */ <E extends d.b> E get(@k d.c<E> cVar) {
        return (E) d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    @k
    public d.c<?> getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @k
    public /* bridge */ d minusKey(@k d.c<?> cVar) {
        return d.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @k
    public /* bridge */ d plus(@k d dVar) {
        return d.b.a.d(this, dVar);
    }
}
