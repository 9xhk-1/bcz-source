package zj;

import a00.h0;
import a00.i0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;
import zj.s;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nGuidesContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuidesContainer.kt\ncom/baicizhan/platform/base/guide/GuidesContainerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1247#2,6:61\n79#3,6:67\n86#3,3:82\n89#3,2:91\n93#3:98\n347#4,9:73\n356#4:93\n357#4,2:96\n4206#5,6:85\n1869#6,2:94\n*S KotlinDebug\n*F\n+ 1 GuidesContainer.kt\ncom/baicizhan/platform/base/guide/GuidesContainerKt\n*L\n27#1:61,6\n16#1:67,6\n16#1:82,3\n16#1:91,2\n16#1:98\n16#1:73,9\n16#1:93\n16#1:96,2\n16#1:85,6\n25#1:94,2\n*E\n"})
/* loaded from: classes6.dex */
public final class s {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nGuidesContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuidesContainer.kt\ncom/baicizhan/platform/base/guide/GuidesContainerKt$GuidesContainer$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,60:1\n1563#2:61\n1634#2,3:62\n1878#2,2:65\n1880#2:85\n65#3:67\n69#3:72\n69#3:77\n69#3:82\n60#4:68\n85#4:71\n70#4:73\n90#4:76\n70#4:78\n90#4:81\n70#4:83\n22#5:69\n22#5:74\n22#5:79\n22#5:84\n54#6:70\n59#6:75\n59#6:80\n*S KotlinDebug\n*F\n+ 1 GuidesContainer.kt\ncom/baicizhan/platform/base/guide/GuidesContainerKt$GuidesContainer$1$1\n*L\n29#1:61\n29#1:62,3\n38#1:65,2\n38#1:85\n42#1:67\n48#1:72\n51#1:77\n53#1:82\n42#1:68\n42#1:71\n48#1:73\n48#1:76\n51#1:78\n51#1:81\n53#1:83\n42#1:69\n48#1:74\n51#1:79\n53#1:84\n42#1:70\n48#1:75\n51#1:80\n*E\n"})
    public static final class a implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<d> f102749a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f102750b;

        public a(List<d> list, float f11) {
            this.f102749a = list;
            this.f102750b = f11;
        }

        public static final g2 b(List list, List list2, long j11, float f11, Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            g0.p(layout, "$this$layout");
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    h0.b0();
                }
                Placeable placeable = (Placeable) obj;
                d dVar = (d) list2.get(i11);
                int B = g10.u.B(g10.u.u(((int) Float.intBitsToFloat((int) (dVar.c() >> 32))) - ((placeable.getWidth() - ((int) (dVar.e() >> 32))) / 2), 0), Constraints.m5068getMaxWidthimpl(j11) - placeable.getWidth());
                int B2 = g10.u.B(((int) Float.intBitsToFloat((int) (dVar.c() & 4294967295L))) + ((int) (dVar.e() & 4294967295L)), Constraints.m5067getMaxHeightimpl(j11) - placeable.getHeight());
                if (B2 < Float.intBitsToFloat((int) (dVar.c() & 4294967295L)) + ((int) (dVar.e() & 4294967295L))) {
                    B2 = ((int) Float.intBitsToFloat((int) (dVar.c() & 4294967295L))) - placeable.getHeight();
                }
                Placeable.PlacementScope.placeRelative$default(layout, placeable, B, B2 + ((int) f11), 0.0f, 4, null);
                layout = placementScope;
                i11 = i12;
            }
            return g2.f100423a;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i11) {
            return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i11);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i11) {
            return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i11);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo33measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j11) {
            g0.p(Layout, "$this$Layout");
            g0.p(measurables, "measurables");
            List<? extends Measurable> list = measurables;
            final ArrayList arrayList = new ArrayList(i0.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                long j12 = j11;
                arrayList.add(((Measurable) it.next()).mo3857measureBRTryo0(Constraints.m5058copyZbe2FdA$default(j12, 0, 0, 0, 0, 10, null)));
                j11 = j12;
            }
            final long j13 = j11;
            int m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(j13);
            int m5067getMaxHeightimpl = Constraints.m5067getMaxHeightimpl(j13);
            final List<d> list2 = this.f102749a;
            final float f11 = this.f102750b;
            return MeasureScope.layout$default(Layout, m5068getMaxWidthimpl, m5067getMaxHeightimpl, null, new x00.l() { // from class: zj.r
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 b11;
                    b11 = s.a.b(arrayList, list2, j13, f11, (Placeable.PlacementScope) obj);
                    return b11;
                }
            }, 4, null);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i11) {
            return super.minIntrinsicHeight(intrinsicMeasureScope, list, i11);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i11) {
            return super.minIntrinsicWidth(intrinsicMeasureScope, list, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0075  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@m80.k final androidx.compose.ui.Modifier r19, @m80.k final x00.a<? extends java.util.List<zj.d>> r20, float r21, @m80.k final x00.a<yz.g2> r22, @m80.l androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zj.s.b(androidx.compose.ui.Modifier, x00.a, float, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final g2 c(Modifier modifier, x00.a aVar, float f11, x00.a aVar2, int i11, int i12, Composer composer, int i13) {
        b(modifier, aVar, f11, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }
}
