package com.getui.gtc.base;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import com.getui.gtc.base.crypt.SecureCryptTools;
import com.getui.gtc.base.publish.Broker;
import com.getui.gtc.base.publish.Publisher;
import com.getui.gtc.base.util.CommonUtil;
import com.getui.gtc.base.util.EmptyProvider;
import com.getui.gtc.base.util.OnForegroundChangedListener;
import com.getui.gtc.base.util.ScheduleQueue;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes6.dex */
public class GtcProvider extends EmptyProvider implements Publisher {
    private static final String METHOD_ON_FOREGROUND_CHANGED = "onForegroundChanged";

    @SuppressLint({"StaticFieldLeak"})
    private static Context context = null;
    private static int gtcPid = 0;
    private static boolean isCheckedLifecycle = false;
    private static volatile boolean isForeground = false;
    private static boolean lazyInitCrypt = false;
    private static String sdcardPath;

    public static Context context() {
        return context;
    }

    @Deprecated
    public static Set<String> getForeActivities() {
        return Collections.EMPTY_SET;
    }

    @Deprecated
    public static String getSdcardPath() {
        if (sdcardPath == null) {
            synchronized (GtcProvider.class) {
                try {
                    if (sdcardPath == null) {
                        sdcardPath = Environment.getExternalStorageDirectory().getAbsolutePath();
                    }
                } finally {
                }
            }
        }
        return sdcardPath;
    }

    public static int gtcPid() {
        return gtcPid;
    }

    public static boolean isForeground() {
        return isForeground;
    }

    public static void lazyInitCrypt() {
        lazyInitCrypt = true;
    }

    @Deprecated
    public static int mainPid() {
        return gtcPid;
    }

    public static void setContext(Context context2) {
        if (context == null && context2 != null) {
            context = context2.getApplicationContext();
        }
        tryListenerForeground(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void subscribe(final Context context2, final boolean z11) {
        ScheduleQueue.getInstance().addSchedule(new Runnable() { // from class: com.getui.gtc.base.GtcProvider.2
            @Override // java.lang.Runnable
            public final void run() {
                context2.getContentResolver().call(Uri.parse("content://" + context2.getPackageName() + ".getui.gtc.provider"), GtcProvider.METHOD_ON_FOREGROUND_CHANGED, Boolean.toString(z11), (Bundle) null);
            }
        });
    }

    private static void tryListenerForeground(Context context2) {
        try {
            if (isCheckedLifecycle) {
                return;
            }
            synchronized (GtcProvider.class) {
                try {
                    if (!isCheckedLifecycle) {
                        final Context applicationContext = context2 != null ? context2.getApplicationContext() : CommonUtil.findAppContext();
                        if (applicationContext != null) {
                            if (CommonUtil.isMainProcess(applicationContext)) {
                                ((Application) applicationContext).registerActivityLifecycleCallbacks(new OnForegroundChangedListener() { // from class: com.getui.gtc.base.GtcProvider.1
                                    @Override // com.getui.gtc.base.util.OnForegroundChangedListener
                                    public final void onForegroundChanged(boolean z11) {
                                        boolean unused = GtcProvider.isForeground = z11;
                                        if (Process.myPid() != GtcProvider.gtcPid) {
                                            GtcProvider.subscribe(applicationContext, z11);
                                        }
                                    }
                                });
                                if (Process.myPid() != gtcPid && CommonUtil.getTopActivity() != null) {
                                    isForeground = true;
                                    subscribe(applicationContext, true);
                                }
                            }
                            isCheckedLifecycle = true;
                        }
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        if (METHOD_ON_FOREGROUND_CHANGED.equals(str)) {
            isForeground = Boolean.parseBoolean(str2);
            return null;
        }
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        return publish(bundle);
    }

    @Override // com.getui.gtc.base.util.EmptyProvider, android.content.ContentProvider
    public boolean onCreate() {
        try {
            gtcPid = Process.myPid();
            setContext(getContext());
            if (lazyInitCrypt) {
                return true;
            }
            ScheduleQueue.getInstance().addSchedule(new Runnable() { // from class: com.getui.gtc.base.GtcProvider.3
                @Override // java.lang.Runnable
                public final void run() {
                    SecureCryptTools.getInstance();
                }
            });
            return true;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return true;
        }
    }

    @Override // com.getui.gtc.base.publish.Publisher
    public Bundle publish(Bundle bundle) {
        return Broker.getInstance().publish(bundle);
    }
}
