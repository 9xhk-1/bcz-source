package a3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f1631a = false;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f1632b;

    public static synchronized void a() {
        synchronized (t.class) {
            if (f1632b) {
                return;
            }
            if (f1631a) {
                return;
            }
            new com.badlogic.gdx.utils.r().j("gdx");
            f1632b = true;
        }
    }
}
