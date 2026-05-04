package p50;

import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class l<T> implements n<T>, m<T> {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final h f79149a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Class<? extends T> f79150b;

    /* renamed from: c, reason: collision with root package name */
    public e<T, ?>[] f79151c;

    public l(@NonNull h hVar, @NonNull Class<? extends T> cls) {
        this.f79150b = cls;
        this.f79149a = hVar;
    }

    @Override // p50.m
    public void a(@NonNull b<T> bVar) {
        o.a(bVar);
        d(c.b(bVar, this.f79151c));
    }

    @Override // p50.n
    @NonNull
    @SafeVarargs
    @CheckResult
    public final m<T> b(@NonNull e<T, ?>... eVarArr) {
        o.a(eVarArr);
        this.f79151c = eVarArr;
        return this;
    }

    @Override // p50.m
    public void c(@NonNull g<T> gVar) {
        o.a(gVar);
        d(gVar);
    }

    public final void d(@NonNull g<T> gVar) {
        for (e<T, ?> eVar : this.f79151c) {
            this.f79149a.j(this.f79150b, eVar, gVar);
        }
    }
}
