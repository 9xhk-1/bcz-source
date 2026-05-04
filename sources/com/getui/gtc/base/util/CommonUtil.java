package com.getui.gtc.base.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.ProcessSwitchContract;
import com.getui.gtc.base.publish.Broker;
import com.getui.gtc.base.publish.Subscriber;
import com.squareup.picasso.h0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class CommonUtil {
    private static File externalFilesDir;
    private static Boolean isAppDebug;

    public static class CommonUtilSubscriber implements Subscriber {
        private static final CommonUtilSubscriber INSTANCE = new CommonUtilSubscriber();
        private static String getInstanceMethodName;
        private ApplicationInfo applicationInfo;
        private PackageInfo packageInfo;

        private CommonUtilSubscriber() {
        }

        private Bundle createBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(ProcessSwitchContract.CLASS_NAME, getClass().getName());
            bundle.putString(ProcessSwitchContract.GET_INSTANCE, getInstanceMethodName);
            return bundle;
        }

        public static CommonUtilSubscriber getInstance() {
            getInstanceMethodName = Thread.currentThread().getStackTrace()[2].getMethodName();
            return INSTANCE;
        }

        public ApplicationInfo getAppInfoForSelf(Context context) {
            try {
                if (!CommonUtil.isGtcProcess()) {
                    GtcProvider.setContext(context);
                    Bundle createBundle = createBundle();
                    createBundle.putString(ProcessSwitchContract.METHOD_NAME, "base-1-3-1");
                    return (ApplicationInfo) Broker.getInstance().subscribe(createBundle).getParcelable(ProcessSwitchContract.METHOD_RETURN);
                }
                if (this.applicationInfo == null) {
                    if (context == null) {
                        context = CommonUtil.findAppContext();
                    }
                    this.applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                }
                return this.applicationInfo;
            } catch (Throwable th2) {
                th2.printStackTrace();
                return null;
            }
        }

        public PackageInfo getPackageInfoForSelf(Context context) {
            try {
                if (!CommonUtil.isGtcProcess()) {
                    GtcProvider.setContext(context);
                    Bundle createBundle = createBundle();
                    createBundle.putString(ProcessSwitchContract.METHOD_NAME, "base-1-2-1");
                    return (PackageInfo) Broker.getInstance().subscribe(createBundle).getParcelable(ProcessSwitchContract.METHOD_RETURN);
                }
                if (this.packageInfo == null) {
                    if (context == null) {
                        context = CommonUtil.findAppContext();
                    }
                    this.packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 79);
                }
                return this.packageInfo;
            } catch (Throwable th2) {
                th2.printStackTrace();
                return null;
            }
        }

        public boolean isAppForeground() {
            try {
                if (CommonUtil.isGtcProcess()) {
                    return GtcProvider.isForeground();
                }
                Bundle createBundle = createBundle();
                createBundle.putString(ProcessSwitchContract.METHOD_NAME, "base-1-1-1");
                return Broker.getInstance().subscribe(createBundle).getBoolean(ProcessSwitchContract.METHOD_RETURN);
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // com.getui.gtc.base.publish.Subscriber
        public void receive(Bundle bundle, Bundle bundle2) {
            Parcelable packageInfoForSelf;
            ArrayList arrayList = new ArrayList();
            try {
                Throwable th2 = (Throwable) bundle2.getSerializable(ProcessSwitchContract.METHOD_EXCEPTION);
                if (th2 != null) {
                    arrayList.add(th2);
                }
                String string = bundle.getString(ProcessSwitchContract.METHOD_NAME);
                if (TextUtils.isEmpty(string)) {
                    throw new RuntimeException("methodName missed");
                }
                int hashCode = string.hashCode();
                if (hashCode != -1969640451) {
                    if (hashCode != -1969639490) {
                        if (hashCode == -1969638529 && string.equals("base-1-3-1")) {
                            packageInfoForSelf = getAppInfoForSelf(GtcProvider.context());
                            bundle2.putParcelable(ProcessSwitchContract.METHOD_RETURN, packageInfoForSelf);
                        }
                    } else if (string.equals("base-1-2-1")) {
                        packageInfoForSelf = getPackageInfoForSelf(GtcProvider.context());
                        bundle2.putParcelable(ProcessSwitchContract.METHOD_RETURN, packageInfoForSelf);
                    }
                } else if (string.equals("base-1-1-1")) {
                    bundle2.putBoolean(ProcessSwitchContract.METHOD_RETURN, isAppForeground());
                }
            } catch (Throwable th3) {
                try {
                    arrayList.add(th3);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Throwable) it.next()).printStackTrace();
                    }
                } finally {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((Throwable) it2.next()).printStackTrace();
                    }
                }
            }
        }
    }

    public static void checkRuntimePermission(Context context, String str, boolean z11) throws Throwable {
        if (hasPermission(context, str, z11)) {
            return;
        }
        throw new IllegalStateException("permission " + str + " not granted");
    }

    public static Context findAppContext() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", null);
            declaredMethod.setAccessible(true);
            return (Context) declaredMethod.invoke(null, null);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public static ApplicationInfo getAppInfoForSelf(Context context) throws PackageManager.NameNotFoundException {
        ApplicationInfo appInfoForSelf = CommonUtilSubscriber.getInstance().getAppInfoForSelf(context);
        if (appInfoForSelf != null) {
            return appInfoForSelf;
        }
        throw new PackageManager.NameNotFoundException();
    }

    public static File getExternalFilesDir(Context context) {
        if (externalFilesDir == null) {
            if (context == null) {
                context = findAppContext();
            }
            externalFilesDir = context.getExternalFilesDir(null);
        }
        return externalFilesDir;
    }

    public static PackageInfo getPackageInfoForSelf(Context context) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfoForSelf = CommonUtilSubscriber.getInstance().getPackageInfoForSelf(context);
        if (packageInfoForSelf != null) {
            return packageInfoForSelf;
        }
        throw new PackageManager.NameNotFoundException();
    }

    public static String getProcessName() {
        String processName;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                return processName;
            }
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, null);
        } catch (Throwable th2) {
            th2.printStackTrace();
            String processNameByPid = getProcessNameByPid(Process.myPid());
            return !TextUtils.isEmpty(processNameByPid) ? processNameByPid : "unknown.process";
        }
    }

    private static String getProcessNameByPid(int i11) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + i11 + "/cmdline"));
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
        try {
            String readLine = bufferedReader.readLine();
            if (!TextUtils.isEmpty(readLine)) {
                readLine = readLine.trim();
            }
            try {
                bufferedReader.close();
                return readLine;
            } catch (IOException e11) {
                e11.printStackTrace();
                return readLine;
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                th.printStackTrace();
                return null;
            } finally {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
            }
        }
    }

    public static Activity getTopActivity() {
        ArrayMap arrayMap;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", null).invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            arrayMap = (ArrayMap) declaredField.get(invoke);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if (arrayMap.size() <= 0) {
            return null;
        }
        for (Object obj : arrayMap.values()) {
            Class<?> cls2 = obj.getClass();
            Field declaredField2 = cls2.getDeclaredField(h0.C);
            declaredField2.setAccessible(true);
            if (!declaredField2.getBoolean(obj)) {
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                return (Activity) declaredField3.get(obj);
            }
        }
        return null;
    }

    public static boolean hasPermission(Context context, String str, boolean z11) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Throwable unused) {
            return z11;
        }
    }

    public static boolean isAppDebugEnable() {
        if (GtcProvider.context() == null) {
            return false;
        }
        if (isAppDebug == null) {
            try {
                isAppDebug = Boolean.valueOf((GtcProvider.context().getApplicationInfo().flags & 2) != 0);
            } catch (Throwable unused) {
                return false;
            }
        }
        return isAppDebug.booleanValue();
    }

    public static boolean isAppForeground() {
        return CommonUtilSubscriber.getInstance().isAppForeground();
    }

    public static boolean isGtcProcess() {
        return Process.myPid() == GtcProvider.gtcPid();
    }

    public static boolean isMainProcess() {
        return isMainProcess(GtcProvider.context());
    }

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean isMainProcess(Context context) {
        if (context == null) {
            try {
                context = findAppContext();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        if (context != null) {
            String str = context.getApplicationInfo().processName;
            String processName = getProcessName();
            if (str != null) {
                if (str.equals(processName)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
