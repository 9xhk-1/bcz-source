package com.vivo.push.util;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class h implements BaseNotifyDataAdapter {

    /* renamed from: e, reason: collision with root package name */
    private static int f45089e;

    /* renamed from: f, reason: collision with root package name */
    private static int f45090f;

    /* renamed from: a, reason: collision with root package name */
    private Resources f45091a;

    /* renamed from: b, reason: collision with root package name */
    private String f45092b;

    /* renamed from: c, reason: collision with root package name */
    private String f45093c;

    /* renamed from: d, reason: collision with root package name */
    private String f45094d;

    private static boolean a(int i11) {
        return (i11 == -1 || i11 == 0) ? false : true;
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getDefaultNotifyIcon() {
        if (a(f45089e)) {
            return f45089e;
        }
        String str = this.f45094d;
        int a11 = !a(str) ? -1 : a(str, "_notifyicon");
        f45089e = a11;
        if (a(a11)) {
            return f45089e;
        }
        for (String str2 = this.f45093c; !TextUtils.isEmpty(str2); str2 = str2.substring(0, str2.length() - 1)) {
            int identifier = this.f45091a.getIdentifier("vivo_push_rom" + str2 + "_notifyicon", "drawable", this.f45092b);
            if (identifier > 0) {
                return identifier;
            }
        }
        return this.f45091a.getIdentifier("vivo_push_notifyicon", "drawable", this.f45092b);
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getDefaultSmallIconId() {
        if (a(f45090f)) {
            return f45090f;
        }
        String str = this.f45094d;
        int a11 = !a(str) ? -1 : a(str, "_icon");
        f45090f = a11;
        if (a(a11)) {
            return f45090f;
        }
        for (String str2 = this.f45093c; !TextUtils.isEmpty(str2); str2 = str2.substring(0, str2.length() - 1)) {
            int identifier = this.f45091a.getIdentifier("vivo_push_rom" + str2 + "_icon", "drawable", this.f45092b);
            if (identifier > 0) {
                return identifier;
            }
        }
        return this.f45091a.getIdentifier("vivo_push_icon", "drawable", this.f45092b);
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getNotifyMode(InsideNotificationItem insideNotificationItem) {
        return 2;
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final void init(Context context) {
        this.f45092b = context.getPackageName();
        this.f45091a = context.getResources();
        this.f45093c = j.a();
        this.f45094d = Build.VERSION.RELEASE;
    }

    private static boolean a(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        p.d("DefaultNotifyDataAdapter", "systemVersion is not suit ");
        return false;
    }

    private int a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String[] split = str.split("\\.");
            if (split != null && split.length > 0) {
                str = split[0];
            }
            try {
                for (int parseInt = Integer.parseInt(str); parseInt > 0; parseInt--) {
                    String str3 = "vivo_push_ard" + parseInt + str2;
                    p.c("DefaultNotifyDataAdapter", "get notify icon : ".concat(String.valueOf(str3)));
                    int identifier = this.f45091a.getIdentifier(str3, "drawable", this.f45092b);
                    if (identifier > 0) {
                        p.c("DefaultNotifyDataAdapter", "find notify icon : ".concat(String.valueOf(str3)));
                        return identifier;
                    }
                }
            } catch (Exception e11) {
                p.a("DefaultNotifyDataAdapter", e11);
            }
        }
        return -1;
    }
}
