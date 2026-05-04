package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;
import java.util.Set;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface h {
    void a(@k MemoryCache.Key key, @k Bitmap bitmap, @k Map<String, ? extends Object> map, int i11);

    void b(int i11);

    void c();

    boolean d(@k MemoryCache.Key key);

    @l
    MemoryCache.b e(@k MemoryCache.Key key);

    @k
    Set<MemoryCache.Key> getKeys();
}
