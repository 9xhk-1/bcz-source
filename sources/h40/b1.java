package h40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f58184a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f58184a;
    }

    @m80.l
    public static final String b(@m80.k String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
