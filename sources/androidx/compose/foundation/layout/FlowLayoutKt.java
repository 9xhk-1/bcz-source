package androidx.compose.foundation.layout;

import a00.a0;
import a00.d1;
import a00.r0;
import androidx.collection.IntIntPair;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.l;
import x00.q;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n+ 10 IntList.kt\nandroidx/collection/IntListKt\n+ 11 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 12 IntList.kt\nandroidx/collection/IntList\n+ 13 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1594:1\n1107#1,115:1734\n1247#2,6:1595\n1247#2,6:1601\n1247#2,6:1612\n1247#2,6:1649\n1247#2,6:1655\n1247#2,6:1666\n1247#2,6:1703\n1247#2,6:1709\n1247#2,6:1715\n1247#2,6:1721\n165#3,5:1607\n79#3,6:1618\n86#3,3:1633\n89#3,2:1642\n93#3:1647\n171#3:1648\n165#3,5:1661\n79#3,6:1672\n86#3,3:1687\n89#3,2:1696\n93#3:1701\n171#3:1702\n347#4,9:1624\n356#4,3:1644\n347#4,9:1678\n356#4,3:1698\n4206#5,6:1636\n4206#5,6:1690\n70#6,6:1727\n1#7:1733\n1101#8:1849\n1083#8,2:1850\n213#9:1852\n210#9:1853\n219#9:1854\n216#9:1867\n213#9:1868\n216#9,4:1871\n216#9,4:1885\n210#9,4:1899\n905#10:1855\n905#10:1856\n105#11:1857\n105#11:1858\n101#11,10:1875\n101#11,10:1889\n101#11,10:1903\n70#12:1859\n65#12:1860\n65#12:1861\n65#12:1862\n251#12,4:1863\n256#12:1869\n516#13:1870\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n*L\n1079#1:1734,115\n100#1:1595,6\n111#1:1601,6\n118#1:1612,6\n214#1:1649,6\n225#1:1655,6\n231#1:1666,6\n451#1:1703,6\n486#1:1709,6\n516#1:1715,6\n548#1:1721,6\n118#1:1607,5\n118#1:1618,6\n118#1:1633,3\n118#1:1642,2\n118#1:1647\n118#1:1648\n231#1:1661,5\n231#1:1672,6\n231#1:1687,3\n231#1:1696,2\n231#1:1701\n231#1:1702\n118#1:1624,9\n118#1:1644,3\n231#1:1678,9\n231#1:1698,3\n118#1:1636,6\n231#1:1690,6\n957#1:1727,6\n1239#1:1849\n1239#1:1850,2\n1240#1:1852\n1241#1:1853\n1242#1:1854\n1444#1:1867\n1445#1:1868\n1564#1:1871,4\n1572#1:1885,4\n1578#1:1899,4\n1287#1:1855\n1288#1:1856\n1350#1:1857\n1360#1:1858\n1564#1:1875,10\n1572#1:1889,10\n1578#1:1903,10\n1421#1:1859\n1423#1:1860\n1434#1:1861\n1435#1:1862\n1439#1:1863,4\n1439#1:1869\n1471#1:1870\n*E\n"})
/* loaded from: classes.dex */
public final class FlowLayoutKt {

    @m80.k
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_START;

    @m80.k
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_TOP;

