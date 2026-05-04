package com.squareup.picasso;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import androidx.media3.datasource.cache.CacheDataSink;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import okio.ByteString;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class h0 {
    public static final String A = "completed";
    public static final String B = "errored";
    public static final String C = "paused";
    public static final String D = "resumed";

    /* renamed from: a, reason: collision with root package name */
    public static final String f41859a = "Picasso-";

    /* renamed from: b, reason: collision with root package name */
    public static final String f41860b = "Picasso-Idle";

    /* renamed from: c, reason: collision with root package name */
    public static final String f41861c = "picasso-cache";

    /* renamed from: d, reason: collision with root package name */
    public static final int f41862d = 50;

    /* renamed from: e, reason: collision with root package name */
    public static final int f41863e = 5242880;

    /* renamed from: f, reason: collision with root package name */
    public static final int f41864f = 52428800;

    /* renamed from: g, reason: collision with root package name */
    public static final int f41865g = 1000;

    /* renamed from: h, reason: collision with root package name */
    public static final char f41866h = '\n';

    /* renamed from: j, reason: collision with root package name */
    public static final String f41868j = "Main";

    /* renamed from: k, reason: collision with root package name */
    public static final String f41869k = "Dispatcher";

    /* renamed from: l, reason: collision with root package name */
    public static final String f41870l = "Hunter";

    /* renamed from: m, reason: collision with root package name */
    public static final String f41871m = "created";

    /* renamed from: n, reason: collision with root package name */
    public static final String f41872n = "changed";

    /* renamed from: o, reason: collision with root package name */
    public static final String f41873o = "ignored";

    /* renamed from: p, reason: collision with root package name */
    public static final String f41874p = "enqueued";

    /* renamed from: q, reason: collision with root package name */
    public static final String f41875q = "canceled";

    /* renamed from: r, reason: collision with root package name */
    public static final String f41876r = "batched";

    /* renamed from: s, reason: collision with root package name */
    public static final String f41877s = "retrying";

    /* renamed from: t, reason: collision with root package name */
    public static final String f41878t = "executing";

    /* renamed from: u, reason: collision with root package name */
    public static final String f41879u = "decoded";

    /* renamed from: v, reason: collision with root package name */
    public static final String f41880v = "transformed";

    /* renamed from: w, reason: collision with root package name */
    public static final String f41881w = "joined";

    /* renamed from: x, reason: collision with root package name */
    public static final String f41882x = "removed";

    /* renamed from: y, reason: collision with root package name */
    public static final String f41883y = "delivered";

    /* renamed from: z, reason: collision with root package name */
    public static final String f41884z = "replaying";

    /* renamed from: i, reason: collision with root package name */
    public static final StringBuilder f41867i = new StringBuilder();
    public static final ByteString E = ByteString.encodeUtf8("RIFF");
    public static final ByteString F = ByteString.encodeUtf8("WEBP");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends Thread {
        public b(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new b(runnable);
        }
    }

    @TargetApi(18)
    public static long a(File file) {
        long j11;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j11 = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j11 = 5242880;
        }
        return Math.max(Math.min(j11, py.b.f81303b), CacheDataSink.DEFAULT_FRAGMENT_SIZE);
    }

    public static int b(Context context) {
        ActivityManager activityManager = (ActivityManager) o(context, "activity");
        return (int) ((((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * 1048576) / 7);
    }

    public static void c() {
        if (!r()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    public static void d() {
        if (r()) {
            throw new IllegalStateException("Method call should not happen from the main thread.");
        }
    }

    public static <T> T e(T t11, String str) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(str);
    }

    public static File f(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), f41861c);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static String g(y yVar) {
        StringBuilder sb2 = f41867i;
        String h11 = h(yVar, sb2);
        sb2.setLength(0);
        return h11;
    }

    public static String h(y yVar, StringBuilder sb2) {
        String str = yVar.f41980f;
        if (str != null) {
            sb2.ensureCapacity(str.length() + 50);
            sb2.append(yVar.f41980f);
        } else {
            Uri uri = yVar.f41978d;
            if (uri != null) {
                String uri2 = uri.toString();
                sb2.ensureCapacity(uri2.length() + 50);
                sb2.append(uri2);
            } else {
                sb2.ensureCapacity(50);
                sb2.append(yVar.f41979e);
            }
        }
        sb2.append('\n');
        if (yVar.f41988n != 0.0f) {
            sb2.append("rotation:");
            sb2.append(yVar.f41988n);
            if (yVar.f41991q) {
                sb2.append('@');
                sb2.append(yVar.f41989o);
                sb2.append('x');
                sb2.append(yVar.f41990p);
            }
            sb2.append('\n');
        }
        if (yVar.d()) {
            sb2.append("resize:");
            sb2.append(yVar.f41982h);
            sb2.append('x');
            sb2.append(yVar.f41983i);
            sb2.append('\n');
        }
        if (yVar.f41984j) {
            sb2.append("centerCrop:");
            sb2.append(yVar.f41985k);
            sb2.append('\n');
        } else if (yVar.f41986l) {
            sb2.append("centerInside");
            sb2.append('\n');
        }
        List<g0> list = yVar.f41981g;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                sb2.append(yVar.f41981g.get(i11).key());
                sb2.append('\n');
            }
        }
        return sb2.toString();
    }

    public static void i(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
    }

    public static int j(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    public static String k(com.squareup.picasso.c cVar) {
        return l(cVar, "");
    }

    public static String l(com.squareup.picasso.c cVar, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        com.squareup.picasso.a h11 = cVar.h();
        if (h11 != null) {
            sb2.append(h11.f41758b.e());
        }
        List<com.squareup.picasso.a> i11 = cVar.i();
        if (i11 != null) {
            int size = i11.size();
            for (int i12 = 0; i12 < size; i12++) {
                if (i12 > 0 || h11 != null) {
                    sb2.append(j2.O);
                }
                sb2.append(i11.get(i12).f41758b.e());
            }
        }
        return sb2.toString();
    }

    public static int m(Resources resources, y yVar) throws FileNotFoundException {
        Uri uri;
        int i11 = yVar.f41979e;
        if (i11 != 0 || (uri = yVar.f41978d) == null) {
            return i11;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + yVar.f41978d);
        }
        List<String> pathSegments = yVar.f41978d.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            throw new FileNotFoundException("No path segments: " + yVar.f41978d);
        }
        if (pathSegments.size() == 1) {
            try {
                return Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new FileNotFoundException("Last path segment is not a resource ID: " + yVar.f41978d);
            }
        }
        if (pathSegments.size() == 2) {
            return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        }
        throw new FileNotFoundException("More than two path segments: " + yVar.f41978d);
    }

    public static Resources n(Context context, y yVar) throws FileNotFoundException {
        Uri uri;
        if (yVar.f41979e != 0 || (uri = yVar.f41978d) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + yVar.f41978d);
        }
        try {
            return context.getPackageManager().getResourcesForApplication(authority);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new FileNotFoundException("Unable to obtain resources for package: " + yVar.f41978d);
        }
    }

    public static <T> T o(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    public static boolean p(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static boolean q(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    public static boolean r() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean s(l60.m mVar) throws IOException {
        return mVar.J0(0L, E) && mVar.J0(8L, F);
    }

    public static void t(String str, String str2, String str3) {
        u(str, str2, str3, "");
    }

    public static void u(String str, String str2, String str3, String str4) {
        Log.d(Picasso.f41723p, String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }
}
