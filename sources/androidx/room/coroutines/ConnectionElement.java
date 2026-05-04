package androidx.room.coroutines;

import kotlin.coroutines.d;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
final class ConnectionElement implements d.b {

    @k
    public static final Key Key = new Key(null);

    @k
    private final PooledConnectionImpl connectionWrapper;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Key implements d.c<ConnectionElement> {
        public /* synthetic */ Key(v vVar) {
            this();
        }

        private Key() {
        }
    }

    public ConnectionElement(@k PooledConnectionImpl connectionWrapper) {
        g0.p(connectionWrapper, "connectionWrapper");
        this.connectionWrapper = connectionWrapper;
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

    @k
    public final PooledConnectionImpl getConnectionWrapper() {
        return this.connectionWrapper;
    }

    @Override // kotlin.coroutines.d.b
    @k
    public d.c<ConnectionElement> getKey() {
        return Key;
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @k
    public kotlin.coroutines.d minusKey(@k d.c<?> cVar) {
        return d.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @k
    public kotlin.coroutines.d plus(@k kotlin.coroutines.d dVar) {
        return d.b.a.d(this, dVar);
    }
}
