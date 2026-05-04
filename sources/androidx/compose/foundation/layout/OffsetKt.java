package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.internal.u0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,273:1\n113#2:274\n113#2:275\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n*L\n50#1:274\n78#1:275\n*E\n"})
/* loaded from: classes.dex */
public final class OffsetKt {
    @m80.k
    public static final Modifier absoluteOffset(@m80.k Modifier modifier, @m80.k final l<? super Density, IntOffset> lVar) {
        return modifier.then(new OffsetPxElement(lVar, false, new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.OffsetKt$absoluteOffset$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                inspectorInfo.setName("absoluteOffset");
                inspectorInfo.getProperties().set("offset", lVar);
            }
        }));
    }

    @Stable
    @m80.k
    /* renamed from: absoluteOffset-VpY3zN4, reason: not valid java name */
    public static final Modifier m683absoluteOffsetVpY3zN4(@m80.k Modifier modifier, final float f11, final float f12) {
        return modifier.then(new OffsetElement(f11, f12, false, new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.OffsetKt$absoluteOffset$1
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
                inspectorInfo.setName("absoluteOffset");
                inspectorInfo.getProperties().set("x", Dp.m5113boximpl(f11));
                inspectorInfo.getProperties().set("y", Dp.m5113boximpl(f12));
            }
        }, null));
    }

    /* renamed from: absoluteOffset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m684absoluteOffsetVpY3zN4$default(Modifier modifier, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 2) != 0) {
            f12 = Dp.m5115constructorimpl(0);
        }
        return m683absoluteOffsetVpY3zN4(modifier, f11, f12);
    }

    @m80.k
    public static final Modifier offset(@m80.k Modifier modifier, @m80.k final l<? super Density, IntOffset> lVar) {
        return modifier.then(new OffsetPxElement(lVar, true, new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.OffsetKt$offset$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                inspectorInfo.setName("offset");
                inspectorInfo.getProperties().set("offset", lVar);
            }
        }));
    }

    @Stable
    @m80.k
    /* renamed from: offset-VpY3zN4, reason: not valid java name */
    public static final Modifier m685offsetVpY3zN4(@m80.k Modifier modifier, final float f11, final float f12) {
        return modifier.then(new OffsetElement(f11, f12, true, new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.OffsetKt$offset$1
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
                inspectorInfo.setName("offset");
                inspectorInfo.getProperties().set("x", Dp.m5113boximpl(f11));
                inspectorInfo.getProperties().set("y", Dp.m5113boximpl(f12));
            }
        }, null));
    }

    /* renamed from: offset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m686offsetVpY3zN4$default(Modifier modifier, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 2) != 0) {
            f12 = Dp.m5115constructorimpl(0);
        }
        return m685offsetVpY3zN4(modifier, f11, f12);
    }
}
