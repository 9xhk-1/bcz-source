package com.getui.gtc;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Base64;
import com.getui.gtc.api.GtcIdCallback;
import com.getui.gtc.api.GtcManager;
import com.getui.gtc.api.SdkInfo;
import com.getui.gtc.b.b;
import com.getui.gtc.base.util.ScheduleQueue;
import com.getui.gtc.i.c.a;

@Deprecated
/* loaded from: classes6.dex */
public class GtcService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        a.a("GtcService onBind");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        a.a("GtcService onCreated");
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        a.a("GtcService onDestroy");
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(final Intent intent, int i11, int i12) {
        try {
            ScheduleQueue.getInstance().addSchedule(new Runnable() { // from class: com.getui.gtc.GtcService.1
                @Override // java.lang.Runnable
                public final void run() {
                    Context applicationContext = GtcService.this.getApplicationContext();
                    Intent intent2 = intent;
                    if (intent2 == null || !intent2.hasExtra("10010")) {
                        return;
                    }
                    String str = new String(Base64.decode(intent2.getByteArrayExtra("10010"), 0));
                    int b11 = b.b(str);
                    com.getui.gtc.api.GtcManager.getInstance().init(applicationContext, new GtcIdCallback.Stub() { // from class: com.getui.gtc.b.b.1

                        /* renamed from: a */
                        final /* synthetic */ Context f29777a;

                        /* renamed from: b */
                        final /* synthetic */ String f29778b;

                        /* renamed from: c */
                        final /* synthetic */ int f29779c;

                        /* renamed from: d */
                        final /* synthetic */ String f29780d;

                        public AnonymousClass1(Context applicationContext2, String str2, int b112, String str3) {
                            r1 = applicationContext2;
                            r2 = str2;
                            r3 = b112;
                            r4 = str3;
                        }

                        @Override // com.getui.gtc.api.GtcIdCallback
                        public final void onSuccess(String str2) {
                            Context context = r1;
                            try {
                                if (TextUtils.isEmpty(str2)) {
                                    com.getui.gtc.i.c.a.a("send cid broadcast fail,cid is null");
                                } else {
                                    Intent intent3 = new Intent();
                                    intent3.setAction(context.getPackageName());
                                    intent3.putExtra("gicid", str2);
                                    context.sendBroadcast(intent3);
                                }
                            } catch (Exception e11) {
                                com.getui.gtc.i.c.a.d(e11);
                            }
                            Context context2 = r1;
                            String str3 = r2;
                            try {
                                if (TextUtils.isEmpty(str2)) {
                                    com.getui.gtc.i.c.a.a("send gicid broadcast fail,cid is null");
                                } else {
                                    Intent intent4 = new Intent();
                                    intent4.setPackage(context2.getPackageName());
                                    intent4.setAction(str3);
                                    intent4.putExtra("gicid", str2);
                                    context2.sendBroadcast(intent4);
                                }
                            } catch (Exception e12) {
                                com.getui.gtc.i.c.a.d(e12);
                            }
                            GtcManager.getInstance().loadSdk(new SdkInfo.Builder().moduleName("SDKID:" + r3).appid(r4).version(r2).cid(str2).build());
                        }

                        @Override // com.getui.gtc.api.GtcIdCallback
                        public final void onFailure(String str2) {
                        }
                    });
                }
            });
            return 2;
        } catch (Throwable th2) {
            a.b(th2);
            return 2;
        }
    }
}
