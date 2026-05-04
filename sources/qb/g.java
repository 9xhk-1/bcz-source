package qb;

import com.tencent.mars.xlog.Xlog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class g extends Xlog {
    @Override // com.tencent.mars.xlog.Xlog, com.tencent.mars.xlog.Log.LogImp
    public void logD(long logInstancePtr, String tag, String filename, String funcname, int line, int pid, long tid, long maintid, String log) {
        String str;
        String str2;
        int i11;
        StackTraceElement[] stackTrace;
        try {
            stackTrace = Thread.currentThread().getStackTrace();
            str = stackTrace[6].getFileName();
        } catch (Exception unused) {
            str = filename;
        }
        try {
            str2 = stackTrace[6].getMethodName();
        } catch (Exception unused2) {
            str2 = funcname;
            i11 = line;
            super.logD(logInstancePtr, tag, str, str2, i11, pid, tid, maintid, log);
        }
        try {
            i11 = stackTrace[6].getLineNumber();
        } catch (Exception unused3) {
            i11 = line;
            super.logD(logInstancePtr, tag, str, str2, i11, pid, tid, maintid, log);
        }
        super.logD(logInstancePtr, tag, str, str2, i11, pid, tid, maintid, log);
    }

    @Override // com.tencent.mars.xlog.Xlog, com.tencent.mars.xlog.Log.LogImp
    public void logE(long logInstancePtr, String tag, String filename, String funcname, int line, int pid, long tid, long maintid, String log) {
        String str;
        String str2;
        int i11;
        StackTraceElement[] stackTrace;
        try {
            stackTrace = Thread.currentThread().getStackTrace();
            str = stackTrace[6].getFileName();
        } catch (Exception unused) {
            str = filename;
        }
        try {
            str2 = stackTrace[6].getMethodName();
        } catch (Exception unused2) {
            str2 = funcname;
            i11 = line;
            super.logE(logInstancePtr, tag, str, str2, i11, pid, tid, maintid, log);
        }
        try {
            i11 = stackTrace[6].getLineNumber();
        } catch (Exception unused3) {
            i11 = line;
            super.logE(logInstancePtr, tag, str, str2, i11, pid, tid, maintid, log);
        }
        super.logE(logInstancePtr, tag, str, str2, i11, pid, tid, maintid, log);
    }

    @Override // com.tencent.mars.xlog.Xlog, com.tencent.mars.xlog.Log.LogImp
    public void logF(long logInstancePtr, String tag, String filename, String funcname, int line, int pid, long tid, long maintid, String log) {
        String str;
        String str2;
        int i11;
        StackTraceElement[] stackTrace;
        try {
            stackTrace = Thread.currentThread().getStackTrace();
            str = stackTrace[6].getFileName();
        } catch (Exception unused) {
            str = filename;
        }
        try {
            str2 = stackTrace[6].getMethodName();
        } catch (Exception unused2) {
            str2 = funcname;
            i11 = line;
            super.logF(logInstancePtr, tag, str, str2, i11, pid, tid, maintid, log);
        }
        try {
            i11 = stackTrace[6].getLineNumber();
        } catch (Exception unused3) {
            i11 = line;
            super.logF(logInstancePtr, tag, str, str2, i11, pid, tid, maintid, log);
        }
        super.logF(logInstancePtr, tag, str, str2, i11, pid, tid, maintid, log);
    }

    @Override // com.tencent.mars.xlog.Xlog, com.tencent.mars.xlog.Log.LogImp
    public void logI(long logInstancePtr, String tag, String filename, String funcname, int line, int pid, long tid, long maintid, String log) {
        String str;
        String str2;
        int i11;
        StackTraceElement[] stackTrace;
        try {
            stackTrace = Thread.currentThread().getStackTrace();
            str = stackTrace[6].getFileName();
        } catch (Exception unused) {
            str = filename;
        }
        try {
            str2 = stackTrace[6].getMethodName();
        } catch (Exception unused2) {
            str2 = funcname;
            i11 = line;
            super.logI(logInstancePtr, tag, str, str2, i11, pid, tid, maintid, log);
        }
        try {
            i11 = stackTrace[6].getLineNumber();
        } catch (Exception unused3) {
            i11 = line;
            super.logI(logInstancePtr, tag, str, str2, i11, pid, tid, maintid, log);
        }
        super.logI(logInstancePtr, tag, str, str2, i11, pid, tid, maintid, log);
    }

    @Override // com.tencent.mars.xlog.Xlog, com.tencent.mars.xlog.Log.LogImp
    public void logV(long logInstancePtr, String tag, String filename, String funcname, int line, int pid, long tid, long maintid, String log) {
        String str;
        String str2;
        int i11;
        StackTraceElement[] stackTrace;
        try {
            stackTrace = Thread.currentThread().getStackTrace();
            str = stackTrace[6].getFileName();
        } catch (Exception unused) {
            str = filename;
        }
        try {
            str2 = stackTrace[6].getMethodName();
        } catch (Exception unused2) {
            str2 = funcname;
            i11 = line;
            super.logV(logInstancePtr, tag, str, str2, i11, pid, tid, maintid, log);
        }
        try {
            i11 = stackTrace[6].getLineNumber();
        } catch (Exception unused3) {
            i11 = line;
            super.logV(logInstancePtr, tag, str, str2, i11, pid, tid, maintid, log);
        }
        super.logV(logInstancePtr, tag, str, str2, i11, pid, tid, maintid, log);
    }

    @Override // com.tencent.mars.xlog.Xlog, com.tencent.mars.xlog.Log.LogImp
    public void logW(long logInstancePtr, String tag, String filename, String funcname, int line, int pid, long tid, long maintid, String log) {
        String str;
        String str2;
        int i11;
        StackTraceElement[] stackTrace;
        try {
            stackTrace = Thread.currentThread().getStackTrace();
            str = stackTrace[6].getFileName();
        } catch (Exception unused) {
            str = filename;
        }
        try {
            str2 = stackTrace[6].getMethodName();
        } catch (Exception unused2) {
            str2 = funcname;
            i11 = line;
            super.logW(logInstancePtr, tag, str, str2, i11, pid, tid, maintid, log);
        }
        try {
            i11 = stackTrace[6].getLineNumber();
        } catch (Exception unused3) {
            i11 = line;
            super.logW(logInstancePtr, tag, str, str2, i11, pid, tid, maintid, log);
        }
        super.logW(logInstancePtr, tag, str, str2, i11, pid, tid, maintid, log);
    }
}
