package fr;

/* loaded from: classes7.dex */
public class l<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public final gr.i<TResult> f52292a = new gr.i<>();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.f52292a.d();
        }
    }

    public l() {
    }

    public k<TResult> b() {
        return this.f52292a;
    }

    public void c(Exception exc) {
        this.f52292a.b(exc);
    }

    public void d(TResult tresult) {
        this.f52292a.c(tresult);
    }

    public l(b bVar) {
        bVar.b(new a());
    }
}
