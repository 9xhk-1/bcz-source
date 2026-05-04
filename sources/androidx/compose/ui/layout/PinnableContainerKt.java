package androidx.compose.ui.layout;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PinnableContainerKt {

    @k
    private static final ProvidableCompositionLocal<PinnableContainer> LocalPinnableContainer = CompositionLocalKt.compositionLocalOf$default(null, new a<PinnableContainer>() { // from class: androidx.compose.ui.layout.PinnableContainerKt$LocalPinnableContainer$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final PinnableContainer invoke() {
            return null;
        }
    }, 1, null);

    @k
    public static final ProvidableCompositionLocal<PinnableContainer> getLocalPinnableContainer() {
        return LocalPinnableContainer;
    }
}
