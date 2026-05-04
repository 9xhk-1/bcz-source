package ac0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2593a = ".errorRendering";

    public final String b(Object obj) {
        try {
            return c(obj);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return obj.getClass().getName() + f2593a;
        } catch (Throwable th2) {
            vb0.a.e(th2);
            return obj.getClass().getName() + f2593a;
        }
    }

    public String c(Object obj) throws InterruptedException {
        return null;
    }

    @Deprecated
    public void a(Throwable th2) {
    }
}
