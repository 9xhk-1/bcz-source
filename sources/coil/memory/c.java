package coil.memory;

import a00.l1;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import coil.decode.DataSource;
import coil.memory.MemoryCache;
import coil.request.ImageRequest;
import coil.size.Scale;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k0.a;
import k0.b;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import o0.j;
import o0.l;
import o0.m;
import u0.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMemoryCacheService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryCacheService.kt\ncoil/memory/MemoryCacheService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Collections.kt\ncoil/util/-Collections\n+ 4 Logs.kt\ncoil/util/-Logs\n+ 5 Dimension.kt\ncoil/size/-Dimensions\n+ 6 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 7 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,236:1\n1#2:237\n22#3,4:238\n21#4,4:242\n21#4,4:246\n21#4,4:252\n21#4,4:256\n57#5:250\n57#5:251\n50#6:260\n28#7:261\n*S KotlinDebug\n*F\n+ 1 MemoryCacheService.kt\ncoil/memory/MemoryCacheService\n*L\n62#1:238,4\n93#1:242,4\n116#1:246,4\n166#1:252,4\n176#1:256,4\n137#1:250\n138#1:251\n213#1:260\n213#1:261\n*E\n"})
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f9713d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f9714e = "MemoryCacheService";

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f9715f = "coil#transformation_";

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final String f9716g = "coil#transformation_size";

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final String f9717h = "coil#is_sampled";

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final String f9718i = "coil#disk_cache_key";

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b0.f f9719a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f9720b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final w f9721c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }

        @VisibleForTesting
        public static /* synthetic */ void a() {
        }

        @VisibleForTesting
        public static /* synthetic */ void b() {
        }

        @VisibleForTesting
        public static /* synthetic */ void c() {
        }

        @VisibleForTesting
        public static /* synthetic */ void d() {
        }
    }

    public c(@k b0.f fVar, @k l lVar, @m80.l w wVar) {
        this.f9719a = fVar;
        this.f9720b = lVar;
        this.f9721c = wVar;
    }

    @m80.l
    public final MemoryCache.b a(@k ImageRequest imageRequest, @k MemoryCache.Key key, @k q0.g gVar, @k Scale scale) {
        if (!imageRequest.C().getReadEnabled()) {
            return null;
        }
        MemoryCache g11 = this.f9719a.g();
        MemoryCache.b e11 = g11 != null ? g11.e(key) : null;
        if (e11 == null || !c(imageRequest, key, e11, gVar, scale)) {
            return null;
        }
        return e11;
    }

    public final String b(MemoryCache.b bVar) {
        Object obj = bVar.d().get(f9718i);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @VisibleForTesting
    public final boolean c(@k ImageRequest imageRequest, @k MemoryCache.Key key, @k MemoryCache.b bVar, @k q0.g gVar, @k Scale scale) {
        if (this.f9720b.c(imageRequest, u0.a.d(bVar.c()))) {
            return e(imageRequest, key, bVar, gVar, scale);
        }
        w wVar = this.f9721c;
        if (wVar == null || wVar.getLevel() > 3) {
            return false;
        }
        wVar.a(f9714e, 3, imageRequest.m() + ": Cached bitmap is hardware-backed, which is incompatible with the request.", null);
        return false;
    }

    public final boolean d(MemoryCache.b bVar) {
        Object obj = bVar.d().get(f9717h);
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c0, code lost:
    
        if (java.lang.Math.abs(r10 - r4) > 1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cd, code lost:
    
        if (java.lang.Math.abs(r12 - r1) > 1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(coil.request.ImageRequest r20, coil.memory.MemoryCache.Key r21, coil.memory.MemoryCache.b r22, q0.g r23, coil.size.Scale r24) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.memory.c.e(coil.request.ImageRequest, coil.memory.MemoryCache$Key, coil.memory.MemoryCache$b, q0.g, coil.size.Scale):boolean");
    }

    @m80.l
    public final MemoryCache.Key f(@k ImageRequest imageRequest, @k Object obj, @k j jVar, @k b0.c cVar) {
        MemoryCache.Key B = imageRequest.B();
        if (B != null) {
            return B;
        }
        cVar.r(imageRequest, obj);
        String f11 = this.f9719a.b().f(obj, jVar);
        cVar.e(imageRequest, f11);
        if (f11 == null) {
            return null;
        }
        List<s0.d> O = imageRequest.O();
        Map<String, String> f12 = imageRequest.E().f();
        if (O.isEmpty() && f12.isEmpty()) {
            return new MemoryCache.Key(f11, null, 2, null);
        }
        Map J0 = l1.J0(f12);
        if (!O.isEmpty()) {
            List<s0.d> O2 = imageRequest.O();
            int size = O2.size();
            for (int i11 = 0; i11 < size; i11++) {
                J0.put(f9715f + i11, O2.get(i11).getCacheKey());
            }
            J0.put(f9716g, jVar.p().toString());
        }
        return new MemoryCache.Key(f11, J0);
    }

    @k
    public final m g(@k b.a aVar, @k ImageRequest imageRequest, @k MemoryCache.Key key, @k MemoryCache.b bVar) {
        return new m(new BitmapDrawable(imageRequest.l().getResources(), bVar.c()), imageRequest, DataSource.MEMORY_CACHE, key, b(bVar), d(bVar), u0.l.C(aVar));
    }

    public final boolean h(@m80.l MemoryCache.Key key, @k ImageRequest imageRequest, @k a.b bVar) {
        MemoryCache g11;
        Bitmap bitmap;
        if (imageRequest.C().getWriteEnabled() && (g11 = this.f9719a.g()) != null && key != null) {
            Drawable e11 = bVar.e();
            BitmapDrawable bitmapDrawable = e11 instanceof BitmapDrawable ? (BitmapDrawable) e11 : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(f9717h, Boolean.valueOf(bVar.f()));
                String d11 = bVar.d();
                if (d11 != null) {
                    linkedHashMap.put(f9718i, d11);
                }
                g11.f(key, new MemoryCache.b(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }
}
