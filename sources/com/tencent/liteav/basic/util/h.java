package com.tencent.liteav.basic.util;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Debug;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.WindowManager;
import androidx.media3.common.MimeTypes;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.a;
import com.tencent.rtmp.TXLiveConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static long f43451a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f43452b = true;

    /* renamed from: c, reason: collision with root package name */
    private static String f43453c = "";

    /* renamed from: d, reason: collision with root package name */
    private static int f43454d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static long f43455e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f43456f = false;

    /* renamed from: g, reason: collision with root package name */
    private static a<b> f43457g = new a<>(new a.InterfaceC0512a<b>() { // from class: com.tencent.liteav.basic.util.h.1
        @Override // com.tencent.liteav.basic.util.a.InterfaceC0512a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b();
        }
    });

    /* renamed from: h, reason: collision with root package name */
    private static final Object f43458h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static boolean f43459i = false;

    /* renamed from: j, reason: collision with root package name */
    private static int[] f43460j = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    public static String c(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static int d(Context context) {
        NetworkInfo networkInfo;
        int i11 = 0;
        if (context == null) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e11) {
            TXCLog.e("TXCSystemUtil", "getNetworkType: error occurred.", e11);
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return 0;
        }
        if (networkInfo.getType() == 9) {
            return 5;
        }
        if (networkInfo.getType() == 1) {
            return 1;
        }
        if (networkInfo.getType() == 0) {
            i11 = 2;
            try {
                switch (telephonyManager.getNetworkType()) {
                }
            } catch (Exception e12) {
                TXCLog.e("TXCSystemUtil", "getNetworkType: error occurred.", e12);
            }
            return 0;
        }
        return i11;
    }

    public static String e(Context context) {
        return TXCDRApi.getDevUUID(context, TXCDRApi.getSimulateIDFA(context));
    }

    public static int f(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int b() {
        if (f43456f || (f43455e != 0 && TXCTimeUtil.getTimeTick() - f43455e < 15000)) {
            return f43454d;
        }
        f43456f = true;
        try {
            AsyncTask.execute(new Runnable() { // from class: com.tencent.liteav.basic.util.h.2
                @Override // java.lang.Runnable
                public void run() {
                    System.currentTimeMillis();
                    boolean unused = h.f43456f = false;
                    try {
                        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                        Debug.getMemoryInfo(memoryInfo);
                        int totalPss = memoryInfo.getTotalPss();
                        long unused2 = h.f43455e = TXCTimeUtil.getTimeTick();
                        int unused3 = h.f43454d = totalPss / 1024;
                    } catch (Exception unused4) {
                    }
                }
            });
        } catch (Throwable th2) {
            TXCLog.e("TXCSystemUtil", "getAppMemory error : " + th2);
        }
        return f43454d;
    }

    public static String e() {
        return f43453c;
    }

    public static int[] a() {
        if (f43452b) {
            f43452b = false;
            f43457g.a().a();
            return new int[]{0, 0};
        }
        return f43457g.a().a();
    }

    public static String c() {
        return UUID.randomUUID().toString();
    }

    public static boolean a(Context context) {
        ActivityManager activityManager;
        ComponentName componentName;
        ComponentName componentName2;
        if (context == null) {
            return false;
        }
        try {
            activityManager = (ActivityManager) context.getSystemService("activity");
        } catch (Exception unused) {
        }
        if (activityManager.getRunningTasks(1) == null) {
            TXCLog.e("TXCSystemUtil", "running task is null, ams is abnormal!!!");
            return false;
        }
        ActivityManager.RunningTaskInfo runningTaskInfo = activityManager.getRunningTasks(1).get(0);
        if (runningTaskInfo != null) {
            componentName = runningTaskInfo.topActivity;
            if (componentName != null) {
                componentName2 = runningTaskInfo.topActivity;
                return !componentName2.getPackageName().equals(context.getPackageName());
            }
        }
        TXCLog.e("TXCSystemUtil", "failed to get RunningTaskInfo");
        return false;
    }

    public static String b(Context context) {
        return TXCDRApi.getSimulateIDFA(context);
    }

    private static boolean b(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Log.w("Native-LiteAV", "load library " + str2 + " from path " + str);
            System.load(str + "/lib" + str2 + ".so");
            return true;
        } catch (Error e11) {
            Log.w("Native-LiteAV", "load library : " + e11.toString());
            return false;
        } catch (Exception e12) {
            Log.w("Native-LiteAV", "load library : " + e12.toString());
            return false;
        }
    }

    public static boolean d() {
        boolean z11;
        synchronized (f43458h) {
            try {
                if (!f43459i) {
                    Log.w("Native-LiteAV", "load library txffmpeg " + a("txffmpeg"));
                    Log.w("Native-LiteAV", "load library soundtouch " + a("soundtouch"));
                    Log.w("Native-LiteAV", "load library traeimp-rtmp " + a("traeimp-rtmp"));
                    f43459i = a("liteavsdk");
                    Log.w("Native-LiteAV", "load library liteavsdk " + f43459i);
                }
                z11 = f43459i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public static void b(String str) {
        Log.w("Native-LiteAV", "setLibraryPath " + str);
        f43453c = str;
    }

    public static void a(WeakReference<com.tencent.liteav.basic.b.b> weakReference, String str, int i11, String str2, long j11) {
        Bundle bundle = new Bundle();
        bundle.putString("EVT_USERID", str);
        bundle.putInt("EVT_ID", i11);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
        bundle.putLong(TXLiveConstants.EVT_BLOCK_DURATION, j11);
        if (str2 != null) {
            bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str2);
        }
        a(weakReference, i11, bundle);
    }

    public static void a(WeakReference<com.tencent.liteav.basic.b.b> weakReference, int i11, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("EVT_ID", i11);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
        if (str != null) {
            bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str);
        }
        a(weakReference, i11, bundle);
    }

    public static void a(WeakReference<com.tencent.liteav.basic.b.b> weakReference, int i11, Bundle bundle) {
        com.tencent.liteav.basic.b.b bVar;
        if (weakReference == null || (bVar = weakReference.get()) == null) {
            return;
        }
        bVar.onNotifyEvent(i11, bundle);
    }

    public static void a(WeakReference<com.tencent.liteav.basic.b.b> weakReference, String str, int i11, Bundle bundle) {
        com.tencent.liteav.basic.b.b bVar;
        if (weakReference == null || (bVar = weakReference.get()) == null) {
            return;
        }
        bundle.putString("EVT_USERID", str);
        bVar.onNotifyEvent(i11, bundle);
    }

    public static boolean a(String str) {
        try {
            Log.w("Native-LiteAV", "load library " + str + " from system path ");
            System.loadLibrary(str);
            return true;
        } catch (Error e11) {
            Log.w("Native-LiteAV", "load library : " + e11.toString());
            return b(f43453c, str);
        } catch (Exception e12) {
            Log.w("Native-LiteAV", "load library : " + e12.toString());
            return b(f43453c, str);
        }
    }

    public static int a(int i11) {
        int[] iArr;
        int i12 = 0;
        while (true) {
            iArr = f43460j;
            if (i12 >= iArr.length || iArr[i12] == i11) {
                break;
            }
            i12++;
        }
        if (i12 >= iArr.length) {
            return -1;
        }
        return i12;
    }

    @TargetApi(16)
    public static MediaFormat a(int i11, int i12, int i13) {
        int a11 = a(i11);
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.put(0, (byte) ((i13 << 3) | (a11 >> 1)));
        allocate.put(1, (byte) (((a11 & 1) << 7) | (i12 << 3)));
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(MimeTypes.AUDIO_AAC, i11, i12);
        createAudioFormat.setInteger("channel-count", i12);
        createAudioFormat.setInteger("sample-rate", i11);
        createAudioFormat.setByteBuffer("csd-0", allocate);
        return createAudioFormat;
    }

    public static boolean a(String str, String str2) {
        MediaMetadataRetriever mediaMetadataRetriever;
        Bitmap frameAtTime;
        FileOutputStream fileOutputStream;
        if (str == null || str2 == null) {
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            if (!new File(str).exists()) {
                return false;
            }
            mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    mediaMetadataRetriever.setDataSource(str);
                    frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                    File file = new File(str2);
                    if (file.exists()) {
                        file.delete();
                    }
                    File parentFile = file.getParentFile();
                    if (parentFile != null && !parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    fileOutputStream = new FileOutputStream(file);
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                frameAtTime.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                try {
                    fileOutputStream.close();
                } catch (IOException unused) {
                }
                mediaMetadataRetriever.release();
                return true;
            } catch (Exception e12) {
                e = e12;
                fileOutputStream2 = fileOutputStream;
                TXCLog.e("TXCSystemUtil", "get video thumb failed.", e);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused3) {
                    }
                }
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    throw th;
                }
                throw th;
            }
        } catch (Exception e13) {
            e = e13;
            mediaMetadataRetriever = null;
        } catch (Throwable th4) {
            th = th4;
            mediaMetadataRetriever = null;
        }
    }
}
