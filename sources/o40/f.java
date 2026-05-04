package o40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f extends k0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final b0 f75735a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final String f75736b;

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static final boolean L(Runnable runnable) {
        return false;
    }

    @Override // c40.m0
    public void dispatch(@m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable) {
        w().N0(this, 0L, runnable, dVar, new x00.l() { // from class: o40.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean L;
                L = f.L((Runnable) obj);
                return Boolean.valueOf(L);
            }
        });
    }

    @Override // c40.m0
    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f75736b;
        if (str == null) {
            str = "StandardTestDispatcher";
        }
        sb2.append(str);
        sb2.append("[scheduler=");
        sb2.append(w());
        sb2.append(l50.b.f69930l);
        return sb2.toString();
    }

    @Override // o40.k0
    @m80.k
    public b0 w() {
        return this.f75735a;
    }

    public /* synthetic */ f(b0 b0Var, String str, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? new b0() : b0Var, (i11 & 2) != 0 ? null : str);
    }

    public f(@m80.k b0 b0Var, @m80.l String str) {
        this.f75735a = b0Var;
        this.f75736b = str;
    }
}
