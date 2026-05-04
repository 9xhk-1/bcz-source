package ce;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.compose.runtime.internal.StabilityInferred;
import be.k;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class a implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8523a = 0;

    @Override // be.k
    @CallSuper
    public void B(@m80.k ViewGroup parent, @m80.k View guideView, @l View view, @l Rect rect, @m80.k x00.a<g2> onDismiss) {
        g0.p(parent, "parent");
        g0.p(guideView, "guideView");
        g0.p(onDismiss, "onDismiss");
        super.B(parent, guideView, view, rect, onDismiss);
        if (view == null || rect == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        K(parent, guideView, view, rect, onDismiss);
    }

    @Override // be.k
    public /* bridge */ int D() {
        return super.D();
    }

    @Override // be.k
    public /* bridge */ int E() {
        return super.E();
    }

    @Override // be.k
    @m80.k
    public /* bridge */ Pair<Integer, Integer> I() {
        return super.I();
    }

    public abstract void K(@m80.k ViewGroup viewGroup, @m80.k View view, @m80.k View view2, @m80.k Rect rect, @m80.k x00.a<g2> aVar);

    @Override // be.k
    @l
    public /* bridge */ x00.a<View> f() {
        return super.f();
    }

    @Override // be.k
    @l
    public /* bridge */ View getTarget() {
        return super.getTarget();
    }

    @Override // be.k
    public /* bridge */ int getWeight() {
        return super.getWeight();
    }

    @Override // be.k
    public /* bridge */ boolean i() {
        return super.i();
    }

    @Override // be.k
    public /* bridge */ int p() {
        return super.p();
    }

    @Override // be.k
    public /* bridge */ boolean v() {
        return super.v();
    }
}
