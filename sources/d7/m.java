package d7;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface m {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
    }

    static /* synthetic */ int d(m mVar, String str, float f11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
        }
        if ((i11 & 2) != 0) {
            f11 = 1.0f;
        }
        return mVar.a(str, f11);
    }

    int a(@m80.k String str, float f11);

    void b();

    void c(int i11);

    void release();
}
