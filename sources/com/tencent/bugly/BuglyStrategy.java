package com.tencent.bugly;

import com.tencent.bugly.proguard.aa;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class BuglyStrategy {

    /* renamed from: c, reason: collision with root package name */
    private String f42029c;

    /* renamed from: d, reason: collision with root package name */
    private String f42030d;

    /* renamed from: e, reason: collision with root package name */
    private String f42031e;

    /* renamed from: f, reason: collision with root package name */
    private long f42032f;

    /* renamed from: g, reason: collision with root package name */
    private String f42033g;

    /* renamed from: h, reason: collision with root package name */
    private String f42034h;

    /* renamed from: i, reason: collision with root package name */
    private String f42035i;

    /* renamed from: u, reason: collision with root package name */
    private a f42047u;

    /* renamed from: j, reason: collision with root package name */
    private boolean f42036j = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f42037k = true;

    /* renamed from: l, reason: collision with root package name */
    private boolean f42038l = true;

    /* renamed from: m, reason: collision with root package name */
    private boolean f42039m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f42040n = true;

    /* renamed from: o, reason: collision with root package name */
    private Class<?> f42041o = null;

    /* renamed from: p, reason: collision with root package name */
    private boolean f42042p = true;

    /* renamed from: q, reason: collision with root package name */
    private boolean f42043q = true;

    /* renamed from: r, reason: collision with root package name */
    private boolean f42044r = true;

    /* renamed from: s, reason: collision with root package name */
    private boolean f42045s = true;

    /* renamed from: t, reason: collision with root package name */
    private boolean f42046t = false;

    /* renamed from: a, reason: collision with root package name */
    protected int f42027a = 31;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f42028b = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f42048v = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {
        public static final int CRASHTYPE_ANR = 4;
        public static final int CRASHTYPE_BLOCK = 7;
        public static final int CRASHTYPE_COCOS2DX_JS = 5;
        public static final int CRASHTYPE_COCOS2DX_LUA = 6;
        public static final int CRASHTYPE_JAVA_CATCH = 1;
        public static final int CRASHTYPE_JAVA_CRASH = 0;
        public static final int CRASHTYPE_NATIVE = 2;
        public static final int CRASHTYPE_U3D = 3;
        public static final int MAX_USERDATA_KEY_LENGTH = 100;
        public static final int MAX_USERDATA_VALUE_LENGTH = 100000;

        public synchronized Map<String, String> onCrashHandleStart(int i11, String str, String str2, String str3) {
            return null;
        }

        public synchronized byte[] onCrashHandleStart2GetExtraDatas(int i11, String str, String str2, String str3) {
            return null;
        }
    }

    public synchronized String getAppChannel() {
        String str = this.f42030d;
        if (str != null) {
            return str;
        }
        return aa.b().f42202s;
    }

    public synchronized String getAppPackageName() {
        String str = this.f42031e;
        if (str != null) {
            return str;
        }
        return aa.b().f42186c;
    }

    public synchronized long getAppReportDelay() {
        return this.f42032f;
    }

    public synchronized String getAppVersion() {
        String str = this.f42029c;
        if (str != null) {
            return str;
        }
        return aa.b().f42198o;
    }

    public synchronized int getCallBackType() {
        return this.f42027a;
    }

    public synchronized boolean getCloseErrorCallback() {
        return this.f42028b;
    }

    public synchronized a getCrashHandleCallback() {
        return this.f42047u;
    }

    public synchronized String getDeviceID() {
        return this.f42034h;
    }

    public synchronized String getDeviceModel() {
        return this.f42035i;
    }

    public synchronized String getLibBuglySOFilePath() {
        return this.f42033g;
    }

    public synchronized Class<?> getUserInfoActivity() {
        return this.f42041o;
    }

    public synchronized boolean isBuglyLogUpload() {
        return this.f42042p;
    }

    public synchronized boolean isEnableANRCrashMonitor() {
        return this.f42037k;
    }

    public synchronized boolean isEnableCatchAnrTrace() {
        return this.f42038l;
    }

    public synchronized boolean isEnableNativeCrashMonitor() {
        return this.f42036j;
    }

    public boolean isEnableRecordAnrMainStack() {
        return this.f42039m;
    }

    public synchronized boolean isEnableUserInfo() {
        return this.f42040n;
    }

    public boolean isMerged() {
        return this.f42048v;
    }

    public boolean isReplaceOldChannel() {
        return this.f42043q;
    }

    public synchronized boolean isUploadProcess() {
        return this.f42044r;
    }

    public synchronized boolean isUploadSpotCrash() {
        return this.f42045s;
    }

    public synchronized boolean recordUserInfoOnceADay() {
        return this.f42046t;
    }

    public synchronized BuglyStrategy setAppChannel(String str) {
        this.f42030d = str;
        return this;
    }

    public synchronized BuglyStrategy setAppPackageName(String str) {
        this.f42031e = str;
        return this;
    }

    public synchronized BuglyStrategy setAppReportDelay(long j11) {
        this.f42032f = j11;
        return this;
    }

    public synchronized BuglyStrategy setAppVersion(String str) {
        this.f42029c = str;
        return this;
    }

    public synchronized BuglyStrategy setBuglyLogUpload(boolean z11) {
        this.f42042p = z11;
        return this;
    }

    public synchronized void setCallBackType(int i11) {
        this.f42027a = i11;
    }

    public synchronized void setCloseErrorCallback(boolean z11) {
        this.f42028b = z11;
    }

    public synchronized BuglyStrategy setCrashHandleCallback(a aVar) {
        this.f42047u = aVar;
        return this;
    }

    public synchronized BuglyStrategy setDeviceID(String str) {
        this.f42034h = str;
        return this;
    }

    public synchronized BuglyStrategy setDeviceModel(String str) {
        this.f42035i = str;
        return this;
    }

    public synchronized BuglyStrategy setEnableANRCrashMonitor(boolean z11) {
        this.f42037k = z11;
        return this;
    }

    public void setEnableCatchAnrTrace(boolean z11) {
        this.f42038l = z11;
    }

    public synchronized BuglyStrategy setEnableNativeCrashMonitor(boolean z11) {
        this.f42036j = z11;
        return this;
    }

    public void setEnableRecordAnrMainStack(boolean z11) {
        this.f42039m = z11;
    }

    public synchronized BuglyStrategy setEnableUserInfo(boolean z11) {
        this.f42040n = z11;
        return this;
    }

    public synchronized BuglyStrategy setLibBuglySOFilePath(String str) {
        this.f42033g = str;
        return this;
    }

    @Deprecated
    public void setMerged(boolean z11) {
        this.f42048v = z11;
    }

    public synchronized BuglyStrategy setRecordUserInfoOnceADay(boolean z11) {
        this.f42046t = z11;
        return this;
    }

    public void setReplaceOldChannel(boolean z11) {
        this.f42043q = z11;
    }

    public synchronized BuglyStrategy setUploadProcess(boolean z11) {
        this.f42044r = z11;
        return this;
    }

    public synchronized void setUploadSpotCrash(boolean z11) {
        this.f42045s = z11;
    }

    public synchronized BuglyStrategy setUserInfoActivity(Class<?> cls) {
        this.f42041o = cls;
        return this;
    }
}
