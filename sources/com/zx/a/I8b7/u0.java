package com.zx.a.I8b7;

import com.zx.module.base.Callback;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class u0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Callback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f46709a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f46710b;

        public a(String[] strArr, CountDownLatch countDownLatch) {
            this.f46709a = strArr;
            this.f46710b = countDownLatch;
        }

        @Override // com.zx.module.base.Callback
        public void callback(String str) {
            try {
                this.f46709a[0] = str;
                this.f46710b.countDown();
            } catch (Throwable unused) {
            }
        }
    }

    public static final String a() {
        String[] strArr = {""};
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new v0(new a(strArr, countDownLatch)));
            thread.setUncaughtExceptionHandler(new w0());
            thread.start();
            countDownLatch.await(1L, TimeUnit.SECONDS);
        } catch (Throwable unused) {
        }
        return strArr[0];
    }
}
