package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nClipScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,99:1\n113#2:100\n*S KotlinDebug\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt\n*L\n62#1:100\n*E\n"})
/* loaded from: classes.dex */
public final class ClipScrollableContainerKt {
    private static final float MaxSupportedElevation = Dp.m5115constructorimpl(30);

    @Stable
    @m80.k
    public static final Modifier clipScrollableContainer(@m80.k Modifier modifier, @m80.k Orientation orientation) {
        return modifier.then(orientation == Orientation.Vertical ? ClipKt.clip(Modifier.Companion, VerticalScrollableClipShape.INSTANCE) : ClipKt.clip(Modifier.Companion, HorizontalScrollableClipShape.INSTANCE));
    }

    public static final float getMaxSupportedElevation() {
        return MaxSupportedElevation;
    }
}
