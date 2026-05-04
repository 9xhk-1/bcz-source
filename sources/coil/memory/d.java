package coil.memory;

import a00.x1;
import coil.memory.MemoryCache;
import java.util.Set;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d implements MemoryCache {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f9722a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f9723b;

    public d(@k g gVar, @k h hVar) {
        this.f9722a = gVar;
        this.f9723b = hVar;
    }

    @Override // coil.memory.MemoryCache
    public int a() {
        return this.f9722a.a();
    }

    @Override // coil.memory.MemoryCache
    public void b(int i11) {
        this.f9722a.b(i11);
        this.f9723b.b(i11);
    }

    @Override // coil.memory.MemoryCache
    public void clear() {
        this.f9722a.c();
        this.f9723b.c();
    }

    @Override // coil.memory.MemoryCache
    public boolean d(@k MemoryCache.Key key) {
        return this.f9722a.d(key) || this.f9723b.d(key);
    }

    @Override // coil.memory.MemoryCache
    @l
    public MemoryCache.b e(@k MemoryCache.Key key) {
        MemoryCache.b e11 = this.f9722a.e(key);
        return e11 == null ? this.f9723b.e(key) : e11;
    }

    @Override // coil.memory.MemoryCache
    public void f(@k MemoryCache.Key key, @k MemoryCache.b bVar) {
        this.f9722a.f(MemoryCache.Key.b(key, null, u0.c.h(key.c()), 1, null), bVar.c(), u0.c.h(bVar.d()));
    }

    @Override // coil.memory.MemoryCache
    @k
    public Set<MemoryCache.Key> getKeys() {
        return x1.C(this.f9722a.getKeys(), this.f9723b.getKeys());
    }

    @Override // coil.memory.MemoryCache
    public int getSize() {
        return this.f9722a.getSize();
    }
}
