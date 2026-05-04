package com.huawei.hms.update.download;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
class DownloadRecord {

    /* renamed from: a, reason: collision with root package name */
    private String f36447a;

    /* renamed from: b, reason: collision with root package name */
    private int f36448b;

    /* renamed from: c, reason: collision with root package name */
    private String f36449c;

    /* renamed from: d, reason: collision with root package name */
    private int f36450d;

    private void a(Context context, String str) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("com.huawei.hms.update.DOWNLOAD_RECORD" + str, 0).edit();
        edit.putString("mUri", this.f36447a);
        edit.putInt("mSize", this.f36448b);
        edit.putString("mHash", this.f36449c);
        edit.putInt("mReceived", this.f36450d);
        edit.commit();
    }

    public int getSize() {
        return this.f36448b;
    }

    public void init(String str, int i11, String str2) {
        this.f36447a = str;
        this.f36448b = i11;
        this.f36449c = str2;
        this.f36450d = 0;
    }

    public boolean isValid(String str, int i11, String str2) {
        String str3;
        String str4 = this.f36447a;
        return str4 != null && str4.equals(str) && this.f36448b == i11 && (str3 = this.f36449c) != null && str3.equals(str2) && this.f36450d <= this.f36448b;
    }

    public void load(Context context, String str) {
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.huawei.hms.update.DOWNLOAD_RECORD" + str, 0);
        this.f36447a = sharedPreferences.getString("mUri", "");
        this.f36448b = sharedPreferences.getInt("mSize", 0);
        this.f36449c = sharedPreferences.getString("mHash", "");
        this.f36450d = sharedPreferences.getInt("mReceived", 0);
    }

    public void update(Context context, int i11, String str) {
        this.f36450d = i11;
        a(context, str);
    }

    public int a() {
        return this.f36450d;
    }
}
