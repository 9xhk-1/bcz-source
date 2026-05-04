package com.huawei.updatesdk.a.a.b;

import java.util.ArrayDeque;
import java.util.Queue;
import lk.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f36804b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Queue<byte[]> f36805a = new ArrayDeque(0);

    private a() {
    }

    public static a b() {
        return f36804b;
    }

    public void a(byte[] bArr) {
        if (bArr.length == 65536) {
            synchronized (this.f36805a) {
                b(bArr);
            }
        }
    }

    private void b(byte[] bArr) {
        if (this.f36805a.size() >= 32 || this.f36805a.offer(bArr)) {
            return;
        }
        com.huawei.updatesdk.a.a.c.a.a.a.a(g.f71445a, "releaseBytes false");
    }

    public byte[] a() {
        byte[] poll;
        synchronized (this.f36805a) {
            poll = this.f36805a.poll();
        }
        return poll == null ? new byte[65536] : poll;
    }
}
