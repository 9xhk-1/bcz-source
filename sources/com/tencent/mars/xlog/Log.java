package com.tencent.mars.xlog;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.widget.Toast;
import com.bumptech.glide.load.engine.GlideException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class Log {
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 4;
    public static final int LEVEL_FATAL = 5;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_NONE = 6;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARNING = 3;
    private static final String SYS_INFO;
    private static final String TAG = "mars.xlog.log";
    private static LogImp debugLog = null;
    private static int level = 6;
    private static LogImp logImp;
    private static Map<String, LogInstance> sLogInstanceMap;
    public static Context toastSupportContext;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface LogImp {
        void appenderClose();

        void appenderFlush(long j11, boolean z11);

        void appenderOpen(int i11, int i12, String str, String str2, String str3, int i13);

        int getLogLevel(long j11);

        long getXlogInstance(String str);

        void logD(long j11, String str, String str2, String str3, int i11, int i12, long j12, long j13, String str4);

        void logE(long j11, String str, String str2, String str3, int i11, int i12, long j12, long j13, String str4);

        void logF(long j11, String str, String str2, String str3, int i11, int i12, long j12, long j13, String str4);

        void logI(long j11, String str, String str2, String str3, int i11, int i12, long j12, long j13, String str4);

        void logV(long j11, String str, String str2, String str3, int i11, int i12, long j12, long j13, String str4);

        void logW(long j11, String str, String str2, String str3, int i11, int i12, long j12, long j13, String str4);

        long openLogInstance(int i11, int i12, String str, String str2, String str3, int i13);

        void releaseXlogInstance(String str);

        void setAppenderMode(long j11, int i11);

        void setConsoleLogOpen(long j11, boolean z11);

        void setMaxAliveTime(long j11, long j12);

        void setMaxFileSize(long j11, long j12);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LogInstance {
        private long mLogInstancePtr;
        private String mPrefix;

        public void appenderFlush() {
            if (Log.logImp == null || this.mLogInstancePtr == -1) {
                return;
            }
            Log.logImp.appenderFlush(this.mLogInstancePtr, false);
        }

        public void appenderFlushSync() {
            if (Log.logImp == null || this.mLogInstancePtr == -1) {
                return;
            }
            Log.logImp.appenderFlush(this.mLogInstancePtr, true);
        }

        public void d(String str, String str2, Object... objArr) {
            if (Log.logImp == null || getLogLevel() > 1 || this.mLogInstancePtr == -1) {
                return;
            }
            String format = objArr == null ? str2 : String.format(str2, objArr);
            if (format == null) {
                format = "";
            }
            Log.logImp.logD(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), format);
        }

        public void e(String str, String str2, Object... objArr) {
            if (Log.logImp == null || getLogLevel() > 4 || this.mLogInstancePtr == -1) {
                return;
            }
            String format = objArr == null ? str2 : String.format(str2, objArr);
            if (format == null) {
                format = "";
            }
            Log.logImp.logE(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), format);
        }

        public void f(String str, String str2, Object... objArr) {
            if (Log.logImp == null || getLogLevel() > 5 || this.mLogInstancePtr == -1) {
                return;
            }
            Log.logImp.logF(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), objArr == null ? str2 : String.format(str2, objArr));
        }

        public int getLogLevel() {
            if (Log.logImp == null || this.mLogInstancePtr == -1) {
                return 6;
            }
            return Log.logImp.getLogLevel(this.mLogInstancePtr);
        }

        public void i(String str, String str2, Object... objArr) {
            if (Log.logImp == null || getLogLevel() > 2 || this.mLogInstancePtr == -1) {
                return;
            }
            String format = objArr == null ? str2 : String.format(str2, objArr);
            if (format == null) {
                format = "";
            }
            Log.logImp.logI(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), format);
        }

        public void printErrStackTrace(String str, Throwable th2, String str2, Object... objArr) {
            if (Log.logImp == null || getLogLevel() > 4 || this.mLogInstancePtr == -1) {
                return;
            }
            String format = objArr == null ? str2 : String.format(str2, objArr);
            if (format == null) {
                format = "";
            }
            Log.logImp.logE(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), format + GlideException.a.f28776d + android.util.Log.getStackTraceString(th2));
        }

        public void setConsoleLogOpen(boolean z11) {
            if (Log.logImp == null || this.mLogInstancePtr == -1) {
                return;
            }
            Log.logImp.setConsoleLogOpen(this.mLogInstancePtr, z11);
        }

        public void v(String str, String str2, Object... objArr) {
            if (Log.logImp == null || getLogLevel() > 0 || this.mLogInstancePtr == -1) {
                return;
            }
            String format = objArr == null ? str2 : String.format(str2, objArr);
            if (format == null) {
                format = "";
            }
            Log.logImp.logV(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), format);
        }

        public void w(String str, String str2, Object... objArr) {
            if (Log.logImp == null || getLogLevel() > 3 || this.mLogInstancePtr == -1) {
                return;
            }
            String format = objArr == null ? str2 : String.format(str2, objArr);
            if (format == null) {
                format = "";
            }
            Log.logImp.logW(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), format);
        }

        private LogInstance(int i11, int i12, String str, String str2, String str3, int i13) {
            this.mLogInstancePtr = -1L;
            this.mPrefix = null;
            if (Log.logImp != null) {
                this.mLogInstancePtr = Log.logImp.openLogInstance(i11, i12, str, str2, str3, i13);
                this.mPrefix = str3;
            }
        }
    }

    static {
        LogImp logImp2 = new LogImp() { // from class: com.tencent.mars.xlog.Log.1
            private Handler handler = new Handler(Looper.getMainLooper());

            @Override // com.tencent.mars.xlog.Log.LogImp
            public int getLogLevel(long j11) {
                return Log.level;
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public long getXlogInstance(String str) {
                return 0L;
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logD(long j11, String str, String str2, String str3, int i11, int i12, long j12, long j13, String str4) {
                if (Log.level <= 1) {
                    android.util.Log.d(str, str4);
                }
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logE(long j11, String str, String str2, String str3, int i11, int i12, long j12, long j13, String str4) {
                if (Log.level <= 4) {
                    android.util.Log.e(str, str4);
                }
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logF(long j11, String str, String str2, String str3, int i11, int i12, long j12, long j13, final String str4) {
                if (Log.level > 5) {
                    return;
                }
                android.util.Log.e(str, str4);
                if (Log.toastSupportContext != null) {
                    this.handler.post(new Runnable() { // from class: com.tencent.mars.xlog.Log.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Toast.makeText(Log.toastSupportContext, str4, 1).show();
                        }
                    });
                }
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logI(long j11, String str, String str2, String str3, int i11, int i12, long j12, long j13, String str4) {
                if (Log.level <= 2) {
                    android.util.Log.i(str, str4);
                }
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logV(long j11, String str, String str2, String str3, int i11, int i12, long j12, long j13, String str4) {
                if (Log.level <= 0) {
                    android.util.Log.v(str, str4);
                }
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logW(long j11, String str, String str2, String str3, int i11, int i12, long j12, long j13, String str4) {
                if (Log.level <= 3) {
                    android.util.Log.w(str, str4);
                }
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public long openLogInstance(int i11, int i12, String str, String str2, String str3, int i13) {
                return 0L;
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void appenderClose() {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void releaseXlogInstance(String str) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void appenderFlush(long j11, boolean z11) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void setAppenderMode(long j11, int i11) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void setConsoleLogOpen(long j11, boolean z11) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void setMaxAliveTime(long j11, long j12) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void setMaxFileSize(long j11, long j12) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void appenderOpen(int i11, int i12, String str, String str2, String str3, int i13) {
            }
        };
        debugLog = logImp2;
        logImp = logImp2;
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append("VERSION.RELEASE:[" + Build.VERSION.RELEASE);
            sb2.append("] VERSION.CODENAME:[" + Build.VERSION.CODENAME);
            sb2.append("] VERSION.INCREMENTAL:[" + Build.VERSION.INCREMENTAL);
            sb2.append("] BOARD:[" + Build.BOARD);
            sb2.append("] DEVICE:[" + Build.DEVICE);
            sb2.append("] DISPLAY:[" + Build.DISPLAY);
            sb2.append("] FINGERPRINT:[" + Build.FINGERPRINT);
            sb2.append("] HOST:[" + Build.HOST);
            sb2.append("] MANUFACTURER:[" + Build.MANUFACTURER);
            sb2.append("] MODEL:[" + Build.MODEL);
            sb2.append("] PRODUCT:[" + Build.PRODUCT);
            sb2.append("] TAGS:[" + Build.TAGS);
            sb2.append("] TYPE:[" + Build.TYPE);
            sb2.append("] USER:[" + Build.USER + "]");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        SYS_INFO = sb2.toString();
        sLogInstanceMap = new HashMap();
    }

    public static void appenderClose() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderClose();
            Iterator<Map.Entry<String, LogInstance>> it = sLogInstanceMap.entrySet().iterator();
            while (it.hasNext()) {
                closeLogInstance(it.next().getKey());
            }
        }
    }

    public static void appenderFlush() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderFlush(0L, false);
            Iterator<Map.Entry<String, LogInstance>> it = sLogInstanceMap.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().appenderFlush();
            }
        }
    }

    public static void appenderFlushSync(boolean z11) {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderFlush(0L, z11);
        }
    }

    public static void appenderOpen(int i11, int i12, String str, String str2, String str3, int i13) {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderOpen(i11, i12, str, str2, str3, i13);
        }
    }

    public static void closeLogInstance(String str) {
        synchronized (sLogInstanceMap) {
            try {
                if (logImp != null && sLogInstanceMap.containsKey(str)) {
                    LogInstance remove = sLogInstanceMap.remove(str);
                    logImp.releaseXlogInstance(str);
                    remove.mLogInstancePtr = -1L;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void d(String str, String str2) {
        d(str, str2, null);
    }

    public static void e(String str, String str2) {
        e(str, str2, null);
    }

    public static void f(String str, String str2) {
        f(str, str2, null);
    }

    public static LogImp getImpl() {
        return logImp;
    }

    public static LogInstance getLogInstance(String str) {
        synchronized (sLogInstanceMap) {
            try {
                if (!sLogInstanceMap.containsKey(str)) {
                    return null;
                }
                return sLogInstanceMap.get(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static int getLogLevel() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            return logImp2.getLogLevel(0L);
        }
        return 6;
    }

    public static String getSysInfo() {
        return SYS_INFO;
    }

    public static void i(String str, String str2) {
        i(str, str2, null);
    }

    public static LogInstance openLogInstance(int i11, int i12, String str, String str2, String str3, int i13) {
        synchronized (sLogInstanceMap) {
            try {
                if (sLogInstanceMap.containsKey(str3)) {
                    return sLogInstanceMap.get(str3);
                }
                LogInstance logInstance = new LogInstance(i11, i12, str, str2, str3, i13);
                sLogInstanceMap.put(str3, logInstance);
                return logInstance;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void printErrStackTrace(String str, Throwable th2, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 == null || logImp2.getLogLevel(0L) > 4) {
            return;
        }
        String format = objArr == null ? str2 : String.format(str2, objArr);
        if (format == null) {
            format = "";
        }
        logImp.logE(0L, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), format + GlideException.a.f28776d + android.util.Log.getStackTraceString(th2));
    }

    public static void setConsoleLogOpen(boolean z11) {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.setConsoleLogOpen(0L, z11);
        }
    }

    public static void setLevel(int i11, boolean z11) {
        level = i11;
        android.util.Log.w(TAG, "new log level: " + i11);
        if (z11) {
            android.util.Log.e(TAG, "no jni log level support");
        }
    }

    public static void setLogImp(LogImp logImp2) {
        logImp = logImp2;
    }

    public static void v(String str, String str2) {
        v(str, str2, null);
    }

    public static void w(String str, String str2) {
        w(str, str2, null);
    }

    public static void d(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 == null || logImp2.getLogLevel(0L) > 1) {
            return;
        }
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        logImp.logD(0L, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
    }

    public static void e(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 == null || logImp2.getLogLevel(0L) > 4) {
            return;
        }
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        logImp.logE(0L, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
    }

    public static void f(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 == null || logImp2.getLogLevel(0L) > 5) {
            return;
        }
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        logImp.logF(0L, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
    }

    public static void i(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 == null || logImp2.getLogLevel(0L) > 2) {
            return;
        }
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        logImp.logI(0L, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
    }

    public static void v(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 == null || logImp2.getLogLevel(0L) > 0) {
            return;
        }
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        logImp.logV(0L, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
    }

    public static void w(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 == null || logImp2.getLogLevel(0L) > 3) {
            return;
        }
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        logImp.logW(0L, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
    }
}
