package com.xiaomi.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Map;

/* loaded from: classes8.dex */
public class eq extends er {

    /* renamed from: a, reason: collision with root package name */
    private int f45484a;

    /* renamed from: a, reason: collision with other field name */
    private PendingIntent f346a;

    /* renamed from: b, reason: collision with root package name */
    private int f45485b;

    /* renamed from: b, reason: collision with other field name */
    private Bitmap f347b;

    /* renamed from: c, reason: collision with root package name */
    private int f45486c;

    /* renamed from: c, reason: collision with other field name */
    private CharSequence f348c;

    public eq(Context context, int i11, String str) {
        super(context, i11, str);
        this.f45484a = 16777216;
        this.f45485b = 16777216;
        this.f45486c = 16777216;
    }

    private Drawable a(int i11, int i12, int i13, float f11) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RoundRectShape(new float[]{f11, f11, f11, f11, f11, f11, f11, f11}, null, null));
        shapeDrawable.getPaint().setColor(i11);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.setIntrinsicWidth(i12);
        shapeDrawable.setIntrinsicHeight(i13);
        return shapeDrawable;
    }

    public eq b(String str) {
        if (m5926b() && !TextUtils.isEmpty(str)) {
            try {
                this.f45484a = Color.parseColor(str);
                return this;
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("parse colorful notification bg color error");
            }
        }
        return this;
    }

    public eq c(String str) {
        if (m5926b() && !TextUtils.isEmpty(str)) {
            try {
                this.f45486c = Color.parseColor(str);
                return this;
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("parse colorful notification image text color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.er
    /* renamed from: a */
    public eq setLargeIcon(Bitmap bitmap) {
        if (m5926b() && bitmap != null) {
            if (bitmap.getWidth() == 984 && bitmap.getHeight() >= 177 && bitmap.getHeight() <= 207) {
                this.f347b = bitmap;
                return this;
            }
            com.xiaomi.channel.commonutils.logger.b.m5639a("colorful notification bg image resolution error, must [984*177, 984*207]");
        }
        return this;
    }

    @Override // com.xiaomi.push.er
    public String b() {
        return "notification_colorful_copy";
    }

    public eq a(CharSequence charSequence, PendingIntent pendingIntent) {
        if (m5926b()) {
            super.addAction(0, charSequence, pendingIntent);
            this.f348c = charSequence;
            this.f346a = pendingIntent;
        }
        return this;
    }

    @Override // com.xiaomi.push.ep
    /* renamed from: a */
    public eq mo5918a(String str) {
        if (m5926b() && !TextUtils.isEmpty(str)) {
            try {
                this.f45485b = Color.parseColor(str);
                return this;
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("parse colorful notification button bg color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.er
    /* renamed from: a */
    public String mo5923a() {
        return "notification_colorful";
    }

    @Override // com.xiaomi.push.er, com.xiaomi.push.ep
    /* renamed from: a */
    public void mo5916a() {
        RemoteViews m5922a;
        Bitmap bitmap;
        boolean z11;
        RemoteViews m5922a2;
        eq eqVar;
        RemoteViews m5922a3;
        Drawable a11;
        if (!m5926b()) {
            m5925b();
            return;
        }
        super.mo5916a();
        Resources resources = a().getResources();
        String packageName = a().getPackageName();
        int a12 = a(resources, "icon", "id", packageName);
        if (((er) this).f349a == null) {
            a(a12);
        } else {
            m5922a().setImageViewBitmap(a12, ((er) this).f349a);
        }
        int a13 = a(resources, "title", "id", packageName);
        int a14 = a(resources, "content", "id", packageName);
        m5922a().setTextViewText(a13, ((er) this).f351a);
        m5922a().setTextViewText(a14, ((er) this).f356b);
        if (!TextUtils.isEmpty(this.f348c)) {
            int a15 = a(resources, "buttonContainer", "id", packageName);
            int a16 = a(resources, ma.b.f72893b1, "id", packageName);
            int a17 = a(resources, "buttonBg", "id", packageName);
            m5922a().setViewVisibility(a15, 0);
            m5922a().setTextViewText(a16, this.f348c);
            m5922a().setOnClickPendingIntent(a15, this.f346a);
            if (this.f45485b != 16777216) {
                int a18 = a(70.0f);
                int a19 = a(29.0f);
                m5922a().setImageViewBitmap(a17, com.xiaomi.push.service.ak.a(a(this.f45485b, a18, a19, a19 / 2.0f)));
                m5922a().setTextColor(a16, m5924a(this.f45485b) ? -1 : -16777216);
            }
        }
        int a21 = a(resources, "bg", "id", packageName);
        int a22 = a(resources, TtmlNode.RUBY_CONTAINER, "id", packageName);
        if (this.f45484a != 16777216) {
            if (j.a(a()) >= 10) {
                m5922a3 = m5922a();
                a11 = a(this.f45484a, 984, 192, 30.0f);
            } else {
                m5922a3 = m5922a();
                a11 = a(this.f45484a, 984, 192, 0.0f);
            }
            m5922a3.setImageViewBitmap(a21, com.xiaomi.push.service.ak.a(a11));
            m5922a2 = m5922a();
            z11 = m5924a(this.f45484a);
            eqVar = this;
        } else {
            if (this.f347b == null) {
                m5922a().setViewVisibility(a12, 8);
                m5922a().setViewVisibility(a21, 8);
                try {
                    bj.a((Object) this, "setStyle", s.a(a(), "android.app.Notification$DecoratedCustomViewStyle").getConstructor(null).newInstance(null));
                } catch (Exception unused) {
                    com.xiaomi.channel.commonutils.logger.b.m5639a("load class DecoratedCustomViewStyle failed");
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("miui.customHeight", true);
                addExtras(bundle);
                setCustomContentView(m5922a());
            }
            if (j.a(a()) >= 10) {
                m5922a = m5922a();
                bitmap = a(this.f347b, 30.0f);
            } else {
                m5922a = m5922a();
                bitmap = this.f347b;
            }
            m5922a.setImageViewBitmap(a21, bitmap);
            Map<String, String> map = ((er) this).f354a;
            if (map != null && this.f45486c == 16777216) {
                c(map.get("notification_image_text_color"));
            }
            int i11 = this.f45486c;
            z11 = i11 == 16777216 || !m5924a(i11);
            m5922a2 = m5922a();
            eqVar = this;
        }
        eqVar.a(m5922a2, a22, a13, a14, z11);
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("miui.customHeight", true);
        addExtras(bundle2);
        setCustomContentView(m5922a());
    }

    private void a(RemoteViews remoteViews, int i11, int i12, int i13, boolean z11) {
        int a11 = a(6.0f);
        remoteViews.setViewPadding(i11, a11, 0, a11, 0);
        int i14 = z11 ? -1 : -16777216;
        remoteViews.setTextColor(i12, i14);
        remoteViews.setTextColor(i13, i14);
    }

    @Override // com.xiaomi.push.er
    /* renamed from: a */
    public boolean mo5917a() {
        if (!j.m6171a()) {
            return false;
        }
        Resources resources = a().getResources();
        String packageName = a().getPackageName();
        return (a(resources, "icon", "id", packageName) == 0 || a(resources, "title", "id", packageName) == 0 || a(resources, "content", "id", packageName) == 0) ? false : true;
    }
}
