package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.RemoteViews;
import androidx.media3.common.C;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.en;
import com.xiaomi.push.eo;
import com.xiaomi.push.ep;
import com.xiaomi.push.eq;
import com.xiaomi.push.g;
import com.xiaomi.push.hh;
import com.xiaomi.push.hu;
import com.xiaomi.push.id;
import com.xiaomi.push.service.aw;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class ak {

    /* renamed from: a, reason: collision with root package name */
    public static long f46239a;

    /* renamed from: a, reason: collision with other field name */
    private static volatile as f919a;

    /* renamed from: a, reason: collision with other field name */
    private static final LinkedList<Pair<Integer, id>> f920a = new LinkedList<>();

    /* renamed from: a, reason: collision with other field name */
    private static ExecutorService f921a = Executors.newCachedThreadPool();

    public static class a implements Callable<Bitmap> {

        /* renamed from: a, reason: collision with root package name */
        private Context f46240a;

        /* renamed from: a, reason: collision with other field name */
        private String f922a;

        /* renamed from: a, reason: collision with other field name */
        private boolean f923a;

        public a(String str, Context context, boolean z11) {
            this.f46240a = context;
            this.f922a = str;
            this.f923a = z11;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap call() {
            if (TextUtils.isEmpty(this.f922a)) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("Failed get online picture/icon resource cause picUrl is empty");
                return null;
            }
            if (!this.f922a.startsWith("http")) {
                Bitmap a11 = aw.a(this.f46240a, this.f922a);
                if (a11 == null) {
                    com.xiaomi.channel.commonutils.logger.b.m5639a("Failed get online picture/icon resource");
                }
                return a11;
            }
            aw.b a12 = aw.a(this.f46240a, this.f922a, this.f923a);
            if (a12 != null) {
                return a12.f943a;
            }
            com.xiaomi.channel.commonutils.logger.b.m5639a("Failed get online picture/icon resource");
            return null;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        long f46241a = 0;

        /* renamed from: a, reason: collision with other field name */
        Notification f924a;
    }

    public static class c {

        /* renamed from: a, reason: collision with other field name */
        public String f925a;

        /* renamed from: a, reason: collision with root package name */
        public long f46242a = 0;

        /* renamed from: a, reason: collision with other field name */
        public boolean f926a = false;
    }

    public static int a(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).getInt(str, Integer.MAX_VALUE);
    }

    private static int b(Context context, String str) {
        int a11 = a(context, str, "mipush_notification");
        int a12 = a(context, str, "mipush_small_notification");
        if (a11 <= 0) {
            a11 = a12 > 0 ? a12 : context.getApplicationInfo().icon;
        }
        return a11 == 0 ? context.getApplicationInfo().logo : a11;
    }

    private static int c(Map<String, String> map) {
        if (map != null) {
            String str = map.get("notification_priority");
            if (!TextUtils.isEmpty(str)) {
                try {
                    com.xiaomi.channel.commonutils.logger.b.c("priority=" + str);
                    return Integer.parseInt(str);
                } catch (Exception e11) {
                    com.xiaomi.channel.commonutils.logger.b.d("parsing notification priority error: " + e11);
                }
            }
        }
        return 0;
    }

    public static boolean d(id idVar) {
        return idVar.a() == hh.Registration;
    }

    public static boolean e(id idVar) {
        return m6226a(idVar) || c(idVar) || m6230b(idVar);
    }

    private static int a(Context context, String str, String str2) {
        if (str.equals(context.getPackageName())) {
            return context.getResources().getIdentifier(str2, "drawable", str);
        }
        return 0;
    }

    private static int b(Map<String, String> map) {
        if (map != null) {
            String str = map.get("channel_importance");
            if (!TextUtils.isEmpty(str)) {
                try {
                    com.xiaomi.channel.commonutils.logger.b.c("importance=" + str);
                    return Integer.parseInt(str);
                } catch (Exception e11) {
                    com.xiaomi.channel.commonutils.logger.b.d("parsing channel importance error: " + e11);
                }
            }
        }
        return 3;
    }

    public static void c(Context context, String str) {
        context.getSharedPreferences("pref_notify_type", 0).edit().remove(str).commit();
    }

    private static int a(Context context, String str, Map<String, String> map, int i11) {
        ComponentName a11;
        Intent b11 = b(context, str, map, i11);
        if (b11 == null || (a11 = l.a(context, b11)) == null) {
            return 0;
        }
        return a11.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent b(android.content.Context r5, java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7, int r8) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.ak.b(android.content.Context, java.lang.String, java.util.Map, int):android.content.Intent");
    }

    public static boolean c(id idVar) {
        hu m6085a = idVar.m6085a();
        return a(m6085a) && m6085a.f575b == 0 && !m6226a(idVar);
    }

    private static int a(Map<String, String> map) {
        String str = map == null ? null : map.get(com.alipay.sdk.m.m.a.f10784h0);
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static String b(id idVar) {
        return m6226a(idVar) ? "E100002" : c(idVar) ? "E100000" : m6230b(idVar) ? "E100001" : d(idVar) ? "E100003" : "";
    }

    private static Notification a(Notification notification) {
        Object a11 = com.xiaomi.push.bj.a(notification, "extraNotification");
        if (a11 != null) {
            com.xiaomi.push.bj.a(a11, "setCustomizedIcon", Boolean.TRUE);
        }
        return notification;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static void m6228b(Context context, String str) {
        if (!com.xiaomi.push.j.m6172a(context) || f919a == null || TextUtils.isEmpty(str)) {
            return;
        }
        f919a.a(str);
    }

    private static PendingIntent a(Context context, id idVar, String str, byte[] bArr, int i11) {
        return a(context, idVar, str, bArr, i11, 0, a(context, idVar, str));
    }

    public static void b(Context context, String str, int i11) {
        context.getSharedPreferences("pref_notify_type", 0).edit().putInt(str, i11).commit();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.app.PendingIntent a(android.content.Context r16, com.xiaomi.push.id r17, java.lang.String r18, byte[] r19, int r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.ak.a(android.content.Context, com.xiaomi.push.id, java.lang.String, byte[], int, int, boolean):android.app.PendingIntent");
    }

    private static void b(Context context, String str, ep epVar, Map<String, String> map) {
        int a11;
        if (!com.xiaomi.push.j.m6172a(context)) {
            String a12 = a(map, "fcm_icon_uri");
            String a13 = a(map, "fcm_icon_color");
            if (!TextUtils.isEmpty(a12) && !TextUtils.isEmpty(a13) && (a11 = a(context, str, a12)) > 0) {
                epVar.setSmallIcon(a11);
                epVar.mo5918a(a13);
                return;
            }
        }
        epVar.setSmallIcon(Icon.createWithResource(str, ay.a(context, str)));
    }

    private static PendingIntent a(Context context, String str, id idVar, byte[] bArr, int i11, int i12) {
        Map<String, String> m6046a = idVar.m6085a().m6046a();
        if (m6046a == null) {
            return null;
        }
        boolean a11 = a(context, idVar, str);
        if (a11) {
            return a(context, idVar, str, bArr, i11, i12, a11);
        }
        Intent m6221a = m6221a(context, str, m6046a, i12);
        if (m6221a != null) {
            return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(context, 0, m6221a, 167772160) : PendingIntent.getActivity(context, 0, m6221a, C.BUFFER_FLAG_FIRST_SAMPLE);
        }
        return null;
    }

    private static void b(Intent intent) {
        if (intent == null) {
            return;
        }
        intent.setFlags(intent.getFlags() & (-196));
    }

    public static ComponentName a(String str) {
        return new ComponentName(str, "com.xiaomi.mipush.sdk.NotificationClickedActivity");
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m6229b(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).contains(str);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static Intent m6221a(Context context, String str, Map<String, String> map, int i11) {
        if (m6231b(map)) {
            return a(context, str, map, String.format("cust_btn_%s_ne", Integer.valueOf(i11)), String.format("cust_btn_%s_iu", Integer.valueOf(i11)), String.format("cust_btn_%s_ic", Integer.valueOf(i11)), String.format("cust_btn_%s_wu", Integer.valueOf(i11)));
        }
        if (i11 == 1) {
            return a(context, str, map, "notification_style_button_left_notify_effect", "notification_style_button_left_intent_uri", "notification_style_button_left_intent_class", "notification_style_button_left_web_uri");
        }
        if (i11 == 2) {
            return a(context, str, map, "notification_style_button_mid_notify_effect", "notification_style_button_mid_intent_uri", "notification_style_button_mid_intent_class", "notification_style_button_mid_web_uri");
        }
        if (i11 == 3) {
            return a(context, str, map, "notification_style_button_right_notify_effect", "notification_style_button_right_intent_uri", "notification_style_button_right_intent_class", "notification_style_button_right_web_uri");
        }
        if (i11 != 4) {
            return null;
        }
        return a(context, str, map, "notification_colorful_button_notify_effect", "notification_colorful_button_intent_uri", "notification_colorful_button_intent_class", "notification_colorful_button_web_uri");
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m6230b(id idVar) {
        hu m6085a = idVar.m6085a();
        return a(m6085a) && m6085a.f575b == 1 && !m6226a(idVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.Intent a(android.content.Context r3, java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.ak.a(android.content.Context, java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.lang.String, java.lang.String):android.content.Intent");
    }

    /* renamed from: b, reason: collision with other method in class */
    private static boolean m6231b(Map<String, String> map) {
        if (map != null) {
            return Constants.VIA_SHARE_TYPE_INFO.equals(map.get("notification_style_type"));
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a("meta extra is null");
        return false;
    }

    private static Bitmap a(Context context, int i11) {
        return a(context.getResources().getDrawable(i11));
    }

    private static Bitmap a(Context context, String str, boolean z11) {
        Future submit = f921a.submit(new a(str, context, z11));
        try {
            try {
                Bitmap bitmap = (Bitmap) submit.get(180L, TimeUnit.SECONDS);
                if (bitmap == null) {
                }
                return bitmap;
            } finally {
                submit.cancel(true);
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            submit.cancel(true);
            return null;
        }
    }

    public static Bitmap a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 1;
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight > 0 ? intrinsicHeight : 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private static RemoteViews a(Context context, id idVar, byte[] bArr) {
        hu m6085a = idVar.m6085a();
        String a11 = a(idVar);
        if (m6085a != null && m6085a.m6046a() != null) {
            Map<String, String> m6046a = m6085a.m6046a();
            String str = m6046a.get("layout_name");
            String str2 = m6046a.get("layout_value");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                try {
                    Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(a11);
                    int identifier = resourcesForApplication.getIdentifier(str, "layout", a11);
                    if (identifier == 0) {
                        return null;
                    }
                    RemoteViews remoteViews = new RemoteViews(a11, identifier);
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        if (jSONObject.has("text")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("text");
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                String string = jSONObject2.getString(next);
                                int identifier2 = resourcesForApplication.getIdentifier(next, "id", a11);
                                if (identifier2 > 0) {
                                    remoteViews.setTextViewText(identifier2, string);
                                }
                            }
                        }
                        if (jSONObject.has("image")) {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("image");
                            Iterator<String> keys2 = jSONObject3.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                String string2 = jSONObject3.getString(next2);
                                int identifier3 = resourcesForApplication.getIdentifier(next2, "id", a11);
                                int identifier4 = resourcesForApplication.getIdentifier(string2, "drawable", a11);
                                if (identifier3 > 0) {
                                    remoteViews.setImageViewResource(identifier3, identifier4);
                                }
                            }
                        }
                        if (jSONObject.has("time")) {
                            JSONObject jSONObject4 = jSONObject.getJSONObject("time");
                            Iterator<String> keys3 = jSONObject4.keys();
                            while (keys3.hasNext()) {
                                String next3 = keys3.next();
                                String string3 = jSONObject4.getString(next3);
                                if (string3.length() == 0) {
                                    string3 = "yy-MM-dd hh:mm";
                                }
                                int identifier5 = resourcesForApplication.getIdentifier(next3, "id", a11);
                                if (identifier5 > 0) {
                                    remoteViews.setTextViewText(identifier5, new SimpleDateFormat(string3).format(new Date(System.currentTimeMillis())));
                                }
                            }
                        }
                        return remoteViews;
                    } catch (JSONException e11) {
                        com.xiaomi.channel.commonutils.logger.b.a(e11);
                        return null;
                    }
                } catch (PackageManager.NameNotFoundException e12) {
                    com.xiaomi.channel.commonutils.logger.b.a(e12);
                }
            }
        }
        return null;
    }

    @TargetApi(16)
    private static ep a(Context context, id idVar, byte[] bArr, String str, int i11) {
        Context context2;
        String a11 = a(idVar);
        Map<String, String> m6046a = idVar.m6085a().m6046a();
        String str2 = m6046a.get("notification_style_type");
        ep a12 = (!com.xiaomi.push.j.m6172a(context) || f919a == null) ? null : f919a.a(context, i11, a11, m6046a);
        if (a12 != null) {
            a12.a(m6046a);
            return a12;
        }
        if ("2".equals(str2)) {
            ep epVar = new ep(context);
            Bitmap a13 = TextUtils.isEmpty(m6046a.get("notification_bigPic_uri")) ? null : a(context, m6046a.get("notification_bigPic_uri"), false);
            if (a13 == null) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("can not get big picture.");
                return epVar;
            }
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle(epVar);
            bigPictureStyle.bigPicture(a13);
            bigPictureStyle.setSummaryText(str);
            bigPictureStyle.bigLargeIcon((Bitmap) null);
            epVar.setStyle(bigPictureStyle);
            return epVar;
        }
        if ("1".equals(str2)) {
            ep epVar2 = new ep(context);
            epVar2.setStyle(new Notification.BigTextStyle().bigText(str));
            return epVar2;
        }
        if ("4".equals(str2) && com.xiaomi.push.j.m6171a()) {
            eo eoVar = new eo(context, a11);
            if (!TextUtils.isEmpty(m6046a.get("notification_banner_image_uri"))) {
                eoVar.setLargeIcon(a(context, m6046a.get("notification_banner_image_uri"), false));
            }
            if (!TextUtils.isEmpty(m6046a.get("notification_banner_icon_uri"))) {
                eoVar.b(a(context, m6046a.get("notification_banner_icon_uri"), false));
            }
            eoVar.a(m6046a);
            return eoVar;
        }
        if (!"3".equals(str2) || !com.xiaomi.push.j.m6171a()) {
            return new ep(context);
        }
        eq eqVar = new eq(context, i11, a11);
        if (TextUtils.isEmpty(m6046a.get("notification_colorful_button_text"))) {
            context2 = context;
        } else {
            context2 = context;
            PendingIntent a14 = a(context2, a11, idVar, bArr, i11, 4);
            if (a14 != null) {
                eqVar.a(m6046a.get("notification_colorful_button_text"), a14).mo5918a(m6046a.get("notification_colorful_button_bg_color"));
            }
        }
        if (!TextUtils.isEmpty(m6046a.get("notification_colorful_bg_color"))) {
            eqVar.b(m6046a.get("notification_colorful_bg_color"));
        } else if (!TextUtils.isEmpty(m6046a.get("notification_colorful_bg_image_uri"))) {
            eqVar.setLargeIcon(a(context2, m6046a.get("notification_colorful_bg_image_uri"), false));
        }
        eqVar.a(m6046a);
        return eqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0256 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x039c  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.xiaomi.push.service.ak.b a(android.content.Context r26, com.xiaomi.push.id r27, byte[] r28, android.widget.RemoteViews r29, android.app.PendingIntent r30, int r31) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.ak.a(android.content.Context, com.xiaomi.push.id, byte[], android.widget.RemoteViews, android.app.PendingIntent, int):com.xiaomi.push.service.ak$b");
    }

    /* renamed from: a, reason: collision with other method in class */
    public static c m6222a(Context context, id idVar, byte[] bArr) {
        int i11;
        Map<String, String> map;
        String str;
        c cVar = new c();
        g.b a11 = com.xiaomi.push.g.a(context, a(idVar), true);
        hu m6085a = idVar.m6085a();
        if (m6085a != null) {
            i11 = m6085a.c();
            map = m6085a.m6046a();
        } else {
            i11 = 0;
            map = null;
        }
        int b11 = com.xiaomi.push.t.b(a(idVar), i11);
        if (com.xiaomi.push.j.m6172a(context) && a11 == g.b.NOT_ALLOWED) {
            if (m6085a != null) {
                en.a(context.getApplicationContext()).a(idVar.b(), b(idVar), m6085a.m6045a(), "10:" + a(idVar));
            }
            str = "Do not notify because user block " + a(idVar) + "‘s notification";
        } else if (com.xiaomi.push.j.m6172a(context) && f919a != null && f919a.m6233a(context, b11, a(idVar), map)) {
            if (m6085a != null) {
                en.a(context.getApplicationContext()).a(idVar.b(), b(idVar), m6085a.m6045a(), "14:" + a(idVar));
            }
            str = "Do not notify because card notification is canceled or sequence incorrect";
        } else {
            RemoteViews a12 = a(context, idVar, bArr);
            PendingIntent a13 = a(context, idVar, idVar.b(), bArr, b11);
            if (a13 != null) {
                b a14 = a(context, idVar, bArr, a12, a13, b11);
                cVar.f46242a = a14.f46241a;
                cVar.f925a = a(idVar);
                Notification notification = a14.f924a;
                if (com.xiaomi.push.j.m6171a()) {
                    if (!TextUtils.isEmpty(m6085a.m6045a())) {
                        notification.extras.putString("message_id", m6085a.m6045a());
                    }
                    notification.extras.putString("local_paid", idVar.m6086a());
                    ay.a(map, notification.extras, "msg_busi_type");
                    ay.a(map, notification.extras, "disable_notification_flags");
                    String str2 = m6085a.m6051b() == null ? null : m6085a.m6051b().get("score_info");
                    if (!TextUtils.isEmpty(str2)) {
                        notification.extras.putString("score_info", str2);
                    }
                    notification.extras.putString("pushUid", a(m6085a.f573a, "n_stats_expose"));
                    notification.extras.putString("eventMessageType", String.valueOf(c(idVar) ? 1000 : m6226a(idVar) ? 3000 : -1));
                    notification.extras.putString(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE, a(idVar));
                }
                String str3 = m6085a.m6046a() != null ? m6085a.m6046a().get("message_count") : null;
                if (com.xiaomi.push.j.m6171a() && str3 != null) {
                    try {
                        ay.a(notification, Integer.parseInt(str3));
                    } catch (NumberFormatException e11) {
                        en.a(context.getApplicationContext()).b(idVar.b(), b(idVar), m6085a.m6045a(), Constants.VIA_SHARE_TYPE_PUBLISHVIDEO);
                        com.xiaomi.channel.commonutils.logger.b.d("fail to set message count. " + e11);
                    }
                }
                String a15 = a(idVar);
                ay.m6249a(notification, a15);
                ax a16 = ax.a(context, a15);
                if (com.xiaomi.push.j.m6172a(context) && f919a != null) {
                    f919a.a(idVar, m6085a.m6046a(), b11, notification);
                }
                if (com.xiaomi.push.j.m6172a(context) && f919a != null && f919a.a(m6085a.m6046a(), b11, notification)) {
                    com.xiaomi.channel.commonutils.logger.b.b("consume this notificaiton by agent");
                } else {
                    a16.a(b11, notification);
                    cVar.f926a = true;
                    com.xiaomi.channel.commonutils.logger.b.m5639a("notification: " + m6085a.m6045a() + " is notifyied");
                }
                if (com.xiaomi.push.j.m6171a() && com.xiaomi.push.j.m6172a(context)) {
                    au.a().a(context, b11, notification);
                    cc.m6273a(context, a15, b11, m6085a.m6045a(), notification);
                }
                if (m6226a(idVar)) {
                    en.a(context.getApplicationContext()).a(idVar.b(), b(idVar), m6085a.m6045a(), 3002, null);
                }
                if (c(idVar)) {
                    en.a(context.getApplicationContext()).a(idVar.b(), b(idVar), m6085a.m6045a(), 1002, null);
                }
                if (Build.VERSION.SDK_INT < 26) {
                    String m6045a = m6085a.m6045a();
                    com.xiaomi.push.aj a17 = com.xiaomi.push.aj.a(context);
                    int a18 = a(m6085a.m6046a());
                    if (a18 > 0 && !TextUtils.isEmpty(m6045a)) {
                        String str4 = "n_timeout_" + m6045a;
                        a17.m5719a(str4);
                        a17.b(new al(str4, a16, b11), a18);
                    }
                }
                Pair<Integer, id> pair = new Pair<>(Integer.valueOf(b11), idVar);
                LinkedList<Pair<Integer, id>> linkedList = f920a;
                synchronized (linkedList) {
                    try {
                        linkedList.add(pair);
                        if (linkedList.size() > 100) {
                            linkedList.remove();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return cVar;
            }
            if (m6085a != null) {
                en.a(context.getApplicationContext()).a(idVar.b(), b(idVar), m6085a.m6045a(), Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE);
            }
            str = "The click PendingIntent is null. ";
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a(str);
        return cVar;
    }

    private static String a(Context context, String str, Map<String, String> map) {
        return (map == null || TextUtils.isEmpty(map.get("channel_name"))) ? com.xiaomi.push.g.m5980b(context, str) : map.get("channel_name");
    }

    public static String a(id idVar) {
        hu m6085a;
        if ("com.xiaomi.xmsf".equals(idVar.f668b) && (m6085a = idVar.m6085a()) != null && m6085a.m6046a() != null) {
            String str = m6085a.m6046a().get("miui_package_name");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return idVar.f668b;
    }

    public static String a(Map<String, String> map, int i11) {
        String str;
        if (i11 == 0) {
            str = "notify_effect";
        } else if (m6231b(map)) {
            str = String.format("cust_btn_%s_ne", Integer.valueOf(i11));
        } else if (i11 == 1) {
            str = "notification_style_button_left_notify_effect";
        } else if (i11 == 2) {
            str = "notification_style_button_mid_notify_effect";
        } else if (i11 == 3) {
            str = "notification_style_button_right_notify_effect";
        } else {
            str = i11 == 4 ? "notification_colorful_button_notify_effect" : null;
        }
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    private static String a(Map<String, String> map, String str) {
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    private static void a(Context context, Intent intent, id idVar, hu huVar, String str, int i11) {
        if (idVar == null || huVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        String a11 = a(huVar.m6046a(), i11);
        if (TextUtils.isEmpty(a11)) {
            return;
        }
        if (bk.f46300a.equals(a11) || bk.f46301b.equals(a11) || bk.f46302c.equals(a11)) {
            intent.putExtra("messageId", str);
            intent.putExtra("local_paid", idVar.f664a);
            if (!TextUtils.isEmpty(idVar.f668b)) {
                intent.putExtra(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE, idVar.f668b);
            }
            intent.putExtra("job_key", a(huVar.m6046a(), "jobkey"));
            intent.putExtra(i11 + "_target_component", a(context, idVar.f668b, huVar.m6046a(), i11));
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m6223a(Context context, String str) {
        a(context, str, -1);
    }

    public static void a(Context context, String str, int i11) {
        a(context, str, i11, -1);
    }

    public static void a(Context context, String str, int i11, int i12) {
        int hashCode;
        if (context == null || TextUtils.isEmpty(str) || i11 < -1) {
            return;
        }
        ax a11 = ax.a(context, str);
        List<StatusBarNotification> m6248b = a11.m6248b();
        if (com.xiaomi.push.t.a(m6248b)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        boolean z11 = false;
        if (i11 == -1) {
            z11 = true;
            hashCode = 0;
        } else {
            hashCode = ((str.hashCode() / 10) * 10) + i11;
        }
        Iterator<StatusBarNotification> it = m6248b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            StatusBarNotification next = it.next();
            if (!TextUtils.isEmpty(String.valueOf(next.getId()))) {
                int id2 = next.getId();
                if (z11) {
                    linkedList.add(next);
                    a11.a(id2);
                } else if (hashCode == id2) {
                    d.a(context, next, i12);
                    linkedList.add(next);
                    a11.a(id2);
                    break;
                }
            }
        }
        a(context, (LinkedList<? extends Object>) linkedList);
    }

    private static void a(Context context, String str, ep epVar, Map<String, String> map) {
        int a11 = a(context, str, "mipush_small_notification");
        int a12 = a(context, str, "mipush_notification");
        if (!com.xiaomi.push.j.m6172a(context)) {
            if (a11 > 0) {
                epVar.setSmallIcon(a11);
            } else {
                b(context, str, epVar, map);
            }
            if (a12 <= 0) {
                return;
            }
        } else {
            if (a11 <= 0 || a12 <= 0) {
                b(context, str, epVar, map);
                return;
            }
            epVar.setSmallIcon(a11);
        }
        epVar.setLargeIcon(a(context, a12));
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        ax a11 = ax.a(context, str);
        List<StatusBarNotification> m6248b = a11.m6248b();
        if (com.xiaomi.push.t.a(m6248b)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (StatusBarNotification statusBarNotification : m6248b) {
            Notification notification = statusBarNotification.getNotification();
            if (notification != null && !TextUtils.isEmpty(String.valueOf(statusBarNotification.getId()))) {
                int id2 = statusBarNotification.getId();
                String a12 = ay.a(notification);
                String b11 = ay.b(notification);
                if (!TextUtils.isEmpty(a12) && !TextUtils.isEmpty(b11) && a(a12, str2) && a(b11, str3)) {
                    linkedList.add(statusBarNotification);
                    a11.a(id2);
                }
            }
        }
        a(context, (LinkedList<? extends Object>) linkedList);
    }

    public static void a(Context context, LinkedList<? extends Object> linkedList) {
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        bz.a(context, "category_clear_notification", "clear_notification", linkedList.size(), "");
    }

    private static void a(Intent intent) {
        try {
            Method declaredMethod = intent.getClass().getDeclaredMethod("addMiuiFlags", Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(intent, 2);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.b("insert flags error " + e11);
        }
    }

    @TargetApi(16)
    private static void a(ep epVar, Context context, String str, id idVar, byte[] bArr, int i11) {
        PendingIntent a11;
        PendingIntent a12;
        PendingIntent a13;
        PendingIntent a14;
        Map<String, String> m6046a = idVar.m6085a().m6046a();
        if (TextUtils.equals("3", m6046a.get("notification_style_type")) || TextUtils.equals("4", m6046a.get("notification_style_type"))) {
            return;
        }
        if (m6231b(m6046a)) {
            for (int i12 = 1; i12 <= 3; i12++) {
                String str2 = m6046a.get(String.format("cust_btn_%s_n", Integer.valueOf(i12)));
                if (!TextUtils.isEmpty(str2) && (a14 = a(context, str, idVar, bArr, i11, i12)) != null) {
                    epVar.addAction(0, str2, a14);
                }
            }
            return;
        }
        if (!TextUtils.isEmpty(m6046a.get("notification_style_button_left_name")) && (a13 = a(context, str, idVar, bArr, i11, 1)) != null) {
            epVar.addAction(0, m6046a.get("notification_style_button_left_name"), a13);
        }
        if (!TextUtils.isEmpty(m6046a.get("notification_style_button_mid_name")) && (a12 = a(context, str, idVar, bArr, i11, 2)) != null) {
            epVar.addAction(0, m6046a.get("notification_style_button_mid_name"), a12);
        }
        if (TextUtils.isEmpty(m6046a.get("notification_style_button_right_name")) || (a11 = a(context, str, idVar, bArr, i11, 3)) == null) {
            return;
        }
        epVar.addAction(0, m6046a.get("notification_style_button_right_name"), a11);
    }

    private static boolean a(Context context, id idVar, String str) {
        if (idVar != null && idVar.m6085a() != null && idVar.m6085a().m6046a() != null && !TextUtils.isEmpty(str)) {
            return Boolean.parseBoolean(idVar.m6085a().m6046a().get("use_clicked_activity")) && l.a(context, a(str));
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a("should clicked activity params are null.");
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m6224a(Context context, String str) {
        return com.xiaomi.push.g.m5981b(context, str);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m6225a(Context context, String str, boolean z11) {
        return com.xiaomi.push.j.m6171a() && !z11 && m6224a(context, str);
    }

    private static boolean a(hu huVar) {
        if (huVar != null) {
            String m6045a = huVar.m6045a();
            if (!TextUtils.isEmpty(m6045a) && m6045a.length() == 22 && "satuigmo".indexOf(m6045a.charAt(0)) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m6226a(id idVar) {
        hu m6085a = idVar.m6085a();
        return a(m6085a) && m6085a.l();
    }

    private static boolean a(String str, String str2) {
        return TextUtils.isEmpty(str) || str2.contains(str);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m6227a(Map<String, String> map) {
        if (map == null || !map.containsKey("notify_foreground")) {
            return true;
        }
        return "1".equals(map.get("notify_foreground"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0072, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String[] a(android.content.Context r3, com.xiaomi.push.hu r4) {
        /*
            java.lang.String r0 = r4.m6053c()
            java.lang.String r1 = r4.d()
            java.util.Map r4 = r4.m6046a()
            if (r4 == 0) goto L73
            android.content.res.Resources r2 = r3.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = (float) r2
            float r2 = r2 / r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            java.lang.Float r3 = java.lang.Float.valueOf(r2)
            int r3 = r3.intValue()
            r2 = 320(0x140, float:4.48E-43)
            if (r3 > r2) goto L51
            java.lang.String r3 = "title_short"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L42
            r0 = r3
        L42:
            java.lang.String r3 = "description_short"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L73
            goto L72
        L51:
            r2 = 360(0x168, float:5.04E-43)
            if (r3 <= r2) goto L73
            java.lang.String r3 = "title_long"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L64
            r0 = r3
        L64:
            java.lang.String r3 = "description_long"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L73
        L72:
            r1 = r3
        L73:
            java.lang.String[] r3 = new java.lang.String[]{r0, r1}
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.ak.a(android.content.Context, com.xiaomi.push.hu):java.lang.String[]");
    }
}
