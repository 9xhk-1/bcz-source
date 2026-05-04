package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import q30.m;
import q30.x;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material/DropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,388:1\n1#2:389\n179#3,2:390\n179#3,2:392\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material/DropdownMenuPositionProvider\n*L\n361#1:390,2\n376#1:392,2\n*E\n"})
/* loaded from: classes.dex */
public final class DropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final long contentOffset;

    @k
    private final Density density;

    @k
    private final p<IntRect, IntRect, g2> onPositionCalculated;

    public /* synthetic */ DropdownMenuPositionProvider(long j11, Density density, p pVar, v vVar) {
        this(j11, density, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-rOJDEFc$default, reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m1660copyrOJDEFc$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j11, Density density, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = dropdownMenuPositionProvider.contentOffset;
        }
        if ((i11 & 2) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        if ((i11 & 4) != 0) {
            pVar = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m1662copyrOJDEFc(j11, density, pVar);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo346calculatePositionllwVHH4(@k IntRect intRect, long j11, @k LayoutDirection layoutDirection, long j12) {
        m C;
        Object obj;
        Object obj2;
        int mo371roundToPx0680j_4 = this.density.mo371roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
        int mo371roundToPx0680j_42 = this.density.mo371roundToPx0680j_4(DpOffset.m5176getXD9Ej5fM(this.contentOffset));
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        int i11 = mo371roundToPx0680j_42 * (layoutDirection == layoutDirection2 ? 1 : -1);
        int mo371roundToPx0680j_43 = this.density.mo371roundToPx0680j_4(DpOffset.m5178getYD9Ej5fM(this.contentOffset));
        int left = intRect.getLeft() + i11;
        int right = (intRect.getRight() - IntSize.m5286getWidthimpl(j12)) + i11;
        int m5286getWidthimpl = IntSize.m5286getWidthimpl(j11) - IntSize.m5286getWidthimpl(j12);
        if (layoutDirection == layoutDirection2) {
            Integer valueOf = Integer.valueOf(left);
            Integer valueOf2 = Integer.valueOf(right);
            if (intRect.getLeft() < 0) {
                m5286getWidthimpl = 0;
            }
            C = x.C(valueOf, valueOf2, Integer.valueOf(m5286getWidthimpl));
        } else {
            Integer valueOf3 = Integer.valueOf(right);
            Integer valueOf4 = Integer.valueOf(left);
            if (intRect.getRight() <= IntSize.m5286getWidthimpl(j11)) {
                m5286getWidthimpl = 0;
            }
            C = x.C(valueOf3, valueOf4, Integer.valueOf(m5286getWidthimpl));
        }
        Iterator it = C.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            int intValue = ((Number) obj2).intValue();
            if (intValue >= 0 && intValue + IntSize.m5286getWidthimpl(j12) <= IntSize.m5286getWidthimpl(j11)) {
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            right = num.intValue();
        }
        int max = Math.max(intRect.getBottom() + mo371roundToPx0680j_43, mo371roundToPx0680j_4);
        int top = (intRect.getTop() - IntSize.m5285getHeightimpl(j12)) + mo371roundToPx0680j_43;
        Iterator it2 = x.C(Integer.valueOf(max), Integer.valueOf(top), Integer.valueOf((intRect.getTop() - (IntSize.m5285getHeightimpl(j12) / 2)) + mo371roundToPx0680j_43), Integer.valueOf((IntSize.m5285getHeightimpl(j11) - IntSize.m5285getHeightimpl(j12)) - mo371roundToPx0680j_4)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int intValue2 = ((Number) next).intValue();
            if (intValue2 >= mo371roundToPx0680j_4 && intValue2 + IntSize.m5285getHeightimpl(j12) <= IntSize.m5285getHeightimpl(j11) - mo371roundToPx0680j_4) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            top = num2.intValue();
        }
        this.onPositionCalculated.invoke(intRect, new IntRect(right, top, IntSize.m5286getWidthimpl(j12) + right, IntSize.m5285getHeightimpl(j12) + top));
        return IntOffsetKt.IntOffset(right, top);
    }

    /* renamed from: component1-RKDOV3M, reason: not valid java name */
    public final long m1661component1RKDOV3M() {
        return this.contentOffset;
    }

    @k
    public final Density component2() {
        return this.density;
    }

    @k
    public final p<IntRect, IntRect, g2> component3() {
        return this.onPositionCalculated;
    }

    @k
    /* renamed from: copy-rOJDEFc, reason: not valid java name */
    public final DropdownMenuPositionProvider m1662copyrOJDEFc(long j11, @k Density density, @k p<? super IntRect, ? super IntRect, g2> pVar) {
        return new DropdownMenuPositionProvider(j11, density, pVar, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
        return DpOffset.m5175equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && g0.g(this.density, dropdownMenuPositionProvider.density) && g0.g(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    /* renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m1663getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    @k
    public final Density getDensity() {
        return this.density;
    }

    @k
    public final p<IntRect, IntRect, g2> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public int hashCode() {
        return (((DpOffset.m5180hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + this.onPositionCalculated.hashCode();
    }

    @k
    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m5183toStringimpl(this.contentOffset)) + ", density=" + this.density + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j11, Density density, p<? super IntRect, ? super IntRect, g2> pVar) {
        this.contentOffset = j11;
        this.density = density;
        this.onPositionCalculated = pVar;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j11, Density density, p pVar, int i11, v vVar) {
        this(j11, density, (i11 & 4) != 0 ? new p<IntRect, IntRect, g2>() { // from class: androidx.compose.material.DropdownMenuPositionProvider.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(IntRect intRect, IntRect intRect2) {
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(IntRect intRect, IntRect intRect2) {
                invoke2(intRect, intRect2);
                return g2.f100423a;
            }
        } : pVar, null);
    }
}
