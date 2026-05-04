package r1;

import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f82822a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<T> f82823b;

    /* renamed from: c, reason: collision with root package name */
    public final c f82824c;

    /* renamed from: d, reason: collision with root package name */
    public v1.a f82825d;

    public a(String str, Class<T> cls) {
        this(str, cls, (c) null);
    }

    public String toString() {
        return this.f82822a + j2.O + this.f82823b.getName();
    }

    public a(v1.a aVar, Class<T> cls) {
        this(aVar, cls, (c) null);
    }

    public a(String str, Class<T> cls, c<T> cVar) {
        this.f82822a = str;
        this.f82823b = cls;
        this.f82824c = cVar;
    }

    public a(v1.a aVar, Class<T> cls, c<T> cVar) {
        this.f82822a = aVar.C();
        this.f82825d = aVar;
        this.f82823b = cls;
        this.f82824c = cVar;
    }
}
