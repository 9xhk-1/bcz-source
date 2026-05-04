package com.tencent.bugly.crashreport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.CrashModule;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.h5.H5JavaScriptInterface;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.proguard.aa;
import com.tencent.bugly.proguard.ac;
import com.tencent.bugly.proguard.ak;
import com.tencent.bugly.proguard.al;
import com.tencent.bugly.proguard.an;
import com.tencent.bugly.proguard.ap;
import com.tencent.bugly.proguard.aq;
import com.tencent.bugly.proguard.at;
import com.tencent.bugly.proguard.au;
import com.tencent.bugly.proguard.bc;
import com.tencent.bugly.proguard.p;
import com.tencent.bugly.proguard.r;
import com.tencent.bugly.proguard.s;
import com.tencent.bugly.proguard.w;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.y;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class CrashReport {

    /* renamed from: a, reason: collision with root package name */
    private static Context f42054a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CrashHandleCallback extends BuglyStrategy.a {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserStrategy extends BuglyStrategy {

        /* renamed from: c, reason: collision with root package name */
        CrashHandleCallback f42056c;

        public UserStrategy(Context context) {
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized int getCallBackType() {
            return this.f42027a;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized boolean getCloseErrorCallback() {
            return this.f42028b;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCallBackType(int i11) {
            this.f42027a = i11;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCloseErrorCallback(boolean z11) {
            this.f42028b = z11;
        }

        public synchronized void setCrashHandleCallback(CrashHandleCallback crashHandleCallback) {
            this.f42056c = crashHandleCallback;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized CrashHandleCallback getCrashHandleCallback() {
            return this.f42056c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        String a();

        void a(H5JavaScriptInterface h5JavaScriptInterface, String str);

        void a(String str);

        void b();

        CharSequence c();
    }

    public static void closeBugly() {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not close bugly because bugly is disable.");
            return;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.w(al.f42282b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        if (f42054a == null) {
            return;
        }
        aq a11 = aq.a();
        if (a11 != null) {
            a11.b(f42054a);
        }
        closeCrashReport();
        s.a(f42054a);
        ak a12 = ak.a();
        if (a12 != null) {
            a12.b();
        }
    }

    public static void closeCrashReport() {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not close crash report because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            at.a().c();
        } else {
            Log.w(al.f42282b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void closeNativeReport() {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not close native report because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            at.a().d();
        } else {
            Log.e(al.f42282b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void enableBugly(boolean z11) {
        p.f42619a = z11;
    }

    public static void enableObtainId(Context context, boolean z11) {
        setCollectPrivacyInfo(context, z11);
    }

    public static Set<String> getAllUserDataKeys(Context context) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not get all keys of user data because bugly is disable.");
            return new HashSet();
        }
        if (context != null) {
            return aa.a(context).w();
        }
        Log.e(al.f42282b, "getAllUserDataKeys args context should not be null");
        return new HashSet();
    }

    public static String getAppChannel() {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not get App channel because bugly is disable.");
            return "unknown";
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return aa.a(f42054a).f42202s;
        }
        Log.e(al.f42282b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return "unknown";
    }

    public static String getAppID() {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not get App ID because bugly is disable.");
            return "unknown";
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return aa.a(f42054a).e();
        }
        Log.e(al.f42282b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return "unknown";
    }

    public static String getAppVer() {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not get app version because bugly is disable.");
            return "unknown";
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return aa.a(f42054a).f42198o;
        }
        Log.e(al.f42282b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return "unknown";
    }

    public static String getBuglyVersion(Context context) {
        if (context != null) {
            return aa.a(context).f42191h;
        }
        al.d("Please call with context.", new Object[0]);
        return "unknown";
    }

    public static Context getContext() {
        return f42054a;
    }

    public static String getDeviceID(Context context) {
        return aa.a(context).g();
    }

    public static Proxy getHttpProxy() {
        return an.f42286a;
    }

    public static Map<String, String> getSdkExtraData() {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not get SDK extra data because bugly is disable.");
            return new HashMap();
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return aa.a(f42054a).K;
        }
        Log.e(al.f42282b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return null;
    }

    public static String getUserData(Context context, String str) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not get user data because bugly is disable.");
            return "unknown";
        }
        if (context == null) {
            Log.e(al.f42282b, "getUserDataValue args context should not be null");
            return "unknown";
        }
        if (ap.b(str)) {
            return null;
        }
        return aa.a(context).g(str);
    }

    public static int getUserDatasSize(Context context) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not get size of user data because bugly is disable.");
            return -1;
        }
        if (context != null) {
            return aa.a(context).v();
        }
        Log.e(al.f42282b, "getUserDatasSize args context should not be null");
        return -1;
    }

    public static String getUserId() {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not get user ID because bugly is disable.");
            return "unknown";
        }
        if (CrashModule.getInstance().hasInitialized()) {
            return aa.a(f42054a).f();
        }
        Log.e(al.f42282b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        return "unknown";
    }

    public static int getUserSceneTagId(Context context) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not get user scene tag because bugly is disable.");
            return -1;
        }
        if (context != null) {
            return aa.a(context).z();
        }
        Log.e(al.f42282b, "getUserSceneTagId args context should not be null");
        return -1;
    }

    public static void initCrashReport(Context context) {
        if (context == null) {
            return;
        }
        f42054a = context;
        p.a(CrashModule.getInstance());
        p.a(context);
    }

    public static boolean isLastSessionCrash() {
        if (!p.f42619a) {
            Log.w(al.f42282b, "The info 'isLastSessionCrash' is not accurate because bugly is disable.");
            return false;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(al.f42282b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return false;
        }
        at a11 = at.a();
        Boolean bool = a11.A;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = aa.b().f42187d;
        List<y> a12 = w.a().a(1);
        ArrayList arrayList = new ArrayList();
        if (a12 == null || a12.size() <= 0) {
            a11.A = Boolean.FALSE;
            return false;
        }
        for (y yVar : a12) {
            if (str.equals(yVar.f42699c)) {
                a11.A = Boolean.TRUE;
                arrayList.add(yVar);
            }
        }
        if (arrayList.size() > 0) {
            w.a().a(arrayList);
        }
        return true;
    }

    public static void postCatchedException(Throwable th2) {
        postCatchedException(th2, Thread.currentThread());
    }

    public static void postException(Thread thread, int i11, String str, String str2, String str3, Map<String, String> map) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not post crash caught because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            au.a(thread, i11, str, str2, str3, map);
        } else {
            Log.e(al.f42282b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    private static void putSdkData(Context context, String str, String str2) {
        if (context == null || ap.b(str) || ap.b(str2)) {
            return;
        }
        String replace = str.replace("[a-zA-Z[0-9]]+", "");
        if (replace.length() > 100) {
            Log.w(al.f42282b, String.format("putSdkData key length over limit %d, will be cutted.", 50));
            replace = replace.substring(0, 50);
        }
        if (str2.length() > 500) {
            Log.w(al.f42282b, String.format("putSdkData value length over limit %d, will be cutted!", 200));
            str2 = str2.substring(0, 200);
        }
        aa.a(context).b(replace, str2);
        al.b(String.format("[param] putSdkData data: %s - %s", replace, str2), new Object[0]);
    }

    public static void putUserData(Context context, String str, String str2) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not put user data because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(al.f42282b, "putUserData args context should not be null");
            return;
        }
        if (str == null) {
            al.d("putUserData args key should not be null or empty", new Object[0]);
            return;
        }
        if (str2 == null) {
            al.d("putUserData args value should not be null", new Object[0]);
            return;
        }
        if (str2.length() > 200) {
            al.d("user data value length over limit %d, it will be cutted!", 200);
            str2 = str2.substring(0, 200);
        }
        aa a11 = aa.a(context);
        if (a11.w().contains(str)) {
            NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
            if (nativeCrashHandler != null) {
                nativeCrashHandler.putKeyValueToNative(str, str2);
            }
            aa.a(context).a(str, str2);
            al.c("replace KV %s %s", str, str2);
            return;
        }
        if (a11.v() >= 50) {
            al.d("user data size is over limit %d, it will be cutted!", 50);
            return;
        }
        if (str.length() > 50) {
            al.d("user data key length over limit %d , will drop this new key %s", 50, str);
            str = str.substring(0, 50);
        }
        NativeCrashHandler nativeCrashHandler2 = NativeCrashHandler.getInstance();
        if (nativeCrashHandler2 != null) {
            nativeCrashHandler2.putKeyValueToNative(str, str2);
        }
        aa.a(context).a(str, str2);
        al.b("[param] set user data: %s - %s", str, str2);
    }

    public static String removeUserData(Context context, String str) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not remove user data because bugly is disable.");
            return "unknown";
        }
        if (context == null) {
            Log.e(al.f42282b, "removeUserData args context should not be null");
            return "unknown";
        }
        if (ap.b(str)) {
            return null;
        }
        al.b("[param] remove user data: %s", str);
        return aa.a(context).f(str);
    }

    public static void setAllThreadStackEnable(Context context, boolean z11, boolean z12) {
        aa a11 = aa.a(context);
        a11.Q = z11;
        a11.R = z12;
    }

    public static void setAppChannel(Context context, String str) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not set App channel because Bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(al.f42282b, "setAppChannel args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(al.f42282b, "App channel is null, will not set");
            return;
        }
        aa.a(context).f42202s = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppChannel(str);
        }
    }

    public static void setAppPackage(Context context, String str) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not set App package because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(al.f42282b, "setAppPackage args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(al.f42282b, "App package is null, will not set");
            return;
        }
        aa.a(context).f42186c = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppPackage(str);
        }
    }

    public static void setAppVersion(Context context, String str) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not set App version because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(al.f42282b, "setAppVersion args context should not be null");
            return;
        }
        if (str == null) {
            Log.w(al.f42282b, "App version is null, will not set");
            return;
        }
        aa.a(context).f42198o = str;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeAppVersion(str);
        }
    }

    public static void setBuglyDbName(String str) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not set DB name because bugly is disable.");
        } else {
            Log.i(al.f42282b, "Set Bugly DB name: ".concat(String.valueOf(str)));
            x.f42693a = str;
        }
    }

    public static void setCollectPrivacyInfo(Context context, boolean z11) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not set collect privacy info enable because bugly is disable.");
        } else if (context == null) {
            Log.w(al.f42282b, "setCollectPrivacyInfo args context should not be null");
        } else {
            Log.i(al.f42282b, "setCollectPrivacyInfo: ".concat(String.valueOf(z11)));
            aa.a(context).f42197n = z11;
        }
    }

    public static void setContext(Context context) {
        f42054a = context;
    }

    public static void setCrashFilter(String str) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not set App package because bugly is disable.");
        } else {
            Log.i(al.f42282b, "Set crash stack filter: ".concat(String.valueOf(str)));
            at.f42361q = str;
        }
    }

    public static void setCrashRegularFilter(String str) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not set App package because bugly is disable.");
        } else {
            Log.i(al.f42282b, "Set crash stack filter: ".concat(String.valueOf(str)));
            at.f42362r = str;
        }
    }

    public static void setDeviceId(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        aa.a(context).a(str);
    }

    public static void setDeviceModel(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        aa.a(context).b(str);
    }

    public static void setDumpFilePath(Context context, String str) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not set App version because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.w(al.f42282b, "setTombPath args context should not be null");
        } else if (str == null) {
            Log.w(al.f42282b, "tombstone path is null, will not set");
        } else {
            Log.i(al.f42282b, "user set tombstone path: ".concat(str));
            NativeCrashHandler.setDumpFilePath(str);
        }
    }

    public static void setHandleNativeCrashInJava(boolean z11) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not set App package because bugly is disable.");
        } else {
            Log.i(al.f42282b, "Should handle native crash in Java profile after handled in native profile: ".concat(String.valueOf(z11)));
            NativeCrashHandler.setShouldHandleInJava(z11);
        }
    }

    public static void setHttpProxy(String str, int i11) {
        if (TextUtils.isEmpty(str)) {
            an.f42286a = null;
        } else {
            an.f42286a = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i11));
        }
    }

    @Deprecated
    public static void setIsAppForeground(Context context, boolean z11) {
        al.a("App fore and back status are no longer supported", new Object[0]);
    }

    public static void setIsDevelopmentDevice(Context context, boolean z11) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not set 'isDevelopmentDevice' because bugly is disable.");
            return;
        }
        if (context == null) {
            al.d("Context should not be null.", new Object[0]);
            return;
        }
        if (z11) {
            al.c("This is a development device.", new Object[0]);
        } else {
            al.c("This is not a development device.", new Object[0]);
        }
        aa.a(context).I = z11;
    }

    public static boolean setJavascriptMonitor(WebView webView, boolean z11) {
        return setJavascriptMonitor(webView, z11, false);
    }

    public static void setSdkExtraData(Context context, String str, String str2) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not put SDK extra data because bugly is disable.");
            return;
        }
        if (context == null || ap.b(str) || ap.b(str2)) {
            return;
        }
        aa a11 = aa.a(context);
        if (str == null || str2 == null) {
            return;
        }
        synchronized (a11.T) {
            a11.K.put(str, str2);
        }
    }

    public static void setServerUrl(String str) {
        if (ap.b(str) || !ap.d(str)) {
            Log.i(al.f42282b, "URL is invalid.");
            return;
        }
        ac.a(str);
        StrategyBean.f42079a = str;
        StrategyBean.f42080b = str;
    }

    public static void setSessionIntervalMills(long j11) {
        if (p.f42619a) {
            s.a(j11);
        } else {
            Log.w(al.f42282b, "Can not set 'SessionIntervalMills' because bugly is disable.");
        }
    }

    public static void setUserId(String str) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not set user ID because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            setUserId(f42054a, str);
        } else {
            Log.e(al.f42282b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void setUserSceneTag(Context context, int i11) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not set tag caught because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.e(al.f42282b, "setTag args context should not be null");
            return;
        }
        if (i11 <= 0) {
            al.d("setTag args tagId should > 0", new Object[0]);
        }
        aa a11 = aa.a(context);
        synchronized (a11.U) {
            try {
                int i12 = a11.f42206w;
                if (i12 != i11) {
                    a11.f42206w = i11;
                    al.a("user scene tag %d changed to tag %d", Integer.valueOf(i12), Integer.valueOf(a11.f42206w));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        al.b("[param] set user scene tag: %d", Integer.valueOf(i11));
    }

    public static void startCrashReport() {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not start crash report because bugly is disable.");
        } else if (CrashModule.getInstance().hasInitialized()) {
            at.a().b();
        } else {
            Log.w(al.f42282b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        }
    }

    public static void testANRCrash() {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not test ANR crash because bugly is disable.");
        } else if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(al.f42282b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        } else {
            al.a("start to create a anr crash for test!", new Object[0]);
            at.a().h();
        }
    }

    public static void testJavaCrash() {
        int i11;
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not test Java crash because bugly is disable.");
            return;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(al.f42282b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        aa b11 = aa.b();
        if (b11 != null && (i11 = b11.f42207x) != 24096) {
            b11.f42207x = 24096;
            al.a("server scene tag %d changed to tag %d", Integer.valueOf(i11), Integer.valueOf(b11.f42207x));
        }
        throw new RuntimeException("This Crash create for Test! You can go to Bugly see more detail!");
    }

    public static void testNativeCrash() {
        testNativeCrash(true, true, false);
    }

    public static void uploadUserInfo() {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not upload user info because bugly is disable.");
            return;
        }
        r rVar = s.f42640b;
        if (rVar == null) {
            Log.w(al.f42282b, "Can not upload user info because bugly is not init.");
        } else {
            rVar.b();
        }
    }

    public static void postCatchedException(Throwable th2, Thread thread) {
        postCatchedException(th2, thread, false);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(final WebView webView, boolean z11, boolean z12) {
        if (webView == null) {
            Log.w(al.f42282b, "WebView is null.");
            return false;
        }
        webView.getSettings().setSavePassword(false);
        webView.getSettings().setAllowFileAccess(false);
        return setJavascriptMonitor(new a() { // from class: com.tencent.bugly.crashreport.CrashReport.1
            @Override // com.tencent.bugly.crashreport.CrashReport.a
            public final String a() {
                return webView.getUrl();
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.a
            public final void b() {
                WebSettings settings = webView.getSettings();
                if (settings.getJavaScriptEnabled()) {
                    return;
                }
                settings.setJavaScriptEnabled(true);
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.a
            public final CharSequence c() {
                return webView.getContentDescription();
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.a
            public final void a(String str) {
                webView.loadUrl(str);
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.a
            public final void a(H5JavaScriptInterface h5JavaScriptInterface, String str) {
                webView.addJavascriptInterface(h5JavaScriptInterface, str);
            }
        }, z11, z12);
    }

    public static void testNativeCrash(boolean z11, boolean z12, boolean z13) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not test native crash because bugly is disable.");
        } else if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(al.f42282b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
        } else {
            al.a("start to create a native crash for test!", new Object[0]);
            at.a().a(z11, z12, z13);
        }
    }

    public static void postCatchedException(final Throwable th2, final Thread thread, final boolean z11) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not post crash caught because bugly is disable.");
            return;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            Log.e(al.f42282b, "CrashReport has not been initialed! pls to call method 'initCrashReport' first!");
            return;
        }
        if (th2 == null) {
            al.d("throwable is null, just return", new Object[0]);
            return;
        }
        if (thread == null) {
            thread = Thread.currentThread();
        }
        final at a11 = at.a();
        a11.f42368w.a(new Runnable() { // from class: com.tencent.bugly.proguard.at.3

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f42374a = false;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f42377d = null;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ byte[] f42378e = null;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f42379f = true;

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    al.c("post a throwable %b", Boolean.valueOf(this.f42374a));
                    at.this.f42365t.a(thread, th2, false, this.f42377d, this.f42378e, this.f42379f);
                    if (z11) {
                        al.a("clear user datas", new Object[0]);
                        aa.a(at.this.f42363c).u();
                    }
                } catch (Throwable th3) {
                    if (!al.b(th3)) {
                        th3.printStackTrace();
                    }
                    al.e("java catch error: %s", th2.toString());
                }
            }
        });
    }

    public static void initCrashReport(Context context, UserStrategy userStrategy) {
        if (context == null) {
            return;
        }
        f42054a = context;
        p.a(CrashModule.getInstance());
        p.a(context, userStrategy);
    }

    public static void setHttpProxy(InetAddress inetAddress, int i11) {
        if (inetAddress == null) {
            an.f42286a = null;
        } else {
            an.f42286a = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(inetAddress, i11));
        }
    }

    public static void postException(int i11, String str, String str2, String str3, Map<String, String> map) {
        postException(Thread.currentThread(), i11, str, str2, str3, map);
    }

    public static void setUserId(Context context, String str) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not set user ID because bugly is disable.");
            return;
        }
        if (context == null) {
            Log.e(al.f42282b, "Context should not be null when bugly has not been initialed!");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            al.d("userId should not be null", new Object[0]);
            return;
        }
        if (str.length() > 100) {
            String substring = str.substring(0, 100);
            al.d("userId %s length is over limit %d substring to %s", str, 100, substring);
            str = substring;
        }
        if (str.equals(aa.a(context).f())) {
            return;
        }
        aa a11 = aa.a(context);
        synchronized (a11.V) {
            a11.f42195l = str;
        }
        al.b("[user] set userId : %s", str);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        if (nativeCrashHandler != null) {
            nativeCrashHandler.setNativeUserId(str);
        }
        if (CrashModule.getInstance().hasInitialized()) {
            s.a();
        }
    }

    public static Map<String, String> getSdkExtraData(Context context) {
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not get SDK extra data because bugly is disable.");
            return new HashMap();
        }
        if (context == null) {
            al.d("Context should not be null.", new Object[0]);
            return null;
        }
        return aa.a(context).K;
    }

    public static void initCrashReport(Context context, String str, boolean z11) {
        initCrashReport(context, str, z11, null);
    }

    public static boolean setJavascriptMonitor(a aVar, boolean z11) {
        return setJavascriptMonitor(aVar, z11, false);
    }

    public static void initCrashReport(Context context, String str, boolean z11, UserStrategy userStrategy) {
        if (context == null) {
            return;
        }
        f42054a = context;
        p.a(CrashModule.getInstance());
        p.a(context, str, z11, userStrategy);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(a aVar, boolean z11, boolean z12) {
        if (aVar == null) {
            Log.w(al.f42282b, "WebViewInterface is null.");
            return false;
        }
        if (!CrashModule.getInstance().hasInitialized()) {
            al.e("CrashReport has not been initialed! please to call method 'initCrashReport' first!", new Object[0]);
            return false;
        }
        al.a("Set Javascript exception monitor of webview.", new Object[0]);
        if (!p.f42619a) {
            Log.w(al.f42282b, "Can not set JavaScript monitor because bugly is disable.");
            return false;
        }
        al.c("URL of webview is %s", aVar.a());
        al.a("Enable the javascript needed by webview monitor.", new Object[0]);
        aVar.b();
        H5JavaScriptInterface h5JavaScriptInterface = H5JavaScriptInterface.getInstance(aVar);
        if (h5JavaScriptInterface != null) {
            al.a("Add a secure javascript interface to the webview.", new Object[0]);
            aVar.a(h5JavaScriptInterface, "exceptionUploader");
        }
        if (!z11) {
            return true;
        }
        al.a("Inject bugly.js(v%s) to the webview.", bc.b());
        String a11 = bc.a();
        if (a11 == null) {
            al.e("Failed to inject Bugly.js.", bc.b());
            return false;
        }
        aVar.a("javascript:".concat(a11));
        return true;
    }
}
