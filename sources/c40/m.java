package c40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface m extends z2 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final x00.l<Throwable, yz.g2> f7888a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@m80.k x00.l<? super Throwable, yz.g2> lVar) {
            this.f7888a = lVar;
        }

        @Override // c40.m
        public void a(@m80.l Throwable th2) {
            this.f7888a.invoke(th2);
        }

        @m80.k
        public String toString() {
            return "CancelHandler.UserSupplied[" + u0.a(this.f7888a) + '@' + u0.b(this) + l50.b.f69930l;
        }
    }

    void a(@m80.l Throwable th2);
}
