package com.tencent.liteav.txcvodplayer.a;

import com.tencent.ijk.media.player.IjkMediaMeta;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    String f44199a;

    /* renamed from: b, reason: collision with root package name */
    String f44200b;

    /* renamed from: c, reason: collision with root package name */
    String f44201c;

    public a(String str, String str2, String str3) {
        this.f44199a = str2;
        this.f44200b = str;
        this.f44201c = str3;
    }

    public String a() {
        if ("mp4".equals(this.f44201c)) {
            return c();
        }
        return null;
    }

    public String b() {
        if (IjkMediaMeta.IJKM_KEY_M3U8.equals(this.f44201c)) {
            return c();
        }
        return null;
    }

    public String c() {
        return this.f44199a + "/" + this.f44200b;
    }

    public String d() {
        return this.f44200b;
    }
}
