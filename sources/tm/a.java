package tm;

import a00.h0;
import a00.r0;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.accompanist.flowlayout.FlowCrossAxisAlignment;
import com.google.accompanist.flowlayout.LayoutOrientation;
import com.google.accompanist.flowlayout.MainAxisAlignment;
import com.google.accompanist.flowlayout.SizeMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: tm.a$a, reason: collision with other inner class name */
    public static final class C1207a implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LayoutOrientation f90776a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f90777b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SizeMode f90778c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f90779d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MainAxisAlignment f90780e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ MainAxisAlignment f90781f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ FlowCrossAxisAlignment f90782g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: tm.a$a$a, reason: collision with other inner class name */
        public static final class C1208a extends Lambda implements l<Placeable.PlacementScope, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List<List<Placeable>> f90783a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MeasureScope f90784b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ float f90785c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ MainAxisAlignment f90786d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ MainAxisAlignment f90787e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ LayoutOrientation f90788f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ int f90789g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ FlowCrossAxisAlignment f90790h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ List<Integer> f90791i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ List<Integer> f90792j;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: tm.a$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C1209a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f90793a;

                static {
                    int[] iArr = new int[FlowCrossAxisAlignment.values().length];
                    iArr[FlowCrossAxisAlignment.Start.ordinal()] = 1;
                    iArr[FlowCrossAxisAlignment.End.ordinal()] = 2;
                    iArr[FlowCrossAxisAlignment.Center.ordinal()] = 3;
                    f90793a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1208a(List<List<Placeable>> list, MeasureScope measureScope, float f11, MainAxisAlignment mainAxisAlignment, MainAxisAlignment mainAxisAlignment2, LayoutOrientation layoutOrientation, int i11, FlowCrossAxisAlignment flowCrossAxisAlignment, List<Integer> list2, List<Integer> list3) {
                super(1);
                this.f90783a = list;
                this.f90784b = measureScope;
                this.f90785c = f11;
                this.f90786d = mainAxisAlignment;
                this.f90787e = mainAxisAlignment2;
                this.f90788f = layoutOrientation;
                this.f90789g = i11;
                this.f90790h = flowCrossAxisAlignment;
                this.f90791i = list2;
                this.f90792j = list3;
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@k Placeable.PlacementScope layout) {
                int i11;
                Iterator it;
                int[] iArr;
                List<Integer> list;
                List<Integer> list2;
                int i12;
                int i13;
                g0.p(layout, "$this$layout");
                List<List<Placeable>> list3 = this.f90783a;
                MeasureScope measureScope = this.f90784b;
                float f11 = this.f90785c;
                MainAxisAlignment mainAxisAlignment = this.f90786d;
                MainAxisAlignment mainAxisAlignment2 = this.f90787e;
                LayoutOrientation layoutOrientation = this.f90788f;
                int i14 = this.f90789g;
                FlowCrossAxisAlignment flowCrossAxisAlignment = this.f90790h;
                List<Integer> list4 = this.f90791i;
                List<Integer> list5 = this.f90792j;
                int i15 = 0;
                for (Object obj : list3) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        h0.b0();
                    }
                    List list6 = (List) obj;
                    int size = list6.size();
                    int i17 = 0;
                    int[] iArr2 = new int[size];
                    int i18 = 0;
                    while (i18 < size) {
                        List<List<Placeable>> list7 = list3;
                        iArr2[i18] = a.e((Placeable) list6.get(i18), layoutOrientation) + (i18 < h0.L(list6) ? measureScope.mo371roundToPx0680j_4(f11) : 0);
                        i18++;
                        list3 = list7;
                    }
                    List<List<Placeable>> list8 = list3;
                    Arrangement.Vertical arrangement$flowlayout_release = i15 < h0.L(list8) ? mainAxisAlignment.getArrangement$flowlayout_release() : mainAxisAlignment2.getArrangement$flowlayout_release();
                    int[] iArr3 = new int[size];
                    for (int i19 = 0; i19 < size; i19++) {
                        iArr3[i19] = 0;
                    }
                    arrangement$flowlayout_release.arrange(measureScope, i14, iArr2, iArr3);
                    Iterator it2 = list6.iterator();
                    int i21 = 0;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            h0.b0();
                        }
                        Placeable placeable = (Placeable) next;
                        int i23 = C1209a.f90793a[flowCrossAxisAlignment.ordinal()];
                        if (i23 == 1) {
                            i11 = i17;
                        } else if (i23 == 2) {
                            i11 = list4.get(i15).intValue() - a.d(placeable, layoutOrientation);
                        } else {
                            if (i23 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i11 = IntOffset.m5244getYimpl(Alignment.Companion.getCenter().mo2085alignKFBX0sM(IntSize.Companion.m5291getZeroYbymL2g(), IntSizeKt.IntSize(i17, list4.get(i15).intValue() - a.d(placeable, layoutOrientation)), LayoutDirection.Ltr));
                        }
                        if (layoutOrientation == LayoutOrientation.Horizontal) {
                            list = list4;
                            iArr = iArr3;
                            i12 = i15;
                            it = it2;
                            list2 = list5;
                            i13 = 0;
                            Placeable.PlacementScope.place$default(layout, placeable, iArr3[i21], list5.get(i15).intValue() + i11, 0.0f, 4, null);
                        } else {
                            it = it2;
                            iArr = iArr3;
                            list = list4;
                            list2 = list5;
                            i12 = i15;
                            i13 = 0;
                            Placeable.PlacementScope.place$default(layout, placeable, list2.get(i12).intValue() + i11, iArr[i21], 0.0f, 4, null);
                        }
                        list5 = list2;
                        i15 = i12;
                        it2 = it;
                        i21 = i22;
                        list4 = list;
                        iArr3 = iArr;
                        i17 = i13;
                    }
                    i15 = i16;
                    list3 = list8;
                }
            }
        }

        public C1207a(LayoutOrientation layoutOrientation, float f11, SizeMode sizeMode, float f12, MainAxisAlignment mainAxisAlignment, MainAxisAlignment mainAxisAlignment2, FlowCrossAxisAlignment flowCrossAxisAlignment) {
            this.f90776a = layoutOrientation;
            this.f90777b = f11;
            this.f90778c = sizeMode;
            this.f90779d = f12;
            this.f90780e = mainAxisAlignment;
            this.f90781f = mainAxisAlignment2;
            this.f90782g = flowCrossAxisAlignment;
        }

        public static final boolean a(List<Placeable> list, Ref.IntRef intRef, MeasureScope measureScope, float f11, tm.b bVar, LayoutOrientation layoutOrientation, Placeable placeable) {
            return list.isEmpty() || (intRef.element + measureScope.mo371roundToPx0680j_4(f11)) + a.e(placeable, layoutOrientation) <= bVar.i();
        }

        public static final void b(List<List<Placeable>> list, Ref.IntRef intRef, MeasureScope measureScope, float f11, List<Placeable> list2, List<Integer> list3, Ref.IntRef intRef2, List<Integer> list4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
            List<List<Placeable>> list5 = list;
            if (!list5.isEmpty()) {
                intRef.element += measureScope.mo371roundToPx0680j_4(f11);
            }
            list5.add(r0.a6(list2));
            list3.add(Integer.valueOf(intRef2.element));
            list4.add(Integer.valueOf(intRef.element));
            intRef.element += intRef2.element;
            intRef3.element = Math.max(intRef3.element, intRef4.element);
            list2.clear();
            intRef4.element = 0;
            intRef2.element = 0;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int maxIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
            return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i11);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int maxIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
            return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i11);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @k
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo33measure3p2s80s(@k MeasureScope measureScope, @k List<? extends Measurable> measurables, long j11) {
            MeasureResult layout$default;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Ref.IntRef intRef;
            Placeable placeable;
            Ref.IntRef intRef2;
            Ref.IntRef intRef3;
            MeasureScope Layout = measureScope;
            g0.p(Layout, "$this$Layout");
            g0.p(measurables, "measurables");
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            Ref.IntRef intRef4 = new Ref.IntRef();
            Ref.IntRef intRef5 = new Ref.IntRef();
            ArrayList arrayList8 = new ArrayList();
            Ref.IntRef intRef6 = new Ref.IntRef();
            Ref.IntRef intRef7 = new Ref.IntRef();
            ArrayList arrayList9 = arrayList8;
            tm.b bVar = new tm.b(j11, this.f90776a, null);
            long Constraints$default = this.f90776a == LayoutOrientation.Horizontal ? ConstraintsKt.Constraints$default(0, bVar.i(), 0, 0, 13, null) : ConstraintsKt.Constraints$default(0, 0, 0, bVar.i(), 7, null);
            Iterator<? extends Measurable> it = measurables.iterator();
            while (it.hasNext()) {
                Placeable mo3857measureBRTryo0 = it.next().mo3857measureBRTryo0(Constraints$default);
                tm.b bVar2 = bVar;
                if (a(arrayList9, intRef6, Layout, this.f90777b, bVar, this.f90776a, mo3857measureBRTryo0)) {
                    Layout = measureScope;
                    arrayList = arrayList9;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    arrayList4 = arrayList7;
                    intRef = intRef6;
                    placeable = mo3857measureBRTryo0;
                    intRef2 = intRef5;
                    intRef3 = intRef7;
                } else {
                    Layout = measureScope;
                    arrayList = arrayList9;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    arrayList4 = arrayList7;
                    intRef = intRef6;
                    placeable = mo3857measureBRTryo0;
                    intRef2 = intRef5;
                    intRef3 = intRef7;
                    b(arrayList2, intRef2, Layout, this.f90779d, arrayList, arrayList3, intRef3, arrayList4, intRef4, intRef);
                }
                if (!arrayList.isEmpty()) {
                    intRef.element += Layout.mo371roundToPx0680j_4(this.f90777b);
                }
                arrayList.add(placeable);
                intRef.element += a.e(placeable, this.f90776a);
                intRef3.element = Math.max(intRef3.element, a.d(placeable, this.f90776a));
                intRef5 = intRef2;
                intRef7 = intRef3;
                arrayList7 = arrayList4;
                intRef6 = intRef;
                arrayList5 = arrayList2;
                arrayList9 = arrayList;
                arrayList6 = arrayList3;
                bVar = bVar2;
            }
            tm.b bVar3 = bVar;
            ArrayList arrayList10 = arrayList6;
            Ref.IntRef intRef8 = intRef7;
            ArrayList arrayList11 = arrayList9;
            Ref.IntRef intRef9 = intRef6;
            ArrayList arrayList12 = arrayList5;
            ArrayList arrayList13 = arrayList7;
            Ref.IntRef intRef10 = intRef5;
            if (!arrayList11.isEmpty()) {
                b(arrayList12, intRef10, Layout, this.f90779d, arrayList11, arrayList10, intRef8, arrayList13, intRef4, intRef9);
            }
            int max = (bVar3.i() == Integer.MAX_VALUE || this.f90778c != SizeMode.Expand) ? Math.max(intRef4.element, bVar3.j()) : bVar3.i();
            int max2 = Math.max(intRef10.element, bVar3.h());
            LayoutOrientation layoutOrientation = this.f90776a;
            LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
            layout$default = MeasureScope.layout$default(measureScope, layoutOrientation == layoutOrientation2 ? max : max2, layoutOrientation == layoutOrientation2 ? max2 : max, null, new C1208a(arrayList12, measureScope, this.f90777b, this.f90780e, this.f90781f, layoutOrientation, max, this.f90782g, arrayList10, arrayList13), 4, null);
            return layout$default;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int minIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
            return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i11);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int minIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
            return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Modifier f90794a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LayoutOrientation f90795b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SizeMode f90796c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MainAxisAlignment f90797d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f90798e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ FlowCrossAxisAlignment f90799f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f90800g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ MainAxisAlignment f90801h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ p<Composer, Integer, g2> f90802i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f90803j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Modifier modifier, LayoutOrientation layoutOrientation, SizeMode sizeMode, MainAxisAlignment mainAxisAlignment, float f11, FlowCrossAxisAlignment flowCrossAxisAlignment, float f12, MainAxisAlignment mainAxisAlignment2, p<? super Composer, ? super Integer, g2> pVar, int i11) {
            super(2);
            this.f90794a = modifier;
            this.f90795b = layoutOrientation;
            this.f90796c = sizeMode;
            this.f90797d = mainAxisAlignment;
            this.f90798e = f11;
            this.f90799f = flowCrossAxisAlignment;
            this.f90800g = f12;
            this.f90801h = mainAxisAlignment2;
            this.f90802i = pVar;
            this.f90803j = i11;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        public final void invoke(@m80.l Composer composer, int i11) {
            a.a(this.f90794a, this.f90795b, this.f90796c, this.f90797d, this.f90798e, this.f90799f, this.f90800g, this.f90801h, this.f90802i, composer, this.f90803j | 1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Lambda implements p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Modifier f90804a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SizeMode f90805b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MainAxisAlignment f90806c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f90807d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ FlowCrossAxisAlignment f90808e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f90809f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ MainAxisAlignment f90810g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ p<Composer, Integer, g2> f90811h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f90812i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f90813j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Modifier modifier, SizeMode sizeMode, MainAxisAlignment mainAxisAlignment, float f11, FlowCrossAxisAlignment flowCrossAxisAlignment, float f12, MainAxisAlignment mainAxisAlignment2, p<? super Composer, ? super Integer, g2> pVar, int i11, int i12) {
            super(2);
            this.f90804a = modifier;
            this.f90805b = sizeMode;
            this.f90806c = mainAxisAlignment;
            this.f90807d = f11;
            this.f90808e = flowCrossAxisAlignment;
            this.f90809f = f12;
            this.f90810g = mainAxisAlignment2;
            this.f90811h = pVar;
            this.f90812i = i11;
            this.f90813j = i12;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        public final void invoke(@m80.l Composer composer, int i11) {
            a.b(this.f90804a, this.f90805b, this.f90806c, this.f90807d, this.f90808e, this.f90809f, this.f90810g, this.f90811h, composer, this.f90812i | 1, this.f90813j);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends Lambda implements p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Modifier f90814a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SizeMode f90815b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MainAxisAlignment f90816c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f90817d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ FlowCrossAxisAlignment f90818e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f90819f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ MainAxisAlignment f90820g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ p<Composer, Integer, g2> f90821h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f90822i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f90823j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Modifier modifier, SizeMode sizeMode, MainAxisAlignment mainAxisAlignment, float f11, FlowCrossAxisAlignment flowCrossAxisAlignment, float f12, MainAxisAlignment mainAxisAlignment2, p<? super Composer, ? super Integer, g2> pVar, int i11, int i12) {
            super(2);
            this.f90814a = modifier;
            this.f90815b = sizeMode;
            this.f90816c = mainAxisAlignment;
            this.f90817d = f11;
            this.f90818e = flowCrossAxisAlignment;
            this.f90819f = f12;
            this.f90820g = mainAxisAlignment2;
            this.f90821h = pVar;
            this.f90822i = i11;
            this.f90823j = i12;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        public final void invoke(@m80.l Composer composer, int i11) {
            a.c(this.f90814a, this.f90815b, this.f90816c, this.f90817d, this.f90818e, this.f90819f, this.f90820g, this.f90821h, composer, this.f90822i | 1, this.f90823j);
        }
    }

    @Composable
    public static final void a(Modifier modifier, LayoutOrientation layoutOrientation, SizeMode sizeMode, MainAxisAlignment mainAxisAlignment, float f11, FlowCrossAxisAlignment flowCrossAxisAlignment, float f12, MainAxisAlignment mainAxisAlignment2, p<? super Composer, ? super Integer, g2> pVar, Composer composer, int i11) {
        Modifier modifier2;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1107216104);
        if ((i11 & 14) == 0) {
            modifier2 = modifier;
            i12 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= startRestartGroup.changed(layoutOrientation) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= startRestartGroup.changed(sizeMode) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= startRestartGroup.changed(mainAxisAlignment) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= startRestartGroup.changed(f11) ? 16384 : 8192;
        }
        if ((458752 & i11) == 0) {
            i12 |= startRestartGroup.changed(flowCrossAxisAlignment) ? 131072 : 65536;
        }
        if ((3670016 & i11) == 0) {
            i12 |= startRestartGroup.changed(f12) ? 1048576 : 524288;
        }
        if ((29360128 & i11) == 0) {
            i12 |= startRestartGroup.changed(mainAxisAlignment2) ? 8388608 : 4194304;
        }
        if ((234881024 & i11) == 0) {
            i12 |= startRestartGroup.changed(pVar) ? 67108864 : 33554432;
        }
        if (((191739611 & i12) ^ 38347922) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            C1207a c1207a = new C1207a(layoutOrientation, f11, sizeMode, f12, mainAxisAlignment, mainAxisAlignment2, flowCrossAxisAlignment);
            startRestartGroup.startReplaceableGroup(1376089394);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, g2> materializerOf = LayoutKt.materializerOf(modifier2);
            int i13 = (((((i12 << 3) & 112) | ((i12 >> 24) & 14)) << 9) & 7168) | 6;
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1951constructorimpl = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl, c1207a, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, density, companion.getSetDensity());
            Updater.m1958setimpl(m1951constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1958setimpl(m1951constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1924boximpl(SkippableUpdater.m1925constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            pVar.invoke(startRestartGroup, Integer.valueOf((i13 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new b(modifier2, layoutOrientation, sizeMode, mainAxisAlignment, f11, flowCrossAxisAlignment, f12, mainAxisAlignment2, pVar, i11));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0071  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@m80.l androidx.compose.ui.Modifier r22, @m80.l com.google.accompanist.flowlayout.SizeMode r23, @m80.l com.google.accompanist.flowlayout.MainAxisAlignment r24, float r25, @m80.l com.google.accompanist.flowlayout.FlowCrossAxisAlignment r26, float r27, @m80.l com.google.accompanist.flowlayout.MainAxisAlignment r28, @m80.k x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r29, @m80.l androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tm.a.b(androidx.compose.ui.Modifier, com.google.accompanist.flowlayout.SizeMode, com.google.accompanist.flowlayout.MainAxisAlignment, float, com.google.accompanist.flowlayout.FlowCrossAxisAlignment, float, com.google.accompanist.flowlayout.MainAxisAlignment, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0071  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@m80.l androidx.compose.ui.Modifier r22, @m80.l com.google.accompanist.flowlayout.SizeMode r23, @m80.l com.google.accompanist.flowlayout.MainAxisAlignment r24, float r25, @m80.l com.google.accompanist.flowlayout.FlowCrossAxisAlignment r26, float r27, @m80.l com.google.accompanist.flowlayout.MainAxisAlignment r28, @m80.k x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r29, @m80.l androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tm.a.c(androidx.compose.ui.Modifier, com.google.accompanist.flowlayout.SizeMode, com.google.accompanist.flowlayout.MainAxisAlignment, float, com.google.accompanist.flowlayout.FlowCrossAxisAlignment, float, com.google.accompanist.flowlayout.MainAxisAlignment, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final int d(Placeable placeable, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    public static final int e(Placeable placeable, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }
}
