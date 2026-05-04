package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g10.u;
import kotlin.jvm.internal.u0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n110#2:365\n110#2:366\n97#3:367\n97#3:368\n97#3:372\n97#3:373\n247#4:369\n247#4:370\n1#5:371\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n75#1:365\n119#1:366\n146#1:367\n153#1:368\n323#1:372\n328#1:373\n181#1:369\n184#1:370\n*E\n"})
/* loaded from: classes.dex */
public final class AlignmentLineKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: alignmentLineOffsetMeasure-tjqqzMA, reason: not valid java name */
    public static final MeasureResult m576alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, final AlignmentLine alignmentLine, final float f11, float f12, Measurable measurable, long j11) {
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(getHorizontal(alignmentLine) ? Constraints.m5058copyZbe2FdA$default(j11, 0, 0, 0, 0, 11, null) : Constraints.m5058copyZbe2FdA$default(j11, 0, 0, 0, 0, 14, null));
        int i11 = mo3857measureBRTryo0.get(alignmentLine);
        if (i11 == Integer.MIN_VALUE) {
            i11 = 0;
        }
        int height = getHorizontal(alignmentLine) ? mo3857measureBRTryo0.getHeight() : mo3857measureBRTryo0.getWidth();
        int m5067getMaxHeightimpl = (getHorizontal(alignmentLine) ? Constraints.m5067getMaxHeightimpl(j11) : Constraints.m5068getMaxWidthimpl(j11)) - height;
        final int I = u.I((!Float.isNaN(f11) ? measureScope.mo371roundToPx0680j_4(f11) : 0) - i11, 0, m5067getMaxHeightimpl);
        final int I2 = u.I(((!Float.isNaN(f12) ? measureScope.mo371roundToPx0680j_4(f12) : 0) - height) + i11, 0, m5067getMaxHeightimpl - I);
        final int width = getHorizontal(alignmentLine) ? mo3857measureBRTryo0.getWidth() : Math.max(mo3857measureBRTryo0.getWidth() + I + I2, Constraints.m5070getMinWidthimpl(j11));
        final int max = getHorizontal(alignmentLine) ? Math.max(mo3857measureBRTryo0.getHeight() + I + I2, Constraints.m5069getMinHeightimpl(j11)) : mo3857measureBRTryo0.getHeight();
        return MeasureScope.layout$default(measureScope, width, max, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$alignmentLineOffsetMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                boolean horizontal;
                int width2;
                boolean horizontal2;
                horizontal = AlignmentLineKt.getHorizontal(AlignmentLine.this);
                if (horizontal) {
                    width2 = 0;
                } else {
                    width2 = !Dp.m5120equalsimpl0(f11, Dp.Companion.m5135getUnspecifiedD9Ej5fM()) ? I : (width - I2) - mo3857measureBRTryo0.getWidth();
                }
                horizontal2 = AlignmentLineKt.getHorizontal(AlignmentLine.this);
                Placeable.PlacementScope.placeRelative$default(placementScope, mo3857measureBRTryo0, width2, horizontal2 ? !Dp.m5120equalsimpl0(f11, Dp.Companion.m5135getUnspecifiedD9Ej5fM()) ? I : (max - I2) - mo3857measureBRTryo0.getHeight() : 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    @Stable
    @m80.k
    /* renamed from: paddingFrom-4j6BHR0, reason: not valid java name */
    public static final Modifier m577paddingFrom4j6BHR0(@m80.k Modifier modifier, @m80.k final AlignmentLine alignmentLine, final float f11, final float f12) {
        return modifier.then(new AlignmentLineOffsetDpElement(alignmentLine, f11, f12, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", AlignmentLine.this);
                inspectorInfo.getProperties().set(TtmlNode.ANNOTATION_POSITION_BEFORE, Dp.m5113boximpl(f11));
                inspectorInfo.getProperties().set(TtmlNode.ANNOTATION_POSITION_AFTER, Dp.m5113boximpl(f12));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFrom-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m578paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            f12 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        return m577paddingFrom4j6BHR0(modifier, alignmentLine, f11, f12);
    }

    @Stable
    @m80.k
    /* renamed from: paddingFrom-Y_r0B1c, reason: not valid java name */
    public static final Modifier m579paddingFromY_r0B1c(@m80.k Modifier modifier, @m80.k final AlignmentLine alignmentLine, long j11, long j12) {
        AlignmentLine alignmentLine2;
        final long j13;
        final long j14;
        l<InspectorInfo, g2> noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            j13 = j11;
            j14 = j12;
            noInspectorInfo = new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1
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
                    inspectorInfo.setName("paddingFrom");
                    inspectorInfo.getProperties().set("alignmentLine", AlignmentLine.this);
                    inspectorInfo.getProperties().set(TtmlNode.ANNOTATION_POSITION_BEFORE, TextUnit.m5299boximpl(j13));
                    inspectorInfo.getProperties().set(TtmlNode.ANNOTATION_POSITION_AFTER, TextUnit.m5299boximpl(j14));
                }
            };
            alignmentLine2 = alignmentLine;
        } else {
            alignmentLine2 = alignmentLine;
            j13 = j11;
            j14 = j12;
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new AlignmentLineOffsetTextUnitElement(alignmentLine2, j13, j14, noInspectorInfo, null));
    }

    /* renamed from: paddingFrom-Y_r0B1c$default, reason: not valid java name */
    public static /* synthetic */ Modifier m580paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j11, long j12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = TextUnit.Companion.m5320getUnspecifiedXSAIIZE();
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            j12 = TextUnit.Companion.m5320getUnspecifiedXSAIIZE();
        }
        return m579paddingFromY_r0B1c(modifier, alignmentLine, j13, j12);
    }

    @Stable
    @m80.k
    /* renamed from: paddingFromBaseline-VpY3zN4, reason: not valid java name */
    public static final Modifier m581paddingFromBaselineVpY3zN4(@m80.k Modifier modifier, float f11, float f12) {
        return modifier.then(!Float.isNaN(f11) ? m578paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), f11, 0.0f, 4, null) : Modifier.Companion).then(!Float.isNaN(f12) ? m578paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f12, 2, null) : Modifier.Companion);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m582paddingFromBaselineVpY3zN4$default(Modifier modifier, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        if ((i11 & 2) != 0) {
            f12 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        return m581paddingFromBaselineVpY3zN4(modifier, f11, f12);
    }

    @Stable
    @m80.k
    /* renamed from: paddingFromBaseline-wCyjxdI, reason: not valid java name */
    public static final Modifier m583paddingFromBaselinewCyjxdI(@m80.k Modifier modifier, long j11, long j12) {
        return modifier.then(TextUnit.m5307getRawTypeimpl(j11) == 0 ? Modifier.Companion : m580paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), j11, 0L, 4, null)).then(TextUnit.m5307getRawTypeimpl(j12) == 0 ? Modifier.Companion : m580paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j12, 2, null));
    }

    /* renamed from: paddingFromBaseline-wCyjxdI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m584paddingFromBaselinewCyjxdI$default(Modifier modifier, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = TextUnit.Companion.m5320getUnspecifiedXSAIIZE();
        }
        if ((i11 & 2) != 0) {
            j12 = TextUnit.Companion.m5320getUnspecifiedXSAIIZE();
        }
        return m583paddingFromBaselinewCyjxdI(modifier, j11, j12);
    }
}
