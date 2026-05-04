package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.tencent.mm.opensdk.diffdev.IDiffDevOAuth;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a implements IDiffDevOAuth {

    /* renamed from: c, reason: collision with root package name */
    private b f44343c;

    /* renamed from: a, reason: collision with root package name */
    private Handler f44341a = null;

    /* renamed from: b, reason: collision with root package name */
    private List<OAuthListener> f44342b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private OAuthListener f44344d = new C0521a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.tencent.mm.opensdk.diffdev.a.a$a, reason: collision with other inner class name */
    public class C0521a implements OAuthListener {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.tencent.mm.opensdk.diffdev.a.a$a$a, reason: collision with other inner class name */
        public class RunnableC0522a implements Runnable {
            public RunnableC0522a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(a.this.f44342b);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((OAuthListener) it.next()).onQrcodeScanned();
                }
            }
        }

        public C0521a() {
        }

        @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
        public void onAuthFinish(OAuthErrCode oAuthErrCode, String str) {
            Log.d("MicroMsg.SDK.ListenerWrapper", String.format("onAuthFinish, errCode = %s, authCode = %s", oAuthErrCode.toString(), str));
            a.this.f44343c = null;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(a.this.f44342b);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((OAuthListener) it.next()).onAuthFinish(oAuthErrCode, str);
            }
        }

        @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
        public void onAuthGotQrcode(String str, byte[] bArr) {
            Log.d("MicroMsg.SDK.ListenerWrapper", "onAuthGotQrcode, qrcodeImgPath = " + str);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(a.this.f44342b);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((OAuthListener) it.next()).onAuthGotQrcode(str, bArr);
            }
        }

        @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
        public void onQrcodeScanned() {
            Log.d("MicroMsg.SDK.ListenerWrapper", "onQrcodeScanned");
            if (a.this.f44341a != null) {
                a.this.f44341a.post(new RunnableC0522a());
            }
        }
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void addListener(OAuthListener oAuthListener) {
        if (this.f44342b.contains(oAuthListener)) {
            return;
        }
        this.f44342b.add(oAuthListener);
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public boolean auth(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        Log.i("MicroMsg.SDK.DiffDevOAuth", "start auth, appId = " + str);
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            Log.d("MicroMsg.SDK.DiffDevOAuth", String.format("auth fail, invalid argument, appId = %s, scope = %s", str, str2));
            return false;
        }
        if (this.f44341a == null) {
            this.f44341a = new Handler(Looper.getMainLooper());
        }
        if (!this.f44342b.contains(oAuthListener)) {
            this.f44342b.add(oAuthListener);
        }
        if (this.f44343c != null) {
            Log.d("MicroMsg.SDK.DiffDevOAuth", "auth, already running, no need to start auth again");
            return true;
        }
        b bVar = new b(str, str2, str3, str4, str5, this.f44344d);
        this.f44343c = bVar;
        bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return true;
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void detach() {
        Log.i("MicroMsg.SDK.DiffDevOAuth", "detach");
        this.f44342b.clear();
        stopAuth();
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void removeAllListeners() {
        this.f44342b.clear();
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void removeListener(OAuthListener oAuthListener) {
        this.f44342b.remove(oAuthListener);
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public boolean stopAuth() {
        boolean z11;
        Log.i("MicroMsg.SDK.DiffDevOAuth", "stopAuth");
        try {
            b bVar = this.f44343c;
            z11 = bVar == null ? true : bVar.a();
        } catch (Exception e11) {
            Log.w("MicroMsg.SDK.DiffDevOAuth", "stopAuth fail, ex = " + e11.getMessage());
            z11 = false;
        }
        this.f44343c = null;
        return z11;
    }
}
