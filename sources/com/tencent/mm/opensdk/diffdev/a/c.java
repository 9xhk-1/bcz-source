package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
class c extends AsyncTask<Void, Void, a> {

    /* renamed from: a, reason: collision with root package name */
    private String f44359a;

    /* renamed from: b, reason: collision with root package name */
    private String f44360b;

    /* renamed from: c, reason: collision with root package name */
    private OAuthListener f44361c;

    /* renamed from: d, reason: collision with root package name */
    private int f44362d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public OAuthErrCode f44363a;

        /* renamed from: b, reason: collision with root package name */
        public String f44364b;

        /* renamed from: c, reason: collision with root package name */
        public int f44365c;
    }

    public c(String str, OAuthListener oAuthListener) {
        this.f44359a = str;
        this.f44361c = oAuthListener;
        this.f44360b = String.format("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=%s", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0161 A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.opensdk.diffdev.a.c.a doInBackground(java.lang.Void[] r11) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.opensdk.diffdev.a.c.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(a aVar) {
        a aVar2 = aVar;
        this.f44361c.onAuthFinish(aVar2.f44363a, aVar2.f44364b);
    }
}
