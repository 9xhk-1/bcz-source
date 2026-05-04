package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Lambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class AndroidComposeView$snapshotObserver$1 extends Lambda implements x00.l<x00.a<? extends g2>, g2> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$snapshotObserver$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ g2 invoke(x00.a<? extends g2> aVar) {
        invoke2((x00.a<g2>) aVar);
        return g2.f100423a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final x00.a<g2> aVar) {
        Handler handler = this.this$0.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            aVar.invoke();
            return;
        }
        Handler handler2 = this.this$0.getHandler();
        if (handler2 != null) {
            handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.f
                @Override // java.lang.Runnable
                public final void run() {
                    x00.a.this.invoke();
                }
            });
        }
    }
}
