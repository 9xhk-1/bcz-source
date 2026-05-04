package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import ix.g;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1134:1\n110#2:1135\n110#2:1136\n110#2:1137\n110#2:1138\n110#2:1139\n110#2:1140\n110#2:1141\n110#2:1142\n110#2:1143\n110#2:1144\n110#2:1145\n110#2:1146\n110#2:1147\n110#2:1148\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n68#1:1135\n95#1:1136\n124#1:1137\n154#1:1138\n189#1:1139\n211#1:1140\n240#1:1141\n272#1:1142\n302#1:1143\n334#1:1144\n362#1:1145\n397#1:1146\n420#1:1147\n451#1:1148\n*E\n"})
/* loaded from: classes.dex */
public final class SizeKt {

    @m80.k
    private static final FillElement FillWholeMaxHeight;

    @m80.k
    private static final FillElement FillWholeMaxSize;

    @m80.k
    private static final FillElement FillWholeMaxWidth;

    @m80.k
    private static final WrapContentElement WrapContentHeightCenter;

    @m80.k
    private static final WrapContentElement WrapContentHeightTop;

    @m80.k
    private static final WrapContentElement WrapContentSizeCenter;

    @m80.k
    private static final WrapContentElement WrapContentSizeTopStart;

    @m80.k
    private static final WrapContentElement WrapContentWidthCenter;

    @m80.k
    private static final WrapContentElement WrapContentWidthStart;

    static {
        FillElement.Companion companion = FillElement.Companion;
        FillWholeMaxWidth = companion.width(1.0f);
        FillWholeMaxHeight = companion.height(1.0f);
        FillWholeMaxSize = companion.size(1.0f);
        WrapContentElement.Companion companion2 = WrapContentElement.Companion;
        Alignment.Companion companion3 = Alignment.Companion;
        WrapContentWidthCenter = companion2.width(companion3.getCenterHorizontally(), false);
        WrapContentWidthStart = companion2.width(companion3.getStart(), false);
        WrapContentHeightCenter = companion2.height(companion3.getCenterVertically(), false);
        WrapContentHeightTop = companion2.height(companion3.getTop(), false);
        WrapContentSizeCenter = companion2.size(companion3.getCenter(), false);
        WrapContentSizeTopStart = companion2.size(companion3.getTopStart(), false);
    }

    @Stable
    @m80.k
    /* renamed from: defaultMinSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m757defaultMinSizeVpY3zN4(@m80.k Modifier modifier, float f11, float f12) {
        return modifier.then(new UnspecifiedConstraintsElement(f11, f12, null));
    }

    /* renamed from: defaultMinSize-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m758defaultMinSizeVpY3zN4$default(Modifier modifier, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f12 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        return m757defaultMinSizeVpY3zN4(modifier, f11, f12);
    }

    @Stable
    @m80.k
    public static final Modifier fillMaxHeight(@m80.k Modifier modifier, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        return modifier.then(f11 == 1.0f ? FillWholeMaxHeight : FillElement.Companion.height(f11));
    }

    public static /* synthetic */ Modifier fillMaxHeight$default(Modifier modifier, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        return fillMaxHeight(modifier, f11);
    }

    @Stable
    @m80.k
    public static final Modifier fillMaxSize(@m80.k Modifier modifier, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        return modifier.then(f11 == 1.0f ? FillWholeMaxSize : FillElement.Companion.size(f11));
    }

    public static /* synthetic */ Modifier fillMaxSize$default(Modifier modifier, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        return fillMaxSize(modifier, f11);
    }

    @Stable
    @m80.k
    public static final Modifier fillMaxWidth(@m80.k Modifier modifier, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        return modifier.then(f11 == 1.0f ? FillWholeMaxWidth : FillElement.Companion.width(f11));
    }

    public static /* synthetic */ Modifier fillMaxWidth$default(Modifier modifier, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        return fillMaxWidth(modifier, f11);
    }

