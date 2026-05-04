package com.huawei.hms.adapter;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.api.BindingFailedResolution;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class BinderAdapter implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final Context f35292a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35293b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35294c;

    /* renamed from: d, reason: collision with root package name */
    private BinderCallBack f35295d;

    /* renamed from: e, reason: collision with root package name */
    private IBinder f35296e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f35297f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private boolean f35298g = false;

    /* renamed from: h, reason: collision with root package name */
    private Handler f35299h = null;

    /* renamed from: i, reason: collision with root package name */
    private Handler f35300i = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface BinderCallBack {
        void onBinderFailed(int i11);

        void onBinderFailed(int i11, Intent intent);

        void onNullBinding(ComponentName componentName);

        void onServiceConnected(ComponentName componentName, IBinder iBinder);

        void onServiceDisconnected(ComponentName componentName);

        void onTimedDisconnected();
    }

    public BinderAdapter(Context context, String str, String str2) {
        this.f35292a = context;
        this.f35293b = str;
        this.f35294c = str2;
    }

    private void c() {
        synchronized (this.f35297f) {
            try {
                Handler handler = this.f35299h;
                if (handler != null) {
                    handler.removeMessages(getConnTimeOut());
                    this.f35299h = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void d() {
        Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.huawei.hms.adapter.BinderAdapter.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message == null || message.what != BinderAdapter.this.getMsgDelayDisconnect()) {
                    return false;
                }
                HMSLog.i("BinderAdapter", "The serviceConnection has been bind for 1800s, need to unbind.");
                BinderAdapter.this.unBind();
                BinderCallBack f11 = BinderAdapter.this.f();
                if (f11 == null) {
                    return true;
                }
                f11.onTimedDisconnected();
                return true;
            }
        });
        this.f35300i = handler;
        handler.sendEmptyMessageDelayed(getMsgDelayDisconnect(), 1800000L);
    }

    private void e() {
        HMSLog.e("BinderAdapter", "In connect, bind core service fail");
        try {
            ComponentName componentName = new ComponentName(this.f35292a.getApplicationInfo().packageName, "com.huawei.hms.activity.BridgeActivity");
            Intent intent = new Intent();
            intent.setComponent(componentName);
            intent.putExtra(BridgeActivity.EXTRA_DELEGATE_CLASS_NAME, BindingFailedResolution.class.getName());
            BinderCallBack f11 = f();
            if (f11 != null) {
                f11.onBinderFailed(-1, intent);
            }
        } catch (RuntimeException e11) {
            HMSLog.e("BinderAdapter", "getBindFailPendingIntent failed " + e11.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BinderCallBack f() {
        return this.f35295d;
    }

    private void g() {
        Handler handler = this.f35299h;
        if (handler != null) {
            handler.removeMessages(getConnTimeOut());
        } else {
            this.f35299h = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.huawei.hms.adapter.BinderAdapter.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    if (message == null || message.what != BinderAdapter.this.getConnTimeOut()) {
                        return false;
                    }
                    HMSLog.e("BinderAdapter", "In connect, bind core service time out");
                    BinderAdapter.this.b();
                    return true;
                }
            });
        }
        this.f35299h.sendEmptyMessageDelayed(getConnTimeOut(), 10000L);
    }

    private void h() {
        HMSLog.d("BinderAdapter", "removeDelayDisconnectTask.");
        synchronized (BinderAdapter.class) {
            try {
                Handler handler = this.f35300i;
                if (handler != null) {
                    handler.removeMessages(getMsgDelayDisconnect());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void binder(BinderCallBack binderCallBack) {
        if (binderCallBack == null) {
            return;
        }
        this.f35295d = binderCallBack;
        a();
    }

    public int getConnTimeOut() {
        return 0;
    }

    public int getMsgDelayDisconnect() {
        return 0;
    }

    public String getServiceAction() {
        return this.f35293b;
    }

    public IBinder getServiceBinder() {
        return this.f35296e;
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        HMSLog.e("BinderAdapter", "Enter onNullBinding, than unBind.");
        if (this.f35298g) {
            this.f35298g = false;
            return;
        }
        unBind();
        c();
        BinderCallBack f11 = f();
        if (f11 != null) {
            f11.onNullBinding(componentName);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HMSLog.i("BinderAdapter", "BinderAdapter Enter onServiceConnected.");
        this.f35296e = iBinder;
        c();
        BinderCallBack f11 = f();
        if (f11 != null) {
            f11.onServiceConnected(componentName, iBinder);
        }
        d();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        HMSLog.i("BinderAdapter", "Enter onServiceDisconnected.");
        BinderCallBack f11 = f();
        if (f11 != null) {
            f11.onServiceDisconnected(componentName);
        }
        h();
    }

    public void unBind() {
        Util.unBindServiceCatchException(this.f35292a, this);
    }

    public void updateDelayTask() {
        HMSLog.d("BinderAdapter", "updateDelayTask.");
        synchronized (BinderAdapter.class) {
            try {
                Handler handler = this.f35300i;
                if (handler != null) {
                    handler.removeMessages(getMsgDelayDisconnect());
                    this.f35300i.sendEmptyMessageDelayed(getMsgDelayDisconnect(), 1800000L);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a() {
        if (TextUtils.isEmpty(this.f35293b) || TextUtils.isEmpty(this.f35294c)) {
            e();
        }
        Intent intent = new Intent(this.f35293b);
        try {
            intent.setPackage(this.f35294c);
        } catch (IllegalArgumentException unused) {
            HMSLog.e("BinderAdapter", "IllegalArgumentException when bindCoreService intent.setPackage");
            e();
        }
        synchronized (this.f35297f) {
            try {
                if (this.f35292a.bindService(intent, this, 1)) {
                    g();
                } else {
                    this.f35298g = true;
                    e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        BinderCallBack f11 = f();
        if (f11 != null) {
            f11.onBinderFailed(-1);
        }
    }
}
