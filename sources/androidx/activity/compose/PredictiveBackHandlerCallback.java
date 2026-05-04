package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import c40.r0;
import e40.s;
import j00.c;
import kotlinx.coroutines.flow.i;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class PredictiveBackHandlerCallback extends OnBackPressedCallback {

    @k
    private p<? super i<BackEventCompat>, ? super c<? super g2>, ? extends Object> currentOnBack;
    private boolean isActive;

    @l
    private OnBackInstance onBackInstance;

    @k
    private r0 onBackScope;

    public PredictiveBackHandlerCallback(boolean z11, @k r0 r0Var, @k p<? super i<BackEventCompat>, ? super c<? super g2>, ? extends Object> pVar) {
        super(z11);
        this.onBackScope = r0Var;
        this.currentOnBack = pVar;
    }

    @k
    public final p<i<BackEventCompat>, c<? super g2>, Object> getCurrentOnBack() {
        return this.currentOnBack;
    }

    @k
    public final r0 getOnBackScope() {
        return this.onBackScope;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackCancelled() {
        super.handleOnBackCancelled();
        OnBackInstance onBackInstance = this.onBackInstance;
        if (onBackInstance != null) {
            onBackInstance.cancel();
        }
        OnBackInstance onBackInstance2 = this.onBackInstance;
        if (onBackInstance2 != null) {
            onBackInstance2.setPredictiveBack(false);
        }
        this.isActive = false;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackPressed() {
        OnBackInstance onBackInstance = this.onBackInstance;
        if (onBackInstance != null && !onBackInstance.isPredictiveBack()) {
            onBackInstance.cancel();
            this.onBackInstance = null;
        }
        if (this.onBackInstance == null) {
            this.onBackInstance = new OnBackInstance(this.onBackScope, false, this.currentOnBack, this);
        }
        OnBackInstance onBackInstance2 = this.onBackInstance;
        if (onBackInstance2 != null) {
            onBackInstance2.close();
        }
        OnBackInstance onBackInstance3 = this.onBackInstance;
        if (onBackInstance3 != null) {
            onBackInstance3.setPredictiveBack(false);
        }
        this.isActive = false;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackProgressed(@k BackEventCompat backEventCompat) {
        super.handleOnBackProgressed(backEventCompat);
        OnBackInstance onBackInstance = this.onBackInstance;
        if (onBackInstance != null) {
            s.b(onBackInstance.m0sendJP2dKIU(backEventCompat));
        }
    }

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackStarted(@k BackEventCompat backEventCompat) {
        super.handleOnBackStarted(backEventCompat);
        OnBackInstance onBackInstance = this.onBackInstance;
        if (onBackInstance != null) {
            onBackInstance.cancel();
        }
        if (isEnabled()) {
            this.onBackInstance = new OnBackInstance(this.onBackScope, true, this.currentOnBack, this);
        }
        this.isActive = true;
    }

    public final void setCurrentOnBack(@k p<? super i<BackEventCompat>, ? super c<? super g2>, ? extends Object> pVar) {
        this.currentOnBack = pVar;
    }

    public final void setIsEnabled(boolean z11) {
        OnBackInstance onBackInstance;
        if (!z11 && !this.isActive && isEnabled() && (onBackInstance = this.onBackInstance) != null) {
            onBackInstance.cancel();
        }
        setEnabled(z11);
    }

    public final void setOnBackScope(@k r0 r0Var) {
        this.onBackScope = r0Var;
    }
}
