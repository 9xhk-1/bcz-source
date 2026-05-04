package qb;

import android.util.SparseIntArray;
import com.tencent.mars.xlog.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class f implements b {

    /* renamed from: b, reason: collision with root package name */
    public static SparseIntArray f82036b;

    /* renamed from: a, reason: collision with root package name */
    public volatile int f82037a = 3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f82036b = sparseIntArray;
        sparseIntArray.put(2, 0);
        f82036b.put(3, 1);
        f82036b.put(4, 2);
        f82036b.put(5, 3);
        f82036b.put(6, 4);
        System.loadLibrary("c++_shared");
        System.loadLibrary("marsxlog");
    }

    @Override // qb.b
    public void a(String tag, String fmt, Object... args) {
        Log.i(tag, fmt, args);
    }

    @Override // qb.b
    public void b(int androidLogLevel) {
        this.f82037a = androidLogLevel;
        Log.setLevel(f82036b.get(this.f82037a, 1), true);
    }

    @Override // qb.b
    public void c(String logPath, String cachePath, String logName) {
        Log.setLogImp(new g());
        Log.setConsoleLogOpen(true);
        Log.appenderOpen(0, 0, cachePath, logPath, logName, 15);
    }

    @Override // qb.b
    public void d(String tag, String fmt, Object... args) {
        Log.d(tag, fmt, args);
    }

    @Override // qb.b
    public void e(String tag, String fmt, Object... args) {
        Log.e(tag, fmt, args);
    }

    @Override // qb.b
    public void f(String tag, String fmt, Object... args) {
        Log.w(tag, fmt, args);
    }

    @Override // qb.b
    public void flush() {
        Log.appenderFlushSync(true);
    }

    @Override // qb.b
    public void g(String tag, String fmt, Object... args) {
        Log.v(tag, fmt, args);
    }
}
