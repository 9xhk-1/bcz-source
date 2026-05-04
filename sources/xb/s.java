package xb;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public sb.j f97994a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f97995b = 1;

    public int a() {
        return this.f97995b;
    }

    public sb.j b() {
        return this.f97994a;
    }

    public void c(int retryCount) {
        if (retryCount < 1) {
            retryCount = 1;
        }
        this.f97995b = retryCount;
    }
}
