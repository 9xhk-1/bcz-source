package androidx.compose.ui.text.font;

import androidx.collection.LruCache;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.SynchronizedObject;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,444:1\n28#2:445\n34#2,2:446\n34#2,2:448\n34#2,2:450\n34#2,2:452\n34#2,2:454\n1#3:456\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n*L\n370#1:445\n379#1:446,2\n396#1:448,2\n406#1:450,2\n413#1:452,2\n434#1:454,2\n*E\n"})
/* loaded from: classes2.dex */
public final class AsyncTypefaceCache {
    public static final int $stable = 8;

    @k
    private final Object PermanentFailure = AsyncTypefaceResult.m4626constructorimpl(null);

    @k
    private final LruCache<Key, AsyncTypefaceResult> resultCache = new LruCache<>(16);

    @k
    private final MutableScatterMap<Key, AsyncTypefaceResult> permanentCache = ScatterMapKt.mutableScatterMapOf();

    @k
    private final SynchronizedObject cacheLock = new SynchronizedObject();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class Key {
        public static final int $stable = 8;

        @k
        private final Font font;

        @l
        private final Object loaderKey;

        public Key(@k Font font, @l Object obj) {
            this.font = font;
            this.loaderKey = obj;
        }

        public static /* synthetic */ Key copy$default(Key key, Font font, Object obj, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                font = key.font;
            }
            if ((i11 & 2) != 0) {
                obj = key.loaderKey;
            }
            return key.copy(font, obj);
        }

        @k
        public final Font component1() {
            return this.font;
        }

        @l
        public final Object component2() {
            return this.loaderKey;
        }

        @k
        public final Key copy(@k Font font, @l Object obj) {
            return new Key(font, obj);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return g0.g(this.font, key.font) && g0.g(this.loaderKey, key.loaderKey);
        }

        @k
        public final Font getFont() {
            return this.font;
        }

        @l
        public final Object getLoaderKey() {
            return this.loaderKey;
        }

        public int hashCode() {
            int hashCode = this.font.hashCode() * 31;
            Object obj = this.loaderKey;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        @k
        public String toString() {
            return "Key(font=" + this.font + ", loaderKey=" + this.loaderKey + ')';
        }
    }

    public static /* synthetic */ void put$default(AsyncTypefaceCache asyncTypefaceCache, Font font, PlatformFontLoader platformFontLoader, Object obj, boolean z11, int i11, Object obj2) {
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        asyncTypefaceCache.put(font, platformFontLoader, obj, z11);
    }

