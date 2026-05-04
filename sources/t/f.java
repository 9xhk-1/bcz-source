package t;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f implements Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public static final String f89090d = "PreviewCallback";

    /* renamed from: a, reason: collision with root package name */
    public final c f89091a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f89092b;

    /* renamed from: c, reason: collision with root package name */
    public int f89093c;

    public f(c configManager) {
        this.f89091a = configManager;
    }

    public void a(Handler previewHandler, int previewMessage) {
        this.f89092b = previewHandler;
        this.f89093c = previewMessage;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] data, Camera camera) {
        Point d11 = this.f89091a.d();
        Handler handler = this.f89092b;
        if (d11 == null || handler == null) {
            qb.c.b(f89090d, "Got preview callback, but no handler or resolution available", new Object[0]);
        } else {
            handler.obtainMessage(this.f89093c, d11.x, d11.y, data).sendToTarget();
            this.f89092b = null;
        }
    }
}
