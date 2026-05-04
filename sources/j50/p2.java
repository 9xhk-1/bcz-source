package j50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public abstract class p2<Array> {
    public static /* synthetic */ void c(p2 p2Var, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i12 & 1) != 0) {
            i11 = p2Var.d() + 1;
        }
        p2Var.b(i11);
    }

    public abstract Array a();

    public abstract void b(int i11);

    public abstract int d();
}
