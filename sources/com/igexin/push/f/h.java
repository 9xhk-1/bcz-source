package com.igexin.push.f;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.location.Location;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.os.SystemClock;
import android.util.ArrayMap;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.getui.gtc.base.crypt.SecureCryptTools;
import com.getui.gtc.base.http.Call;
import com.getui.gtc.base.http.Response;
import com.getui.gtc.base.util.CommonUtil;
import com.getui.gtc.base.util.io.IOUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.igexin.push.config.SDKUrlConfig;
import com.igexin.push.core.ServiceManager;
import com.igexin.push.core.b.u;
import com.igexin.push.core.d.d.AnonymousClass3;
import com.igexin.push.core.d.d.AnonymousClass4;
import com.igexin.push.g.n;
import com.igexin.push.g.o;
import com.igexin.push.g.q;
import com.igexin.sdk.router.TransferGtcProcess;
import com.squareup.picasso.h0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f38595a = "com.sdk.plus.EnhActivity";

    /* renamed from: b, reason: collision with root package name */
    public static final int f38596b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f38597c = 0;

    /* renamed from: d, reason: collision with root package name */
    static final AtomicReference<ScheduledFuture<?>> f38598d = new AtomicReference<>();

    /* renamed from: e, reason: collision with root package name */
    private static final String f38599e = "Type145Task";

    /* renamed from: com.igexin.push.f.h$2, reason: invalid class name */
    public static class AnonymousClass2 implements Call.Callback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicInteger f38611a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38612b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ byte[] f38613c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f38614d;

        public AnonymousClass2(AtomicInteger atomicInteger, String str, byte[] bArr, int i11) {
            this.f38611a = atomicInteger;
            this.f38612b = str;
            this.f38613c = bArr;
            this.f38614d = i11;
        }

        @Override // com.getui.gtc.base.http.Call.Callback
        public final void onFailure(Call call, Exception exc) {
            com.igexin.c.a.c.a.a(exc);
            if (!"network is not available".equals(exc.getMessage()) && this.f38611a.incrementAndGet() < 3) {
                com.igexin.push.f.a.c.a(this.f38612b, this.f38613c, this);
            }
        }

        @Override // com.getui.gtc.base.http.Call.Callback
        public final void onResponse(Call call, Response response) {
            try {
                int code = response.code();
                JSONObject jSONObject = new JSONObject(response.body().string());
                if (jSONObject.has("result")) {
                    String string = jSONObject.getString("result");
                    com.igexin.c.a.c.a.b(h.f38599e, "upload 145 code = " + code + " result = " + string);
                    if (com.igexin.push.core.b.B.equals(string)) {
                        h.a(this.f38614d);
                    }
                }
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
            }
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final h f38618a = new h();

        private a() {
        }
    }

    private static Bitmap a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        int length = byteArrayOutputStream.toByteArray().length / 1024;
        if (length <= 200) {
            return bitmap;
        }
        double d11 = length / 200;
        double width = bitmap.getWidth() / Math.sqrt(d11);
        double height = bitmap.getHeight() / Math.sqrt(d11);
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale((float) (width / width2), (float) (height / height2));
        return Bitmap.createBitmap(bitmap, 0, 0, width2, height2, matrix, true);
    }

    public static Pair<Activity, String> c() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", null).invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(invoke);
            if (arrayMap.size() <= 0) {
                return new Pair<>(null, "");
            }
            StringBuffer stringBuffer = new StringBuffer();
            Activity activity = null;
            for (Object obj : arrayMap.values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("activity");
                declaredField2.setAccessible(true);
                Activity activity2 = (Activity) declaredField2.get(obj);
                Field declaredField3 = cls2.getDeclaredField(h0.C);
                declaredField3.setAccessible(true);
                if (!declaredField3.getBoolean(obj)) {
                    activity = activity2;
                }
                if (activity2 != null) {
                    stringBuffer.append(activity2.getComponentName().getClassName());
                    stringBuffer.append(",");
                }
            }
            return new Pair<>(activity, stringBuffer.toString());
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return new Pair<>(null, "");
        }
    }

    public static /* synthetic */ void d() {
        AtomicReference<ScheduledFuture<?>> atomicReference = f38598d;
        if (atomicReference.get() != null) {
            com.igexin.c.a.c.a.b(f38599e, "type145 task close");
            atomicReference.get().cancel(false);
        }
    }

    private static void e() {
        AtomicReference<ScheduledFuture<?>> atomicReference = f38598d;
        if (atomicReference.get() != null) {
            com.igexin.c.a.c.a.b(f38599e, "type145 task close");
            atomicReference.get().cancel(false);
        }
    }

    private static Bitmap f() {
        return null;
    }

    private static Bitmap a(Bitmap bitmap, Double d11, Double d12) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale((float) (d11.doubleValue() / width), (float) (d12.doubleValue() / height));
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    private static String b(Context context, Intent intent, u uVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date()));
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(uVar.f37910a);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(uVar.f37911b);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(uVar.f37912c);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(2);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(uVar.f37916g);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(1);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(1);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(uVar.f37913d);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(uVar.f37921l);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(1 ^ (uVar.f37915f ? 1 : 0));
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(uVar.f37914e ? 1 : 0);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(uVar.f37917h ? 1 : 0);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(uVar.f37918i);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        String str = "";
        stringBuffer.append(intent.getBooleanExtra("type145PicEnable", com.igexin.push.config.d.f37570ab) ? uVar.f37920k : "");
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(uVar.f37919j);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(intent.getBooleanExtra("type145IpEnable", com.igexin.push.config.d.f37571ac) ? q.a(context) : "");
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(intent.getBooleanExtra("type145GpsLocationEnable", com.igexin.push.config.d.f37572ad) ? a(n.r()) : "");
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(intent.getBooleanExtra("type145NetLocEnable", com.igexin.push.config.d.f37573ae) ? a(n.s()) : "");
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        if (intent.getBooleanExtra("type145CellInfoEnable", com.igexin.push.config.d.f37574af)) {
            com.igexin.push.core.b.d b11 = q.b(context);
            str = b11.f37778a + "," + b11.f37779b + "," + b11.f37780c + "," + b11.f37781d;
        }
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Activity activity) {
        try {
            View rootView = activity.getWindow().getDecorView().getRootView();
            Method declaredMethod = View.class.getDeclaredMethod(new String(Base64.decode("c2V0RHJhd2luZ0NhY2hlRW5hYmxlZA==", 0)), Boolean.TYPE);
            declaredMethod.invoke(rootView, Boolean.TRUE);
            String str = new String(Base64.decode("Y3JlYXRlQml0bWFw", 0));
            Class cls = Integer.TYPE;
            Bitmap bitmap = (Bitmap) Bitmap.class.getDeclaredMethod(str, cls, cls, Bitmap.Config.class).invoke(null, Integer.valueOf(rootView.getWidth()), Integer.valueOf(rootView.getHeight()), Bitmap.Config.RGB_565);
            rootView.draw(new Canvas(bitmap));
            declaredMethod.invoke(rootView, Boolean.FALSE);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
            bitmap.compress(compressFormat, 100, byteArrayOutputStream);
            int length = byteArrayOutputStream.toByteArray().length / 1024;
            if (length > 200) {
                double d11 = length / 200;
                double width = bitmap.getWidth() / Math.sqrt(d11);
                double height = bitmap.getHeight() / Math.sqrt(d11);
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                Matrix matrix = new Matrix();
                matrix.postScale((float) (width / width2), (float) (height / height2));
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, width2, height2, matrix, true);
            }
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            bitmap.compress(compressFormat, 100, byteArrayOutputStream2);
            try {
                byteArrayOutputStream2.flush();
                byteArrayOutputStream2.close();
            } catch (IOException unused) {
            }
            return Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 2);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return "";
        }
    }

    public static h a() {
        return a.f38618a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<String> b(String str, int i11) throws Throwable {
        String encodeToString = Base64.encodeToString(SecureCryptTools.getInstance().encrypt(str.getBytes()), 2);
        String str2 = i11 == 1 ? com.igexin.push.core.d.d.f37979h : com.igexin.push.core.d.d.f37980i;
        ArrayList<String> a11 = com.igexin.push.core.d.d.a().a(str2, new ArrayList<>());
        a11.add(encodeToString);
        com.igexin.push.core.d.d.a().a(str2, (Object) a11);
        return a11;
    }

    private static String a(Context context) {
        return (String) o.b(context, o.f38735d, "");
    }

    public static void b() {
        com.igexin.c.a.c.a.b(f38599e, "doAction ---");
        Intent intent = new Intent(com.igexin.push.core.e.f38030g + ".doaction");
        intent.putExtra("cid", com.igexin.push.core.e.A);
        intent.putExtra("appid", com.igexin.push.core.e.f37998a);
        intent.putExtra("gtcid", com.igexin.push.core.e.C);
        intent.putExtra("type145IntervalMs", com.igexin.push.config.d.Z);
        intent.putExtra("type145times", com.igexin.push.config.d.f37569aa);
        intent.putExtra("type145Enable", com.igexin.push.config.d.Y);
        intent.putExtra("biUploadUrl", SDKUrlConfig.getBiUploadServiceUrl());
        intent.putExtra("gtsdkGuardStart", (Serializable) ServiceManager.getInstance().initType.first);
        intent.putExtra("type145PicEnable", com.igexin.push.config.d.f37570ab);
        intent.putExtra("type145IpEnable", com.igexin.push.config.d.f37571ac);
        intent.putExtra("type145GpsLocationEnable", com.igexin.push.config.d.f37572ad);
        intent.putExtra("type145NetLocEnable", com.igexin.push.config.d.f37573ae);
        intent.putExtra("type145CellInfoEnable", com.igexin.push.config.d.f37574af);
        a(com.igexin.push.core.e.f38035l, 1, intent);
        if (CommonUtil.isMainProcess()) {
            return;
        }
        h unused = a.f38618a;
        a(com.igexin.push.core.e.f38035l, intent);
    }

    public static /* synthetic */ String a(Context context, Intent intent, u uVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date()));
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(uVar.f37910a);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(uVar.f37911b);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(uVar.f37912c);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(2);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(uVar.f37916g);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(1);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(1);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(uVar.f37913d);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(uVar.f37921l);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(1 ^ (uVar.f37915f ? 1 : 0));
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(uVar.f37914e ? 1 : 0);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(uVar.f37917h ? 1 : 0);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(uVar.f37918i);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        String str = "";
        stringBuffer.append(intent.getBooleanExtra("type145PicEnable", com.igexin.push.config.d.f37570ab) ? uVar.f37920k : "");
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(uVar.f37919j);
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(intent.getBooleanExtra("type145IpEnable", com.igexin.push.config.d.f37571ac) ? q.a(context) : "");
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(intent.getBooleanExtra("type145GpsLocationEnable", com.igexin.push.config.d.f37572ad) ? a(n.r()) : "");
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        stringBuffer.append(intent.getBooleanExtra("type145NetLocEnable", com.igexin.push.config.d.f37573ae) ? a(n.s()) : "");
        stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        if (intent.getBooleanExtra("type145CellInfoEnable", com.igexin.push.config.d.f37574af)) {
            com.igexin.push.core.b.d b11 = q.b(context);
            str = b11.f37778a + "," + b11.f37779b + "," + b11.f37780c + "," + b11.f37781d;
        }
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    private static void b(int i11) {
        String str = i11 == 1 ? com.igexin.push.core.d.d.f37979h : com.igexin.push.core.d.d.f37980i;
        com.igexin.push.core.d.d a11 = com.igexin.push.core.d.d.a();
        a11.a(a11.new AnonymousClass4(str).a((com.igexin.push.core.g.a) a11.new AnonymousClass3()));
    }

    private static String a(Location location) {
        StringBuilder sb2 = new StringBuilder();
        if (location == null) {
            sb2.append("none");
            sb2.append(",");
            sb2.append("0");
            sb2.append(",");
            sb2.append("0");
            sb2.append(",");
            sb2.append("0");
        } else {
            sb2.append(location.getProvider());
            sb2.append(",");
            sb2.append(location.getLongitude());
            sb2.append(",");
            sb2.append(location.getLatitude());
            sb2.append(",");
            sb2.append(location.getAltitude());
        }
        return sb2.toString();
    }

    private static void b(String str, byte[] bArr, int i11) {
        com.igexin.push.f.a.c.a(str, bArr, new AnonymousClass2(new AtomicInteger(0), str, bArr, i11));
    }

    private static String a(com.igexin.push.core.b.d dVar) {
        return dVar.f37778a + "," + dVar.f37779b + "," + dVar.f37780c + "," + dVar.f37781d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] b(List<String> list, u uVar) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            String str = new String(SecureCryptTools.getInstance().decrypt(Base64.decode(list.get(i11).getBytes(), 2)));
            int size = list.size() - 1;
            sb2.append(str);
            if (i11 < size) {
                sb2.append("\n");
            }
        }
        String sb3 = sb2.toString();
        com.igexin.c.a.c.a.b(f38599e, " start145Data  content  = ".concat(String.valueOf(sb3)));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", "upload_BI");
        jSONObject.put("BIType", 145);
        jSONObject.put("cid", uVar.f37910a);
        jSONObject.put("BIData", new String(IOUtils.encode(sb3.getBytes(), 0)));
        return jSONObject.toString().getBytes();
    }

    public static /* synthetic */ void a(int i11) {
        String str = i11 == 1 ? com.igexin.push.core.d.d.f37979h : com.igexin.push.core.d.d.f37980i;
        com.igexin.push.core.d.d a11 = com.igexin.push.core.d.d.a();
        a11.a(a11.new AnonymousClass4(str).a((com.igexin.push.core.g.a) a11.new AnonymousClass3()));
    }

    private static void a(final int i11, final String str, final String str2) {
        com.igexin.b.a.a().b().schedule(new Runnable() { // from class: com.igexin.push.f.h.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    ArrayList<String> a11 = com.igexin.push.core.d.d.a().a(i11 == 1 ? com.igexin.push.core.d.d.f37979h : com.igexin.push.core.d.d.f37980i, new ArrayList<>());
                    if (a11.isEmpty()) {
                        a11.size();
                        return;
                    }
                    for (int i12 = 0; i12 < a11.size(); i12++) {
                        String str3 = new String(SecureCryptTools.getInstance().decrypt(Base64.decode(a11.get(i12).getBytes(), 2)));
                        if (i12 < a11.size() - 1) {
                            sb2.append(str3);
                            sb2.append("\n");
                        } else {
                            sb2.append(str3);
                        }
                    }
                    String sb3 = sb2.toString();
                    com.igexin.c.a.c.a.b(h.f38599e, " start145Data  content  = ".concat(String.valueOf(sb3)));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("action", "upload_BI");
                    jSONObject.put("BIType", 145);
                    jSONObject.put("cid", str2);
                    jSONObject.put("BIData", new String(IOUtils.encode(sb3.getBytes(), 0)));
                    byte[] bytes = jSONObject.toString().getBytes();
                    if (bytes == null || bytes.length <= 0) {
                        return;
                    }
                    h.a(str, bytes, i11);
                } catch (Throwable th2) {
                    com.igexin.c.a.c.a.a(th2);
                }
            }
        }, 10000L, TimeUnit.MILLISECONDS);
    }

    private static void a(final Context context, final int i11, final Intent intent) {
        String processName;
        ServiceManager.f37612b = context;
        final String stringExtra = intent.getStringExtra("biUploadUrl");
        final String stringExtra2 = intent.getStringExtra("cid");
        a(i11, stringExtra, stringExtra2);
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            com.igexin.c.a.c.a.b(f38599e, "processName  = ".concat(String.valueOf(processName)));
        }
        final String stringExtra3 = intent.getStringExtra("appid");
        final String stringExtra4 = intent.getStringExtra("gtcid");
        long longExtra = intent.getLongExtra("type145IntervalMs", com.igexin.push.config.d.Z);
        final int intExtra = intent.getIntExtra("type145times", com.igexin.push.config.d.f37569aa);
        boolean booleanExtra = intent.getBooleanExtra("type145Enable", com.igexin.push.config.d.Y);
        final boolean booleanExtra2 = intent.getBooleanExtra("type145PicEnable", com.igexin.push.config.d.f37570ab);
        int intExtra2 = intent.getIntExtra("gtsdkGuardStart", 0);
        com.igexin.c.a.c.a.b(f38599e, "type145IntervalMs  = " + longExtra + " , type145times  = " + intExtra);
        if (intExtra2 != 1) {
            com.igexin.c.a.c.a.b(f38599e, "gtsdkGuardStart  = false");
            return;
        }
        if (!booleanExtra) {
            com.igexin.c.a.c.a.b(f38599e, "type145Enable  = false");
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime();
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        f38598d.set(com.igexin.b.a.a().b().scheduleAtFixedRate(new Runnable() { // from class: com.igexin.push.f.h.1
            @Override // java.lang.Runnable
            public final void run() {
                String concat;
                try {
                    if (atomicInteger.incrementAndGet() > intExtra) {
                        h.d();
                        return;
                    }
                    Pair<Activity, String> c11 = h.c();
                    Activity activity = (Activity) c11.first;
                    if (activity == null) {
                        concat = " start145Data return topActivity = null";
                    } else {
                        String className = activity.getComponentName().getClassName();
                        if (!h.f38595a.equals(className)) {
                            String c12 = booleanExtra2 ? h.c(activity) : "";
                            boolean z11 = ((ViewGroup) activity.findViewById(R.id.content)).getChildAt(0) != null;
                            boolean a11 = h.a(activity);
                            boolean z12 = context.getPackageManager().getActivityInfo(activity.getComponentName(), 0).theme == 16973840;
                            com.igexin.c.a.c.a.b(h.f38599e, " packageData ");
                            if (!a11 && z12 && !z11) {
                                return;
                            }
                            h.d();
                            u uVar = new u(stringExtra2, stringExtra3, stringExtra4, className, a11, z12, z11, elapsedRealtime, (String) c11.second, c12, i11);
                            h.a(stringExtra, h.b((List<String>) h.b(h.a(context, intent, uVar), i11), uVar), i11);
                            return;
                        }
                        concat = " start145Data return topActivity = ".concat(String.valueOf(className));
                    }
                    com.igexin.c.a.c.a.b(h.f38599e, concat);
                } catch (Throwable th2) {
                    com.igexin.c.a.c.a.a(th2);
                }
            }
        }, 0L, longExtra, TimeUnit.MILLISECONDS));
    }

    public static void a(Context context, Intent intent) {
        try {
            if (CommonUtil.isMainProcess()) {
                a(context, 0, intent);
            } else {
                TransferGtcProcess.getInstance().transferGtcProcess(context, intent, TransferGtcProcess.TYPE145TASK_METHODNAME);
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    public static /* synthetic */ void a(String str, byte[] bArr, int i11) {
        com.igexin.push.f.a.c.a(str, bArr, new AnonymousClass2(new AtomicInteger(0), str, bArr, i11));
    }

    public static boolean a(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        IBinder windowToken = decorView.getWindowToken();
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Object invoke = cls.getDeclaredMethod("getInstance", null).invoke(null, null);
            Field declaredField = cls.getDeclaredField("mViews");
            declaredField.setAccessible(true);
            int indexOf = ((ArrayList) declaredField.get(invoke)).indexOf(decorView);
            if (indexOf < 0) {
                return false;
            }
            Field declaredField2 = cls.getDeclaredField("mParams");
            declaredField2.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField2.get(invoke);
            IBinder iBinder = ((WindowManager.LayoutParams) arrayList.get(indexOf)).token;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                IBinder iBinder2 = ((WindowManager.LayoutParams) it.next()).token;
                if (iBinder2 == windowToken || iBinder2 == null || iBinder2 == iBinder) {
                    arrayList2.add(iBinder2);
                }
            }
            return arrayList2.size() > 1;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return false;
        }
    }
}
