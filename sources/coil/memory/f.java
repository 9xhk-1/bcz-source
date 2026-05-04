package coil.memory;

import a00.r0;
import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import coil.memory.MemoryCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWeakMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakMemoryCache.kt\ncoil/memory/RealWeakMemoryCache\n+ 2 Collections.kt\ncoil/util/-Collections\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Utils.kt\ncoil/util/-Utils\n*L\n1#1,158:1\n44#2,2:159\n47#2:163\n55#2,9:172\n1#3:161\n1#3:162\n372#4,7:164\n162#5:171\n*S KotlinDebug\n*F\n+ 1 WeakMemoryCache.kt\ncoil/memory/RealWeakMemoryCache\n*L\n63#1:159,2\n63#1:163\n137#1:172,9\n63#1:162\n73#1:164,7\n77#1:171\n*E\n"})
/* loaded from: classes3.dex */
public final class f implements h {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f9730c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f9731d = 10;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap<MemoryCache.Key, ArrayList<b>> f9732a = new LinkedHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public int f9733b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f9734a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final WeakReference<Bitmap> f9735b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Map<String, Object> f9736c;

        /* renamed from: d, reason: collision with root package name */
        public final int f9737d;

        public b(int i11, @k WeakReference<Bitmap> weakReference, @k Map<String, ? extends Object> map, int i12) {
            this.f9734a = i11;
            this.f9735b = weakReference;
            this.f9736c = map;
            this.f9737d = i12;
        }

        @k
        public final WeakReference<Bitmap> a() {
            return this.f9735b;
        }

        @k
        public final Map<String, Object> b() {
            return this.f9736c;
        }

        public final int c() {
            return this.f9734a;
        }

        public final int d() {
            return this.f9737d;
        }
    }

    @Override // coil.memory.h
    public synchronized void a(@k MemoryCache.Key key, @k Bitmap bitmap, @k Map<String, ? extends Object> map, int i11) {
        try {
            LinkedHashMap<MemoryCache.Key, ArrayList<b>> linkedHashMap = this.f9732a;
            ArrayList<b> arrayList = linkedHashMap.get(key);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(key, arrayList);
            }
            ArrayList<b> arrayList2 = arrayList;
            int identityHashCode = System.identityHashCode(bitmap);
            b bVar = new b(identityHashCode, new WeakReference(bitmap), map, i11);
            int size = arrayList2.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    arrayList2.add(bVar);
                    break;
                }
                b bVar2 = arrayList2.get(i12);
                if (i11 < bVar2.d()) {
                    i12++;
                } else if (bVar2.c() == identityHashCode && bVar2.a().get() == bitmap) {
                    arrayList2.set(i12, bVar);
                } else {
                    arrayList2.add(i12, bVar);
                }
            }
            g();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // coil.memory.h
    public synchronized void b(int i11) {
        if (i11 >= 10 && i11 != 20) {
            f();
        }
    }

    @Override // coil.memory.h
    public synchronized void c() {
        this.f9733b = 0;
        this.f9732a.clear();
    }

    @Override // coil.memory.h
    public synchronized boolean d(@k MemoryCache.Key key) {
        return this.f9732a.remove(key) != null;
    }

    @Override // coil.memory.h
    @l
    public synchronized MemoryCache.b e(@k MemoryCache.Key key) {
        try {
            ArrayList<b> arrayList = this.f9732a.get(key);
            MemoryCache.b bVar = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                b bVar2 = arrayList.get(i11);
                Bitmap bitmap = bVar2.a().get();
                MemoryCache.b bVar3 = bitmap != null ? new MemoryCache.b(bitmap, bVar2.b()) : null;
                if (bVar3 != null) {
                    bVar = bVar3;
                    break;
                }
                i11++;
            }
            g();
            return bVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @VisibleForTesting
    public final void f() {
        WeakReference<Bitmap> a11;
        this.f9733b = 0;
        Iterator<ArrayList<b>> it = this.f9732a.values().iterator();
        while (it.hasNext()) {
            ArrayList<b> next = it.next();
            if (next.size() <= 1) {
                b bVar = (b) r0.L2(next);
                if (((bVar == null || (a11 = bVar.a()) == null) ? null : a11.get()) == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    int i13 = i12 - i11;
                    if (next.get(i13).a().get() == null) {
                        next.remove(i13);
                        i11++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public final void g() {
        int i11 = this.f9733b;
        this.f9733b = i11 + 1;
        if (i11 >= 10) {
            f();
        }
    }

    @Override // coil.memory.h
    @k
    public synchronized Set<MemoryCache.Key> getKeys() {
        return r0.f6(this.f9732a.keySet());
    }

    @k
    public final LinkedHashMap<MemoryCache.Key, ArrayList<b>> h() {
        return this.f9732a;
    }

    @VisibleForTesting
    public static /* synthetic */ void i() {
    }
}
