package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 implements OffsetProvider, b0 {
    private final /* synthetic */ x00.a function;

    public SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0(x00.a aVar) {
        this.function = aVar;
    }

    public final boolean equals(@l Object obj) {
        if ((obj instanceof OffsetProvider) && (obj instanceof b0)) {
            return g0.g(getFunctionDelegate(), ((b0) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.b0
    @k
    public final w<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.foundation.text.selection.OffsetProvider
    /* renamed from: provide-F1C5BW0 */
    public final /* synthetic */ long mo1028provideF1C5BW0() {
        return ((Offset) this.function.invoke()).m2278unboximpl();
    }
}
