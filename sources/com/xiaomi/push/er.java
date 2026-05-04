package com.xiaomi.push;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class er extends ep {

    /* renamed from: a, reason: collision with root package name */
    private int f45487a;

    /* renamed from: a, reason: collision with other field name */
    protected Bitmap f349a;

    /* renamed from: a, reason: collision with other field name */
    private RemoteViews f350a;

    /* renamed from: a, reason: collision with other field name */
    protected CharSequence f351a;

    /* renamed from: a, reason: collision with other field name */
    private String f352a;

    /* renamed from: a, reason: collision with other field name */
    private ArrayList<Notification.Action> f353a;

    /* renamed from: a, reason: collision with other field name */
    protected Map<String, String> f354a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f355a;

    /* renamed from: b, reason: collision with root package name */
    private int f45488b;

    /* renamed from: b, reason: collision with other field name */
    protected CharSequence f356b;

    /* renamed from: b, reason: collision with other field name */
    private boolean f357b;

    public er(Context context, int i11, String str) {
        super(context);
        this.f353a = new ArrayList<>();
        this.f45488b = 0;
        this.f352a = str;
        this.f45487a = i11;
        m5919c();
    }

    private String c() {
        boolean e11 = e();
        this.f357b = e11;
        return e11 ? b() : mo5923a();
    }

    private void d() {
        super.setContentTitle(this.f351a);
        super.setContentText(this.f356b);
    }

    private boolean e() {
        return m5921d() && f();
    }

    private boolean f() {
        List<StatusBarNotification> m6248b = com.xiaomi.push.service.ax.a(a(), this.f352a).m6248b();
        if (m6248b != null && !m6248b.isEmpty()) {
            for (StatusBarNotification statusBarNotification : m6248b) {
                if (statusBarNotification.getId() == this.f45487a) {
                    if (statusBarNotification.getNotification() == null) {
                        return false;
                    }
                    return !r0.extras.getBoolean("mipush.customCopyLayout", true);
                }
            }
        }
        return false;
    }

    public int a(float f11) {
        return (int) ((f11 * a().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a, reason: collision with other method in class */
    public abstract String mo5923a();

    /* renamed from: a */
    public abstract boolean mo5917a();

    @Override // android.app.Notification.Builder
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public er setContentText(CharSequence charSequence) {
        this.f356b = charSequence;
        return this;
    }

    public abstract String b();

    public er(Context context, String str) {
        this(context, 0, str);
    }

    private Bitmap a() {
        return com.xiaomi.push.service.ak.a(g.m5975a(a(), this.f352a));
    }

    /* renamed from: c, reason: collision with other method in class */
    private void m5919c() {
        int a11 = a(a().getResources(), c(), "layout", a().getPackageName());
        if (a11 == 0) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("create RemoteViews failed, no such layout resource was found");
        } else {
            this.f350a = new RemoteViews(a().getPackageName(), a11);
            this.f355a = mo5917a();
        }
    }

    /* renamed from: d, reason: collision with other method in class */
    private boolean m5921d() {
        return (TextUtils.isEmpty(b()) || TextUtils.isEmpty(this.f352a)) ? false : true;
    }

    /* renamed from: b, reason: collision with other method in class */
    public final void m5925b() {
        super.setContentTitle(this.f351a);
        super.setContentText(this.f356b);
        Bitmap bitmap = this.f349a;
        if (bitmap != null) {
            super.setLargeIcon(bitmap);
        }
    }

    /* renamed from: c, reason: collision with other method in class */
    private boolean m5920c() {
        Map<String, String> map = this.f354a;
        return map != null && Boolean.parseBoolean(map.get("custom_builder_set_title"));
    }

    public Bitmap a(Bitmap bitmap, float f11) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawRoundRect(new RectF(rect), f11, f11, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* renamed from: b, reason: collision with other method in class */
    public final boolean m5926b() {
        return this.f355a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final RemoteViews m5922a() {
        return this.f350a;
    }

    @Override // com.xiaomi.push.ep
    public ep a(Map<String, String> map) {
        this.f354a = map;
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public er addAction(int i11, CharSequence charSequence, PendingIntent pendingIntent) {
        addAction(new Notification.Action(i11, charSequence, pendingIntent));
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public er addAction(Notification.Action action) {
        if (action != null) {
            this.f353a.add(action);
        }
        int i11 = this.f45488b;
        this.f45488b = i11 + 1;
        a(i11, action);
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public er setLargeIcon(Bitmap bitmap) {
        this.f349a = bitmap;
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public er setContentTitle(CharSequence charSequence) {
        this.f351a = charSequence;
        return this;
    }

    @Override // com.xiaomi.push.ep
    /* renamed from: a */
    public void mo5916a() {
        super.mo5916a();
        Bundle bundle = new Bundle();
        if (m5921d()) {
            bundle.putBoolean("mipush.customCopyLayout", this.f357b);
        } else {
            bundle.putBoolean("mipush.customCopyLayout", false);
        }
        bundle.putBoolean("miui.customHeight", false);
        bundle.putBoolean("mipush.customNotification", true);
        bundle.putInt("mipush.customLargeIconId", a("large_icon"));
        if (this.f353a.size() > 0) {
            Notification.Action[] actionArr = new Notification.Action[this.f353a.size()];
            this.f353a.toArray(actionArr);
            bundle.putParcelableArray("mipush.customActions", actionArr);
        }
        if (m5920c() || !com.xiaomi.push.service.ay.m6250a(a().getContentResolver())) {
            d();
        } else {
            bundle.putCharSequence("mipush.customTitle", this.f351a);
            bundle.putCharSequence("mipush.customContent", this.f356b);
        }
        addExtras(bundle);
    }

    public void a(int i11) {
        Bitmap a11 = a();
        if (a11 != null) {
            m5922a().setImageViewBitmap(i11, a11);
            return;
        }
        int b11 = g.b(a(), this.f352a);
        if (b11 != 0) {
            m5922a().setImageViewResource(i11, b11);
        }
    }

    public void a(int i11, Notification.Action action) {
    }

    /* renamed from: a, reason: collision with other method in class */
    public final boolean m5924a(int i11) {
        return ((((double) Color.red(i11)) * 0.299d) + (((double) Color.green(i11)) * 0.587d)) + (((double) Color.blue(i11)) * 0.114d) < 192.0d;
    }
}