    @l
    /* renamed from: get-1ASDuI8, reason: not valid java name */
    public final AsyncTypefaceResult m4624get1ASDuI8(@k Font font, @k PlatformFontLoader platformFontLoader) {
        AsyncTypefaceResult asyncTypefaceResult;
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            asyncTypefaceResult = this.resultCache.get(key);
            if (asyncTypefaceResult == null) {
                asyncTypefaceResult = this.permanentCache.get(key);
            }
        }
        return asyncTypefaceResult;
    }

    public final void put(@k Font font, @k PlatformFontLoader platformFontLoader, @l Object obj, boolean z11) {
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            try {
                if (obj == null) {
                    this.permanentCache.set(key, AsyncTypefaceResult.m4625boximpl(this.PermanentFailure));
                    g2 g2Var = g2.f100423a;
                } else if (z11) {
                    this.permanentCache.set(key, AsyncTypefaceResult.m4625boximpl(AsyncTypefaceResult.m4626constructorimpl(obj)));
                    g2 g2Var2 = g2.f100423a;
                } else {
                    this.resultCache.put(key, AsyncTypefaceResult.m4625boximpl(AsyncTypefaceResult.m4626constructorimpl(obj)));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runCached(@m80.k androidx.compose.ui.text.font.Font r5, @m80.k androidx.compose.ui.text.font.PlatformFontLoader r6, boolean r7, @m80.k x00.l<? super j00.c<java.lang.Object>, ? extends java.lang.Object> r8, @m80.k j00.c<java.lang.Object> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = (androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            boolean r7 = r0.Z$0
            java.lang.Object r5 = r0.L$1
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r5 = (androidx.compose.ui.text.font.AsyncTypefaceCache.Key) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.text.font.AsyncTypefaceCache r6 = (androidx.compose.ui.text.font.AsyncTypefaceCache) r6
            kotlin.e.n(r9)
            goto L7d
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.e.n(r9)
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r9 = new androidx.compose.ui.text.font.AsyncTypefaceCache$Key
            java.lang.Object r6 = r6.getCacheKey()
            r9.<init>(r5, r6)
            androidx.compose.ui.text.platform.SynchronizedObject r5 = r4.cacheLock
            monitor-enter(r5)
            androidx.collection.LruCache<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r6 = r4.resultCache     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r6 = r6.get(r9)     // Catch: java.lang.Throwable -> L5d
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r6 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r6     // Catch: java.lang.Throwable -> L5d
            if (r6 != 0) goto L5f
            androidx.collection.MutableScatterMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r6 = r4.permanentCache     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r6 = r6.get(r9)     // Catch: java.lang.Throwable -> L5d
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r6 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r6     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r6 = move-exception
            goto Lb3
        L5f:
            if (r6 == 0) goto L67
            java.lang.Object r6 = r6.m4632unboximpl()     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r5)
            return r6
        L67:
            yz.g2 r6 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r5)
            r0.L$0 = r4
            r0.L$1 = r9
            r0.Z$0 = r7
            r0.label = r3
            java.lang.Object r5 = r8.invoke(r0)
            if (r5 != r1) goto L79
            return r1
        L79:
            r6 = r9
            r9 = r5
            r5 = r6
            r6 = r4
        L7d:
            androidx.compose.ui.text.platform.SynchronizedObject r8 = r6.cacheLock
            monitor-enter(r8)
            if (r9 != 0) goto L90
            androidx.collection.MutableScatterMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r6.permanentCache     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r6 = r6.PermanentFailure     // Catch: java.lang.Throwable -> L8e
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r6 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4625boximpl(r6)     // Catch: java.lang.Throwable -> L8e
            r7.set(r5, r6)     // Catch: java.lang.Throwable -> L8e
            goto Lad
        L8e:
            r5 = move-exception
            goto Lb1
        L90:
            if (r7 == 0) goto La0
            androidx.collection.MutableScatterMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r6 = r6.permanentCache     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r7 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4626constructorimpl(r9)     // Catch: java.lang.Throwable -> L8e
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4625boximpl(r7)     // Catch: java.lang.Throwable -> L8e
            r6.set(r5, r7)     // Catch: java.lang.Throwable -> L8e
            goto Lad
        La0:
            androidx.collection.LruCache<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r6 = r6.resultCache     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r7 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4626constructorimpl(r9)     // Catch: java.lang.Throwable -> L8e
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4625boximpl(r7)     // Catch: java.lang.Throwable -> L8e
            r6.put(r5, r7)     // Catch: java.lang.Throwable -> L8e
        Lad:
            yz.g2 r5 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r8)
            return r9
        Lb1:
            monitor-exit(r8)
            throw r5
        Lb3:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncTypefaceCache.runCached(androidx.compose.ui.text.font.Font, androidx.compose.ui.text.font.PlatformFontLoader, boolean, x00.l, j00.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final Object runCachedBlocking(@k Font font, @k PlatformFontLoader platformFontLoader, @k x00.a<? extends Object> aVar) {
        synchronized (this.cacheLock) {
            try {
                Key key = new Key(font, platformFontLoader.getCacheKey());
                AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceResult) this.resultCache.get(key);
                if (asyncTypefaceResult == null) {
                    asyncTypefaceResult = (AsyncTypefaceResult) this.permanentCache.get(key);
                }
                if (asyncTypefaceResult != null) {
                    Object m4632unboximpl = asyncTypefaceResult.m4632unboximpl();
                    d0.d(2);
                    d0.c(2);
                    return m4632unboximpl;
                }
                g2 g2Var = g2.f100423a;
                d0.d(1);
                d0.c(1);
                Object invoke = aVar.invoke();
                put$default(this, font, platformFontLoader, invoke, false, 8, null);
                return invoke;
            } catch (Throwable th2) {
                d0.d(1);
                d0.c(1);
                throw th2;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @w00.h
    public static final class AsyncTypefaceResult {

        @l
        private final Object result;

        private /* synthetic */ AsyncTypefaceResult(Object obj) {
            this.result = obj;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ AsyncTypefaceResult m4625boximpl(Object obj) {
            return new AsyncTypefaceResult(obj);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m4627equalsimpl(Object obj, Object obj2) {
            return (obj2 instanceof AsyncTypefaceResult) && g0.g(obj, ((AsyncTypefaceResult) obj2).m4632unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4628equalsimpl0(Object obj, Object obj2) {
            return g0.g(obj, obj2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m4629hashCodeimpl(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* renamed from: isPermanentFailure-impl, reason: not valid java name */
        public static final boolean m4630isPermanentFailureimpl(Object obj) {
            return obj == null;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m4631toStringimpl(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return m4627equalsimpl(this.result, obj);
        }

        @l
        public final Object getResult() {
            return this.result;
        }

        public int hashCode() {
            return m4629hashCodeimpl(this.result);
        }

        public String toString() {
            return m4631toStringimpl(this.result);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Object m4632unboximpl() {
            return this.result;
        }

        @k
        /* renamed from: constructor-impl, reason: not valid java name */
        public static Object m4626constructorimpl(@l Object obj) {
            return obj;
        }
    }
}
