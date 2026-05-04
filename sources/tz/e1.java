package tz;

/* loaded from: classes8.dex */
public class e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f91266a;

    public e1(d1 d1Var) {
        this.f91266a = d1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z11;
        boolean z12;
        z11 = this.f91266a.f91259c;
        if (z11) {
            z12 = this.f91266a.f91260d;
            if (z12) {
                this.f91266a.f91259c = false;
                this.f91266a.d(System.currentTimeMillis());
            }
        }
    }
}
