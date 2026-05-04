package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextFieldSelectionStateKt {
    private static final boolean DEBUG = false;

    @k
    private static final String DEBUG_TAG = "TextFieldSelectionState";

    @l
    public static final a<g2> menuItem(@k final TextFieldSelectionState textFieldSelectionState, boolean z11, @k final TextToolbarState textToolbarState, @k final a<g2> aVar) {
        if (z11) {
            return new a<g2>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$menuItem$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    aVar.invoke();
                    textFieldSelectionState.updateTextToolbarState(textToolbarState);
                }
            };
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverse-5zc-tL8, reason: not valid java name */
    public static final long m1381reverse5zctL8(long j11) {
        return TextRangeKt.TextRange(TextRange.m4554getEndimpl(j11), TextRange.m4559getStartimpl(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logDebug(a<String> aVar) {
    }
}
