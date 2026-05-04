package com.vivo.push.util;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class x implements d {

    /* renamed from: a, reason: collision with root package name */
    private static String f45121a = "SpCache";

    /* renamed from: b, reason: collision with root package name */
    private static String f45122b = "com.vivo.push.cache";

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f45123c;

    @Override // com.vivo.push.util.d
    public final boolean a(Context context) {
        if (this.f45123c != null) {
            return true;
        }
        this.f45123c = context.getSharedPreferences(f45122b, 0);
        return true;
    }

    @Override // com.vivo.push.util.d
    public final void b(String str, String str2) {
        SharedPreferences.Editor edit = this.f45123c.edit();
        if (edit == null) {
            p.b(f45121a, "putString error by ".concat(String.valueOf(str)));
            return;
        }
        edit.putString(str, str2);
        b.a(edit);
        p.d(f45121a, "putString by ".concat(String.valueOf(str)));
    }

    @Override // com.vivo.push.util.d
    public final String a(String str, String str2) {
        String string = this.f45123c.getString(str, str2);
        p.d(f45121a, "getString " + str + " is " + string);
        return string;
    }

    public final void a() {
        SharedPreferences.Editor edit = this.f45123c.edit();
        if (edit != null) {
            edit.clear();
            b.a(edit);
        }
        p.d(f45121a, "system cache is cleared");
    }
}
