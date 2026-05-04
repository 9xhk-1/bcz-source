package androidx.compose.animation;

import a00.h0;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,865:1\n150#2,3:866\n34#2,6:869\n153#2:875\n344#2,8:880\n344#2,8:888\n344#2,8:896\n344#2,8:904\n30#3:876\n30#3:878\n80#4:877\n80#4:879\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n*L\n793#1:866,3\n793#1:869,6\n793#1:875\n813#1:880,8\n818#1:888,8\n823#1:896,8\n828#1:904,8\n802#1:876\n805#1:878\n802#1:877\n805#1:879\n*E\n"})
/* loaded from: classes.dex */
final class AnimatedEnterExitMeasurePolicy implements MeasurePolicy {
    private boolean hasLookaheadOccurred;

    @k
    private final AnimatedVisibilityScopeImpl scope;

    public AnimatedEnterExitMeasurePolicy(@k AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl) {
        this.scope = animatedVisibilityScopeImpl;
    }

    public final boolean getHasLookaheadOccurred() {
        return this.hasLookaheadOccurred;
    }

    @k
    public final AnimatedVisibilityScopeImpl getScope() {
        return this.scope;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int maxIntrinsicHeight = list.get(0).maxIntrinsicHeight(i11);
        int L = h0.L(list);
        int i12 = 1;
        if (1 <= L) {
            while (true) {
                int maxIntrinsicHeight2 = list.get(i12).maxIntrinsicHeight(i11);
                if (maxIntrinsicHeight2 > maxIntrinsicHeight) {
                    maxIntrinsicHeight = maxIntrinsicHeight2;
                }
                if (i12 == L) {
                    break;
                }
                i12++;
            }
        }
        return maxIntrinsicHeight;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int maxIntrinsicWidth = list.get(0).maxIntrinsicWidth(i11);
        int L = h0.L(list);
        int i12 = 1;
        if (1 <= L) {
            while (true) {
                int maxIntrinsicWidth2 = list.get(i12).maxIntrinsicWidth(i11);
                if (maxIntrinsicWidth2 > maxIntrinsicWidth) {
                    maxIntrinsicWidth = maxIntrinsicWidth2;
                }
                if (i12 == L) {
                    break;
                }
                i12++;
            }
        }
        return maxIntrinsicWidth;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(@k MeasureScope measureScope, @k List<? extends Measurable> list, long j11) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Placeable mo3857measureBRTryo0 = list.get(i13).mo3857measureBRTryo0(j11);
            i11 = Math.max(i11, mo3857measureBRTryo0.getWidth());
            i12 = Math.max(i12, mo3857measureBRTryo0.getHeight());
            arrayList.add(mo3857measureBRTryo0);
        }
        if (measureScope.isLookingAhead()) {
            this.hasLookaheadOccurred = true;
            this.scope.getTargetSize$animation().setValue(IntSize.m5278boximpl(IntSize.m5281constructorimpl((4294967295L & i12) | (i11 << 32))));
        } else if (!this.hasLookaheadOccurred) {
            this.scope.getTargetSize$animation().setValue(IntSize.m5278boximpl(IntSize.m5281constructorimpl((4294967295L & i12) | (i11 << 32))));
        }
        return MeasureScope.layout$default(measureScope, i11, i12, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                List<Placeable> list2 = arrayList;
                int size2 = list2.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    Placeable.PlacementScope.place$default(placementScope, list2.get(i14), 0, 0, 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int minIntrinsicHeight = list.get(0).minIntrinsicHeight(i11);
        int L = h0.L(list);
        int i12 = 1;
        if (1 <= L) {
            while (true) {
                int minIntrinsicHeight2 = list.get(i12).minIntrinsicHeight(i11);
                if (minIntrinsicHeight2 > minIntrinsicHeight) {
                    minIntrinsicHeight = minIntrinsicHeight2;
                }
                if (i12 == L) {
                    break;
                }
                i12++;
            }
        }
        return minIntrinsicHeight;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int minIntrinsicWidth = list.get(0).minIntrinsicWidth(i11);
        int L = h0.L(list);
        int i12 = 1;
        if (1 <= L) {
            while (true) {
                int minIntrinsicWidth2 = list.get(i12).minIntrinsicWidth(i11);
                if (minIntrinsicWidth2 > minIntrinsicWidth) {
                    minIntrinsicWidth = minIntrinsicWidth2;
                }
                if (i12 == L) {
                    break;
                }
                i12++;
            }
        }
        return minIntrinsicWidth;
    }

    public final void setHasLookaheadOccurred(boolean z11) {
        this.hasLookaheadOccurred = z11;
    }
}
