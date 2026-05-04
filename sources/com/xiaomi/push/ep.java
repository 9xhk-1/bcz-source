package com.xiaomi.push;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.Map;

@SuppressLint({"NewApi"})
/* loaded from: classes8.dex */
public class ep extends Notification.Builder {

    /* renamed from: a, reason: collision with root package name */
    private Context f45483a;

    public ep(Context context) {
        super(context);
        this.f45483a = context;
    }

    public int a(Resources resources, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return resources.getIdentifier(str, str2, str3);
    }

    @Override // android.app.Notification.Builder
    public Notification build() {
        mo5916a();
        return super.build();
    }

    public final int a(String str) {
        return a(a().getResources(), str, "id", a().getPackageName());
    }

    public Context a() {
        return this.f45483a;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ep addExtras(Bundle bundle) {
        super.addExtras(bundle);
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ep setCustomContentView(RemoteViews remoteViews) {
        super.setCustomContentView(remoteViews);
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public ep mo5918a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                bj.a((Object) this, "setColor", Integer.valueOf(Color.parseColor(str)));
                return this;
            } catch (Exception e11) {
                com.xiaomi.channel.commonutils.logger.b.d("fail to set color. " + e11);
            }
        }
        return this;
    }

    public ep a(Map<String, String> map) {
        return this;
    }

    /* renamed from: a */
    public void mo5916a() {
    }
}
