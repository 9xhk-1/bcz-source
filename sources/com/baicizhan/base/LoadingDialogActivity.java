package com.baicizhan.base;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLoadingDialogActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadingDialogActivity.kt\ncom/baicizhan/base/LoadingDialogActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: classes3.dex */
public class LoadingDialogActivity extends AppCompatActivity {

    @l
    private b delayedLoading;
    private boolean isLoadingDialogShowing;

    @k
    public static final a Companion = new a(null);
    public static final int $stable = 8;
    private static final String TAG = LoadingDialogActivity.class.getSimpleName();

    @k
    private final c0 loadingDialog$delegate = e0.c(new x00.a() { // from class: com.baicizhan.base.e
        @Override // x00.a
        public final Object invoke() {
            va.f F0;
            F0 = LoadingDialogActivity.F0(LoadingDialogActivity.this);
            return F0;
        }
    });

    @k
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            qb.c.b(LoadingDialogActivity.TAG, "delayed showing", new Object[0]);
            LoadingDialogActivity.this.E0().show();
            LoadingDialogActivity.this.isLoadingDialogShowing = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final va.f E0() {
        return (va.f) this.loadingDialog$delegate.getValue();
    }

    public static final va.f F0(LoadingDialogActivity loadingDialogActivity) {
        va.f fVar = new va.f(loadingDialogActivity);
        fVar.setCancelable(false);
        return fVar;
    }

    public static /* synthetic */ void setLoading$default(LoadingDialogActivity loadingDialogActivity, boolean z11, long j11, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLoading");
        }
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        if ((i11 & 4) != 0) {
            str = "";
        }
        loadingDialogActivity.setLoading(z11, j11, str);
    }

    public final void G0() {
        b bVar = this.delayedLoading;
        if (bVar != null) {
            this.handler.removeCallbacks(bVar);
        }
        this.delayedLoading = null;
    }

    public final boolean isLoadingShowing() {
        return this.isLoadingDialogShowing;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.handler.removeCallbacksAndMessages(null);
        if (this.isLoadingDialogShowing) {
            E0().dismiss();
        }
    }

    @w00.k
    public final void setLoading(boolean z11) {
        setLoading$default(this, z11, 0L, null, 6, null);
    }

    @w00.k
    public final void setLoading(boolean z11, long j11) {
        setLoading$default(this, z11, j11, null, 4, null);
    }

    @w00.k
    public final void setLoading(boolean z11, long j11, @k String message) {
        g0.p(message, "message");
        qb.c.b(TAG, "isLoading = " + z11 + ", showing = " + this.isLoadingDialogShowing + ", delay = " + j11, new Object[0]);
        if (z11 && this.isLoadingDialogShowing) {
            return;
        }
        G0();
        if (!z11) {
            E0().dismiss();
            this.isLoadingDialogShowing = false;
        } else {
            if (j11 > 0) {
                Handler handler = this.handler;
                b bVar = new b();
                this.delayedLoading = bVar;
                handler.postDelayed(bVar, j11);
                return;
            }
            E0().f(message);
            E0().show();
            this.isLoadingDialogShowing = true;
        }
    }
}
