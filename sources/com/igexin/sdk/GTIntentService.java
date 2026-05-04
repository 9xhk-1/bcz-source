package com.igexin.sdk;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.getui.gtc.base.GtcProvider;
import com.igexin.c.a.c.a.c;
import com.igexin.c.a.c.a.e;
import com.igexin.sdk.message.GTCmdMessage;
import com.igexin.sdk.message.GTNotificationMessage;
import com.igexin.sdk.message.GTPopupMessage;
import com.igexin.sdk.message.GTTransmitMessage;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class GTIntentService extends Service {
    private static final int REMOTE_CLINET_RECEIVED = 2;
    private static final int REMOTE_MSG_RECEIVED = 1;
    public static final String TAG = "intentSer";
    private final Messenger client = new Messenger(new a(this));

    public static final class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<GTIntentService> f38756a;

        public a(GTIntentService gTIntentService) {
            super(Looper.getMainLooper());
            this.f38756a = new WeakReference<>(gTIntentService);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            WeakReference<GTIntentService> weakReference = this.f38756a;
            if (weakReference == null || weakReference.get() == null) {
                e.a(GTIntentService.TAG, "intent service is null");
                c.a().a("intent service is null");
                return;
            }
            GTIntentService gTIntentService = this.f38756a.get();
            if (message.what == 1) {
                Object obj = message.obj;
                if (obj instanceof Intent) {
                    gTIntentService.processOnHandleIntent(gTIntentService, (Intent) obj);
                } else {
                    e.a(GTIntentService.TAG, "receive bad msg");
                }
            }
            super.handleMessage(message);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.client.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        try {
            GtcProvider.setContext(getApplicationContext());
        } catch (Throwable unused) {
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        if (intent == null) {
            return 2;
        }
        processOnHandleIntent(this, intent);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        com.igexin.c.a.c.a.b(TAG, "onUnbind: ");
        return super.onUnbind(intent);
    }

    public void processOnHandleIntent(Context context, Intent intent) {
        c a11;
        String str;
        if (intent == null || context == null) {
            e.a(TAG, "onHandleIntent() context or intent is null");
            return;
        }
        try {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.get("action") != null && (extras.get("action") instanceof Integer)) {
                int i11 = extras.getInt("action");
                com.igexin.c.a.c.a.b(TAG, "onHandleIntent() action = ".concat(String.valueOf(i11)));
                Context applicationContext = context.getApplicationContext();
                if (i11 == 10001) {
                    onReceiveMessageData(applicationContext, (GTTransmitMessage) intent.getSerializableExtra(PushConsts.KEY_MESSAGE_DATA));
                    a11 = c.a();
                    str = "onHandleIntent() = received msg data ";
                } else if (i11 == 10002) {
                    onReceiveClientId(applicationContext, extras.getString(PushConsts.KEY_CLIENT_ID));
                    a11 = c.a();
                    str = "onHandleIntent() = received client id ";
                } else {
                    if (i11 == 10007) {
                        onReceiveOnlineState(applicationContext, extras.getBoolean(PushConsts.KEY_ONLINE_STATE));
                        return;
                    }
                    if (i11 != 10008) {
                        switch (i11) {
                            case 10010:
                                onReceiveCommandResult(applicationContext, (GTCmdMessage) intent.getSerializableExtra(PushConsts.KEY_CMD_MSG));
                                a11 = c.a();
                                str = "onHandleIntent() = " + intent.getSerializableExtra(PushConsts.KEY_CMD_MSG).getClass().getSimpleName();
                                break;
                            case 10011:
                                onNotificationMessageArrived(applicationContext, (GTNotificationMessage) intent.getSerializableExtra("notification_arrived"));
                                a11 = c.a();
                                str = "onHandleIntent() = notification arrived ";
                                break;
                            case 10012:
                                onNotificationMessageClicked(applicationContext, (GTNotificationMessage) intent.getSerializableExtra(PushConsts.KEY_NOTIFICATION_CLICKED));
                                a11 = c.a();
                                str = "onHandleIntent() notification clicked ";
                                break;
                            case 10013:
                                onReceiveDeviceToken(applicationContext, extras.getString(PushConsts.KEY_DEVICE_TOKEN));
                                a11 = c.a();
                                str = "onHandleIntent() = received device token ";
                                break;
                            case PushConsts.ACTION_NOTIFICATION_ENABLE /* 10014 */:
                                areNotificationsEnabled(applicationContext, com.igexin.push.g.c.b(applicationContext));
                                a11 = c.a();
                                str = "onHandleIntent() areNotificationsEnabled";
                                break;
                            case PushConsts.ACTION_POPUP_SHOW /* 10015 */:
                                onPopupMessageShow(applicationContext, (GTPopupMessage) extras.getSerializable(PushConsts.KEY_POPUP_SHOW));
                                a11 = c.a();
                                str = "onHandleIntent() onPopupMessageShow";
                                break;
                            case PushConsts.ACTION_POPUP_CLICKED /* 10016 */:
                                onPopupMessageClicked(applicationContext, (GTPopupMessage) extras.getSerializable(PushConsts.KEY_POPUP_CLICKED));
                                a11 = c.a();
                                str = "onHandleIntent() onPopupMessageClicked";
                                break;
                            default:
                                return;
                        }
                    } else {
                        onReceiveServicePid(applicationContext, extras.getInt(PushConsts.KEY_SERVICE_PIT));
                        a11 = c.a();
                        str = "onHandleIntent() = get sdk service pid ";
                    }
                }
                a11.a(str);
                return;
            }
            com.igexin.c.a.c.a.b(TAG, "onHandleIntent, receive intent error");
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
    }

    public void areNotificationsEnabled(Context context, boolean z11) {
    }

    public void onNotificationMessageArrived(Context context, GTNotificationMessage gTNotificationMessage) {
    }

    public void onNotificationMessageClicked(Context context, GTNotificationMessage gTNotificationMessage) {
    }

    public void onPopupMessageClicked(Context context, GTPopupMessage gTPopupMessage) {
    }

    public void onPopupMessageShow(Context context, GTPopupMessage gTPopupMessage) {
    }

    public void onReceiveClientId(Context context, String str) {
    }

    public void onReceiveCommandResult(Context context, GTCmdMessage gTCmdMessage) {
    }

    public void onReceiveDeviceToken(Context context, String str) {
    }

    public void onReceiveMessageData(Context context, GTTransmitMessage gTTransmitMessage) {
    }

    public void onReceiveOnlineState(Context context, boolean z11) {
    }

    public void onReceiveServicePid(Context context, int i11) {
    }
}
