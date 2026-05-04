package com.mob.tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.mob.commons.a.l;
import com.mob.tools.proguard.EverythingKeeper;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.ResHelper;
import com.mob.tools.utils.UIHandler;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class FakeActivity implements EverythingKeeper {
    private static Class<? extends Activity> shellClass;
    protected Activity activity;
    private View contentView;
    private HashMap<String, Object> result;
    private FakeActivity resultReceiver;

    public static void registerExecutor(String str, Object obj) {
        Class<? extends Activity> cls = shellClass;
        if (cls == null) {
            MobUIShell.a(str, obj);
            return;
        }
        try {
            Method method = cls.getMethod(l.a("016'ei%jHggefghEej,eihdem;j?ehed:e-fdei"), String.class, Object.class);
            method.setAccessible(true);
            method.invoke(null, str, obj);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    public static void setShell(Class<? extends Activity> cls) {
        shellClass = cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showActivity(Context context, Intent intent) {
        if (!(context instanceof Activity)) {
            Activity topActivity = DeviceHelper.getInstance(context).getTopActivity();
            if (topActivity == null) {
                intent.addFlags(268435456);
            } else {
                context = topActivity;
            }
        }
        context.startActivity(intent);
    }

    public boolean disableScreenCapture() {
        Activity activity = this.activity;
        if (activity == null) {
            return false;
        }
        activity.getWindow().setFlags(8192, 8192);
        return true;
    }

    public <T extends View> T findViewById(int i11) {
        Activity activity = this.activity;
        if (activity == null) {
            return null;
        }
        return (T) activity.findViewById(i11);
    }

    public <T extends View> T findViewByResName(View view, String str) {
        int idRes;
        Activity activity = this.activity;
        if (activity != null && (idRes = ResHelper.getIdRes(activity, str)) > 0) {
            return (T) view.findViewById(idRes);
        }
        return null;
    }

    public final void finish() {
        Activity activity = this.activity;
        if (activity != null) {
            activity.finish();
        }
    }

    public View getContentView() {
        return this.contentView;
    }

    public Context getContext() {
        return this.activity;
    }

    public int getOrientation() {
        return this.activity.getResources().getConfiguration().orientation;
    }

    public FakeActivity getParent() {
        return this.resultReceiver;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public boolean onFinish() {
        return false;
    }

    public boolean onKeyEvent(int i11, KeyEvent keyEvent) {
        return false;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void requestFullScreen(boolean z11) {
        Activity activity = this.activity;
        if (activity == null) {
            return;
        }
        if (z11) {
            activity.getWindow().addFlags(1024);
            this.activity.getWindow().clearFlags(2048);
        } else {
            activity.getWindow().addFlags(2048);
            this.activity.getWindow().clearFlags(1024);
        }
        this.activity.getWindow().getDecorView().requestLayout();
    }

    public void requestLandscapeOrientation() {
        setRequestedOrientation(0);
    }

    public void requestPermissions(String[] strArr, int i11) {
        Activity activity = this.activity;
        if (activity == null) {
            return;
        }
        try {
            ReflectHelper.invokeInstanceMethod(activity, l.a("018Xei5jlGedOjDgh7e1hh6j$ei;m)efghgheffdelgh"), new Object[]{strArr, Integer.valueOf(i11)}, new Class[]{String.class, Integer.TYPE});
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }

    public void requestPortraitOrientation() {
        setRequestedOrientation(1);
    }

    public void requestSensorLandscapeOrientation() {
        setRequestedOrientation(6);
    }

    public void requestSensorPortraitOrientation() {
        setRequestedOrientation(7);
    }

    public void runOnUIThread(final Runnable runnable) {
        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.tools.FakeActivity.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                runnable.run();
                return false;
            }
        });
    }

    public void sendResult() {
        FakeActivity fakeActivity = this.resultReceiver;
        if (fakeActivity != null) {
            fakeActivity.onResult(this.result);
        }
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void setContentView(View view) {
        this.contentView = view;
    }

    public void setContentViewLayoutResName(String str) {
        int layoutRes;
        Activity activity = this.activity;
        if (activity != null && (layoutRes = ResHelper.getLayoutRes(activity, str)) > 0) {
            this.activity.setContentView(layoutRes);
        }
    }

    public void setRequestedOrientation(int i11) {
        if (this.activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26 || getContext().getApplicationInfo().targetSdkVersion < 27) {
            this.activity.setRequestedOrientation(i11);
        }
    }

    public final void setResult(HashMap<String, Object> hashMap) {
        this.result = hashMap;
    }

    public void show(Context context, Intent intent) {
        showForResult(context, intent, null);
    }

    public void showForResult(final Context context, Intent intent, FakeActivity fakeActivity) {
        final Intent intent2;
        String a11;
        this.resultReceiver = fakeActivity;
        if (shellClass != null) {
            intent2 = new Intent(context, shellClass);
            a11 = null;
            try {
                Method method = shellClass.getMethod(l.a("016Qei<jAggefghRej6eihdem>jNehedUeQfdei"), Object.class);
                method.setAccessible(true);
                a11 = (String) method.invoke(null, this);
            } catch (Throwable th2) {
                MobLog.getInstance().w(th2);
            }
        } else {
            intent2 = new Intent(context, (Class<?>) MobUIShell.class);
            a11 = MobUIShell.a(this);
        }
        intent2.putExtra(l.a("011<feegedelehDd1eeXe@ef8mj"), a11);
        intent2.putExtra(l.a("013jTem0j5ehed1e fdeieeelegDmj"), getClass().getName());
        if (intent != null) {
            intent2.putExtras(intent);
        }
        if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
            showActivity(context, intent2);
        } else {
            UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.tools.FakeActivity.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    FakeActivity.this.showActivity(context, intent2);
                    return false;
                }
            });
        }
    }

    public void startActivity(Intent intent) {
        startActivityForResult(intent, -1);
    }

    public void startActivityForResult(Intent intent, int i11) {
        Activity activity = this.activity;
        if (activity == null) {
            return;
        }
        activity.startActivityForResult(intent, i11);
    }

    public void runOnUIThread(final Runnable runnable, long j11) {
        UIHandler.sendEmptyMessageDelayed(0, j11, new Handler.Callback() { // from class: com.mob.tools.FakeActivity.3
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                runnable.run();
                return false;
            }
        });
    }

    public <T extends View> T findViewByResName(String str) {
        int idRes;
        Activity activity = this.activity;
        if (activity != null && (idRes = ResHelper.getIdRes(activity, str)) > 0) {
            return (T) findViewById(idRes);
        }
        return null;
    }

    public void onCreate() {
    }

    public void onDestroy() {
    }

    public void onPause() {
    }

    public void onRestart() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onNewIntent(Intent intent) {
    }

    public void onResult(HashMap<String, Object> hashMap) {
    }

    public int onSetTheme(int i11, boolean z11) {
        return i11;
    }

    public void beforeStartActivityForResult(Intent intent, int i11, Bundle bundle) {
    }

    public void onActivityResult(int i11, int i12, Intent intent) {
    }

    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
    }
}
