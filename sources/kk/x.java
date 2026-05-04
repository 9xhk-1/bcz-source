package kk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public boolean f66833a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f66834b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        public static final int f66835a = 1;

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((u) message.obj).recycle();
            return true;
        }
    }

    public synchronized void a(u<?> uVar, boolean z11) {
        try {
            if (!this.f66833a && !z11) {
                this.f66833a = true;
                uVar.recycle();
                this.f66833a = false;
            }
            this.f66834b.obtainMessage(1, uVar).sendToTarget();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
