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
public final class b implements h {
    @Override // coil.memory.h
    public boolean d(@k MemoryCache.Key key) {
        return false;
    }

    @Override // coil.memory.h
    @l
    public MemoryCache.b e(@k MemoryCache.Key key) {
        return null;
    }

    @Override // coil.memory.h
    @k
    public Set<MemoryCache.Key> getKeys() {
        return w1.k();
    }

    @Override // coil.memory.h
    public void c() {
    }

    @Override // coil.memory.h
    public void b(int i11) {
    }

    @Override // coil.memory.h
    public void a(@k MemoryCache.Key key, @k Bitmap bitmap, @k Map<String, ? extends Object> map, int i11) {
    }
}
