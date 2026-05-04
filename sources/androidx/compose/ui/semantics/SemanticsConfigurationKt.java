package androidx.compose.ui.semantics;

import m80.k;
import m80.l;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SemanticsConfigurationKt {
    @l
    public static final <T> T getOrNull(@k SemanticsConfiguration semanticsConfiguration, @k SemanticsPropertyKey<T> semanticsPropertyKey) {
        return (T) semanticsConfiguration.getOrElseNullable(semanticsPropertyKey, new a<T>() { // from class: androidx.compose.ui.semantics.SemanticsConfigurationKt$getOrNull$1
            @Override // x00.a
            public final T invoke() {
                return null;
            }
        });
    }
}
