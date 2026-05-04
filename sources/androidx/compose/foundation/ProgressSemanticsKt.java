package androidx.compose.foundation;

import androidx.annotation.IntRange;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import g10.t;
import g10.u;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ProgressSemanticsKt {
    @Stable
    @m80.k
    public static final Modifier progressSemantics(@m80.k Modifier modifier, final float f11, @m80.k final g10.f<Float> fVar, @IntRange(from = 0) final int i11) {
        return SemanticsModifierKt.semantics(modifier, true, new l<SemanticsPropertyReceiver, g2>() { // from class: androidx.compose.foundation.ProgressSemanticsKt$progressSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(((Number) u.M(Float.valueOf(f11), fVar)).floatValue(), fVar, i11));
            }
        });
    }

    public static /* synthetic */ Modifier progressSemantics$default(Modifier modifier, float f11, g10.f fVar, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            fVar = t.e(0.0f, 1.0f);
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return progressSemantics(modifier, f11, fVar, i11);
    }

    @Stable
    @m80.k
    public static final Modifier progressSemantics(@m80.k Modifier modifier) {
        return SemanticsModifierKt.semantics(modifier, true, new l<SemanticsPropertyReceiver, g2>() { // from class: androidx.compose.foundation.ProgressSemanticsKt$progressSemantics$2
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, ProgressBarRangeInfo.Companion.getIndeterminate());
            }
        });
    }
}
