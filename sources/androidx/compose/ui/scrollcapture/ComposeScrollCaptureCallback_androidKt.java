package androidx.compose.ui.scrollcapture;

import android.os.CancellationSignal;
import c40.l2;
import c40.r0;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ComposeScrollCaptureCallback_androidKt {
    private static final boolean DEBUG = false;

    @k
    private static final String TAG = "ScrollCapture";

    /* JADX INFO: Access modifiers changed from: private */
    public static final l2 launchWithCancellationSignal(r0 r0Var, final CancellationSignal cancellationSignal, p<? super r0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        final l2 f11;
        f11 = c40.k.f(r0Var, null, null, pVar, 3, null);
        f11.z0(new l<Throwable, g2>() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
                invoke2(th2);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                if (th2 != null) {
                    cancellationSignal.cancel();
                }
            }
        });
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.ui.scrollcapture.c
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                l2.a.b(l2.this, null, 1, null);
            }
        });
        return f11;
    }
}
