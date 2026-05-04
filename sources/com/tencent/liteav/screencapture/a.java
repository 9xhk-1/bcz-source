package com.tencent.liteav.screencapture;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.f;
import com.tencent.liteav.basic.util.h;
import com.tencent.liteav.basic.util.j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@TargetApi(21)
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f44105a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f44106b;

    /* renamed from: f, reason: collision with root package name */
    private MediaProjection f44110f;

    /* renamed from: g, reason: collision with root package name */
    private j f44111g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f44112h;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Surface, C0517a> f44108d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private boolean f44109e = false;

    /* renamed from: i, reason: collision with root package name */
    private MediaProjection.Callback f44113i = new MediaProjection.Callback() { // from class: com.tencent.liteav.screencapture.a.1
        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            TXCLog.e("VirtualDisplayManager", "MediaProjection session is no longer valid");
            HashMap hashMap = new HashMap(a.this.f44108d);
            a.this.f44108d.clear();
            for (C0517a c0517a : hashMap.values()) {
                b bVar = c0517a.f44121d;
                if (bVar != null) {
                    if (c0517a.f44122e != null) {
                        bVar.a();
                    } else {
                        bVar.a(false, false);
                    }
                }
            }
            a.this.a(false);
        }
    };

    /* renamed from: j, reason: collision with root package name */
    private j.a f44114j = new j.a() { // from class: com.tencent.liteav.screencapture.a.2
        @Override // com.tencent.liteav.basic.util.j.a
        public void onTimeout() {
            a aVar = a.this;
            boolean b11 = aVar.b(aVar.f44106b);
            if (a.this.f44112h == b11) {
                return;
            }
            a.this.f44112h = b11;
            Iterator it = a.this.f44108d.values().iterator();
            while (it.hasNext()) {
                b bVar = ((C0517a) it.next()).f44121d;
                if (bVar != null) {
                    bVar.a(b11);
                }
            }
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final Handler f44107c = new f(Looper.getMainLooper());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.tencent.liteav.screencapture.a$a, reason: collision with other inner class name */
    public static class C0517a {

        /* renamed from: a, reason: collision with root package name */
        public Surface f44118a;

        /* renamed from: b, reason: collision with root package name */
        public int f44119b;

        /* renamed from: c, reason: collision with root package name */
        public int f44120c;

        /* renamed from: d, reason: collision with root package name */
        public b f44121d;

        /* renamed from: e, reason: collision with root package name */
        public VirtualDisplay f44122e;

        private C0517a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a();

        void a(boolean z11);

        void a(boolean z11, boolean z12);
    }

    public a(Context context) {
        this.f44106b = context.getApplicationContext();
        this.f44112h = b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(Context context) {
        int f11 = h.f(context);
        return f11 == 0 || f11 == 2;
    }

    public static a a(Context context) {
        if (f44105a == null) {
            synchronized (a.class) {
                try {
                    if (f44105a == null) {
                        f44105a = new a(context);
                    }
                } finally {
                }
            }
        }
        return f44105a;
    }

    private void a() {
        for (C0517a c0517a : this.f44108d.values()) {
            if (c0517a.f44122e == null) {
                c0517a.f44122e = this.f44110f.createVirtualDisplay("TXCScreenCapture", c0517a.f44119b, c0517a.f44120c, 1, 1, c0517a.f44118a, null, null);
                TXCLog.i("VirtualDisplayManager", "create VirtualDisplay " + c0517a.f44122e);
                b bVar = c0517a.f44121d;
                if (bVar != null) {
                    bVar.a(true, false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z11) {
        if (this.f44108d.isEmpty()) {
            if (z11) {
                this.f44107c.postDelayed(new Runnable() { // from class: com.tencent.liteav.screencapture.a.3
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.a(false);
                    }
                }, TimeUnit.SECONDS.toMillis(1L));
                return;
            }
            TXCLog.i("VirtualDisplayManager", "stop media projection session " + this.f44110f);
            MediaProjection mediaProjection = this.f44110f;
            if (mediaProjection != null) {
                mediaProjection.unregisterCallback(this.f44113i);
                this.f44110f.stop();
                this.f44110f = null;
            }
            j jVar = this.f44111g;
            if (jVar != null) {
                jVar.a();
                this.f44111g = null;
            }
        }
    }

    public void a(MediaProjection mediaProjection) {
        this.f44109e = false;
        if (mediaProjection == null) {
            HashMap hashMap = new HashMap(this.f44108d);
            this.f44108d.clear();
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                b bVar = ((C0517a) it.next()).f44121d;
                if (bVar != null) {
                    bVar.a(false, true);
                }
            }
            return;
        }
        TXCLog.i("VirtualDisplayManager", "Got session " + mediaProjection);
        this.f44110f = mediaProjection;
        mediaProjection.registerCallback(this.f44113i, this.f44107c);
        a();
        j jVar = new j(Looper.getMainLooper(), this.f44114j);
        this.f44111g = jVar;
        jVar.a(50, 50);
        a(true);
    }
}
