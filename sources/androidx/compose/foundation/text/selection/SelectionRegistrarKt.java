package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SelectionRegistrarKt {

    @k
    private static final ProvidableCompositionLocal<SelectionRegistrar> LocalSelectionRegistrar = CompositionLocalKt.compositionLocalOf$default(null, new x00.a<SelectionRegistrar>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarKt$LocalSelectionRegistrar$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final SelectionRegistrar invoke() {
            return null;
        }
    }, 1, null);

    @k
    public static final ProvidableCompositionLocal<SelectionRegistrar> getLocalSelectionRegistrar() {
        return LocalSelectionRegistrar;
    }

    public static final boolean hasSelection(@l SelectionRegistrar selectionRegistrar, long j11) {
        LongObjectMap<Selection> subselections;
        if (selectionRegistrar == null || (subselections = selectionRegistrar.getSubselections()) == null) {
            return false;
        }
        return subselections.containsKey(j11);
    }
}
