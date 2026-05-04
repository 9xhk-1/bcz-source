package com.xiaomi.push;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.Map;

/* loaded from: classes8.dex */
public class eo extends er {

    /* renamed from: a, reason: collision with root package name */
    private int f45480a;

    /* renamed from: b, reason: collision with root package name */
    private Bitmap f45481b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f45482c;

    public eo(Context context, String str) {
        super(context, str);
        this.f45480a = 16777216;
    }

    @Override // com.xiaomi.push.er
    /* renamed from: a */
    public eo setLargeIcon(Bitmap bitmap) {
        if (m5926b() && bitmap != null) {
            if (bitmap.getWidth() == 984 && 184 <= bitmap.getHeight() && bitmap.getHeight() <= 1678) {
                this.f45481b = bitmap;
                return this;
            }
            com.xiaomi.channel.commonutils.logger.b.m5639a("colorful notification banner image resolution error, must belong to [984*184, 984*1678]");
        }
        return this;
    }

    public eo b(Bitmap bitmap) {
        if (m5926b() && bitmap != null) {
            this.f45482c = bitmap;
        }
        return this;
    }

    @Override // com.xiaomi.push.ep
    /* renamed from: a */
    public eo mo5918a(String str) {
        if (m5926b() && !TextUtils.isEmpty(str)) {
            try {
                this.f45480a = Color.parseColor(str);
                return this;
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("parse banner notification image text color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.er
    public String b() {
        return null;
    }

    @Override // com.xiaomi.push.er, android.app.Notification.Builder
    /* renamed from: a */
    public er setLargeIcon(Bitmap bitmap) {
        return this;
    }

    @Override // com.xiaomi.push.er
    /* renamed from: a */
    public String mo5923a() {
        return "notification_banner";
    }

    @Override // com.xiaomi.push.er, com.xiaomi.push.ep
    /* renamed from: a, reason: collision with other method in class */
    public void mo5916a() {
        RemoteViews m5922a;
        Bitmap bitmap;
        if (!m5926b() || this.f45481b == null) {
            m5925b();
            return;
        }
        super.mo5916a();
        Resources resources = a().getResources();
        String packageName = a().getPackageName();
        int a11 = a(resources, "bg", "id", packageName);
        if (j.a(a()) >= 10) {
            m5922a = m5922a();
            bitmap = a(this.f45481b, 30.0f);
        } else {
            m5922a = m5922a();
            bitmap = this.f45481b;
        }
        m5922a.setImageViewBitmap(a11, bitmap);
        int a12 = a(resources, "icon", "id", packageName);
        if (this.f45482c != null) {
            m5922a().setImageViewBitmap(a12, this.f45482c);
        } else {
            a(a12);
        }
        int a13 = a(resources, "title", "id", packageName);
        m5922a().setTextViewText(a13, ((er) this).f351a);
        Map<String, String> map = ((er) this).f354a;
        if (map != null && this.f45480a == 16777216) {
            mo5918a(map.get("notification_image_text_color"));
        }
        RemoteViews m5922a2 = m5922a();
        int i11 = this.f45480a;
        m5922a2.setTextColor(a13, (i11 == 16777216 || !m5924a(i11)) ? -1 : -16777216);
        setCustomContentView(m5922a());
        Bundle bundle = new Bundle();
        bundle.putBoolean("miui.customHeight", true);
        addExtras(bundle);
    }

    @Override // com.xiaomi.push.er
    /* renamed from: a, reason: collision with other method in class */
    public boolean mo5917a() {
        if (!j.m6171a()) {
            return false;
        }
        Resources resources = a().getResources();
        String packageName = a().getPackageName();
        return (a(a().getResources(), "bg", "id", a().getPackageName()) == 0 || a(resources, "icon", "id", packageName) == 0 || a(resources, "title", "id", packageName) == 0 || j.a(a()) < 9) ? false : true;
    }
}
