package androidx.compose.material.ripple;

import a00.h0;
import a00.m0;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nRippleContainer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleContainer.android.kt\nandroidx/compose/material/ripple/RippleContainer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
/* loaded from: classes.dex */
public final class RippleContainer extends ViewGroup {
    public static final int $stable = 8;
    private final int MaxRippleHosts;
    private int nextHostIndex;

    @k
    private final RippleHostMap rippleHostMap;

    @k
    private final List<RippleHostView> rippleHosts;

    @k
    private final List<RippleHostView> unusedRippleHosts;

    public RippleContainer(@k Context context) {
        super(context);
        this.MaxRippleHosts = 5;
        ArrayList arrayList = new ArrayList();
        this.rippleHosts = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.unusedRippleHosts = arrayList2;
        this.rippleHostMap = new RippleHostMap();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.nextHostIndex = 1;
        setTag(androidx.compose.ui.R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void disposeRippleIfNeeded(@k RippleHostKey rippleHostKey) {
        rippleHostKey.onResetRippleHostView();
        RippleHostView rippleHostView = this.rippleHostMap.get(rippleHostKey);
        if (rippleHostView != null) {
            rippleHostView.disposeRipple();
            this.rippleHostMap.remove(rippleHostKey);
            this.unusedRippleHosts.add(rippleHostView);
        }
    }

    @k
    public final RippleHostView getRippleHostView(@k RippleHostKey rippleHostKey) {
        RippleHostView rippleHostView = this.rippleHostMap.get(rippleHostKey);
        if (rippleHostView != null) {
            return rippleHostView;
        }
        RippleHostView rippleHostView2 = (RippleHostView) m0.P0(this.unusedRippleHosts);
        if (rippleHostView2 == null) {
            if (this.nextHostIndex > h0.L(this.rippleHosts)) {
                rippleHostView2 = new RippleHostView(getContext());
                addView(rippleHostView2);
                this.rippleHosts.add(rippleHostView2);
            } else {
                rippleHostView2 = this.rippleHosts.get(this.nextHostIndex);
                RippleHostKey rippleHostKey2 = this.rippleHostMap.get(rippleHostView2);
                if (rippleHostKey2 != null) {
                    rippleHostKey2.onResetRippleHostView();
                    this.rippleHostMap.remove(rippleHostKey2);
                    rippleHostView2.disposeRipple();
                }
            }
            int i11 = this.nextHostIndex;
            if (i11 < this.MaxRippleHosts - 1) {
                this.nextHostIndex = i11 + 1;
            } else {
                this.nextHostIndex = 0;
            }
        }
        this.rippleHostMap.set(rippleHostKey, rippleHostView2);
        return rippleHostView2;
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }
}
