package com.mob.tools;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.mob.commons.n;
import com.mob.tools.utils.ReflectHelper;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class MobUIShell extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, FakeActivity> f41123a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private FakeActivity f41124b;

    static {
        MobLog.getInstance().d("===============================", new Object[0]);
        MobLog.getInstance().d("MobTools " + "2022-07-29".replace("-0", Constants.ACCEPT_TIME_SEPARATOR_SERVER).replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "."), new Object[0]);
        MobLog.getInstance().d("===============================", new Object[0]);
    }

    public static String a(Object obj) {
        return a(String.valueOf(System.currentTimeMillis()), obj);
    }

    private boolean b() {
        if (this.f41124b == null) {
            Intent intent = getIntent();
            Uri data = intent.getData();
            if (data != null && n.a("005kGdbebcbcd").equals(data.getScheme())) {
                FakeActivity a11 = a(data.getHost());
                this.f41124b = a11;
                if (a11 != null) {
                    MobLog.getInstance().i("MobUIShell found executor: " + this.f41124b.getClass());
                    this.f41124b.setActivity(this);
                    return true;
                }
            }
            try {
                String stringExtra = intent.getStringExtra(n.a("011 dccecbcjcf5b[cc'c!cd[kh"));
                String stringExtra2 = intent.getStringExtra(n.a("013hUckLh6cfcb$cQdbcgcccjceHkh"));
                FakeActivity remove = f41123a.remove(stringExtra);
                this.f41124b = remove;
                if (remove == null) {
                    FakeActivity remove2 = f41123a.remove(intent.getScheme());
                    this.f41124b = remove2;
                    if (remove2 == null) {
                        FakeActivity a12 = a();
                        this.f41124b = a12;
                        if (a12 == null) {
                            MobLog.getInstance().w(new RuntimeException("Executor lost! launchTime = " + stringExtra + ", executorName: " + stringExtra2));
                            return false;
                        }
                    }
                }
                MobLog.getInstance().i("MobUIShell found executor: " + this.f41124b.getClass());
                this.f41124b.setActivity(this);
            } catch (Throwable th2) {
                MobLog.getInstance().w(th2);
                return false;
            }
        }
        return true;
    }

    private boolean c() {
        if (Build.VERSION.SDK_INT > 27) {
            return false;
        }
        try {
            Field declaredField = Activity.class.getDeclaredField(n.a("013k,dicfRcFcdEiZcd8c:chdfcjegdb"));
            declaredField.setAccessible(true);
            ((ActivityInfo) declaredField.get(this)).screenOrientation = -1;
            declaredField.setAccessible(false);
            return true;
        } catch (Exception e11) {
            MobLog.getInstance().w(e11, "Fix orientation for 8.0 encountered exception", new Object[0]);
            return false;
        }
    }

    private boolean d() {
        Method method;
        boolean booleanValue;
        boolean z11 = false;
        if (Build.VERSION.SDK_INT > 27) {
            return false;
        }
        try {
            TypedArray obtainStyledAttributes = this.f41124b.activity.obtainStyledAttributes((int[]) Class.forName("com.android.internal.R$styleable").getField("Window").get(null));
            method = ActivityInfo.class.getMethod(n.a("023Zcdefdhcgcecjefdccbcf^h cjFc8ejcggcdcdbceJcUcdcjee"), TypedArray.class);
            method.setAccessible(true);
            booleanValue = ((Boolean) method.invoke(null, obtainStyledAttributes)).booleanValue();
        } catch (Exception e11) {
            e = e11;
        }
        try {
            method.setAccessible(false);
            return booleanValue;
        } catch (Exception e12) {
            e = e12;
            z11 = booleanValue;
            MobLog.getInstance().w(e);
            return z11;
        }
    }

    @Override // android.app.Activity
    public void finish() {
        FakeActivity fakeActivity = this.f41124b;
        if (fakeActivity == null || !fakeActivity.onFinish()) {
            super.finish();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        FakeActivity fakeActivity = this.f41124b;
        if (fakeActivity != null) {
            fakeActivity.onActivityResult(i11, i12, intent);
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        FakeActivity fakeActivity = this.f41124b;
        if (fakeActivity != null) {
            fakeActivity.onConfigurationChanged(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        if (!b()) {
            super.onCreate(bundle);
            finish();
            return;
        }
        MobLog.getInstance().d(this.f41124b.getClass().getSimpleName() + " onCreate", new Object[0]);
        if (Build.VERSION.SDK_INT == 26 && d()) {
            c();
        }
        this.f41124b.activity.getWindow().addFlags(Integer.MIN_VALUE);
        this.f41124b.activity.getWindow().setStatusBarColor(0);
        super.onCreate(bundle);
        this.f41124b.onCreate();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        FakeActivity fakeActivity = this.f41124b;
        return fakeActivity != null ? fakeActivity.onCreateOptionsMenu(menu) : onCreateOptionsMenu;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        FakeActivity fakeActivity = this.f41124b;
        if (fakeActivity != null) {
            fakeActivity.sendResult();
            MobLog.getInstance().d(this.f41124b.getClass().getSimpleName() + " onDestroy", new Object[0]);
            this.f41124b.onDestroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        try {
            FakeActivity fakeActivity = this.f41124b;
            if (fakeActivity != null ? fakeActivity.onKeyEvent(i11, keyEvent) : false) {
                return true;
            }
            return super.onKeyDown(i11, keyEvent);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return false;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        try {
            FakeActivity fakeActivity = this.f41124b;
            if (fakeActivity != null ? fakeActivity.onKeyEvent(i11, keyEvent) : false) {
                return true;
            }
            return super.onKeyUp(i11, keyEvent);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return false;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        FakeActivity fakeActivity = this.f41124b;
        if (fakeActivity == null) {
            super.onNewIntent(intent);
        } else {
            fakeActivity.onNewIntent(intent);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
        FakeActivity fakeActivity = this.f41124b;
        return fakeActivity != null ? fakeActivity.onOptionsItemSelected(menuItem) : onOptionsItemSelected;
    }

    @Override // android.app.Activity
    public void onPause() {
        if (this.f41124b != null) {
            MobLog.getInstance().d(this.f41124b.getClass().getSimpleName() + " onPause", new Object[0]);
            this.f41124b.onPause();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        FakeActivity fakeActivity = this.f41124b;
        if (fakeActivity != null) {
            fakeActivity.onRequestPermissionsResult(i11, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        if (this.f41124b != null) {
            MobLog.getInstance().d(this.f41124b.getClass().getSimpleName() + " onRestart", new Object[0]);
            this.f41124b.onRestart();
        }
        super.onRestart();
    }

    @Override // android.app.Activity
    public void onResume() {
        if (this.f41124b != null) {
            MobLog.getInstance().d(this.f41124b.getClass().getSimpleName() + " onResume", new Object[0]);
            this.f41124b.onResume();
        }
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        if (this.f41124b != null) {
            MobLog.getInstance().d(this.f41124b.getClass().getSimpleName() + " onStart", new Object[0]);
            this.f41124b.onStart();
        }
        super.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        if (this.f41124b != null) {
            MobLog.getInstance().d(this.f41124b.getClass().getSimpleName() + " onStop", new Object[0]);
            this.f41124b.onStop();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public void setContentView(int i11) {
        setContentView(LayoutInflater.from(this).inflate(i11, (ViewGroup) null));
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i11) {
        if (Build.VERSION.SDK_INT == 26 && d()) {
            return;
        }
        super.setRequestedOrientation(i11);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i11) {
        if (b()) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int i12 = 0;
            while (i12 < stackTrace.length) {
                if (stackTrace[i12].toString().startsWith(n.a("0304gece0i(cedkdccecjeedkdh%bUcg,h1ceSg3dkee<hc-dg c6cecfcidhcgcecf;h")) && (i12 = i12 + 2) < stackTrace.length) {
                    int onSetTheme = this.f41124b.onSetTheme(i11, stackTrace[i12].toString().startsWith(n.a("048;cecj6gZcgdbcdBg[dkceYdd8dkdicfIc@cdEi*cdNcUchdhYbKcg(hZceKg]dkVdh7cgegdbcg2kNdjcecbcjcfEb,dicfUcUcd;iHcd=c.ch")));
                    if (onSetTheme > 0) {
                        super.setTheme(onSetTheme);
                        return;
                    }
                    return;
                }
                i12++;
            }
        }
        super.setTheme(i11);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i11) {
        FakeActivity fakeActivity = this.f41124b;
        if (fakeActivity != null) {
            fakeActivity.beforeStartActivityForResult(intent, i11, null);
        }
        super.startActivityForResult(intent, i11);
    }

    public static String a(String str, Object obj) {
        f41123a.put(str, (FakeActivity) obj);
        return str;
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        if (view == null) {
            return;
        }
        super.setContentView(view);
        FakeActivity fakeActivity = this.f41124b;
        if (fakeActivity != null) {
            fakeActivity.setContentView(view);
        }
    }

    private FakeActivity a(String str) {
        Object newInstance;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith(".")) {
                str = getPackageName() + str;
            }
            String importClass = ReflectHelper.importClass(str);
            if (TextUtils.isEmpty(importClass) || (newInstance = ReflectHelper.newInstance(importClass, new Object[0])) == null || !(newInstance instanceof FakeActivity)) {
                return null;
            }
            return (FakeActivity) newInstance;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i11, Bundle bundle) {
        FakeActivity fakeActivity = this.f41124b;
        if (fakeActivity != null) {
            fakeActivity.beforeStartActivityForResult(intent, i11, bundle);
        }
        super.startActivityForResult(intent, i11, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view == null) {
            return;
        }
        if (layoutParams == null) {
            super.setContentView(view);
        } else {
            super.setContentView(view, layoutParams);
        }
        FakeActivity fakeActivity = this.f41124b;
        if (fakeActivity != null) {
            fakeActivity.setContentView(view);
        }
    }

    public FakeActivity a() {
        String str;
        try {
            str = getPackageManager().getActivityInfo(getComponentName(), 128).metaData.getString(n.a("015gh)egcecbdc4cLdicf c4cd!i6cdKcVch"));
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            str = null;
        }
        return a(str);
    }
}
