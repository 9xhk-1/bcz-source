package p10;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x0 f78622a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements x0 {
        public static /* synthetic */ void d(int i11) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // p10.x0
        @m80.k
        public y0 b() {
            y0 y0Var = y0.f78623a;
            if (y0Var == null) {
                d(0);
            }
            return y0Var;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    @m80.k
    y0 b();
}
