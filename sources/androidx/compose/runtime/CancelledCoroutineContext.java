package androidx.compose.runtime;

import kotlin.coroutines.d;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class CancelledCoroutineContext implements d.b {

    @k
    public static final Key Key = new Key(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Key implements d.c<CancelledCoroutineContext> {
        public /* synthetic */ Key(v vVar) {
            this();
        }

        private Key() {
        }
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public <R> R fold(R r11, @k p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) d.b.a.a(this, r11, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @l
    public <E extends d.b> E get(@k d.c<E> cVar) {
        return (E) d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    @k
    public d.c<?> getKey() {
        return Key;
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @k
    public d minusKey(@k d.c<?> cVar) {
        return d.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @k
    public d plus(@k d dVar) {
        return d.b.a.d(this, dVar);
    }
}
