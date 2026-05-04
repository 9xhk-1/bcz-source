package rx;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class Notification<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final Notification<Void> f84847d = new Notification<>(Kind.OnCompleted, null, null);

    /* renamed from: a, reason: collision with root package name */
    public final Kind f84848a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f84849b;

    /* renamed from: c, reason: collision with root package name */
    public final T f84850c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Kind {
        OnNext,
        OnError,
        OnCompleted
    }

    public Notification(Kind kind, T t11, Throwable th2) {
        this.f84850c = t11;
        this.f84849b = th2;
        this.f84848a = kind;
    }

    public static <T> Notification<T> b() {
        return (Notification<T>) f84847d;
    }

    @Deprecated
    public static <T> Notification<T> c(Class<T> cls) {
        return (Notification<T>) f84847d;
    }

    public static <T> Notification<T> d(Throwable th2) {
        return new Notification<>(Kind.OnError, null, th2);
    }

    public static <T> Notification<T> e(T t11) {
        return new Notification<>(Kind.OnNext, t11, null);
    }

    public void a(qb0.c<? super T> cVar) {
        Kind kind = this.f84848a;
        if (kind == Kind.OnNext) {
            cVar.onNext(h());
        } else if (kind == Kind.OnCompleted) {
            cVar.onCompleted();
        } else {
            cVar.onError(g());
        }
    }

    public boolean equals(Object obj) {
        T t11;
        T t12;
        Throwable th2;
        Throwable th3;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != Notification.class) {
            return false;
        }
        Notification notification = (Notification) obj;
        return notification.f() == f() && ((t11 = this.f84850c) == (t12 = notification.f84850c) || (t11 != null && t11.equals(t12))) && ((th2 = this.f84849b) == (th3 = notification.f84849b) || (th2 != null && th2.equals(th3)));
    }

    public Kind f() {
        return this.f84848a;
    }

    public Throwable g() {
        return this.f84849b;
    }

    public T h() {
        return this.f84850c;
    }

    public int hashCode() {
        int hashCode = f().hashCode();
        if (j()) {
            hashCode = (hashCode * 31) + h().hashCode();
        }
        return i() ? (hashCode * 31) + g().hashCode() : hashCode;
    }

    public boolean i() {
        return l() && this.f84849b != null;
    }

    public boolean j() {
        return m() && this.f84850c != null;
    }

    public boolean k() {
        return f() == Kind.OnCompleted;
    }

    public boolean l() {
        return f() == Kind.OnError;
    }

    public boolean m() {
        return f() == Kind.OnNext;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append('[');
        sb2.append(super.toString());
        sb2.append(' ');
        sb2.append(f());
        if (j()) {
            sb2.append(' ');
            sb2.append(h());
        }
        if (i()) {
            sb2.append(' ');
            sb2.append(g().getMessage());
        }
        sb2.append(l50.b.f69930l);
        return sb2.toString();
    }
}
