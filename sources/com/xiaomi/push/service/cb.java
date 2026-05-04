package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.hl;

/* loaded from: classes8.dex */
final class cb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f46349a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ hl f996a;

    public cb(Context context, hl hlVar) {
        this.f46349a = context;
        this.f996a = hlVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r1.isValid() != false) goto L46;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r5 = this;
            java.lang.Object r0 = com.xiaomi.push.service.ca.f46348a
            monitor-enter(r0)
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L47
            android.content.Context r3 = r5.f46349a     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L47
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L47
            java.lang.String r4 = "tiny_data.lock"
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L47
            com.xiaomi.push.y.m6304a(r2)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L47
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L47
            java.lang.String r4 = "rw"
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L47
            java.nio.channels.FileChannel r2 = r3.getChannel()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            java.nio.channels.FileLock r1 = r2.lock()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            android.content.Context r2 = r5.f46349a     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            com.xiaomi.push.hl r4 = r5.f996a     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            com.xiaomi.push.service.ca.b(r2, r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            if (r1 == 0) goto L3c
            boolean r2 = r1.isValid()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L3c
        L32:
            r1.release()     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
            goto L3c
        L36:
            r1 = move-exception
            goto L6b
        L38:
            r1 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a(r1)     // Catch: java.lang.Throwable -> L36
        L3c:
            com.xiaomi.push.y.a(r3)     // Catch: java.lang.Throwable -> L36
            goto L55
        L40:
            r2 = move-exception
            goto L57
        L42:
            r2 = move-exception
            goto L49
        L44:
            r2 = move-exception
            r3 = r1
            goto L57
        L47:
            r2 = move-exception
            r3 = r1
        L49:
            com.xiaomi.channel.commonutils.logger.b.a(r2)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L3c
            boolean r2 = r1.isValid()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L3c
            goto L32
        L55:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            return
        L57:
            if (r1 == 0) goto L67
            boolean r4 = r1.isValid()     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L67
            r1.release()     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L63
            goto L67
        L63:
            r1 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a(r1)     // Catch: java.lang.Throwable -> L36
        L67:
            com.xiaomi.push.y.a(r3)     // Catch: java.lang.Throwable -> L36
            throw r2     // Catch: java.lang.Throwable -> L36
        L6b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.cb.run():void");
    }
}
