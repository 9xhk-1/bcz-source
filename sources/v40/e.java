package v40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface e<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
    }

    static /* synthetic */ void a(e eVar, Object obj, Appendable appendable, boolean z11, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: format");
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        eVar.b(obj, appendable, z11);
    }

    void b(T t11, @m80.k Appendable appendable, boolean z11);
}
