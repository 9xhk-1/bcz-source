package bt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class o extends q {
    public a N;
    public long O = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(o oVar, long j11, long j12);
    }

    public void E0(a aVar) {
        this.N = aVar;
    }

    @Override // bt.q
    public boolean K(long j11) {
        if (this.f7341i == 0) {
            this.f7341i = 1;
            long j12 = this.f7335c;
            if (j12 < 0) {
                this.f7334b = j11;
            } else {
                this.f7334b = j11 - j12;
                this.f7335c = -1L;
            }
        }
        a aVar = this.N;
        if (aVar == null) {
            return false;
        }
        long j13 = j11 - this.f7334b;
        long j14 = this.O;
        long j15 = j14 >= 0 ? j11 - j14 : 0L;
        this.O = j11;
        aVar.a(this, j13, j15);
        return false;
    }

    @Override // bt.q
    public void e0() {
    }

    @Override // bt.q
    public void J(float f11) {
    }
}
