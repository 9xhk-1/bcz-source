package com.zx.a.I8b7;

import android.media.MediaDrm;
import android.os.Build;
import android.util.Base64;
import com.zx.module.base.Callback;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callback f46717a;

    public v0(Callback callback) {
        this.f46717a = callback;
    }

    @Override // java.lang.Runnable
    public void run() {
        MediaDrm mediaDrm;
        Throwable th2;
        try {
            try {
                mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
                try {
                    String str = new String(Base64.encode(mediaDrm.getPropertyByteArray("deviceUniqueId"), 2), StandardCharsets.UTF_8);
                    if (Build.VERSION.SDK_INT >= 28) {
                        mediaDrm.release();
                    } else {
                        mediaDrm.release();
                    }
                    this.f46717a.callback(str);
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        r2.a(th2);
                        if (Build.VERSION.SDK_INT >= 28) {
                            if (mediaDrm != null) {
                                mediaDrm.release();
                            }
                        } else if (mediaDrm != null) {
                            mediaDrm.release();
                        }
                        this.f46717a.callback("");
                    } catch (Throwable th4) {
                        try {
                            if (Build.VERSION.SDK_INT >= 28) {
                                if (mediaDrm != null) {
                                    mediaDrm.release();
                                }
                            } else if (mediaDrm != null) {
                                mediaDrm.release();
                            }
                            this.f46717a.callback("");
                        } catch (Throwable unused) {
                        }
                        throw th4;
                    }
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable th5) {
            mediaDrm = null;
            th2 = th5;
        }
    }
}
