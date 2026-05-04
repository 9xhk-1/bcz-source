package androidx.compose.runtime;

import j00.c;
import kotlin.coroutines.d;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface MonotonicFrameClock extends d.b {

    @k
    public static final Key Key = Key.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        public static <R> R fold(@k MonotonicFrameClock monotonicFrameClock, R r11, @k p<? super R, ? super d.b, ? extends R> pVar) {
            return (R) d.b.a.a(monotonicFrameClock, r11, pVar);
        }

        @l
        public static <E extends d.b> E get(@k MonotonicFrameClock monotonicFrameClock, @k d.c<E> cVar) {
            return (E) d.b.a.b(monotonicFrameClock, cVar);
        }

        @Deprecated
        @k
        public static d.c<?> getKey(@k MonotonicFrameClock monotonicFrameClock) {
            return MonotonicFrameClock.super.getKey();
        }

        @k
        public static d minusKey(@k MonotonicFrameClock monotonicFrameClock, @k d.c<?> cVar) {
            return d.b.a.c(monotonicFrameClock, cVar);
        }

        @k
        public static d plus(@k MonotonicFrameClock monotonicFrameClock, @k d dVar) {
            return d.b.a.d(monotonicFrameClock, dVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Key implements d.c<MonotonicFrameClock> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // kotlin.coroutines.d.b
    @k
    default d.c<?> getKey() {
        return Key;
    }

    @l
    <R> Object withFrameNanos(@k x00.l<? super Long, ? extends R> lVar, @k c<? super R> cVar);
}
