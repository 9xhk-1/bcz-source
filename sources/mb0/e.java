package mb0;

import javax.annotation.Nullable;
import lb0.y;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class e<T> {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final y<T> f73079a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final Throwable f73080b;

    public e(@Nullable y<T> yVar, @Nullable Throwable th2) {
        this.f73079a = yVar;
        this.f73080b = th2;
    }

    public static <T> e<T> b(Throwable th2) {
        if (th2 != null) {
            return new e<>(null, th2);
        }
        throw new NullPointerException("error == null");
    }

    public static <T> e<T> e(y<T> yVar) {
        if (yVar != null) {
            return new e<>(yVar, null);
        }
        throw new NullPointerException("response == null");
    }

    @Nullable
    public Throwable a() {
        return this.f73080b;
    }

    public boolean c() {
        return this.f73080b != null;
    }

    @Nullable
    public y<T> d() {
        return this.f73079a;
    }

    public String toString() {
        if (this.f73080b != null) {
            return "Result{isError=true, error=\"" + this.f73080b + "\"}";
        }
        return "Result{isError=false, response=" + this.f73079a + l50.b.f69928j;
    }
}
