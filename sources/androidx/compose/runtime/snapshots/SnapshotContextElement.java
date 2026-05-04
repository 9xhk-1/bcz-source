package androidx.compose.runtime.snapshots;

import kotlin.coroutines.d;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface SnapshotContextElement extends d.b {

    @k
    public static final Key Key = Key.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        public static <R> R fold(@k SnapshotContextElement snapshotContextElement, R r11, @k p<? super R, ? super d.b, ? extends R> pVar) {
            return (R) d.b.a.a(snapshotContextElement, r11, pVar);
        }

        @l
        public static <E extends d.b> E get(@k SnapshotContextElement snapshotContextElement, @k d.c<E> cVar) {
            return (E) d.b.a.b(snapshotContextElement, cVar);
        }

        @k
        public static d minusKey(@k SnapshotContextElement snapshotContextElement, @k d.c<?> cVar) {
            return d.b.a.c(snapshotContextElement, cVar);
        }

        @k
        public static d plus(@k SnapshotContextElement snapshotContextElement, @k d dVar) {
            return d.b.a.d(snapshotContextElement, dVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Key implements d.c<SnapshotContextElement> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }
}
