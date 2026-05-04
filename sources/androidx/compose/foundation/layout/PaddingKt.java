package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.jvm.internal.u0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,472:1\n113#2:473\n113#2:474\n113#2:475\n113#2:476\n113#2:477\n113#2:478\n113#2:479\n113#2:480\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n53#1:473\n83#1:474\n162#1:475\n274#1:476\n284#1:477\n285#1:478\n286#1:479\n287#1:480\n*E\n"})
/* loaded from: classes.dex */
public final class PaddingKt {
    @Stable
    @m80.k
    /* renamed from: PaddingValues-0680j_4, reason: not valid java name */
    public static final PaddingValues m719PaddingValues0680j_4(float f11) {
        return new PaddingValuesImpl(f11, f11, f11, f11, null);
    }

    @Stable
    @m80.k
    /* renamed from: PaddingValues-YgX7TsA, reason: not valid java name */
    public static final PaddingValues m720PaddingValuesYgX7TsA(float f11, float f12) {
        return new PaddingValuesImpl(f11, f12, f11, f12, null);
    }

    /* renamed from: PaddingValues-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m721PaddingValuesYgX7TsA$default(float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 2) != 0) {
            f12 = Dp.m5115constructorimpl(0);
        }
        return m720PaddingValuesYgX7TsA(f11, f12);
    }

    @Stable
    @m80.k
    /* renamed from: PaddingValues-a9UjIt4, reason: not valid java name */
    public static final PaddingValues m722PaddingValuesa9UjIt4(float f11, float f12, float f13, float f14) {
        return new PaddingValuesImpl(f11, f12, f13, f14, null);
    }

    /* renamed from: PaddingValues-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m723PaddingValuesa9UjIt4$default(float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 2) != 0) {
            f12 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 4) != 0) {
            f13 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 8) != 0) {
            f14 = Dp.m5115constructorimpl(0);
        }
        return m722PaddingValuesa9UjIt4(f11, f12, f13, f14);
    }

    @Stable
    @m80.k
    /* renamed from: absolutePadding-qDBjuR0, reason: not valid java name */
    public static final Modifier m724absolutePaddingqDBjuR0(@m80.k Modifier modifier, final float f11, final float f12, final float f13, final float f14) {
        return modifier.then(new PaddingElement(f11, f12, f13, f14, false, new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.PaddingKt$absolutePadding$1
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
                inspectorInfo.setName("absolutePadding");
                inspectorInfo.getProperties().set(TtmlNode.LEFT, Dp.m5113boximpl(f11));
                inspectorInfo.getProperties().set("top", Dp.m5113boximpl(f12));
                inspectorInfo.getProperties().set(TtmlNode.RIGHT, Dp.m5113boximpl(f13));
                inspectorInfo.getProperties().set("bottom", Dp.m5113boximpl(f14));
            }
        }, null));
    }

    /* renamed from: absolutePadding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m725absolutePaddingqDBjuR0$default(Modifier modifier, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 2) != 0) {
            f12 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 4) != 0) {
            f13 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 8) != 0) {
            f14 = Dp.m5115constructorimpl(0);
        }
        return m724absolutePaddingqDBjuR0(modifier, f11, f12, f13, f14);
    }

    @Stable
    public static final float calculateEndPadding(@m80.k PaddingValues paddingValues, @m80.k LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo677calculateRightPaddingu2uoSUM(layoutDirection) : paddingValues.mo676calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final float calculateStartPadding(@m80.k PaddingValues paddingValues, @m80.k LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo676calculateLeftPaddingu2uoSUM(layoutDirection) : paddingValues.mo677calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    @m80.k
    public static final Modifier padding(@m80.k Modifier modifier, @m80.k final PaddingValues paddingValues) {
        return modifier.then(new PaddingValuesElement(paddingValues, new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$4
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
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("paddingValues", PaddingValues.this);
            }
        }));
    }

    @Stable
    @m80.k
    /* renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final Modifier m726padding3ABfNKs(@m80.k Modifier modifier, final float f11) {
        return modifier.then(new PaddingElement(f11, f11, f11, f11, true, new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$3
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
                inspectorInfo.setName("padding");
                inspectorInfo.setValue(Dp.m5113boximpl(f11));
            }
        }, null));
    }

    @Stable
    @m80.k
    /* renamed from: padding-VpY3zN4, reason: not valid java name */
    public static final Modifier m727paddingVpY3zN4(@m80.k Modifier modifier, final float f11, final float f12) {
        return modifier.then(new PaddingElement(f11, f12, f11, f12, true, new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$2
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
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("horizontal", Dp.m5113boximpl(f11));
                inspectorInfo.getProperties().set("vertical", Dp.m5113boximpl(f12));
            }
        }, null));
    }

    /* renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m728paddingVpY3zN4$default(Modifier modifier, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 2) != 0) {
            f12 = Dp.m5115constructorimpl(0);
        }
        return m727paddingVpY3zN4(modifier, f11, f12);
    }

    @Stable
    @m80.k
    /* renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final Modifier m729paddingqDBjuR0(@m80.k Modifier modifier, final float f11, final float f12, final float f13, final float f14) {
        return modifier.then(new PaddingElement(f11, f12, f13, f14, true, new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$1
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
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set(TtmlNode.START, Dp.m5113boximpl(f11));
                inspectorInfo.getProperties().set("top", Dp.m5113boximpl(f12));
                inspectorInfo.getProperties().set(TtmlNode.END, Dp.m5113boximpl(f13));
                inspectorInfo.getProperties().set("bottom", Dp.m5113boximpl(f14));
            }
        }, null));
    }

    /* renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m730paddingqDBjuR0$default(Modifier modifier, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 2) != 0) {
            f12 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 4) != 0) {
            f13 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 8) != 0) {
            f14 = Dp.m5115constructorimpl(0);
        }
        return m729paddingqDBjuR0(modifier, f11, f12, f13, f14);
    }
}
