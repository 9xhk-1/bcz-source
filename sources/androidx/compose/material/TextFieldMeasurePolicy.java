package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.layout.AlignmentLineKt;
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
import g10.u;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1123:1\n116#2,2:1124\n33#2,6:1126\n118#2:1132\n116#2,2:1133\n33#2,6:1135\n118#2:1141\n116#2,2:1142\n33#2,6:1144\n118#2:1150\n544#2,2:1151\n33#2,6:1153\n546#2:1159\n116#2,2:1160\n33#2,6:1162\n118#2:1168\n544#2,2:1169\n33#2,6:1171\n546#2:1177\n116#2,2:1178\n33#2,6:1180\n118#2:1186\n116#2,2:1188\n33#2,6:1190\n118#2:1196\n116#2,2:1197\n33#2,6:1199\n118#2:1205\n116#2,2:1206\n33#2,6:1208\n118#2:1214\n116#2,2:1215\n33#2,6:1217\n118#2:1223\n116#2,2:1224\n33#2,6:1226\n118#2:1232\n116#2,2:1233\n33#2,6:1235\n118#2:1241\n544#2,2:1242\n33#2,6:1244\n546#2:1250\n116#2,2:1251\n33#2,6:1253\n118#2:1259\n1#3:1187\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldMeasurePolicy\n*L\n732#1:1124,2\n732#1:1126,6\n732#1:1132\n738#1:1133,2\n738#1:1135,6\n738#1:1141\n749#1:1142,2\n749#1:1144,6\n749#1:1150\n772#1:1151,2\n772#1:1153,6\n772#1:1159\n778#1:1160,2\n778#1:1162,6\n778#1:1168\n879#1:1169,2\n879#1:1171,6\n879#1:1177\n882#1:1178,2\n882#1:1180,6\n882#1:1186\n886#1:1188,2\n886#1:1190,6\n886#1:1196\n890#1:1197,2\n890#1:1199,6\n890#1:1205\n894#1:1206,2\n894#1:1208,6\n894#1:1214\n914#1:1215,2\n914#1:1217,6\n914#1:1223\n924#1:1224,2\n924#1:1226,6\n924#1:1232\n935#1:1233,2\n935#1:1235,6\n935#1:1241\n939#1:1242,2\n939#1:1244,6\n939#1:1250\n942#1:1251,2\n942#1:1253,6\n942#1:1259\n*E\n"})
/* loaded from: classes.dex */
final class TextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;

    @k
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z11, float f11, @k PaddingValues paddingValues) {
        this.singleLine = z11;
        this.animationProgress = f11;
        this.paddingValues = paddingValues;
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i11, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        int i12;
        int i13;
        int i14;
        IntrinsicMeasurable intrinsicMeasurable3;
        int i15;
        IntrinsicMeasurable intrinsicMeasurable4;
        int m1841calculateHeightO3s9Psw;
        int size = list.size();
        int i16 = 0;
        while (true) {
            intrinsicMeasurable = null;
            if (i16 >= size) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i16);
            if (g0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), TextFieldImplKt.LeadingId)) {
                break;
            }
            i16++;
        }
        IntrinsicMeasurable intrinsicMeasurable5 = intrinsicMeasurable2;
        if (intrinsicMeasurable5 != null) {
            i12 = i11;
            i14 = TextFieldKt.substractConstraintSafely(i12, intrinsicMeasurable5.maxIntrinsicWidth(Integer.MAX_VALUE));
            i13 = pVar.invoke(intrinsicMeasurable5, Integer.valueOf(i12)).intValue();
        } else {
            i12 = i11;
            i13 = 0;
            i14 = i12;
        }
        int size2 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size2) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i17);
            if (g0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), TextFieldImplKt.TrailingId)) {
                break;
            }
            i17++;
        }
        IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable3;
        if (intrinsicMeasurable6 != null) {
            i14 = TextFieldKt.substractConstraintSafely(i14, intrinsicMeasurable6.maxIntrinsicWidth(Integer.MAX_VALUE));
            i15 = pVar.invoke(intrinsicMeasurable6, Integer.valueOf(i12)).intValue();
        } else {
            i15 = 0;
        }
        int size3 = list.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size3) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i18);
            if (g0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.LabelId)) {
                break;
            }
            i18++;
        }
        IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable4;
        int intValue = intrinsicMeasurable7 != null ? pVar.invoke(intrinsicMeasurable7, Integer.valueOf(i14)).intValue() : 0;
        int size4 = list.size();
        for (int i19 = 0; i19 < size4; i19++) {
            IntrinsicMeasurable intrinsicMeasurable8 = list.get(i19);
            if (g0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable8), TextFieldImplKt.TextFieldId)) {
                int intValue2 = pVar.invoke(intrinsicMeasurable8, Integer.valueOf(i14)).intValue();
                int size5 = list.size();
                int i21 = 0;
                while (true) {
                    if (i21 >= size5) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable9 = list.get(i21);
                    if (g0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable9), TextFieldImplKt.PlaceholderId)) {
                        intrinsicMeasurable = intrinsicMeasurable9;
                        break;
                    }
                    i21++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable;
                m1841calculateHeightO3s9Psw = TextFieldKt.m1841calculateHeightO3s9Psw(intValue2, intValue > 0, intValue, i13, i15, intrinsicMeasurable10 != null ? pVar.invoke(intrinsicMeasurable10, Integer.valueOf(i14)).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m1841calculateHeightO3s9Psw;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> list, int i11, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        int m1842calculateWidthVsPV1Ek;
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
                m1842calculateWidthVsPV1Ek = TextFieldKt.m1842calculateWidthVsPV1Ek(intValue4, intValue3, intValue, intValue2, intrinsicMeasurable10 != null ? pVar.invoke(intrinsicMeasurable10, Integer.valueOf(i11)).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
                return m1842calculateWidthVsPV1Ek;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        return intrinsicHeight(intrinsicMeasureScope, list, i11, new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$maxIntrinsicHeight$1
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
        return intrinsicWidth(list, i11, new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$maxIntrinsicWidth$1
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
    public MeasureResult mo33measure3p2s80s(@k MeasureScope measureScope, @k List<? extends Measurable> list, long j11) {
        Measurable measurable;
        Measurable measurable2;
        Measurable measurable3;
        int i11;
        Measurable measurable4;
        final int m1842calculateWidthVsPV1Ek;
        final int m1841calculateHeightO3s9Psw;
        final TextFieldMeasurePolicy textFieldMeasurePolicy = this;
        final MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        final int mo371roundToPx0680j_4 = measureScope2.mo371roundToPx0680j_4(textFieldMeasurePolicy.paddingValues.mo678calculateTopPaddingD9Ej5fM());
        int mo371roundToPx0680j_42 = measureScope2.mo371roundToPx0680j_4(textFieldMeasurePolicy.paddingValues.mo675calculateBottomPaddingD9Ej5fM());
        final int mo371roundToPx0680j_43 = measureScope2.mo371roundToPx0680j_4(TextFieldKt.getTextFieldTopPadding());
        long m5058copyZbe2FdA$default = Constraints.m5058copyZbe2FdA$default(j11, 0, 0, 0, 0, 10, null);
        int size = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                measurable = null;
                break;
            }
            measurable = list2.get(i12);
            if (g0.g(LayoutIdKt.getLayoutId(measurable), TextFieldImplKt.LeadingId)) {
                break;
            }
            i12++;
        }
        Measurable measurable5 = measurable;
        Placeable mo3857measureBRTryo0 = measurable5 != null ? measurable5.mo3857measureBRTryo0(m5058copyZbe2FdA$default) : null;
        int widthOrZero = TextFieldImplKt.widthOrZero(mo3857measureBRTryo0);
        int size2 = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list2.get(i13);
            if (g0.g(LayoutIdKt.getLayoutId(measurable2), TextFieldImplKt.TrailingId)) {
                break;
            }
            i13++;
        }
        Measurable measurable6 = measurable2;
        Placeable mo3857measureBRTryo02 = measurable6 != null ? measurable6.mo3857measureBRTryo0(ConstraintsKt.m5088offsetNN6EwU$default(m5058copyZbe2FdA$default, -widthOrZero, 0, 2, null)) : null;
        int i14 = -mo371roundToPx0680j_42;
        int i15 = -(widthOrZero + TextFieldImplKt.widthOrZero(mo3857measureBRTryo02));
        long m5087offsetNN6EwU = ConstraintsKt.m5087offsetNN6EwU(m5058copyZbe2FdA$default, i15, i14);
        int size3 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size3) {
                measurable3 = null;
                break;
            }
            measurable3 = list2.get(i16);
            if (g0.g(LayoutIdKt.getLayoutId(measurable3), TextFieldImplKt.LabelId)) {
                break;
            }
            i16++;
        }
        Measurable measurable7 = measurable3;
        Placeable mo3857measureBRTryo03 = measurable7 != null ? measurable7.mo3857measureBRTryo0(m5087offsetNN6EwU) : null;
        if (mo3857measureBRTryo03 != null) {
            i11 = mo3857measureBRTryo03.get(AlignmentLineKt.getLastBaseline());
            if (i11 == Integer.MIN_VALUE) {
                i11 = mo3857measureBRTryo03.getHeight();
            }
        } else {
            i11 = 0;
        }
        final int max = Math.max(i11, mo371roundToPx0680j_4);
        long m5087offsetNN6EwU2 = ConstraintsKt.m5087offsetNN6EwU(Constraints.m5058copyZbe2FdA$default(j11, 0, 0, 0, 0, 11, null), i15, mo3857measureBRTryo03 != null ? (i14 - mo371roundToPx0680j_43) - max : (-mo371roundToPx0680j_4) - mo371roundToPx0680j_42);
        int size4 = list2.size();
        int i17 = 0;
        while (i17 < size4) {
            Measurable measurable8 = list2.get(i17);
            if (g0.g(LayoutIdKt.getLayoutId(measurable8), TextFieldImplKt.TextFieldId)) {
                final Placeable mo3857measureBRTryo04 = measurable8.mo3857measureBRTryo0(m5087offsetNN6EwU2);
                long m5058copyZbe2FdA$default2 = Constraints.m5058copyZbe2FdA$default(m5087offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                int size5 = list2.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size5) {
                        measurable4 = null;
                        break;
                    }
                    measurable4 = list2.get(i18);
                    if (g0.g(LayoutIdKt.getLayoutId(measurable4), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                    i18++;
                    list2 = list;
                }
                Measurable measurable9 = measurable4;
                final Placeable mo3857measureBRTryo05 = measurable9 != null ? measurable9.mo3857measureBRTryo0(m5058copyZbe2FdA$default2) : null;
                m1842calculateWidthVsPV1Ek = TextFieldKt.m1842calculateWidthVsPV1Ek(TextFieldImplKt.widthOrZero(mo3857measureBRTryo0), TextFieldImplKt.widthOrZero(mo3857measureBRTryo02), mo3857measureBRTryo04.getWidth(), TextFieldImplKt.widthOrZero(mo3857measureBRTryo03), TextFieldImplKt.widthOrZero(mo3857measureBRTryo05), j11);
                m1841calculateHeightO3s9Psw = TextFieldKt.m1841calculateHeightO3s9Psw(mo3857measureBRTryo04.getHeight(), mo3857measureBRTryo03 != null, max, TextFieldImplKt.heightOrZero(mo3857measureBRTryo0), TextFieldImplKt.heightOrZero(mo3857measureBRTryo02), TextFieldImplKt.heightOrZero(mo3857measureBRTryo05), j11, measureScope2.getDensity(), textFieldMeasurePolicy.paddingValues);
                final Placeable placeable = mo3857measureBRTryo02;
                final int i19 = i11;
                final Placeable placeable2 = mo3857measureBRTryo03;
                final Placeable placeable3 = mo3857measureBRTryo0;
                return MeasureScope.layout$default(measureScope, m1842calculateWidthVsPV1Ek, m1841calculateHeightO3s9Psw, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$measure$1
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
                        boolean z11;
                        PaddingValues paddingValues;
                        boolean z12;
                        float f11;
                        if (Placeable.this == null) {
                            int i21 = m1842calculateWidthVsPV1Ek;
                            int i22 = m1841calculateHeightO3s9Psw;
                            Placeable placeable4 = mo3857measureBRTryo04;
                            Placeable placeable5 = mo3857measureBRTryo05;
                            Placeable placeable6 = placeable3;
                            Placeable placeable7 = placeable;
                            z11 = textFieldMeasurePolicy.singleLine;
                            float density = measureScope2.getDensity();
                            paddingValues = textFieldMeasurePolicy.paddingValues;
                            TextFieldKt.placeWithoutLabel(placementScope, i21, i22, placeable4, placeable5, placeable6, placeable7, z11, density, paddingValues);
                            return;
                        }
                        int u11 = u.u(mo371roundToPx0680j_4 - i19, 0);
                        int i23 = m1842calculateWidthVsPV1Ek;
                        int i24 = m1841calculateHeightO3s9Psw;
                        Placeable placeable8 = mo3857measureBRTryo04;
                        Placeable placeable9 = Placeable.this;
                        Placeable placeable10 = mo3857measureBRTryo05;
                        Placeable placeable11 = placeable3;
                        Placeable placeable12 = placeable;
                        z12 = textFieldMeasurePolicy.singleLine;
                        int i25 = max + mo371roundToPx0680j_43;
                        f11 = textFieldMeasurePolicy.animationProgress;
                        TextFieldKt.placeWithLabel(placementScope, i23, i24, placeable8, placeable9, placeable10, placeable11, placeable12, z12, u11, i25, f11, measureScope2.getDensity());
                    }
                }, 4, null);
            }
            i17++;
            textFieldMeasurePolicy = this;
            measureScope2 = measureScope;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        return intrinsicHeight(intrinsicMeasureScope, list, i11, new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$minIntrinsicHeight$1
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
        return intrinsicWidth(list, i11, new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$minIntrinsicWidth$1
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
