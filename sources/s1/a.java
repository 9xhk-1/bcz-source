package s1;

import r1.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a<T, P extends r1.c<T>> {

    /* renamed from: a, reason: collision with root package name */
    public e f87081a;

    public a(e eVar) {
        this.f87081a = eVar;
    }

    public abstract com.badlogic.gdx.utils.a<r1.a> a(String str, v1.a aVar, P p11);

    public v1.a b(String str) {
        return this.f87081a.resolve(str);
    }
}
