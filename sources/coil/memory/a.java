package coil.memory;

import a00.w1;
import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;
import java.util.Set;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f9712a;

    public a(@k h hVar) {
        this.f9712a = hVar;
    }

    @Override // coil.memory.g
    public int a() {
        return 0;
    }

    @Override // coil.memory.g
    public boolean d(@k MemoryCache.Key key) {
        return false;
    }

    @Override // coil.memory.g
    @l
    public MemoryCache.b e(@k MemoryCache.Key key) {
        return null;
    }

    @Override // coil.memory.g
    public void f(@k MemoryCache.Key key, @k Bitmap bitmap, @k Map<String, ? extends Object> map) {
        this.f9712a.a(key, bitmap, map, u0.a.a(bitmap));
    }

    @Override // coil.memory.g
    @k
    public Set<MemoryCache.Key> getKeys() {
        return w1.k();
    }

    @Override // coil.memory.g
    public int getSize() {
        return 0;
    }

    @Override // coil.memory.g
    public void c() {
    }

    @Override // coil.memory.g
    public void b(int i11) {
    }
}
