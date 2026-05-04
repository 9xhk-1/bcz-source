package com.vivo.push.util;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class v implements d {

    /* renamed from: a, reason: collision with root package name */
    private ContentResolver f45119a;

    @Override // com.vivo.push.util.d
    public final boolean a(Context context) {
        if (!j.b()) {
            return false;
        }
        this.f45119a = context.getContentResolver();
        return true;
    }

    @Override // com.vivo.push.util.d
    public final void b(String str, String str2) {
        try {
            Settings.System.putString(this.f45119a, str, str2);
        } catch (Exception e11) {
            e11.printStackTrace();
            p.b("SettingsCache", "putString error by ".concat(String.valueOf(str)));
        }
    }

    @Override // com.vivo.push.util.d
    public final String a(String str, String str2) {
        try {
            return Settings.System.getString(this.f45119a, str);
        } catch (Exception e11) {
            e11.printStackTrace();
            p.b("SettingsCache", "getString error by ".concat(String.valueOf(str)));
            return str2;
        }
    }
}
