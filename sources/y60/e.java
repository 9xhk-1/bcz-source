package y60;

import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f99456a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadGroup f99457b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f99458c;

    public e(String str, ThreadGroup threadGroup) {
        this.f99456a = str;
        this.f99457b = threadGroup;
        this.f99458c = new AtomicLong();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(this.f99457b, runnable, this.f99456a + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.f99458c.incrementAndGet());
    }

    public e(String str) {
        this(str, null);
    }
}
