package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.internal.u0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,242:1\n110#2:243\n*S KotlinDebug\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioKt\n*L\n65#1:243\n*E\n"})
/* loaded from: classes.dex */
public final class AspectRatioKt {
    @Stable
    @m80.k
    public static final Modifier aspectRatio(@m80.k Modifier modifier, @FloatRange(from = 0.0d, fromInclusive = false) final float f11, final boolean z11) {
        return modifier.then(new AspectRatioElement(f11, z11, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("aspectRatio");
                inspectorInfo.getProperties().set("ratio", Float.valueOf(f11));
                inspectorInfo.getProperties().set("matchHeightConstraintsFirst", Boolean.valueOf(z11));
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    public static /* synthetic */ Modifier aspectRatio$default(Modifier modifier, float f11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return aspectRatio(modifier, f11, z11);
    }

    @Stable
    /* renamed from: isSatisfiedBy-NN6Ew-U, reason: not valid java name */
    public static final boolean m624isSatisfiedByNN6EwU(long j11, int i11, int i12) {
        int m5070getMinWidthimpl = Constraints.m5070getMinWidthimpl(j11);
        if (i11 > Constraints.m5068getMaxWidthimpl(j11) || m5070getMinWidthimpl > i11) {
            return false;
        }
        return i12 <= Constraints.m5067getMaxHeightimpl(j11) && Constraints.m5069getMinHeightimpl(j11) <= i12;
    }
}
