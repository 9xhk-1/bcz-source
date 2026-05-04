package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1213:1\n116#2,2:1214\n33#2,6:1216\n118#2:1222\n116#2,2:1223\n33#2,6:1225\n118#2:1231\n116#2,2:1232\n33#2,6:1234\n118#2:1240\n544#2,2:1242\n33#2,6:1244\n546#2:1250\n116#2,2:1251\n33#2,6:1253\n118#2:1259\n544#2,2:1260\n33#2,6:1262\n546#2:1268\n544#2,2:1269\n33#2,6:1271\n546#2:1277\n116#2,2:1278\n33#2,6:1280\n118#2:1286\n116#2,2:1287\n33#2,6:1289\n118#2:1295\n116#2,2:1296\n33#2,6:1298\n118#2:1304\n116#2,2:1305\n33#2,6:1307\n118#2:1313\n116#2,2:1314\n33#2,6:1316\n118#2:1322\n116#2,2:1323\n33#2,6:1325\n118#2:1331\n116#2,2:1332\n33#2,6:1334\n118#2:1340\n544#2,2:1341\n33#2,6:1343\n546#2:1349\n116#2,2:1350\n33#2,6:1352\n118#2:1358\n1#3:1241\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldMeasurePolicy\n*L\n779#1:1214,2\n779#1:1216,6\n779#1:1222\n785#1:1223,2\n785#1:1225,6\n785#1:1231\n804#1:1232,2\n804#1:1234,6\n804#1:1240\n822#1:1242,2\n822#1:1244,6\n822#1:1250\n828#1:1251,2\n828#1:1253,6\n828#1:1259\n858#1:1260,2\n858#1:1262,6\n858#1:1268\n928#1:1269,2\n928#1:1271,6\n928#1:1277\n931#1:1278,2\n931#1:1280,6\n931#1:1286\n935#1:1287,2\n935#1:1289,6\n935#1:1295\n939#1:1296,2\n939#1:1298,6\n939#1:1304\n943#1:1305,2\n943#1:1307,6\n943#1:1313\n966#1:1314,2\n966#1:1316,6\n966#1:1322\n976#1:1323,2\n976#1:1325,6\n976#1:1331\n987#1:1332,2\n987#1:1334,6\n987#1:1340\n991#1:1341,2\n991#1:1343,6\n991#1:1349\n994#1:1350,2\n994#1:1352,6\n994#1:1358\n*E\n"})
/* loaded from: classes.dex */
final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;

    @k
    private final l<Size, g2> onLabelMeasured;

    @k
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    /* JADX WARN: Multi-variable type inference failed */
    public OutlinedTextFieldMeasurePolicy(@k l<? super Size, g2> lVar, boolean z11, float f11, @k PaddingValues paddingValues) {
        this.onLabelMeasured = lVar;
        this.singleLine = z11;
        this.animationProgress = f11;
        this.paddingValues = paddingValues;
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i11, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        int i12;
        int i13;
        IntrinsicMeasurable intrinsicMeasurable3;
        int i14;
        IntrinsicMeasurable intrinsicMeasurable4;
        int m1719calculateHeightO3s9Psw;
        int size = list.size();
        int i15 = 0;
        while (true) {
            intrinsicMeasurable = null;
            if (i15 >= size) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i15);
            if (g0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), TextFieldImplKt.LeadingId)) {
                break;
            }
            i15++;
        }
        IntrinsicMeasurable intrinsicMeasurable5 = intrinsicMeasurable2;
        if (intrinsicMeasurable5 != null) {
            i12 = OutlinedTextFieldKt.substractConstraintSafely(i11, intrinsicMeasurable5.maxIntrinsicWidth(Integer.MAX_VALUE));
            i13 = pVar.invoke(intrinsicMeasurable5, Integer.valueOf(i11)).intValue();
        } else {
            i12 = i11;
            i13 = 0;
        }
        int size2 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size2) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i16);
            if (g0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), TextFieldImplKt.TrailingId)) {
                break;
            }
            i16++;
        }
        IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable3;
        if (intrinsicMeasurable6 != null) {
            i12 = OutlinedTextFieldKt.substractConstraintSafely(i12, intrinsicMeasurable6.maxIntrinsicWidth(Integer.MAX_VALUE));
            i14 = pVar.invoke(intrinsicMeasurable6, Integer.valueOf(i11)).intValue();
        } else {
            i14 = 0;
        }
        int size3 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size3) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i17);
            if (g0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.LabelId)) {
                break;
            }
            i17++;
        }
        IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable4;
        int intValue = intrinsicMeasurable7 != null ? pVar.invoke(intrinsicMeasurable7, Integer.valueOf(MathHelpersKt.lerp(i12, i11, this.animationProgress))).intValue() : 0;
        int size4 = list.size();
        for (int i18 = 0; i18 < size4; i18++) {
            IntrinsicMeasurable intrinsicMeasurable8 = list.get(i18);
            if (g0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable8), TextFieldImplKt.TextFieldId)) {
                int intValue2 = pVar.invoke(intrinsicMeasurable8, Integer.valueOf(i12)).intValue();
                int size5 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size5) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable9 = list.get(i19);
                    if (g0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable9), TextFieldImplKt.PlaceholderId)) {
                        intrinsicMeasurable = intrinsicMeasurable9;
                        break;
                    }
                    i19++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable;
                m1719calculateHeightO3s9Psw = OutlinedTextFieldKt.m1719calculateHeightO3s9Psw(i13, i14, intValue2, intValue, intrinsicMeasurable10 != null ? pVar.invoke(intrinsicMeasurable10, Integer.valueOf(i12)).intValue() : 0, this.animationProgress, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m1719calculateHeightO3s9Psw;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i11, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        int m1720calculateWidthO3s9Psw;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            IntrinsicMeasurable intrinsicMeasurable5 = list.get(i12);
            if (g0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.TextFieldId)) {
                int intValue = pVar.invoke(intrinsicMeasurable5, Integer.valueOf(i11)).intValue();
                int size2 = list.size();
                int i13 = 0;
                while (true) {
                    intrinsicMeasurable = null;
                    if (i13 >= size2) {
                        intrinsicMeasurable2 = null;
                        break;
                    }
                    intrinsicMeasurable2 = list.get(i13);
                    if (g0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), TextFieldImplKt.LabelId)) {
                        break;
                    }
                    i13++;
                }
                IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable2;
                int intValue2 = intrinsicMeasurable6 != null ? pVar.invoke(intrinsicMeasurable6, Integer.valueOf(i11)).intValue() : 0;
                int size3 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size3) {
                        intrinsicMeasurable3 = null;
                        break;
                    }
                    intrinsicMeasurable3 = list.get(i14);
                    if (g0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), TextFieldImplKt.TrailingId)) {
                        break;
                    }
                    i14++;
                }
                IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable3;
                int intValue3 = intrinsicMeasurable7 != null ? pVar.invoke(intrinsicMeasurable7, Integer.valueOf(i11)).intValue() : 0;
                int size4 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size4) {
                        intrinsicMeasurable4 = null;
                        break;
                    }
                    intrinsicMeasurable4 = list.get(i15);
                    if (g0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.LeadingId)) {
                        break;
                    }
                    i15++;
                }
                IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable4;
                int intValue4 = intrinsicMeasurable8 != null ? pVar.invoke(intrinsicMeasurable8, Integer.valueOf(i11)).intValue() : 0;
                int size5 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size5) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable9 = list.get(i16);
                    if (g0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable9), TextFieldImplKt.PlaceholderId)) {
                        intrinsicMeasurable = intrinsicMeasurable9;
                        break;
                    }
                    i16++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable;
                m1720calculateWidthO3s9Psw = OutlinedTextFieldKt.m1720calculateWidthO3s9Psw(intValue4, intValue3, intValue, intValue2, intrinsicMeasurable10 != null ? pVar.invoke(intrinsicMeasurable10, Integer.valueOf(i11)).intValue() : 0, this.animationProgress, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m1720calculateWidthO3s9Psw;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        return intrinsicHeight(intrinsicMeasureScope, list, i11, new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1
            @Override // x00.p
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i12) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i12));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        return intrinsicWidth(intrinsicMeasureScope, list, i11, new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1
            @Override // x00.p
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i12) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i12));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(@k final MeasureScope measureScope, @k List<? extends Measurable> list, long j11) {
        Measurable measurable;
        Measurable measurable2;
        Measurable measurable3;
        Measurable measurable4;
        int m1720calculateWidthO3s9Psw;
        int m1719calculateHeightO3s9Psw;
        final OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = this;
        MeasureScope measureScope2 = measureScope;
        int mo371roundToPx0680j_4 = measureScope2.mo371roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.mo675calculateBottomPaddingD9Ej5fM());
        long m5058copyZbe2FdA$default = Constraints.m5058copyZbe2FdA$default(j11, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                measurable = null;
                break;
            }
            measurable = list.get(i11);
            if (g0.g(LayoutIdKt.getLayoutId(measurable), TextFieldImplKt.LeadingId)) {
                break;
            }
            i11++;
        }
        Measurable measurable5 = measurable;
        Placeable mo3857measureBRTryo0 = measurable5 != null ? measurable5.mo3857measureBRTryo0(m5058copyZbe2FdA$default) : null;
        int widthOrZero = TextFieldImplKt.widthOrZero(mo3857measureBRTryo0);
        int size2 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i12);
            if (g0.g(LayoutIdKt.getLayoutId(measurable2), TextFieldImplKt.TrailingId)) {
                break;
            }
            i12++;
        }
        Measurable measurable6 = measurable2;
        Placeable mo3857measureBRTryo02 = measurable6 != null ? measurable6.mo3857measureBRTryo0(ConstraintsKt.m5088offsetNN6EwU$default(m5058copyZbe2FdA$default, -widthOrZero, 0, 2, null)) : null;
        int widthOrZero2 = widthOrZero + TextFieldImplKt.widthOrZero(mo3857measureBRTryo02);
        int mo371roundToPx0680j_42 = measureScope2.mo371roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.mo676calculateLeftPaddingu2uoSUM(measureScope2.getLayoutDirection())) + measureScope2.mo371roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.mo677calculateRightPaddingu2uoSUM(measureScope2.getLayoutDirection()));
        int i13 = -widthOrZero2;
        int i14 = -mo371roundToPx0680j_4;
        long m5087offsetNN6EwU = ConstraintsKt.m5087offsetNN6EwU(m5058copyZbe2FdA$default, MathHelpersKt.lerp(i13 - mo371roundToPx0680j_42, -mo371roundToPx0680j_42, outlinedTextFieldMeasurePolicy.animationProgress), i14);
        int size3 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size3) {
                measurable3 = null;
                break;
            }
            measurable3 = list.get(i15);
            if (g0.g(LayoutIdKt.getLayoutId(measurable3), TextFieldImplKt.LabelId)) {
                break;
            }
            i15++;
        }
        Measurable measurable7 = measurable3;
        final Placeable mo3857measureBRTryo03 = measurable7 != null ? measurable7.mo3857measureBRTryo0(m5087offsetNN6EwU) : null;
        outlinedTextFieldMeasurePolicy.onLabelMeasured.invoke(Size.m2325boximpl(mo3857measureBRTryo03 != null ? SizeKt.Size(mo3857measureBRTryo03.getWidth(), mo3857measureBRTryo03.getHeight()) : Size.Companion.m2346getZeroNHjbRc()));
        long j12 = j11;
        long m5058copyZbe2FdA$default2 = Constraints.m5058copyZbe2FdA$default(ConstraintsKt.m5087offsetNN6EwU(j12, i13, i14 - Math.max(TextFieldImplKt.heightOrZero(mo3857measureBRTryo03) / 2, measureScope2.mo371roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.mo678calculateTopPaddingD9Ej5fM()))), 0, 0, 0, 0, 11, null);
        int size4 = list.size();
        int i16 = 0;
        while (i16 < size4) {
            Measurable measurable8 = list.get(i16);
            if (g0.g(LayoutIdKt.getLayoutId(measurable8), TextFieldImplKt.TextFieldId)) {
                Placeable mo3857measureBRTryo04 = measurable8.mo3857measureBRTryo0(m5058copyZbe2FdA$default2);
                long m5058copyZbe2FdA$default3 = Constraints.m5058copyZbe2FdA$default(m5058copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                int size5 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size5) {
                        measurable4 = null;
                        break;
                    }
                    measurable4 = list.get(i17);
                    if (g0.g(LayoutIdKt.getLayoutId(measurable4), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                    i17++;
                }
                Measurable measurable9 = measurable4;
                final Placeable mo3857measureBRTryo05 = measurable9 != null ? measurable9.mo3857measureBRTryo0(m5058copyZbe2FdA$default3) : null;
                m1720calculateWidthO3s9Psw = OutlinedTextFieldKt.m1720calculateWidthO3s9Psw(TextFieldImplKt.widthOrZero(mo3857measureBRTryo0), TextFieldImplKt.widthOrZero(mo3857measureBRTryo02), mo3857measureBRTryo04.getWidth(), TextFieldImplKt.widthOrZero(mo3857measureBRTryo03), TextFieldImplKt.widthOrZero(mo3857measureBRTryo05), outlinedTextFieldMeasurePolicy.animationProgress, j12, measureScope2.getDensity(), outlinedTextFieldMeasurePolicy.paddingValues);
                m1719calculateHeightO3s9Psw = OutlinedTextFieldKt.m1719calculateHeightO3s9Psw(TextFieldImplKt.heightOrZero(mo3857measureBRTryo0), TextFieldImplKt.heightOrZero(mo3857measureBRTryo02), mo3857measureBRTryo04.getHeight(), TextFieldImplKt.heightOrZero(mo3857measureBRTryo03), TextFieldImplKt.heightOrZero(mo3857measureBRTryo05), outlinedTextFieldMeasurePolicy.animationProgress, j11, measureScope.getDensity(), outlinedTextFieldMeasurePolicy.paddingValues);
                int size6 = list.size();
                int i18 = 0;
                while (i18 < size6) {
                    Measurable measurable10 = list.get(i18);
                    if (g0.g(LayoutIdKt.getLayoutId(measurable10), OutlinedTextFieldKt.BorderId)) {
                        final Placeable mo3857measureBRTryo06 = measurable10.mo3857measureBRTryo0(ConstraintsKt.Constraints(m1720calculateWidthO3s9Psw != Integer.MAX_VALUE ? m1720calculateWidthO3s9Psw : 0, m1720calculateWidthO3s9Psw, m1719calculateHeightO3s9Psw != Integer.MAX_VALUE ? m1719calculateHeightO3s9Psw : 0, m1719calculateHeightO3s9Psw));
                        final Placeable placeable = mo3857measureBRTryo04;
                        final int i19 = m1720calculateWidthO3s9Psw;
                        final Placeable placeable2 = mo3857measureBRTryo02;
                        final int i21 = m1719calculateHeightO3s9Psw;
                        final Placeable placeable3 = mo3857measureBRTryo0;
                        return MeasureScope.layout$default(measureScope, i19, i21, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$measure$1
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
                                float f11;
                                boolean z11;
                                PaddingValues paddingValues;
                                int i22 = i21;
                                int i23 = i19;
                                Placeable placeable4 = placeable3;
                                Placeable placeable5 = placeable2;
                                Placeable placeable6 = placeable;
                                Placeable placeable7 = mo3857measureBRTryo03;
                                Placeable placeable8 = mo3857measureBRTryo05;
                                Placeable placeable9 = mo3857measureBRTryo06;
                                f11 = outlinedTextFieldMeasurePolicy.animationProgress;
                                z11 = outlinedTextFieldMeasurePolicy.singleLine;
                                float density = measureScope.getDensity();
                                LayoutDirection layoutDirection = measureScope.getLayoutDirection();
                                paddingValues = outlinedTextFieldMeasurePolicy.paddingValues;
                                OutlinedTextFieldKt.place(placementScope, i22, i23, placeable4, placeable5, placeable6, placeable7, placeable8, placeable9, f11, z11, density, layoutDirection, paddingValues);
                            }
                        }, 4, null);
                    }
                    i18++;
                    mo3857measureBRTryo04 = mo3857measureBRTryo04;
                    m1720calculateWidthO3s9Psw = m1720calculateWidthO3s9Psw;
                    mo3857measureBRTryo0 = mo3857measureBRTryo0;
                    m1719calculateHeightO3s9Psw = m1719calculateHeightO3s9Psw;
                    outlinedTextFieldMeasurePolicy = this;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i16++;
            outlinedTextFieldMeasurePolicy = this;
            measureScope2 = measureScope;
            j12 = j11;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        return intrinsicHeight(intrinsicMeasureScope, list, i11, new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1
            @Override // x00.p
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i12) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i12));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        return intrinsicWidth(intrinsicMeasureScope, list, i11, new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1
            @Override // x00.p
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i12) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i12));
            }
        });
    }
}
