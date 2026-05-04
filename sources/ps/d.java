package ps;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d extends Handler {

    /* renamed from: b, reason: collision with root package name */
    public static final String f81182b = "RenderHandler";

    /* renamed from: c, reason: collision with root package name */
    public static final int f81183c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f81184d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f81185e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f81186f = 3;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<e> f81187a;

    public d(e rt2) {
        this.f81187a = new WeakReference<>(rt2);
    }

    public void a() {
        sendMessage(obtainMessage(1));
    }

    public void b() {
        sendMessage(obtainMessage(2));
    }

    public void c(Surface surface) {
        sendMessage(obtainMessage(0, surface));
    }

    public void d(int width, int height) {
        sendMessage(obtainMessage(3, width, height));
    }

    @Override // android.os.Handler
    public void handleMessage(Message msg) {
        int i11 = msg.what;
        e eVar = this.f81187a.get();
        if (eVar == null) {
            Log.w(f81182b, "RenderHandler.handleMessage: weak ref is null");
            return;
        }
        if (i11 == 0) {
            eVar.g((Surface) msg.obj);
            return;
        }
        if (i11 == 1) {
            eVar.a();
            return;
        }
        if (i11 == 2) {
            eVar.f();
        } else {
            if (i11 == 3) {
                eVar.h(msg.arg1, msg.arg2);
                return;
            }
            throw new RuntimeException("unknown message " + i11);
        }
    }
}
