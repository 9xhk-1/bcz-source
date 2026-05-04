package androidx.compose.ui;

import android.os.Handler;
import android.os.Looper;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class Actual_androidKt {

    @k
    private static final Handler handler = new Handler(Looper.getMainLooper());

    public static final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @k
    public static final Object postDelayed(long j11, @k final x00.a<g2> aVar) {
        Runnable runnable = new Runnable() { // from class: androidx.compose.ui.a
            @Override // java.lang.Runnable
            public final void run() {
                x00.a.this.invoke();
            }
        };
        handler.postDelayed(runnable, j11);
        return runnable;
    }

    public static final void removePost(@l Object obj) {
        if ((obj instanceof Runnable ? (Runnable) obj : null) == null) {
            return;
        }
        handler.removeCallbacks((Runnable) obj);
    }
}
