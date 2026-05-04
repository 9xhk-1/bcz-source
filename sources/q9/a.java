package q9;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f81917d = "AsyncAudioPlayer";

    /* renamed from: e, reason: collision with root package name */
    public static final int f81918e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f81919f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f81920g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f81921h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f81922i = 5;

    /* renamed from: a, reason: collision with root package name */
    public HandlerThread f81923a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f81924b;

    /* renamed from: c, reason: collision with root package name */
    public IAudioPlayer f81925c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: q9.a$a, reason: collision with other inner class name */
    public class C1012a implements IAudioPlayer.a {
        public C1012a() {
        }

        @Override // com.baicizhan.client.framework.audio.IAudioPlayer.a
        public void onPlayError(int what, int extra) {
            qb.c.d(a.f81917d, "audio error %d, %d", Integer.valueOf(what), Integer.valueOf(extra));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public Object f81927a;

        /* renamed from: b, reason: collision with root package name */
        public IAudioPlayer.b f81928b;

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public IAudioPlayer f81929a;

        public c(Looper looper, IAudioPlayer player) {
            super(looper);
            this.f81929a = player;
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            int i11 = msg.what;
            if (i11 != 1 && i11 != 2 && i11 != 3) {
                if (i11 == 4) {
                    this.f81929a.stop();
                    return;
                } else {
                    if (i11 != 5) {
                        return;
                    }
                    this.f81929a.pause();
                    return;
                }
            }
            b bVar = (b) msg.obj;
            this.f81929a.f(bVar.f81928b);
            int i12 = msg.what;
            if (i12 == 1) {
                this.f81929a.e((File) bVar.f81927a);
                return;
            }
            if (i12 == 2) {
                this.f81929a.i((String) bVar.f81927a, false);
            } else if (i12 == 3) {
                this.f81929a.a(((Integer) bVar.f81927a).intValue());
            }
        }
    }

    public a(Context context) {
        this.f81925c = new l(context);
        HandlerThread handlerThread = new HandlerThread(f81917d);
        this.f81923a = handlerThread;
        handlerThread.start();
        this.f81924b = new c(this.f81923a.getLooper(), this.f81925c);
        this.f81925c.j(new C1012a());
    }

    public void a() {
        this.f81925c.stop();
        this.f81924b.removeCallbacksAndMessages(null);
        this.f81923a.quit();
    }

    public void b(File file, IAudioPlayer.b listener) {
        b bVar = new b();
        bVar.f81927a = file;
        bVar.f81928b = listener;
        Handler handler = this.f81924b;
        handler.sendMessage(handler.obtainMessage(1, bVar));
    }

    public void c(String asset, IAudioPlayer.b listener) {
        b bVar = new b();
        bVar.f81927a = asset;
        bVar.f81928b = listener;
        Handler handler = this.f81924b;
        handler.sendMessage(handler.obtainMessage(2, bVar));
    }

    public void d(int resId, IAudioPlayer.b listener) {
        b bVar = new b();
        bVar.f81927a = Integer.valueOf(resId);
        bVar.f81928b = listener;
        Handler handler = this.f81924b;
        handler.sendMessage(handler.obtainMessage(3, bVar));
    }
}
