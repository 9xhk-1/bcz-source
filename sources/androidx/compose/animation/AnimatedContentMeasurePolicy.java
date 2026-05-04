package androidx.compose.animation;

import a00.a0;
import a00.d1;
import a00.h0;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import g10.l;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,958:1\n70#2,4:959\n75#2:965\n70#2,6:966\n320#2,8:1006\n320#2,8:1014\n320#2,8:1022\n320#2,8:1030\n30#3:963\n30#3:1004\n80#4:964\n85#4:973\n90#4:989\n80#4:1005\n54#5:972\n59#5:988\n13896#6,14:974\n13896#6,14:990\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy\n*L\n887#1:959,4\n887#1:965\n900#1:966,6\n941#1:1006,8\n946#1:1014,8\n951#1:1022,8\n956#1:1030,8\n894#1:963\n919#1:1004\n894#1:964\n907#1:973\n913#1:989\n919#1:1005\n907#1:972\n913#1:988\n909#1:974,14\n915#1:990,14\n*E\n"})
/* loaded from: classes.dex */
final class AnimatedContentMeasurePolicy implements MeasurePolicy {

    @k
    private final AnimatedContentTransitionScopeImpl<?> rootScope;

    public AnimatedContentMeasurePolicy(@k AnimatedContentTransitionScopeImpl<?> animatedContentTransitionScopeImpl) {
        this.rootScope = animatedContentTransitionScopeImpl;
    }

    @k
    public final AnimatedContentTransitionScopeImpl<?> getRootScope() {
        return this.rootScope;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).maxIntrinsicHeight(i11));
            int L = h0.L(list);
            int i12 = 1;
            if (1 <= L) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i12).maxIntrinsicHeight(i11));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i12 == L) {
                        break;
                    }
                    i12++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).maxIntrinsicWidth(i11));
            int L = h0.L(list);
            int i12 = 1;
            if (1 <= L) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i12).maxIntrinsicWidth(i11));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i12 == L) {
                        break;
                    }
                    i12++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @k
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo33measure3p2s80s(@k MeasureScope measureScope, @k List<? extends Measurable> list, long j11) {
        Placeable placeable;
        Placeable placeable2;
        final int width;
        final int height;
        int size = list.size();
        final Placeable[] placeableArr = new Placeable[size];
        long m5291getZeroYbymL2g = IntSize.Companion.m5291getZeroYbymL2g();
        List<? extends Measurable> list2 = list;
        int size2 = list2.size();
        int i11 = 0;
        while (true) {
            placeable = null;
            if (i11 >= size2) {
                break;
            }
            Measurable measurable = list.get(i11);
            Object parentData = measurable.getParentData();
            AnimatedContentTransitionScopeImpl.ChildData childData = parentData instanceof AnimatedContentTransitionScopeImpl.ChildData ? (AnimatedContentTransitionScopeImpl.ChildData) parentData : null;
            if (childData != null && childData.isTarget()) {
                Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
                long m5281constructorimpl = IntSize.m5281constructorimpl((mo3857measureBRTryo0.getWidth() << 32) | (mo3857measureBRTryo0.getHeight() & 4294967295L));
                g2 g2Var = g2.f100423a;
                placeableArr[i11] = mo3857measureBRTryo0;
                m5291getZeroYbymL2g = m5281constructorimpl;
            }
            i11++;
        }
        int size3 = list2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            Measurable measurable2 = list.get(i12);
            if (placeableArr[i12] == null) {
                placeableArr[i12] = measurable2.mo3857measureBRTryo0(j11);
            }
        }
        if (measureScope.isLookingAhead()) {
            width = (int) (m5291getZeroYbymL2g >> 32);
        } else {
            if (size == 0) {
                placeable2 = null;
            } else {
                placeable2 = placeableArr[0];
                int Oe = a0.Oe(placeableArr);
                if (Oe != 0) {
                    int width2 = placeable2 != null ? placeable2.getWidth() : 0;
                    d1 it = new l(1, Oe).iterator();
                    while (it.hasNext()) {
                        Placeable placeable3 = placeableArr[it.nextInt()];
                        int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                        if (width2 < width3) {
                            placeable2 = placeable3;
                            width2 = width3;
                        }
                    }
                }
            }
            width = placeable2 != null ? placeable2.getWidth() : 0;
        }
        if (measureScope.isLookingAhead()) {
            height = (int) (m5291getZeroYbymL2g & 4294967295L);
        } else {
            if (size != 0) {
                placeable = placeableArr[0];
                int Oe2 = a0.Oe(placeableArr);
                if (Oe2 != 0) {
                    int height2 = placeable != null ? placeable.getHeight() : 0;
                    d1 it2 = new l(1, Oe2).iterator();
                    while (it2.hasNext()) {
                        Placeable placeable4 = placeableArr[it2.nextInt()];
                        int height3 = placeable4 != null ? placeable4.getHeight() : 0;
                        if (height2 < height3) {
                            placeable = placeable4;
                            height2 = height3;
                        }
                    }
                }
            }
            height = placeable != null ? placeable.getHeight() : 0;
        }
        if (!measureScope.isLookingAhead()) {
            this.rootScope.m58setMeasuredSizeozmzZPI$animation(IntSize.m5281constructorimpl((width << 32) | (height & 4294967295L)));
        }
        return MeasureScope.layout$default(measureScope, width, height, null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
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
                Placeable[] placeableArr2;
                Placeable[] placeableArr3 = placeableArr;
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this;
                int i13 = width;
                int i14 = height;
                int length = placeableArr3.length;
                int i15 = 0;
                while (i15 < length) {
                    Placeable placeable5 = placeableArr3[i15];
                    if (placeable5 != null) {
                        placeableArr2 = placeableArr3;
                        long mo2085alignKFBX0sM = animatedContentMeasurePolicy.getRootScope().getContentAlignment().mo2085alignKFBX0sM(IntSize.m5281constructorimpl((placeable5.getWidth() << 32) | (placeable5.getHeight() & 4294967295L)), IntSize.m5281constructorimpl((i14 & 4294967295L) | (i13 << 32)), LayoutDirection.Ltr);
                        Placeable.PlacementScope.place$default(placementScope, placeable5, IntOffset.m5243getXimpl(mo2085alignKFBX0sM), IntOffset.m5244getYimpl(mo2085alignKFBX0sM), 0.0f, 4, null);
                    } else {
                        placeableArr2 = placeableArr3;
                    }
                    i15++;
                    placeableArr3 = placeableArr2;
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).minIntrinsicHeight(i11));
            int L = h0.L(list);
            int i12 = 1;
            if (1 <= L) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i12).minIntrinsicHeight(i11));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i12 == L) {
                        break;
                    }
                    i12++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).minIntrinsicWidth(i11));
            int L = h0.L(list);
            int i12 = 1;
            if (1 <= L) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i12).minIntrinsicWidth(i11));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i12 == L) {
                        break;
                    }
                    i12++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
