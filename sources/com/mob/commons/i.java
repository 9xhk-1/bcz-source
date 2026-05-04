package com.mob.commons;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobHandlerThread;
import com.mob.tools.MobLog;
import com.mob.tools.utils.ActivityTracker;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static i f40341a;

    /* renamed from: c, reason: collision with root package name */
    private volatile Handler f40343c;

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<h> f40342b = new HashSet<>();

    /* renamed from: d, reason: collision with root package name */
    private String f40344d = null;

    /* renamed from: e, reason: collision with root package name */
    private volatile long f40345e = -1;

    private i() {
        String str = null;
        if (!TextUtils.isEmpty("M-")) {
            str = t.f40412a + a("004]jfhljkim");
        }
        this.f40343c = MobHandlerThread.newHandler(str, new Handler.Callback() { // from class: com.mob.commons.i.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i11 = message.what;
                if (i11 == 0) {
                    i.this.f40345e = SystemClock.elapsedRealtime();
                    i.this.a(false);
                    i.this.c();
                } else if (i11 == 1) {
                    i.this.a(true);
                } else if (i11 == 2) {
                    i.this.a(((Long) message.obj).longValue(), true);
                } else if (i11 == 3) {
                    try {
                        h hVar = (h) message.obj;
                        if (hVar != null) {
                            i.this.f40342b.add(hVar);
                            hVar.a(i.this.f40345e > 0, true, 0L);
                        }
                    } catch (Throwable th2) {
                        MobLog.getInstance().d(th2);
                    }
                }
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        ActivityTracker.getInstance(MobSDK.getContext()).addTracker(new ActivityTracker.Tracker() { // from class: com.mob.commons.FBManager$2
            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onDestroyed(Activity activity) {
                if (i.this.f40345e > 0) {
                    onStopped(activity);
                }
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onResumed(Activity activity) {
                Handler handler;
                Handler handler2;
                try {
                    if (i.this.f40345e == 0) {
                        i.this.f40345e = SystemClock.elapsedRealtime();
                        handler = i.this.f40343c;
                        if (handler != null) {
                            handler2 = i.this.f40343c;
                            handler2.sendEmptyMessage(1);
                        }
                    }
                    i.this.f40344d = activity == null ? null : activity.toString();
                } catch (Throwable unused) {
                }
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onStopped(Activity activity) {
                String str;
                Handler handler;
                Handler handler2;
                String str2;
                try {
                    str = i.this.f40344d;
                    if (str != null) {
                        str2 = i.this.f40344d;
                        if (!str2.equals(activity == null ? null : activity.toString())) {
                            return;
                        }
                    }
                    handler = i.this.f40343c;
                    if (handler != null) {
                        long elapsedRealtime = i.this.f40345e > 0 ? SystemClock.elapsedRealtime() - i.this.f40345e : 0L;
                        Message message = new Message();
                        message.what = 2;
                        message.obj = Long.valueOf(elapsedRealtime);
                        handler2 = i.this.f40343c;
                        handler2.sendMessage(message);
                    }
                    i.this.f40345e = 0L;
                    i.this.f40344d = null;
                } catch (Throwable unused) {
                }
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onPaused(Activity activity) {
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onStarted(Activity activity) {
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onCreated(Activity activity, Bundle bundle) {
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onSaveInstanceState(Activity activity, Bundle bundle) {
            }
        });
    }

    public boolean b() {
        return this.f40345e == 0;
    }

    public static synchronized i a() {
        i iVar;
        synchronized (i.class) {
            try {
                if (f40341a == null) {
                    i iVar2 = new i();
                    f40341a = iVar2;
                    if (iVar2.f40343c != null) {
                        f40341a.f40343c.sendEmptyMessage(0);
                    }
                }
                iVar = f40341a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    public void a(h hVar) {
        if (hVar == null) {
            return;
        }
        synchronized (this.f40342b) {
            try {
                if (this.f40342b.contains(hVar)) {
                    return;
                }
                if (this.f40343c != null) {
                    Message message = new Message();
                    message.what = 3;
                    message.obj = hVar;
                    this.f40343c.sendMessage(message);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z11) {
        if (z11) {
            a(true, false, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j11, boolean z11) {
        if (z11) {
            a(false, false, j11);
        }
    }

    private void a(boolean z11, boolean z12, long j11) {
        synchronized (this.f40342b) {
            try {
                Iterator<h> it = this.f40342b.iterator();
                while (it.hasNext()) {
                    it.next().a(z11, z12, j11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String a(String str) {
        return r.a(str, 101);
    }
}
