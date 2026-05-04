package com.mob.tools.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mob.tools.proguard.PublicMemberKeeper;

/* loaded from: classes7.dex */
public class UIHandler implements PublicMemberKeeper {

    /* renamed from: a, reason: collision with root package name */
    private static Handler f41420a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Message f41421a;

        /* renamed from: b, reason: collision with root package name */
        public final Handler.Callback f41422b;

        public a(Message message, Handler.Callback callback) {
            this.f41421a = message;
            this.f41422b = callback;
        }
    }

    private static void b() {
        f41420a = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.mob.tools.utils.UIHandler.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                UIHandler.b(message);
                return false;
            }
        });
    }

    public static boolean sendEmptyMessage(int i11, Handler.Callback callback) {
        a();
        return f41420a.sendMessage(a(i11, callback));
    }

    public static boolean sendEmptyMessageDelayed(int i11, long j11, Handler.Callback callback) {
        a();
        return f41420a.sendMessageDelayed(a(i11, callback), j11);
    }

    public static boolean sendMessage(Message message, Handler.Callback callback) {
        a();
        return f41420a.sendMessage(a(message, callback));
    }

    public static boolean sendMessageDelayed(Message message, long j11, Handler.Callback callback) {
        a();
        return f41420a.sendMessageDelayed(a(message, callback), j11);
    }

    private static synchronized void a() {
        synchronized (UIHandler.class) {
            if (f41420a == null) {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Message message) {
        a aVar = (a) message.obj;
        Message message2 = aVar.f41421a;
        Handler.Callback callback = aVar.f41422b;
        if (callback != null) {
            callback.handleMessage(message2);
        }
    }

    private static Message a(Message message, Handler.Callback callback) {
        Message message2 = new Message();
        message2.obj = new a(message, callback);
        return message2;
    }

    private static Message a(int i11, Handler.Callback callback) {
        Message message = new Message();
        message.what = i11;
        return a(message, callback);
    }
}
