package androidx.compose.ui.graphics.vector;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface VectorConfig {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> T getOrDefault(@k VectorConfig vectorConfig, @k VectorProperty<T> vectorProperty, T t11) {
            return (T) VectorConfig.super.getOrDefault(vectorProperty, t11);
        }
    }

    default <T> T getOrDefault(@k VectorProperty<T> vectorProperty, T t11) {
        return t11;
    }
}