    static {
        CrossAxisAlignment.Companion companion = CrossAxisAlignment.Companion;
        Alignment.Companion companion2 = Alignment.Companion;
        CROSS_AXIS_ALIGNMENT_TOP = companion.vertical$foundation_layout_release(companion2.getTop());
        CROSS_AXIS_ALIGNMENT_START = companion.horizontal$foundation_layout_release(companion2.getStart());
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01bd, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L142;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @androidx.compose.foundation.layout.ExperimentalLayoutApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    @yz.n(message = "The overflow parameter has been deprecated")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowColumn(@m80.l androidx.compose.ui.Modifier r24, @m80.l androidx.compose.foundation.layout.Arrangement.Vertical r25, @m80.l androidx.compose.foundation.layout.Arrangement.Horizontal r26, @m80.l androidx.compose.ui.Alignment.Horizontal r27, int r28, int r29, @m80.l androidx.compose.foundation.layout.FlowColumnOverflow r30, @m80.k final x00.q<? super androidx.compose.foundation.layout.FlowColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r31, @m80.l androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Horizontal, int, int, androidx.compose.foundation.layout.FlowColumnOverflow, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01bd, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L142;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @androidx.compose.foundation.layout.ExperimentalLayoutApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    @yz.n(message = "The overflow parameter has been deprecated")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowRow(@m80.l androidx.compose.ui.Modifier r24, @m80.l androidx.compose.foundation.layout.Arrangement.Horizontal r25, @m80.l androidx.compose.foundation.layout.Arrangement.Vertical r26, @m80.l androidx.compose.ui.Alignment.Vertical r27, int r28, int r29, @m80.l androidx.compose.foundation.layout.FlowRowOverflow r30, @m80.k final x00.q<? super androidx.compose.foundation.layout.FlowRowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r31, @m80.l androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, int, int, androidx.compose.foundation.layout.FlowRowOverflow, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    /* renamed from: breakDownItems-di9J0FM, reason: not valid java name */
    public static final MeasureResult m650breakDownItemsdi9J0FM(@m80.k MeasureScope measureScope, @m80.k FlowLineMeasurePolicy flowLineMeasurePolicy, @m80.k Iterator<? extends Measurable> it, float f11, float f12, long j11, int i11, int i12, @m80.k FlowLayoutOverflowState flowLayoutOverflowState) {
        int i13;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo;
        MutableIntObjectMap mutableIntObjectMap;
        int i14;
        int i15;
        MeasureScope measureScope2;
        FlowLineMeasurePolicy flowLineMeasurePolicy2;
        int[] iArr;
        int[] iArr2;
        long j12;
        int height;
        int width;
        int i16;
        MutableIntObjectMap mutableIntObjectMap2;
        IntIntPair m14boximpl;
        MutableIntList mutableIntList;
        MutableIntList mutableIntList2;
        int i17;
        int i18;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo2;
        int i19;
        int i21;
        int i22;
        MeasureScope measureScope3 = measureScope;
        FlowLineMeasurePolicy flowLineMeasurePolicy3 = flowLineMeasurePolicy;
        Iterator<? extends Measurable> it2 = it;
        MutableVector mutableVector = new MutableVector(new MeasureResult[16], 0);
        int m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(j11);
        int m5070getMinWidthimpl = Constraints.m5070getMinWidthimpl(j11);
        int m5067getMaxHeightimpl = Constraints.m5067getMaxHeightimpl(j11);
        MutableIntObjectMap mutableIntObjectMapOf = IntObjectMapKt.mutableIntObjectMapOf();
        ArrayList arrayList = new ArrayList();
        int ceil = (int) Math.ceil(measureScope3.mo377toPx0680j_4(f11));
        int ceil2 = (int) Math.ceil(measureScope3.mo377toPx0680j_4(f12));
        long m693constructorimpl = OrientationIndependentConstraints.m693constructorimpl(0, m5068getMaxWidthimpl, 0, m5067getMaxHeightimpl);
        long m708toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m708toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m697copyyUG9Ft0$default(m693constructorimpl, 0, 0, 0, 0, 14, null), flowLineMeasurePolicy3.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        FlowLineInfo flowLineInfo = it2 instanceof ContextualFlowItemIterator ? new FlowLineInfo(0, 0, measureScope3.mo374toDpu2uoSUM(m5068getMaxWidthimpl), measureScope3.mo374toDpu2uoSUM(m5067getMaxHeightimpl), null) : null;
        Measurable safeNext = !it2.hasNext() ? null : safeNext(it2, flowLineInfo);
        IntIntPair m14boximpl2 = safeNext != null ? IntIntPair.m14boximpl(m651measureAndCacherqJ1uqs(safeNext, flowLineMeasurePolicy3, m708toBoxConstraintsOenEA2s, new l<Placeable, g2>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Placeable placeable) {
                invoke2(placeable);
                return g2.f100423a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable placeable) {
                objectRef.element = placeable;
            }
        })) : null;
        Integer valueOf = m14boximpl2 != null ? Integer.valueOf(IntIntPair.m21getFirstimpl(m14boximpl2.m25unboximpl())) : null;
        Integer valueOf2 = m14boximpl2 != null ? Integer.valueOf(IntIntPair.m22getSecondimpl(m14boximpl2.m25unboximpl())) : null;
        Integer num = valueOf;
        Measurable measurable = safeNext;
        MutableIntList mutableIntList3 = new MutableIntList(0, 1, null);
        MutableIntList mutableIntList4 = new MutableIntList(0, 1, null);
        FlowLineInfo flowLineInfo2 = flowLineInfo;
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i11, flowLayoutOverflowState, j11, i12, ceil, ceil2, null);
        int i23 = ceil;
        FlowLayoutBuildingBlocks.WrapInfo m648getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m648getWrapInfoOpUlnko(it2.hasNext(), 0, IntIntPair.m17constructorimpl(m5068getMaxWidthimpl, m5067getMaxHeightimpl), m14boximpl2, 0, 0, 0, false, false);
        if (m648getWrapInfoOpUlnko.isLastItemInContainer()) {
            wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m648getWrapInfoOpUlnko, m14boximpl2 != null, -1, 0, m5068getMaxWidthimpl, 0);
            i13 = m5068getMaxWidthimpl;
        } else {
            i13 = m5068getMaxWidthimpl;
            wrapEllipsisInfo = null;
        }
        Integer num2 = num;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo3 = wrapEllipsisInfo;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfo = m648getWrapInfoOpUlnko;
        int i28 = 0;
        int i29 = m5070getMinWidthimpl;
        MutableIntList mutableIntList5 = mutableIntList3;
        int i31 = m5067getMaxHeightimpl;
        int i32 = 0;
        int i33 = i13;
        Measurable measurable2 = measurable;
        while (!wrapInfo.isLastItemInContainer() && measurable2 != null) {
            g0.m(num2);
            int intValue = num2.intValue();
            g0.m(valueOf2);
            MutableIntList mutableIntList6 = mutableIntList4;
            int i34 = i13;
            int i35 = i25 + intValue;
            int max = Math.max(i24, valueOf2.intValue());
            int i36 = i33 - intValue;
            int i37 = i32 + 1;
            int i38 = i29;
            flowLayoutOverflowState.setItemShown$foundation_layout_release(i37);
            arrayList.add(measurable2);
            mutableIntObjectMapOf.set(i32, objectRef.element);
            int i39 = i37 - i26;
            boolean z11 = i39 < i11;
            if (flowLineInfo2 != null) {
                if (z11) {
                    i16 = i39;
                    i19 = i28;
                } else {
                    i16 = i39;
                    i19 = i28 + 1;
                }
                int i41 = z11 ? i16 : 0;
                if (z11) {
                    int i42 = i36 - i23;
                    i21 = i42 < 0 ? 0 : i42;
                } else {
                    i21 = i34;
                }
                float mo374toDpu2uoSUM = measureScope3.mo374toDpu2uoSUM(i21);
                if (z11) {
                    mutableIntObjectMap2 = mutableIntObjectMapOf;
                    i22 = i31;
                } else {
                    int i43 = (i31 - max) - ceil2;
                    mutableIntObjectMap2 = mutableIntObjectMapOf;
                    i22 = i43 < 0 ? 0 : i43;
                }
                flowLineInfo2.m661update4j6BHR0$foundation_layout_release(i19, i41, mo374toDpu2uoSUM, measureScope3.mo374toDpu2uoSUM(i22));
            } else {
                i16 = i39;
                mutableIntObjectMap2 = mutableIntObjectMapOf;
            }
            measurable2 = !it2.hasNext() ? null : safeNext(it2, flowLineInfo2);
            objectRef.element = null;
            IntIntPair m14boximpl3 = measurable2 != null ? IntIntPair.m14boximpl(m651measureAndCacherqJ1uqs(measurable2, flowLineMeasurePolicy3, m708toBoxConstraintsOenEA2s, new l<Placeable, g2>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Placeable placeable) {
                    invoke2(placeable);
                    return g2.f100423a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable placeable) {
                    objectRef.element = placeable;
                }
            })) : null;
            Integer valueOf3 = m14boximpl3 != null ? Integer.valueOf(IntIntPair.m21getFirstimpl(m14boximpl3.m25unboximpl()) + i23) : null;
            valueOf2 = m14boximpl3 != null ? Integer.valueOf(IntIntPair.m22getSecondimpl(m14boximpl3.m25unboximpl())) : null;
            boolean hasNext = it2.hasNext();
            int i44 = i28;
            long m17constructorimpl = IntIntPair.m17constructorimpl(i36, i31);
            if (m14boximpl3 == null) {
                m14boximpl = null;
            } else {
                g0.m(valueOf3);
                int intValue2 = valueOf3.intValue();
                g0.m(valueOf2);
                m14boximpl = IntIntPair.m14boximpl(IntIntPair.m17constructorimpl(intValue2, valueOf2.intValue()));
            }
            FlowLayoutBuildingBlocks.WrapInfo m648getWrapInfoOpUlnko2 = flowLayoutBuildingBlocks.m648getWrapInfoOpUlnko(hasNext, i16, m17constructorimpl, m14boximpl, i44, i27, max, false, false);
            if (m648getWrapInfoOpUlnko2.isLastItemInLine()) {
                int min = Math.min(Math.max(i38, i35), i34);
                int i45 = i27 + max;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo4 = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m648getWrapInfoOpUlnko2, m14boximpl3 != null, i44, i45, i36, i16);
                mutableIntList = mutableIntList6;
                mutableIntList.add(max);
                int i46 = (m5067getMaxHeightimpl - i45) - ceil2;
                MutableIntList mutableIntList7 = mutableIntList5;
                mutableIntList7.add(i37);
                i28 = i44 + 1;
                i27 = i45 + ceil2;
                i33 = i34;
                i34 = i33;
                num2 = valueOf3 != null ? Integer.valueOf(valueOf3.intValue() - i23) : null;
                i26 = i37;
                i17 = i46;
                wrapEllipsisInfo2 = wrapEllipsisInfo4;
                i29 = min;
                mutableIntList2 = mutableIntList7;
                i18 = 0;
                i35 = 0;
            } else {
                mutableIntList = mutableIntList6;
                mutableIntList2 = mutableIntList5;
                num2 = valueOf3;
                i33 = i36;
                i28 = i44;
                i29 = i38;
                i17 = i31;
                i18 = max;
                wrapEllipsisInfo2 = wrapEllipsisInfo3;
            }
            wrapEllipsisInfo3 = wrapEllipsisInfo2;
            mutableIntList5 = mutableIntList2;
            i24 = i18;
            i31 = i17;
            i32 = i37;
            wrapInfo = m648getWrapInfoOpUlnko2;
            it2 = it;
            mutableIntList4 = mutableIntList;
            mutableIntObjectMapOf = mutableIntObjectMap2;
            i25 = i35;
            i13 = i34;
        }
        MutableIntObjectMap mutableIntObjectMap3 = mutableIntObjectMapOf;
        int i47 = i29;
        MutableIntList mutableIntList8 = mutableIntList4;
        MutableIntList mutableIntList9 = mutableIntList5;
        if (wrapEllipsisInfo3 != null) {
            arrayList.add(wrapEllipsisInfo3.getEllipsis());
            mutableIntObjectMap = mutableIntObjectMap3;
            mutableIntObjectMap.set(arrayList.size() - 1, wrapEllipsisInfo3.getPlaceable());
            int i48 = mutableIntList9._size - 1;
            if (wrapEllipsisInfo3.getPlaceEllipsisOnLastContentLine()) {
                int i49 = mutableIntList9._size - 1;
                mutableIntList8.set(i48, Math.max(mutableIntList8.get(i48), IntIntPair.m22getSecondimpl(wrapEllipsisInfo3.m649getEllipsisSizeOO21N7I())));
                mutableIntList9.set(i49, mutableIntList9.last() + 1);
            } else {
                mutableIntList8.add(IntIntPair.m22getSecondimpl(wrapEllipsisInfo3.m649getEllipsisSizeOO21N7I()));
                mutableIntList9.add(mutableIntList9.last() + 1);
            }
        } else {
            mutableIntObjectMap = mutableIntObjectMap3;
        }
        int size = arrayList.size();
        Placeable[] placeableArr = new Placeable[size];
        for (int i51 = 0; i51 < size; i51++) {
            placeableArr[i51] = mutableIntObjectMap.get(i51);
        }
        int i52 = mutableIntList9._size;
        int[] iArr3 = new int[i52];
        int[] iArr4 = new int[i52];
        int[] iArr5 = mutableIntList9.content;
        int i53 = i47;
        int i54 = 0;
        int i55 = 0;
        int i56 = 0;
        Placeable[] placeableArr2 = placeableArr;
        while (i55 < i52) {
            int i57 = iArr5[i55];
            MutableIntList mutableIntList10 = mutableIntList8;
            int i58 = mutableIntList10.get(i55);
            int[] iArr6 = iArr3;
            Placeable[] placeableArr3 = placeableArr2;
            FlowLineMeasurePolicy flowLineMeasurePolicy4 = flowLineMeasurePolicy3;
            ArrayList arrayList2 = arrayList;
            int i59 = i23;
            MeasureResult measure = RowColumnMeasurePolicyKt.measure(flowLineMeasurePolicy4, i53, Constraints.m5069getMinHeightimpl(m693constructorimpl), Constraints.m5068getMaxWidthimpl(m693constructorimpl), i58, i59, measureScope3, arrayList2, placeableArr3, i54, i57, iArr6, i55);
            if (flowLineMeasurePolicy.isHorizontal()) {
                height = measure.getWidth();
                width = measure.getHeight();
            } else {
                height = measure.getHeight();
                width = measure.getWidth();
            }
            iArr4[i55] = width;
            i56 += width;
            i53 = Math.max(i53, height);
            mutableVector.add(measure);
            i55++;
            arrayList = arrayList2;
            placeableArr2 = placeableArr3;
            i54 = i57;
            iArr3 = iArr6;
            mutableIntList8 = mutableIntList10;
            i23 = i59;
            measureScope3 = measureScope;
            flowLineMeasurePolicy3 = flowLineMeasurePolicy;
        }
        int[] iArr7 = iArr3;
        if (mutableVector.getSize() == 0) {
            i14 = 0;
            i15 = 0;
            measureScope2 = measureScope;
            flowLineMeasurePolicy2 = flowLineMeasurePolicy;
            j12 = j11;
            iArr = iArr7;
            iArr2 = iArr4;
        } else {
            i14 = i53;
            i15 = i56;
            measureScope2 = measureScope;
            flowLineMeasurePolicy2 = flowLineMeasurePolicy;
            iArr = iArr7;
            iArr2 = iArr4;
            j12 = j11;
        }
        return m652placeHelperBmaY500(measureScope2, j12, i14, i15, iArr2, mutableVector, flowLineMeasurePolicy2, iArr);
    }

    @Composable
    @v0
    @m80.k
    public static final MeasurePolicy columnMeasurementHelper(@m80.k Arrangement.Vertical vertical, @m80.k Arrangement.Horizontal horizontal, int i11, @m80.l Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013098357, i12, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:514)");
        }
        boolean z11 = ((((i12 & 14) ^ 6) > 4 && composer.changed(vertical)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i12 & 48) == 32) | ((((i12 & 896) ^ 384) > 256 && composer.changed(i11)) || (i12 & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            final FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(false, horizontal, vertical, vertical.mo613getSpacingD9Ej5fM(), CROSS_AXIS_ALIGNMENT_START, horizontal.mo613getSpacingD9Ej5fM(), i11, Integer.MAX_VALUE, FlowRowOverflow.Companion.getVisible().createOverflowState$foundation_layout_release(), null);
            rememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$columnMeasurementHelper$1$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j11) {
                    return FlowMeasurePolicy.this.mo673measure3p2s80s(measureScope, a00.g0.l(list), j11);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return measurePolicy;
    }

    @Composable
    @m80.k
    public static final MultiContentMeasurePolicy columnMeasurementMultiContentHelper(@m80.k Arrangement.Vertical vertical, @m80.k Arrangement.Horizontal horizontal, @m80.k Alignment.Horizontal horizontal2, int i11, int i12, @m80.k FlowLayoutOverflowState flowLayoutOverflowState, @m80.l Composer composer, int i13) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-308635847, i13, -1, "androidx.compose.foundation.layout.columnMeasurementMultiContentHelper (FlowLayout.kt:546)");
        }
        boolean changed = ((((i13 & 14) ^ 6) > 4 && composer.changed(vertical)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i13 & 48) == 32) | ((((i13 & 896) ^ 384) > 256 && composer.changed(horizontal2)) || (i13 & 384) == 256) | ((((i13 & 7168) ^ 3072) > 2048 && composer.changed(i11)) || (i13 & 3072) == 2048) | ((((57344 & i13) ^ 24576) > 16384 && composer.changed(i12)) || (i13 & 24576) == 16384) | composer.changed(flowLayoutOverflowState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(false, horizontal, vertical, vertical.mo613getSpacingD9Ej5fM(), CrossAxisAlignment.Companion.horizontal$foundation_layout_release(horizontal2), horizontal.mo613getSpacingD9Ej5fM(), i11, i12, flowLayoutOverflowState, null);
            composer.updateRememberedValue(flowMeasurePolicy);
            rememberedValue = flowMeasurePolicy;
        }
        FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return flowMeasurePolicy2;
    }

    public static final int crossAxisMin(@m80.k IntrinsicMeasurable intrinsicMeasurable, boolean z11, int i11) {
        return z11 ? intrinsicMeasurable.minIntrinsicHeight(i11) : intrinsicMeasurable.minIntrinsicWidth(i11);
    }

    @m80.k
    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_START() {
        return CROSS_AXIS_ALIGNMENT_START;
    }

    @m80.k
    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_TOP() {
        return CROSS_AXIS_ALIGNMENT_TOP;
    }

    private static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, q<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> qVar, q<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> qVar2, int i11, int i12, int i13, int i14, int i15, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i16;
        if (list.isEmpty()) {
            return IntIntPair.m17constructorimpl(0, 0);
        }
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i14, flowLayoutOverflowState, OrientationIndependentConstraints.m693constructorimpl(0, i11, 0, Integer.MAX_VALUE), i15, i12, i13, null);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) r0.b3(list, 0);
        int intValue = intrinsicMeasurable != null ? qVar2.invoke(intrinsicMeasurable, 0, Integer.valueOf(i11)).intValue() : 0;
        int intValue2 = intrinsicMeasurable != null ? qVar.invoke(intrinsicMeasurable, 0, Integer.valueOf(intValue)).intValue() : 0;
        int i17 = 0;
        int i18 = 0;
        if (flowLayoutBuildingBlocks.m648getWrapInfoOpUlnko(list.size() > 1, 0, IntIntPair.m17constructorimpl(i11, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.m14boximpl(IntIntPair.m17constructorimpl(intValue2, intValue)), 0, 0, 0, false, false).isLastItemInContainer()) {
            IntIntPair m653ellipsisSizeF35zmw$foundation_layout_release = flowLayoutOverflowState.m653ellipsisSizeF35zmw$foundation_layout_release(intrinsicMeasurable != null, 0, 0);
            return IntIntPair.m17constructorimpl(m653ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m22getSecondimpl(m653ellipsisSizeF35zmw$foundation_layout_release.m25unboximpl()) : 0, 0);
        }
        int size = list.size();
        int i19 = i11;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (true) {
            int i25 = i18;
            if (i21 >= size) {
                i16 = i22;
                break;
            }
            int i26 = i19 - intValue2;
            int i27 = i21 + 1;
            i18 = Math.max(i25, intValue);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) r0.b3(list, i27);
            int intValue3 = intrinsicMeasurable2 != null ? qVar2.invoke(intrinsicMeasurable2, Integer.valueOf(i27), Integer.valueOf(i11)).intValue() : 0;
            int intValue4 = intrinsicMeasurable2 != null ? qVar.invoke(intrinsicMeasurable2, Integer.valueOf(i27), Integer.valueOf(intValue3)).intValue() + i12 : 0;
            int i28 = i27 - i23;
            i16 = i27;
            int i29 = i24;
            FlowLayoutBuildingBlocks.WrapInfo m648getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m648getWrapInfoOpUlnko(i21 + 2 < list.size(), i28, IntIntPair.m17constructorimpl(i26, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.m14boximpl(IntIntPair.m17constructorimpl(intValue4, intValue3)), i29, i17, i18, false, false);
            if (m648getWrapInfoOpUlnko.isLastItemInLine()) {
                int i31 = i17 + i18 + i13;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m648getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i29, i31, i26, i28);
                intValue4 -= i12;
                i24 = i29 + 1;
                if (m648getWrapInfoOpUlnko.isLastItemInContainer()) {
                    if (wrapEllipsisInfo != null) {
                        long m649getEllipsisSizeOO21N7I = wrapEllipsisInfo.m649getEllipsisSizeOO21N7I();
                        if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                            i31 += IntIntPair.m22getSecondimpl(m649getEllipsisSizeOO21N7I) + i13;
                        }
                    }
                    i17 = i31;
                } else {
                    i19 = i11;
                    i23 = i16;
                    i17 = i31;
                    i18 = 0;
                }
            } else {
                i19 = i26;
                i24 = i29;
            }
            intValue2 = intValue4;
            intValue = intValue3;
            i21 = i16;
            i22 = i21;
        }
        return IntIntPair.m17constructorimpl(i17 - i13, i16);
    }

    public static final int mainAxisMin(@m80.k IntrinsicMeasurable intrinsicMeasurable, boolean z11, int i11) {
        return z11 ? intrinsicMeasurable.minIntrinsicWidth(i11) : intrinsicMeasurable.minIntrinsicHeight(i11);
    }

    private static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, q<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> qVar, int i11, int i12, int i13) {
        int size = list.size();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i14 < size) {
            int intValue = qVar.invoke(list.get(i14), Integer.valueOf(i14), Integer.valueOf(i11)).intValue() + i12;
            int i18 = i14 + 1;
            if (i18 - i16 == i13 || i18 == list.size()) {
                i15 = Math.max(i15, (i17 + intValue) - i12);
                i17 = 0;
                i16 = i14;
            } else {
                i17 += intValue;
            }
            i14 = i18;
        }
        return i15;
    }

    /* renamed from: measureAndCache-rqJ1uqs, reason: not valid java name */
    public static final long m651measureAndCacherqJ1uqs(@m80.k Measurable measurable, @m80.k FlowLineMeasurePolicy flowLineMeasurePolicy, long j11, @m80.k l<? super Placeable, g2> lVar) {
        FlowLayoutData flowLayoutData;
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable)) == 0.0f) {
            RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(measurable);
            if (((rowColumnParentData == null || (flowLayoutData = rowColumnParentData.getFlowLayoutData()) == null) ? null : Float.valueOf(flowLayoutData.getFillCrossAxisFraction())) == null) {
                Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
                lVar.invoke(mo3857measureBRTryo0);
                return IntIntPair.m17constructorimpl(flowLineMeasurePolicy.mainAxisSize(mo3857measureBRTryo0), flowLineMeasurePolicy.crossAxisSize(mo3857measureBRTryo0));
            }
        }
        int mainAxisMin = mainAxisMin(measurable, flowLineMeasurePolicy.isHorizontal(), Integer.MAX_VALUE);
        return IntIntPair.m17constructorimpl(mainAxisMin, crossAxisMin(measurable, flowLineMeasurePolicy.isHorizontal(), mainAxisMin));
    }

    private static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, q<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> qVar, q<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> qVar2, int i11, int i12, int i13, int i14, int i15, FlowLayoutOverflowState flowLayoutOverflowState) {
        List<? extends IntrinsicMeasurable> list2 = list;
        int i16 = i14;
        int i17 = i15;
        if (list2.isEmpty()) {
            return 0;
        }
        int size = list2.size();
        int[] iArr = new int[size];
        int size2 = list2.size();
        int[] iArr2 = new int[size2];
        int size3 = list2.size();
        for (int i18 = 0; i18 < size3; i18++) {
            IntrinsicMeasurable intrinsicMeasurable = list2.get(i18);
            int intValue = qVar.invoke(intrinsicMeasurable, Integer.valueOf(i18), Integer.valueOf(i11)).intValue();
            iArr[i18] = intValue;
            iArr2[i18] = qVar2.invoke(intrinsicMeasurable, Integer.valueOf(i18), Integer.valueOf(intValue)).intValue();
        }
        int i19 = Integer.MAX_VALUE;
        if (i17 != Integer.MAX_VALUE && i16 != Integer.MAX_VALUE) {
            i19 = i16 * i17;
        }
        int min = Math.min(i19 - (((i19 >= list2.size() || !(flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandIndicator || flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) && (i19 < list2.size() || i17 < flowLayoutOverflowState.getMinLinesToShowCollapse$foundation_layout_release() || flowLayoutOverflowState.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? 0 : 1), list2.size());
        int uw2 = a0.uw(iArr) + ((list2.size() - 1) * i12);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i21 = iArr2[0];
        d1 it = new g10.l(1, a0.Me(iArr2)).iterator();
        while (it.hasNext()) {
            int i22 = iArr2[it.nextInt()];
            if (i21 < i22) {
                i21 = i22;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i23 = iArr[0];
        d1 it2 = new g10.l(1, a0.Me(iArr)).iterator();
        while (it2.hasNext()) {
            int i24 = iArr[it2.nextInt()];
            if (i23 < i24) {
                i23 = i24;
            }
        }
        int i25 = i23;
        int i26 = uw2;
        while (i25 <= i26 && i21 != i11) {
            int i27 = (i25 + i26) / 2;
            long intrinsicCrossAxisSize = intrinsicCrossAxisSize(list2, iArr, iArr2, i27, i12, i13, i16, i17, flowLayoutOverflowState);
            i21 = IntIntPair.m21getFirstimpl(intrinsicCrossAxisSize);
            int m22getSecondimpl = IntIntPair.m22getSecondimpl(intrinsicCrossAxisSize);
            if (i21 > i11 || m22getSecondimpl < min) {
                i25 = i27 + 1;
                if (i25 > i26) {
                    return i25;
                }
            } else {
                if (i21 >= i11) {
                    return i27;
                }
                i26 = i27 - 1;
            }
            list2 = list;
            i16 = i14;
            i17 = i15;
            uw2 = i27;
        }
        return uw2;
    }

    @m80.k
    /* renamed from: placeHelper-BmaY500, reason: not valid java name */
    public static final MeasureResult m652placeHelperBmaY500(@m80.k MeasureScope measureScope, long j11, int i11, int i12, @m80.k int[] iArr, @m80.k final MutableVector<MeasureResult> mutableVector, @m80.k FlowLineMeasurePolicy flowLineMeasurePolicy, @m80.k int[] iArr2) {
        int i13;
        int i14;
        int i15;
        boolean isHorizontal = flowLineMeasurePolicy.isHorizontal();
        Arrangement.Vertical verticalArrangement = flowLineMeasurePolicy.getVerticalArrangement();
        Arrangement.Horizontal horizontalArrangement = flowLineMeasurePolicy.getHorizontalArrangement();
        if (isHorizontal) {
            int mo371roundToPx0680j_4 = i12 + (measureScope.mo371roundToPx0680j_4(verticalArrangement.mo613getSpacingD9Ej5fM()) * (mutableVector.getSize() - 1));
            int m5069getMinHeightimpl = Constraints.m5069getMinHeightimpl(j11);
            i13 = Constraints.m5067getMaxHeightimpl(j11);
            if (mo371roundToPx0680j_4 < m5069getMinHeightimpl) {
                mo371roundToPx0680j_4 = m5069getMinHeightimpl;
            }
            if (mo371roundToPx0680j_4 <= i13) {
                i13 = mo371roundToPx0680j_4;
            }
            verticalArrangement.arrange(measureScope, i13, iArr, iArr2);
        } else {
            int mo371roundToPx0680j_42 = i12 + (measureScope.mo371roundToPx0680j_4(horizontalArrangement.mo613getSpacingD9Ej5fM()) * (mutableVector.getSize() - 1));
            int m5069getMinHeightimpl2 = Constraints.m5069getMinHeightimpl(j11);
            int m5067getMaxHeightimpl = Constraints.m5067getMaxHeightimpl(j11);
            if (mo371roundToPx0680j_42 < m5069getMinHeightimpl2) {
                mo371roundToPx0680j_42 = m5069getMinHeightimpl2;
            }
            int i16 = mo371roundToPx0680j_42 > m5067getMaxHeightimpl ? m5067getMaxHeightimpl : mo371roundToPx0680j_42;
            horizontalArrangement.arrange(measureScope, i16, iArr, measureScope.getLayoutDirection(), iArr2);
            i13 = i16;
        }
        int m5070getMinWidthimpl = Constraints.m5070getMinWidthimpl(j11);
        int m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(j11);
        if (i11 < m5070getMinWidthimpl) {
            i11 = m5070getMinWidthimpl;
        }
        if (i11 <= m5068getMaxWidthimpl) {
            m5068getMaxWidthimpl = i11;
        }
        if (isHorizontal) {
            i15 = m5068getMaxWidthimpl;
            i14 = i13;
        } else {
            i14 = m5068getMaxWidthimpl;
            i15 = i13;
        }
        return MeasureScope.layout$default(measureScope, i15, i14, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$placeHelper$3
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
                MutableVector<MeasureResult> mutableVector2 = mutableVector;
                MeasureResult[] measureResultArr = mutableVector2.content;
                int size = mutableVector2.getSize();
                for (int i17 = 0; i17 < size; i17++) {
                    measureResultArr[i17].placeChildren();
                }
            }
        }, 4, null);
    }

    @Composable
    @v0
    @m80.k
    public static final MeasurePolicy rowMeasurementHelper(@m80.k Arrangement.Horizontal horizontal, @m80.k Arrangement.Vertical vertical, int i11, @m80.l Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1479255111, i12, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:449)");
        }
        boolean z11 = ((((i12 & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i12 & 48) == 32) | ((((i12 & 896) ^ 384) > 256 && composer.changed(i11)) || (i12 & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            final FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.mo613getSpacingD9Ej5fM(), CROSS_AXIS_ALIGNMENT_TOP, vertical.mo613getSpacingD9Ej5fM(), i11, Integer.MAX_VALUE, FlowRowOverflow.Companion.getVisible().createOverflowState$foundation_layout_release(), null);
            rememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$rowMeasurementHelper$1$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j11) {
                    return MultiContentMeasurePolicy.this.mo673measure3p2s80s(measureScope, a00.g0.l(list), j11);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return measurePolicy;
    }

    @Composable
    @m80.k
    public static final MultiContentMeasurePolicy rowMeasurementMultiContentHelper(@m80.k Arrangement.Horizontal horizontal, @m80.k Arrangement.Vertical vertical, @m80.k Alignment.Vertical vertical2, int i11, int i12, @m80.k FlowLayoutOverflowState flowLayoutOverflowState, @m80.l Composer composer, int i13) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2010142641, i13, -1, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:484)");
        }
        boolean changed = ((((i13 & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i13 & 48) == 32) | ((((i13 & 896) ^ 384) > 256 && composer.changed(vertical2)) || (i13 & 384) == 256) | ((((i13 & 7168) ^ 3072) > 2048 && composer.changed(i11)) || (i13 & 3072) == 2048) | ((((57344 & i13) ^ 24576) > 16384 && composer.changed(i12)) || (i13 & 24576) == 16384) | composer.changed(flowLayoutOverflowState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.mo613getSpacingD9Ej5fM(), CrossAxisAlignment.Companion.vertical$foundation_layout_release(vertical2), vertical.mo613getSpacingD9Ej5fM(), i11, i12, flowLayoutOverflowState, null);
            composer.updateRememberedValue(flowMeasurePolicy);
            rememberedValue = flowMeasurePolicy;
        }
        FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return flowMeasurePolicy2;
    }

    private static final Measurable safeNext(Iterator<? extends Measurable> it, FlowLineInfo flowLineInfo) {
        try {
            if (!(it instanceof ContextualFlowItemIterator)) {
                return it.next();
            }
            g0.m(flowLineInfo);
            return ((ContextualFlowItemIterator) it).getNext$foundation_layout_release(flowLineInfo);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int[] iArr, int[] iArr2, int i11, int i12, int i13, int i14, int i15, FlowLayoutOverflowState flowLayoutOverflowState) {
        if (list.isEmpty()) {
            return IntIntPair.m17constructorimpl(0, 0);
        }
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i14, flowLayoutOverflowState, OrientationIndependentConstraints.m693constructorimpl(0, i11, 0, Integer.MAX_VALUE), i15, i12, i13, null);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) r0.b3(list, 0);
        int i16 = intrinsicMeasurable != null ? iArr2[0] : 0;
        int i17 = intrinsicMeasurable != null ? iArr[0] : 0;
        int i18 = 0;
        if (flowLayoutBuildingBlocks.m648getWrapInfoOpUlnko(list.size() > 1, 0, IntIntPair.m17constructorimpl(i11, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.m14boximpl(IntIntPair.m17constructorimpl(i17, i16)), 0, 0, 0, false, false).isLastItemInContainer()) {
            IntIntPair m653ellipsisSizeF35zmw$foundation_layout_release = flowLayoutOverflowState.m653ellipsisSizeF35zmw$foundation_layout_release(intrinsicMeasurable != null, 0, 0);
            return IntIntPair.m17constructorimpl(m653ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m22getSecondimpl(m653ellipsisSizeF35zmw$foundation_layout_release.m25unboximpl()) : 0, 0);
        }
        int size = list.size();
        int i19 = i11;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        while (true) {
            if (i21 >= size) {
                break;
            }
            int i26 = i19 - i17;
            int i27 = i21 + 1;
            int max = Math.max(i25, i16);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) r0.b3(list, i27);
            int i28 = intrinsicMeasurable2 != null ? iArr2[i27] : 0;
            int i29 = intrinsicMeasurable2 != null ? iArr[i27] + i12 : 0;
            int i31 = i27 - i23;
            int i32 = i24;
            int i33 = i28;
            int i34 = i29;
            FlowLayoutBuildingBlocks.WrapInfo m648getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m648getWrapInfoOpUlnko(i21 + 2 < list.size(), i31, IntIntPair.m17constructorimpl(i26, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.m14boximpl(IntIntPair.m17constructorimpl(i29, i28)), i32, i18, max, false, false);
            if (m648getWrapInfoOpUlnko.isLastItemInLine()) {
                int i35 = i18 + max + i13;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m648getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i32, i35, i26, i31);
                int i36 = i34 - i12;
                i24 = i32 + 1;
                if (m648getWrapInfoOpUlnko.isLastItemInContainer()) {
                    if (wrapEllipsisInfo != null) {
                        long m649getEllipsisSizeOO21N7I = wrapEllipsisInfo.m649getEllipsisSizeOO21N7I();
                        if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                            i35 += IntIntPair.m22getSecondimpl(m649getEllipsisSizeOO21N7I) + i13;
                        }
                    }
                    i18 = i35;
                    i22 = i27;
                } else {
                    i25 = 0;
                    i18 = i35;
                    i17 = i36;
                    i23 = i27;
                    i19 = i11;
                }
            } else {
                i19 = i26;
                i24 = i32;
                i25 = max;
                i17 = i34;
            }
            i21 = i27;
            i22 = i21;
            i16 = i33;
        }
        return IntIntPair.m17constructorimpl(i18 - i13, i22);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x004d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowColumn(@m80.l androidx.compose.ui.Modifier r21, @m80.l androidx.compose.foundation.layout.Arrangement.Vertical r22, @m80.l androidx.compose.foundation.layout.Arrangement.Horizontal r23, @m80.l androidx.compose.ui.Alignment.Horizontal r24, int r25, int r26, @m80.k final x00.q<? super androidx.compose.foundation.layout.FlowColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r27, @m80.l androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Horizontal, int, int, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x004d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowRow(@m80.l androidx.compose.ui.Modifier r21, @m80.l androidx.compose.foundation.layout.Arrangement.Horizontal r22, @m80.l androidx.compose.foundation.layout.Arrangement.Vertical r23, @m80.l androidx.compose.ui.Alignment.Vertical r24, int r25, int r26, @m80.k final x00.q<? super androidx.compose.foundation.layout.FlowRowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r27, @m80.l androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, int, int, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }
}