    @Stable
    @m80.k
    /* renamed from: height-3ABfNKs, reason: not valid java name */
    public static final Modifier m759height3ABfNKs(@m80.k Modifier modifier, final float f11) {
        return modifier.then(new SizeElement(0.0f, f11, 0.0f, f11, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.SizeKt$height-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("height");
                inspectorInfo.setValue(Dp.m5113boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    @Stable
    @m80.k
    /* renamed from: heightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m760heightInVpY3zN4(@m80.k Modifier modifier, final float f11, final float f12) {
        return modifier.then(new SizeElement(0.0f, f11, 0.0f, f12, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.SizeKt$heightIn-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("heightIn");
                inspectorInfo.getProperties().set("min", Dp.m5113boximpl(f11));
                inspectorInfo.getProperties().set("max", Dp.m5113boximpl(f12));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: heightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m761heightInVpY3zN4$default(Modifier modifier, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f12 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        return m760heightInVpY3zN4(modifier, f11, f12);
    }

    @Stable
    @m80.k
    /* renamed from: requiredHeight-3ABfNKs, reason: not valid java name */
    public static final Modifier m762requiredHeight3ABfNKs(@m80.k Modifier modifier, final float f11) {
        return modifier.then(new SizeElement(0.0f, f11, 0.0f, f11, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeight-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredHeight");
                inspectorInfo.setValue(Dp.m5113boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    @Stable
    @m80.k
    /* renamed from: requiredHeightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m763requiredHeightInVpY3zN4(@m80.k Modifier modifier, final float f11, final float f12) {
        return modifier.then(new SizeElement(0.0f, f11, 0.0f, f12, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeightIn-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredHeightIn");
                inspectorInfo.getProperties().set("min", Dp.m5113boximpl(f11));
                inspectorInfo.getProperties().set("max", Dp.m5113boximpl(f12));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredHeightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m764requiredHeightInVpY3zN4$default(Modifier modifier, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f12 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        return m763requiredHeightInVpY3zN4(modifier, f11, f12);
    }

    @Stable
    @m80.k
    /* renamed from: requiredSize-3ABfNKs, reason: not valid java name */
    public static final Modifier m765requiredSize3ABfNKs(@m80.k Modifier modifier, final float f11) {
        return modifier.then(new SizeElement(f11, f11, f11, f11, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredSize");
                inspectorInfo.setValue(Dp.m5113boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    @m80.k
    /* renamed from: requiredSize-6HolHcs, reason: not valid java name */
    public static final Modifier m766requiredSize6HolHcs(@m80.k Modifier modifier, long j11) {
        return m767requiredSizeVpY3zN4(modifier, DpSize.m5213getWidthD9Ej5fM(j11), DpSize.m5211getHeightD9Ej5fM(j11));
    }

    @Stable
    @m80.k
    /* renamed from: requiredSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m767requiredSizeVpY3zN4(@m80.k Modifier modifier, final float f11, final float f12) {
        return modifier.then(new SizeElement(f11, f12, f11, f12, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredSize");
                inspectorInfo.getProperties().set("width", Dp.m5113boximpl(f11));
                inspectorInfo.getProperties().set("height", Dp.m5113boximpl(f12));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    @m80.k
    /* renamed from: requiredSizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m768requiredSizeInqDBjuR0(@m80.k Modifier modifier, final float f11, final float f12, final float f13, final float f14) {
        return modifier.then(new SizeElement(f11, f12, f13, f14, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredSizeIn");
                inspectorInfo.getProperties().set("minWidth", Dp.m5113boximpl(f11));
                inspectorInfo.getProperties().set("minHeight", Dp.m5113boximpl(f12));
                inspectorInfo.getProperties().set("maxWidth", Dp.m5113boximpl(f13));
                inspectorInfo.getProperties().set("maxHeight", Dp.m5113boximpl(f14));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m769requiredSizeInqDBjuR0$default(Modifier modifier, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f12 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f13 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        if ((i11 & 8) != 0) {
            f14 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        return m768requiredSizeInqDBjuR0(modifier, f11, f12, f13, f14);
    }

    @Stable
    @m80.k
    /* renamed from: requiredWidth-3ABfNKs, reason: not valid java name */
    public static final Modifier m770requiredWidth3ABfNKs(@m80.k Modifier modifier, final float f11) {
        return modifier.then(new SizeElement(f11, 0.0f, f11, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidth-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredWidth");
                inspectorInfo.setValue(Dp.m5113boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    @Stable
    @m80.k
    /* renamed from: requiredWidthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m771requiredWidthInVpY3zN4(@m80.k Modifier modifier, final float f11, final float f12) {
        return modifier.then(new SizeElement(f11, 0.0f, f12, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidthIn-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredWidthIn");
                inspectorInfo.getProperties().set("min", Dp.m5113boximpl(f11));
                inspectorInfo.getProperties().set("max", Dp.m5113boximpl(f12));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: requiredWidthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m772requiredWidthInVpY3zN4$default(Modifier modifier, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f12 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        return m771requiredWidthInVpY3zN4(modifier, f11, f12);
    }

    @Stable
    @m80.k
    /* renamed from: size-3ABfNKs, reason: not valid java name */
    public static final Modifier m773size3ABfNKs(@m80.k Modifier modifier, final float f11) {
        return modifier.then(new SizeElement(f11, f11, f11, f11, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.SizeKt$size-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName(g.b.f62794h);
                inspectorInfo.setValue(Dp.m5113boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    @m80.k
    /* renamed from: size-6HolHcs, reason: not valid java name */
    public static final Modifier m774size6HolHcs(@m80.k Modifier modifier, long j11) {
        return m775sizeVpY3zN4(modifier, DpSize.m5213getWidthD9Ej5fM(j11), DpSize.m5211getHeightD9Ej5fM(j11));
    }

    @Stable
    @m80.k
    /* renamed from: size-VpY3zN4, reason: not valid java name */
    public static final Modifier m775sizeVpY3zN4(@m80.k Modifier modifier, final float f11, final float f12) {
        return modifier.then(new SizeElement(f11, f12, f11, f12, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.SizeKt$size-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName(g.b.f62794h);
                inspectorInfo.getProperties().set("width", Dp.m5113boximpl(f11));
                inspectorInfo.getProperties().set("height", Dp.m5113boximpl(f12));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    @m80.k
    /* renamed from: sizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m776sizeInqDBjuR0(@m80.k Modifier modifier, final float f11, final float f12, final float f13, final float f14) {
        return modifier.then(new SizeElement(f11, f12, f13, f14, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("sizeIn");
                inspectorInfo.getProperties().set("minWidth", Dp.m5113boximpl(f11));
                inspectorInfo.getProperties().set("minHeight", Dp.m5113boximpl(f12));
                inspectorInfo.getProperties().set("maxWidth", Dp.m5113boximpl(f13));
                inspectorInfo.getProperties().set("maxHeight", Dp.m5113boximpl(f14));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: sizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m777sizeInqDBjuR0$default(Modifier modifier, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f12 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f13 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        if ((i11 & 8) != 0) {
            f14 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        return m776sizeInqDBjuR0(modifier, f11, f12, f13, f14);
    }

    @Stable
    @m80.k
    /* renamed from: width-3ABfNKs, reason: not valid java name */
    public static final Modifier m778width3ABfNKs(@m80.k Modifier modifier, final float f11) {
        return modifier.then(new SizeElement(f11, 0.0f, f11, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.SizeKt$width-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("width");
                inspectorInfo.setValue(Dp.m5113boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    @Stable
    @m80.k
    /* renamed from: widthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m779widthInVpY3zN4(@m80.k Modifier modifier, final float f11, final float f12) {
        return modifier.then(new SizeElement(f11, 0.0f, f12, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.SizeKt$widthIn-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("widthIn");
                inspectorInfo.getProperties().set("min", Dp.m5113boximpl(f11));
                inspectorInfo.getProperties().set("max", Dp.m5113boximpl(f12));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: widthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m780widthInVpY3zN4$default(Modifier modifier, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f12 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        return m779widthInVpY3zN4(modifier, f11, f12);
    }

    @Stable
    @m80.k
    public static final Modifier wrapContentHeight(@m80.k Modifier modifier, @m80.k Alignment.Vertical vertical, boolean z11) {
        Alignment.Companion companion = Alignment.Companion;
        return modifier.then((!g0.g(vertical, companion.getCenterVertically()) || z11) ? (!g0.g(vertical, companion.getTop()) || z11) ? WrapContentElement.Companion.height(vertical, z11) : WrapContentHeightTop : WrapContentHeightCenter);
    }

    public static /* synthetic */ Modifier wrapContentHeight$default(Modifier modifier, Alignment.Vertical vertical, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            vertical = Alignment.Companion.getCenterVertically();
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return wrapContentHeight(modifier, vertical, z11);
    }

    @Stable
    @m80.k
    public static final Modifier wrapContentSize(@m80.k Modifier modifier, @m80.k Alignment alignment, boolean z11) {
        Alignment.Companion companion = Alignment.Companion;
        return modifier.then((!g0.g(alignment, companion.getCenter()) || z11) ? (!g0.g(alignment, companion.getTopStart()) || z11) ? WrapContentElement.Companion.size(alignment, z11) : WrapContentSizeTopStart : WrapContentSizeCenter);
    }

    public static /* synthetic */ Modifier wrapContentSize$default(Modifier modifier, Alignment alignment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return wrapContentSize(modifier, alignment, z11);
    }

    @Stable
    @m80.k
    public static final Modifier wrapContentWidth(@m80.k Modifier modifier, @m80.k Alignment.Horizontal horizontal, boolean z11) {
        Alignment.Companion companion = Alignment.Companion;
        return modifier.then((!g0.g(horizontal, companion.getCenterHorizontally()) || z11) ? (!g0.g(horizontal, companion.getStart()) || z11) ? WrapContentElement.Companion.width(horizontal, z11) : WrapContentWidthStart : WrapContentWidthCenter);
    }

    public static /* synthetic */ Modifier wrapContentWidth$default(Modifier modifier, Alignment.Horizontal horizontal, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            horizontal = Alignment.Companion.getCenterHorizontally();
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return wrapContentWidth(modifier, horizontal, z11);
    }
}
