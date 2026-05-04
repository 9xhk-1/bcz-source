package androidx.compose.runtime;

import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface Applier<N> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static <N> void apply(@k Applier<N> applier, @k p<? super N, Object, g2> pVar, @l Object obj) {
            Applier.super.apply(pVar, obj);
        }

        @Deprecated
        public static <N> void onBeginChanges(@k Applier<N> applier) {
            Applier.super.onBeginChanges();
        }

        @Deprecated
        public static <N> void onEndChanges(@k Applier<N> applier) {
            Applier.super.onEndChanges();
        }

        @Deprecated
        public static <N> void reuse(@k Applier<N> applier) {
            Applier.super.reuse();
        }
    }

    default void apply(@k p<? super N, Object, g2> pVar, @l Object obj) {
        pVar.invoke(getCurrent(), obj);
    }

    void clear();

    void down(N n11);

    N getCurrent();

    void insertBottomUp(int i11, N n11);

    void insertTopDown(int i11, N n11);

    void move(int i11, int i12, int i13);

    void remove(int i11, int i12);

    default void reuse() {
        N current = getCurrent();
        ComposeNodeLifecycleCallback composeNodeLifecycleCallback = current instanceof ComposeNodeLifecycleCallback ? (ComposeNodeLifecycleCallback) current : null;
        if (composeNodeLifecycleCallback != null) {
            composeNodeLifecycleCallback.onReuse();
        }
    }

    void up();

    default void onBeginChanges() {
    }

    default void onEndChanges() {
    }
}
