package com.tencent.liteav.basic.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class j extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private int f43468a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f43469b;

    /* renamed from: c, reason: collision with root package name */
    private a f43470c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void onTimeout();
    }

    public j(Looper looper, a aVar) {
        super(looper);
        this.f43469b = false;
        this.f43470c = aVar;
    }

    public void a(int i11, int i12) {
        a();
        this.f43468a = i12;
        this.f43469b = true;
        sendEmptyMessageDelayed(0, i11);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar = this.f43470c;
        if (aVar != null) {
            aVar.onTimeout();
        }
        if (this.f43469b) {
            sendEmptyMessageDelayed(0, this.f43468a);
        }
    }

    public void a() {
        while (hasMessages(0)) {
            removeMessages(0);
        }
        this.f43469b = false;
    }
}
