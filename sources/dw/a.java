package dw;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final int f48178b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f48179c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0576a f48180d;

    /* renamed from: a, reason: collision with root package name */
    public ThreadPoolExecutor f48181a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: dw.a$a, reason: collision with other inner class name */
    public class C0576a implements Comparator<Runnable> {
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Runnable runnable, Runnable runnable2) {
            return 0;
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f48178b = availableProcessors + 1;
        f48179c = (availableProcessors * 2) + 1;
        f48180d = new C0576a();
    }

    public a() {
        if (this.f48181a == null) {
            this.f48181a = new ThreadPoolExecutor(f48178b, f48179c, 1L, TimeUnit.SECONDS, new PriorityBlockingQueue(5, f48180d));
        }
    }
}
