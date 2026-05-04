package com.huawei.updatesdk.b.d;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c extends AsyncTask<Void, Void, Void> {

    /* renamed from: a, reason: collision with root package name */
    private String f36890a;

    /* renamed from: b, reason: collision with root package name */
    private HttpURLConnection f36891b;

    /* renamed from: d, reason: collision with root package name */
    private final com.huawei.updatesdk.b.d.b f36893d;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36892c = false;

    /* renamed from: e, reason: collision with root package name */
    private Handler f36894e = new b(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f36891b != null) {
                c.this.f36892c = true;
                c.this.f36891b.disconnect();
            }
            com.huawei.updatesdk.a.a.d.d.a(new File(d.b()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends Handler {
        private b() {
        }

        private void a(Message message, Intent intent, com.huawei.updatesdk.a.b.b.b bVar) {
            Bundle bundle = new Bundle();
            bundle.putInt("download_status_param", message.what);
            intent.putExtras(bundle);
            com.huawei.updatesdk.b.f.c.b().b(bVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            Object obj = message.obj;
            if (obj instanceof com.huawei.updatesdk.b.d.b) {
                com.huawei.updatesdk.b.d.b bVar = (com.huawei.updatesdk.b.d.b) obj;
                Intent intent = new Intent();
                com.huawei.updatesdk.a.b.b.b a11 = com.huawei.updatesdk.a.b.b.b.a(intent);
                int i11 = message.what;
                if (i11 == 2) {
                    intent.putExtra("download_apk_size", bVar.e());
                    intent.putExtra("download_apk_already", bVar.a());
                    com.huawei.updatesdk.b.f.c.b().a(a11);
                    return;
                }
                if (i11 != 3) {
                    if (i11 == 4) {
                        e.a(com.huawei.updatesdk.a.b.a.a.c().a(), d.b() + "/appmarket.apk", bVar.c(), bVar.d());
                        a(message, intent, a11);
                        return;
                    }
                    if (i11 != 5) {
                        return;
                    }
                }
                a(message, intent, a11);
            }
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public c(com.huawei.updatesdk.b.d.b bVar) {
        this.f36893d = bVar;
        if (TextUtils.isEmpty(bVar.c())) {
            return;
        }
        this.f36890a = bVar.c();
    }

    private int a(com.huawei.updatesdk.b.d.b bVar, BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream, long j11) {
        byte[] bArr = new byte[8192];
        long j12 = 0;
        int i11 = 0;
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read == -1) {
                return i11;
            }
            bufferedOutputStream.write(bArr, 0, read);
            int i12 = i11 + read;
            if (Math.abs(System.currentTimeMillis() - j12) > 1000) {
                j12 = System.currentTimeMillis();
                if (i12 != j11) {
                    a(bVar.d(), i12, j11, this.f36890a, 2);
                }
            }
            i11 = i12;
        }
    }

    private void c() {
        HttpURLConnection httpURLConnection = this.f36891b;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void b() {
        this.f36894e = null;
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        super.onCancelled();
        a();
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void doInBackground(Void... voidArr) {
        com.huawei.updatesdk.b.g.b.a(this);
        a(this.f36893d, d.b());
        return null;
    }

    public void a() {
        com.huawei.updatesdk.b.g.c.f36910a.execute(new a());
    }

    private void a(com.huawei.updatesdk.b.d.b bVar, String str) {
        String str2;
        FileOutputStream fileOutputStream;
        if (bVar == null || TextUtils.isEmpty(bVar.b())) {
            return;
        }
        String str3 = str + "/appmarket.apk";
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(new File(str3));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException unused) {
        } catch (Exception e11) {
            e = e11;
        }
        try {
            if (!a(bVar, fileOutputStream, str3)) {
                com.huawei.updatesdk.a.a.d.d.a(new File(d.b()));
            }
            com.huawei.updatesdk.a.a.d.d.a(fileOutputStream);
        } catch (FileNotFoundException unused2) {
            fileOutputStream2 = fileOutputStream;
            str2 = "DOWNLOAD market package FileNotFoundException error";
            com.huawei.updatesdk.a.a.c.a.a.a.b("DownloadMarketTask", str2);
            com.huawei.updatesdk.a.a.d.d.a(fileOutputStream2);
        } catch (Exception e12) {
            e = e12;
            fileOutputStream2 = fileOutputStream;
            str2 = "DOWNLOAD market package Exception error:" + e.getMessage();
            com.huawei.updatesdk.a.a.c.a.a.a.b("DownloadMarketTask", str2);
            com.huawei.updatesdk.a.a.d.d.a(fileOutputStream2);
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            com.huawei.updatesdk.a.a.d.d.a(fileOutputStream2);
            throw th;
        }
    }

    private void a(InputStream inputStream, OutputStream outputStream) {
        com.huawei.updatesdk.a.a.d.d.a(inputStream);
        com.huawei.updatesdk.a.a.d.d.a(outputStream);
    }

    private void a(String str, int i11, long j11, String str2, int i12) {
        com.huawei.updatesdk.b.d.b bVar = new com.huawei.updatesdk.b.d.b();
        bVar.a(i11);
        bVar.a(j11);
        bVar.a(str2);
        bVar.b(str);
        Handler handler = this.f36894e;
        if (handler == null) {
            return;
        }
        handler.sendMessage(handler.obtainMessage(i12, bVar));
    }

    private void a(boolean z11, com.huawei.updatesdk.b.d.b bVar, int i11, long j11) {
        String d11;
        String str;
        int i12;
        if (z11) {
            return;
        }
        if (this.f36892c) {
            d11 = bVar.d();
            str = this.f36890a;
            i12 = 3;
        } else {
            d11 = bVar.d();
            str = this.f36890a;
            i12 = 5;
        }
        a(d11, i11, j11, str, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.huawei.updatesdk.b.d.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.BufferedOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.huawei.updatesdk.b.d.b r13, java.io.OutputStream r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.b.d.c.a(com.huawei.updatesdk.b.d.b, java.io.OutputStream, java.lang.String):boolean");
    }
}
