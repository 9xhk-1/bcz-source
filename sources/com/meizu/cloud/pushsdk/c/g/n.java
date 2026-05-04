package com.meizu.cloud.pushsdk.c.g;

import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: classes7.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f39670a = new n() { // from class: com.meizu.cloud.pushsdk.c.g.n.1
        @Override // com.meizu.cloud.pushsdk.c.g.n
        public void a() {
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private boolean f39671b;

    /* renamed from: c, reason: collision with root package name */
    private long f39672c;

    public void a() throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        }
        if (this.f39671b && this.f39672c - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
