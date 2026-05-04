package com.mob.tools.utils;

import android.os.SystemClock;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/* loaded from: classes7.dex */
public class FileLocker implements PublicMemberKeeper {

    /* renamed from: a, reason: collision with root package name */
    private FileOutputStream f41386a;

    /* renamed from: b, reason: collision with root package name */
    private FileLock f41387b;

    private boolean a(boolean z11) throws Throwable {
        if (z11) {
            this.f41387b = this.f41386a.getChannel().lock();
        } else {
            this.f41387b = this.f41386a.getChannel().tryLock();
        }
        return this.f41387b != null;
    }

    public synchronized boolean lock(boolean z11) {
        return lock(z11, z11 ? 1000L : 500L, 16L);
    }

    public synchronized void release() {
        if (this.f41386a == null) {
            return;
        }
        unlock();
        try {
            this.f41386a.close();
        } catch (Throwable unused) {
        }
        this.f41386a = null;
    }

    public synchronized void setLockFile(String str) {
        try {
            this.f41386a = new FileOutputStream(str);
        } catch (Throwable unused) {
            FileOutputStream fileOutputStream = this.f41386a;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused2) {
                }
                this.f41386a = null;
            }
        }
    }

    public synchronized void unlock() {
        FileLock fileLock = this.f41387b;
        if (fileLock == null) {
            return;
        }
        try {
            fileLock.release();
        } catch (Throwable unused) {
        }
        this.f41387b = null;
    }

    public synchronized boolean lock(boolean z11, long j11, long j12) {
        boolean z12;
        try {
            if (this.f41386a == null) {
                return false;
            }
            try {
                return a(z11);
            } catch (Throwable th2) {
                if (j11 <= 0 || !(th2 instanceof OverlappingFileLockException)) {
                    MobLog.getInstance().w(th2);
                } else {
                    long elapsedRealtime = SystemClock.elapsedRealtime() + j11;
                    while (true) {
                        if (j11 <= 0) {
                            z12 = false;
                            break;
                        }
                        try {
                            Thread.sleep(j12);
                        } catch (Throwable unused) {
                        }
                        try {
                            j11 = elapsedRealtime - SystemClock.elapsedRealtime();
                            z12 = a(z11);
                            break;
                        } catch (Throwable th3) {
                            if (!(th3 instanceof OverlappingFileLockException)) {
                                MobLog.getInstance().w(th2);
                                j11 = -1;
                            } else if (j11 <= 0) {
                                MobLog.getInstance().w("OverlappingFileLockException and timeout");
                            }
                        }
                    }
                    if (j11 > 0) {
                        return z12;
                    }
                }
                FileLock fileLock = this.f41387b;
                if (fileLock != null) {
                    try {
                        fileLock.release();
                    } catch (Throwable unused2) {
                    }
                    this.f41387b = null;
                }
                FileOutputStream fileOutputStream = this.f41386a;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                    this.f41386a = null;
                }
                return false;
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public synchronized void lock(Runnable runnable, boolean z11) {
        if (lock(z11) && runnable != null) {
            runnable.run();
        }
    }
}
