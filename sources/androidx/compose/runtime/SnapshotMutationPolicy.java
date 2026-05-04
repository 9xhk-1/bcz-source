package androidx.compose.runtime;

import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface SnapshotMutationPolicy<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @l
        @Deprecated
        public static <T> T merge(@k SnapshotMutationPolicy<T> snapshotMutationPolicy, T t11, T t12, T t13) {
            return (T) SnapshotMutationPolicy.super.merge(t11, t12, t13);
        }
    }

    boolean equivalent(T t11, T t12);

    @l
    default T merge(T t11, T t12, T t13) {
        return null;
    }
}
