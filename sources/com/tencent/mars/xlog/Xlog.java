package com.tencent.mars.xlog;

import com.tencent.mars.xlog.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class Xlog implements Log.LogImp {
    public static final int AppednerModeAsync = 0;
    public static final int AppednerModeSync = 1;
    public static final int COMPRESS_LEVEL1 = 1;
    public static final int COMPRESS_LEVEL2 = 2;
    public static final int COMPRESS_LEVEL3 = 3;
    public static final int COMPRESS_LEVEL4 = 4;
    public static final int COMPRESS_LEVEL5 = 5;
    public static final int COMPRESS_LEVEL6 = 6;
    public static final int COMPRESS_LEVEL7 = 7;
    public static final int COMPRESS_LEVEL8 = 8;
    public static final int COMPRESS_LEVEL9 = 9;
    public static final int LEVEL_ALL = 0;
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 4;
    public static final int LEVEL_FATAL = 5;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_NONE = 6;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARNING = 3;
    public static final int ZLIB_MODE = 0;
    public static final int ZSTD_MODE = 1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class XLogConfig {
        public String cachedir;
        public String logdir;
        public String nameprefix;
        public int level = 2;
        public int mode = 0;
        public String pubkey = "";
        public int compressmode = 0;
        public int compresslevel = 0;
        public int cachedays = 0;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class XLoggerInfo {
        public String filename;
        public String funcname;
        public int level;
        public int line;
        public long maintid;
        public long pid;
        public String tag;
        public long tid;
    }

    private static native void appenderOpen(XLogConfig xLogConfig);

    public static native void logWrite(XLoggerInfo xLoggerInfo, String str);

    public static void logWrite2(int i11, String str, String str2, String str3, int i12, int i13, long j11, long j12, String str4) {
        logWrite2(0L, i11, str, str2, str3, i12, i13, j11, j12, str4);
    }

    public static native void logWrite2(long j11, int i11, String str, String str2, String str3, int i12, int i13, long j12, long j13, String str4);

    public static void open(boolean z11, int i11, int i12, String str, String str2, String str3, String str4) {
        if (z11) {
            System.loadLibrary("c++_shared");
            System.loadLibrary("marsxlog");
        }
        XLogConfig xLogConfig = new XLogConfig();
        xLogConfig.level = i11;
        xLogConfig.mode = i12;
        xLogConfig.logdir = str2;
        xLogConfig.nameprefix = str3;
        xLogConfig.pubkey = str4;
        xLogConfig.compressmode = 0;
        xLogConfig.compresslevel = 0;
        xLogConfig.cachedir = str;
        xLogConfig.cachedays = 0;
        appenderOpen(xLogConfig);
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void appenderClose();

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void appenderFlush(long j11, boolean z11);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void appenderOpen(int i11, int i12, String str, String str2, String str3, int i13) {
        XLogConfig xLogConfig = new XLogConfig();
        xLogConfig.level = i11;
        xLogConfig.mode = i12;
        xLogConfig.logdir = str2;
        xLogConfig.nameprefix = str3;
        xLogConfig.compressmode = 0;
        xLogConfig.pubkey = "";
        xLogConfig.cachedir = str;
        xLogConfig.cachedays = i13;
        appenderOpen(xLogConfig);
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native int getLogLevel(long j11);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native long getXlogInstance(String str);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logD(long j11, String str, String str2, String str3, int i11, int i12, long j12, long j13, String str4) {
        logWrite2(j11, 1, decryptTag(str), str2, str3, i11, i12, j12, j13, str4);
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logE(long j11, String str, String str2, String str3, int i11, int i12, long j12, long j13, String str4) {
        logWrite2(j11, 4, decryptTag(str), str2, str3, i11, i12, j12, j13, str4);
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logF(long j11, String str, String str2, String str3, int i11, int i12, long j12, long j13, String str4) {
        logWrite2(j11, 5, decryptTag(str), str2, str3, i11, i12, j12, j13, str4);
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logI(long j11, String str, String str2, String str3, int i11, int i12, long j12, long j13, String str4) {
        logWrite2(j11, 2, decryptTag(str), str2, str3, i11, i12, j12, j13, str4);
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logV(long j11, String str, String str2, String str3, int i11, int i12, long j12, long j13, String str4) {
        logWrite2(j11, 0, decryptTag(str), str2, str3, i11, i12, j12, j13, str4);
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logW(long j11, String str, String str2, String str3, int i11, int i12, long j12, long j13, String str4) {
        logWrite2(j11, 3, decryptTag(str), str2, str3, i11, i12, j12, j13, str4);
    }

    public native long newXlogInstance(XLogConfig xLogConfig);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public long openLogInstance(int i11, int i12, String str, String str2, String str3, int i13) {
        XLogConfig xLogConfig = new XLogConfig();
        xLogConfig.level = i11;
        xLogConfig.mode = i12;
        xLogConfig.logdir = str2;
        xLogConfig.nameprefix = str3;
        xLogConfig.compressmode = 0;
        xLogConfig.pubkey = "";
        xLogConfig.cachedir = str;
        xLogConfig.cachedays = i13;
        return newXlogInstance(xLogConfig);
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void releaseXlogInstance(String str);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void setAppenderMode(long j11, int i11);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void setConsoleLogOpen(long j11, boolean z11);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void setMaxAliveTime(long j11, long j12);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void setMaxFileSize(long j11, long j12);

    private static String decryptTag(String str) {
        return str;
    }
}
