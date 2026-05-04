package androidx.constraintlayout.compose;

import android.os.Handler;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.layout.Measurable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@v0
@u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintSetForInlineDsl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,2303:1\n69#2,6:2304\n*S KotlinDebug\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintSetForInlineDsl\n*L\n544#1:2304,6\n*E\n"})
/* loaded from: classes2.dex */
public final class ConstraintSetForInlineDsl implements ConstraintSet, RememberObserver {
    public static final int $stable = 0;

    @l
    private Handler handler;

    @k
    private final ConstraintLayoutScope scope;

    @k
    private final SnapshotStateObserver observer = new SnapshotStateObserver(new ConstraintSetForInlineDsl$observer$1(this));
    private boolean knownDirty = true;

    @k
    private final x00.l<g2, g2> onCommitAffectingConstrainLambdas = new x00.l<g2, g2>() { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$onCommitAffectingConstrainLambdas$1
        {
            super(1);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(g2 g2Var) {
            invoke2(g2Var);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(g2 g2Var) {
            ConstraintSetForInlineDsl.this.setKnownDirty(true);
        }
    };

    @k
    private final List<ConstraintLayoutParentData> previousDatas = new ArrayList();

    public ConstraintSetForInlineDsl(@k ConstraintLayoutScope constraintLayoutScope) {
        this.scope = constraintLayoutScope;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(@k final State state, @k final List<? extends Measurable> list) {
        this.previousDatas.clear();
        this.observer.observeReads(g2.f100423a, this.onCommitAffectingConstrainLambdas, new x00.a<g2>() { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$applyTo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                List list2;
                List<Measurable> list3 = list;
                ConstraintSetForInlineDsl constraintSetForInlineDsl = this;
                int size = list3.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Object parentData = list3.get(i11).getParentData();
                    ConstraintLayoutParentData constraintLayoutParentData = parentData instanceof ConstraintLayoutParentData ? (ConstraintLayoutParentData) parentData : null;
                    if (constraintLayoutParentData != null) {
                        ConstrainedLayoutReference ref = constraintLayoutParentData.getRef();
                        constraintLayoutParentData.getConstrain().invoke(new ConstrainScope(ref.getId$constraintlayout_compose_release(), constraintSetForInlineDsl.getScope().asCLContainer$constraintlayout_compose_release(ref)));
                    }
                    list2 = constraintSetForInlineDsl.previousDatas;
                    list2.add(constraintLayoutParentData);
                }
                this.getScope().applyTo(state);
            }
        });
        this.knownDirty = false;
    }

    public final boolean getKnownDirty() {
        return this.knownDirty;
    }

    @k
    public final ConstraintLayoutScope getScope() {
        return this.scope;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public boolean isDirty(@k List<? extends Measurable> list) {
        if (this.knownDirty || list.size() != this.previousDatas.size()) {
            return true;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object parentData = list.get(i11).getParentData();
            if (!g0.g(parentData instanceof ConstraintLayoutParentData ? (ConstraintLayoutParentData) parentData : null, this.previousDatas.get(i11))) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.observer.stop();
        this.observer.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.observer.start();
    }

    public final void setKnownDirty(boolean z11) {
        this.knownDirty = z11;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }
}
