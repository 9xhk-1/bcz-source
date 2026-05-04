package fl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        public volatile T f52005a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f52006b;

        public a(b bVar) {
            this.f52006b = bVar;
        }

        @Override // fl.h.b
        public T get() {
            if (this.f52005a == null) {
                synchronized (this) {
                    try {
                        if (this.f52005a == null) {
                            this.f52005a = (T) m.e(this.f52006b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.f52005a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b<T> {
        T get();
    }

    public static <T> b<T> a(b<T> bVar) {
        return new a(bVar);
    }
}
