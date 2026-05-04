package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import c40.l2;
import c40.r0;
import e40.l0;
import e40.o;
import e40.r;
import j00.c;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.i;
import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class OnBackInstance {

    @k
    private final o<BackEventCompat> channel = r.d(-2, BufferOverflow.SUSPEND, null, 4, null);
    private boolean isPredictiveBack;

    @k
    private final l2 job;

    public OnBackInstance(@k r0 r0Var, boolean z11, @k p<? super i<BackEventCompat>, ? super c<? super g2>, ? extends Object> pVar, @k OnBackPressedCallback onBackPressedCallback) {
        l2 f11;
        this.isPredictiveBack = z11;
        f11 = c40.k.f(r0Var, null, null, new OnBackInstance$job$1(onBackPressedCallback, pVar, this, null), 3, null);
        this.job = f11;
    }

    public final void cancel() {
        this.channel.cancel(new CancellationException("onBack cancelled"));
        l2.a.b(this.job, null, 1, null);
    }

    public final boolean close() {
        return l0.a.a(this.channel, null, 1, null);
    }

    @k
    public final o<BackEventCompat> getChannel() {
        return this.channel;
    }

    @k
    public final l2 getJob() {
        return this.job;
    }

    public final boolean isPredictiveBack() {
        return this.isPredictiveBack;
    }

    @k
    /* renamed from: send-JP2dKIU, reason: not valid java name */
    public final Object m0sendJP2dKIU(@k BackEventCompat backEventCompat) {
        return this.channel.m(backEventCompat);
    }

    public final void setPredictiveBack(boolean z11) {
        this.isPredictiveBack = z11;
    }
}
