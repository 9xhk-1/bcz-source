package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nContextMenuPopupPositionProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuPopupPositionProvider.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuPopupPositionProvider\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,137:1\n54#2:138\n54#2:140\n59#2:142\n59#2:144\n85#3:139\n85#3:141\n90#3:143\n90#3:145\n80#3:147\n32#4:146\n*S KotlinDebug\n*F\n+ 1 ContextMenuPopupPositionProvider.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuPopupPositionProvider\n*L\n61#1:138\n62#1:140\n68#1:142\n69#1:144\n61#1:139\n62#1:141\n68#1:143\n69#1:145\n57#1:147\n57#1:146\n*E\n"})
/* loaded from: classes.dex */
public final class ContextMenuPopupPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final long localPosition;

    public /* synthetic */ ContextMenuPopupPositionProvider(long j11, v vVar) {
        this(j11);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4, reason: not valid java name */
    public long mo346calculatePositionllwVHH4(@k IntRect intRect, long j11, @k LayoutDirection layoutDirection, long j12) {
        return IntOffset.m5237constructorimpl((ContextMenuPopupPositionProvider_androidKt.alignPopupAxis(intRect.getLeft() + IntOffset.m5243getXimpl(this.localPosition), (int) (j12 >> 32), (int) (j11 >> 32), layoutDirection == LayoutDirection.Ltr) << 32) | (ContextMenuPopupPositionProvider_androidKt.alignPopupAxis$default(intRect.getTop() + IntOffset.m5244getYimpl(this.localPosition), (int) (j12 & 4294967295L), (int) (j11 & 4294967295L), false, 8, null) & 4294967295L));
    }

    private ContextMenuPopupPositionProvider(long j11) {
        this.localPosition = j11;
    }
}
