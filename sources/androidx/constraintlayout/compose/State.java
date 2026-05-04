package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.CorePixelDp;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/State\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2303:1\n1#2:2304\n288#3,2:2305\n*S KotlinDebug\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/State\n*L\n1584#1:2305,2\n*E\n"})
/* loaded from: classes2.dex */
public final class State extends androidx.constraintlayout.core.state.State {
    public static final int $stable = 8;

    @k
    private final Density density;
    private long rootIncomingConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

    @k
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;

    public State(@k Density density) {
        this.density = density;
        setDpToPixel(new CorePixelDp() { // from class: androidx.constraintlayout.compose.c
            @Override // androidx.constraintlayout.core.state.CorePixelDp
            public final float toPixels(float f11) {
                float _init_$lambda$0;
                _init_$lambda$0 = State._init_$lambda$0(State.this, f11);
                return _init_$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float _init_$lambda$0(State state, float f11) {
        return state.density.getDensity() * f11;
    }

    @Override // androidx.constraintlayout.core.state.State
    public int convertDimension(@l Object obj) {
        return obj instanceof Dp ? this.density.mo371roundToPx0680j_4(((Dp) obj).m5129unboximpl()) : super.convertDimension(obj);
    }

    @k
    public final Density getDensity() {
        return this.density;
    }

    @l
    public final Object getKeyId$constraintlayout_compose_release(@k HelperWidget helperWidget) {
        Object obj;
        Iterator<T> it = this.mHelperReferences.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (g0.g(((HelperReference) ((Map.Entry) obj).getValue()).getHelperWidget(), helperWidget)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    @k
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* renamed from: getRootIncomingConstraints-msEJaDk, reason: not valid java name */
    public final long m5583getRootIncomingConstraintsmsEJaDk() {
        return this.rootIncomingConstraints;
    }

    public final void setLayoutDirection(@k LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    /* renamed from: setRootIncomingConstraints-BRTryo0, reason: not valid java name */
    public final void m5584setRootIncomingConstraintsBRTryo0(long j11) {
        this.rootIncomingConstraints = j11;
    }

    @n(message = "Use #isLtr instead")
    public static /* synthetic */ void getLayoutDirection$annotations() {
    }
}
