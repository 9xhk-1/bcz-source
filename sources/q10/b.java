package q10;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final g f81406a;

    public b(@m80.k g gVar) {
        if (gVar == null) {
            C(0);
        }
        this.f81406a = gVar;
    }

    private static /* synthetic */ void C(int i11) {
        String str = i11 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i11 != 1 ? 3 : 2];
        if (i11 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i11 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i11 != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i11 == 1) {
            throw new IllegalStateException(format);
        }
    }

    @Override // q10.a
    @m80.k
    public g getAnnotations() {
        g gVar = this.f81406a;
        if (gVar == null) {
            C(1);
        }
        return gVar;
    }
}
