package coil.memory;

import android.graphics.Bitmap;
import androidx.collection.LruCache;
import coil.memory.MemoryCache;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nStrongMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrongMemoryCache.kt\ncoil/memory/RealStrongMemoryCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
/* loaded from: classes3.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f9724a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f9725b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Bitmap f9726a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, Object> f9727b;

        /* renamed from: c, reason: collision with root package name */
        public final int f9728c;

        public a(@k Bitmap bitmap, @k Map<String, ? extends Object> map, int i11) {
            this.f9726a = bitmap;
            this.f9727b = map;
            this.f9728c = i11;
        }

        @k
        public final Bitmap a() {
            return this.f9726a;
        }

        @k
        public final Map<String, Object> b() {
            return this.f9727b;
        }

        public final int c() {
            return this.f9728c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends LruCache<MemoryCache.Key, a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f9729a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11, e eVar) {
            super(i11);
            this.f9729a = eVar;
        }

        @Override // androidx.collection.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void entryRemoved(boolean z11, @k MemoryCache.Key key, @k a aVar, @l a aVar2) {
            this.f9729a.f9724a.a(key, aVar.a(), aVar.b(), aVar.c());
        }

        @Override // androidx.collection.LruCache
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int sizeOf(@k MemoryCache.Key key, @k a aVar) {
            return aVar.c();
        }
    }

    public e(int i11, @k h hVar) {
        this.f9724a = hVar;
        this.f9725b = new b(i11, this);
    }

    @Override // coil.memory.g
    public int a() {
        return this.f9725b.maxSize();
    }

    @Override // coil.memory.g
    public void b(int i11) {
        if (i11 >= 40) {
            c();
        } else {
            if (10 > i11 || i11 >= 20) {
                return;
            }
            this.f9725b.trimToSize(getSize() / 2);
        }
    }

    @Override // coil.memory.g
    public void c() {
        this.f9725b.evictAll();
    }

    @Override // coil.memory.g
    public boolean d(@k MemoryCache.Key key) {
        return this.f9725b.remove(key) != null;
    }

    @Override // coil.memory.g
    @l
    public MemoryCache.b e(@k MemoryCache.Key key) {
        a aVar = this.f9725b.get(key);
        if (aVar != null) {
            return new MemoryCache.b(aVar.a(), aVar.b());
        }
        return null;
    }

    @Override // coil.memory.g
    public void f(@k MemoryCache.Key key, @k Bitmap bitmap, @k Map<String, ? extends Object> map) {
        int a11 = u0.a.a(bitmap);
        if (a11 <= a()) {
            this.f9725b.put(key, new a(bitmap, map, a11));
        } else {
            this.f9725b.remove(key);
            this.f9724a.a(key, bitmap, map, a11);
        }
    }

    @Override // coil.memory.g
    @k
    public Set<MemoryCache.Key> getKeys() {
        return this.f9725b.snapshot().keySet();
    }

    @Override // coil.memory.g
    public int getSize() {
        return this.f9725b.size();
    }
}
