package d30;

import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f47156a = a.f47157a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f47157a = new a();

        @m80.k
        public final d a(@m80.l Runnable runnable, @m80.l x00.l<? super InterruptedException, g2> lVar) {
            return (runnable == null || lVar == null) ? new d(null, 1, null) : new c(runnable, lVar);
        }
    }

    void lock();

    void unlock();
}
