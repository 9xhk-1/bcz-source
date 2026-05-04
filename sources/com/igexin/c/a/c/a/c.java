package com.igexin.c.a.c.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import com.igexin.push.core.ServiceManager;
import com.igexin.sdk.IUserLoggerInterface;
import com.igexin.sdk.PushManager;

/* loaded from: classes7.dex */
public final class c extends Handler implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public static final String f37184a = "SERVER_LOG";

    /* renamed from: c, reason: collision with root package name */
    private static final String f37185c = "LogController";

    /* renamed from: b, reason: collision with root package name */
    public b f37186b;

    /* renamed from: d, reason: collision with root package name */
    private Messenger f37187d;

    /* renamed from: e, reason: collision with root package name */
    private Messenger f37188e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f37189a = new c(0);

        private a() {
        }
    }

    private c() {
        super(Looper.getMainLooper());
        this.f37186b = new com.igexin.c.a.c.a.a();
    }

    public static c a() {
        return a.f37189a;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 2) {
            String string = message.getData().getString(d.f37192d);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            if (!string.contains("\n")) {
                this.f37186b.a(string);
                return;
            }
            for (String str : string.split("\n")) {
                this.f37186b.a(str);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.igexin.c.a.c.a.a("remote log service connected ", new Object[0]);
        try {
            this.f37188e = new Messenger(iBinder);
            if (this.f37187d == null) {
                this.f37187d = new Messenger(this);
            }
            Message obtain = Message.obtain();
            obtain.replyTo = this.f37187d;
            obtain.what = 1;
            this.f37188e.send(obtain);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(f37185c, "Client sent Message to Service error = ".concat(String.valueOf(e11)));
            a("Client sent Message to Service error = ".concat(String.valueOf(e11)));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f37188e = null;
    }

    public /* synthetic */ c(byte b11) {
        this();
    }

    public final void a(Context context) {
        com.igexin.c.a.c.a.a("try to bind log server", new Object[0]);
        try {
            Intent intent = new Intent(context, (Class<?>) ServiceManager.getInstance().b(context));
            intent.setType(f37184a);
            context.bindService(intent, this, 1);
        } catch (Exception e11) {
            e.a(f37185c, "bind service error = " + e11.toString());
        }
    }

    private void a(Context context, IUserLoggerInterface iUserLoggerInterface) {
        if (iUserLoggerInterface == null) {
            e.a(f37185c, "user logger register parameter can not be null!");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        a(applicationContext);
        this.f37186b.a(iUserLoggerInterface);
        this.f37186b.a();
        a("[LogController] Sdk version = " + PushManager.getInstance().getVersion(applicationContext));
    }

    public final void a(String str) {
        b bVar = this.f37186b;
        if (bVar != null) {
            bVar.a(str);
        }
    }
}
