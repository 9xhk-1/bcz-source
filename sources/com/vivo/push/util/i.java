package com.vivo.push.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class i implements BaseNotifyLayoutAdapter {

    /* renamed from: a, reason: collision with root package name */
    private Resources f45095a;

    /* renamed from: b, reason: collision with root package name */
    private String f45096b;

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getNotificationLayout() {
        return this.f45095a.getIdentifier("push_notify", "layout", this.f45096b);
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getSuitIconId() {
        Resources resources;
        String str;
        if (j.f45099c) {
            resources = this.f45095a;
            str = "notify_icon_rom30";
        } else if (j.f45098b) {
            resources = this.f45095a;
            str = "notify_icon_rom20";
        } else {
            resources = this.f45095a;
            str = "notify_icon";
        }
        return resources.getIdentifier(str, "id", this.f45096b);
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getTitleColor() {
        int i11;
        try {
            i11 = ((Integer) z.a("com.android.internal.R$color", "vivo_notification_title_text_color")).intValue();
        } catch (Exception e11) {
            e11.printStackTrace();
            i11 = 0;
        }
        if (i11 > 0) {
            return this.f45095a.getColor(i11);
        }
        boolean z11 = j.f45099c;
        if (z11) {
            return -1;
        }
        if (!j.f45098b) {
            return -16777216;
        }
        if (z11) {
            return Color.parseColor("#ff999999");
        }
        return -1;
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final void init(Context context) {
        this.f45096b = context.getPackageName();
        this.f45095a = context.getResources();
    }
}
