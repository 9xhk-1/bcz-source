package m9;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    public static final Handler f72661c = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public m9.c f72662a = new m9.c();

    /* renamed from: b, reason: collision with root package name */
    public c f72663b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: m9.a$a, reason: collision with other inner class name */
    public class RunnableC0879a implements Runnable {
        public RunnableC0879a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.f72663b.b(aVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Throwable f72665a;

        public b(final Throwable val$throwable) {
            this.f72665a = val$throwable;
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.f72663b.a(aVar, this.f72665a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void a(a task, Throwable throwable);

        void b(a task);
    }

    public abstract Object a();

    public void b(final Throwable throwable) {
        if (this.f72663b != null) {
            f72661c.post(new b(throwable));
        }
    }

    public void c() {
        if (this.f72663b != null) {
            f72661c.post(new RunnableC0879a());
        }
    }

    public abstract void d();

    public void e(c listener) {
        this.f72663b = listener;
    }

    public boolean equals(Object o11) {
        if (o11 != null && (o11 instanceof a)) {
            Object a11 = a();
            Object a12 = ((a) o11).a();
            if (a11 != null && a12 != null) {
                return a11.equals(a12);
            }
        }
        return false;
    }
}
