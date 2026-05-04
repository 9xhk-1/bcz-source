package t1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f implements s1.e {

    /* renamed from: a, reason: collision with root package name */
    public String f89196a;

    /* renamed from: b, reason: collision with root package name */
    public s1.e f89197b;

    public f(s1.e eVar, String str) {
        this.f89197b = eVar;
        this.f89196a = str;
    }

    public s1.e a() {
        return this.f89197b;
    }

    public String b() {
        return this.f89196a;
    }

    public void c(s1.e eVar) {
        this.f89197b = eVar;
    }

    public void d(String str) {
        this.f89196a = str;
    }

    @Override // s1.e
    public v1.a resolve(String str) {
        return this.f89197b.resolve(this.f89196a + str);
    }
}
