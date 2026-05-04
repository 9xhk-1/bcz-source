package c70;

import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f8286a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadGroup f8287b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f8288c;

    public c(String str, ThreadGroup threadGroup) {
        this.f8286a = str;
        this.f8287b = threadGroup;
        this.f8288c = new AtomicLong();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(this.f8287b, runnable, this.f8286a + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.f8288c.incrementAndGet());
    }

    public c(String str) {
        this(str, null);
    }
}
