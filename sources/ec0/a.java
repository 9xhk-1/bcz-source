package ec0;

import java.util.concurrent.atomic.AtomicReference;
import qb0.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a implements h {

    /* renamed from: b, reason: collision with root package name */
    public static final wb0.a f49630b = new C0596a();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<wb0.a> f49631a;

    public a() {
        this.f49631a = new AtomicReference<>();
    }

    public static a a() {
        return new a();
    }

    public static a b(wb0.a aVar) {
        return new a(aVar);
    }

    @Override // qb0.h
    public boolean isUnsubscribed() {
        return this.f49631a.get() == f49630b;
    }

    @Override // qb0.h
    public void unsubscribe() {
        wb0.a andSet;
        wb0.a aVar = this.f49631a.get();
        wb0.a aVar2 = f49630b;
        if (aVar == aVar2 || (andSet = this.f49631a.getAndSet(aVar2)) == null || andSet == aVar2) {
            return;
        }
        andSet.call();
    }

    public a(wb0.a aVar) {
        this.f49631a = new AtomicReference<>(aVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ec0.a$a, reason: collision with other inner class name */
    public static class C0596a implements wb0.a {
        @Override // wb0.a
        public void call() {
        }
    }
}
