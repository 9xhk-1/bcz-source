package l60;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l1 {
    @m80.k
    public static final byte[] a(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        byte[] bytes = str.getBytes(u30.d.f91599b);
        kotlin.jvm.internal.g0.o(bytes, "getBytes(...)");
        return bytes;
    }

    @m80.k
    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    @m80.k
    public static final String c(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return new String(bArr, u30.d.f91599b);
    }

    public static final <T> T d(@m80.k ReentrantLock reentrantLock, @m80.k x00.a<? extends T> action) {
        kotlin.jvm.internal.g0.p(reentrantLock, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        reentrantLock.lock();
        try {
            return action.invoke();
        } finally {
            kotlin.jvm.internal.d0.d(1);
            reentrantLock.unlock();
            kotlin.jvm.internal.d0.c(1);
        }
    }
}
