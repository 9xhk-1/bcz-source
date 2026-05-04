package j40;

import c40.u0;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h extends g {

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final Runnable f63194c;

    public h(@m80.k Runnable runnable, long j11, boolean z11) {
        super(j11, z11);
        this.f63194c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f63194c.run();
    }

    @m80.k
    public String toString() {
        String d11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Task[");
        sb2.append(u0.a(this.f63194c));
        sb2.append('@');
        sb2.append(u0.b(this.f63194c));
        sb2.append(j2.O);
        sb2.append(this.f63192a);
        sb2.append(j2.O);
        d11 = i.d(this.f63193b);
        sb2.append(d11);
        sb2.append(l50.b.f69930l);
        return sb2.toString();
    }
}
