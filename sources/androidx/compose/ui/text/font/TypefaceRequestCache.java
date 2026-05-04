package androidx.compose.ui.text.font;

import androidx.collection.LruCache;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,259:1\n28#2:260\n34#2,2:261\n34#2,2:263\n34#2,2:265\n34#2,2:267\n34#2,2:269\n34#2,2:271\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n*L\n168#1:260\n176#1:261,2\n216#1:263,2\n233#1:265,2\n247#1:267,2\n253#1:269,2\n257#1:271,2\n*E\n"})
/* loaded from: classes2.dex */
public final class TypefaceRequestCache {
    public static final int $stable = 8;

    @k
    private final SynchronizedObject lock = new SynchronizedObject();

    @k
    private final LruCache<TypefaceRequest, TypefaceResult> resultCache = new LruCache<>(16);

    @l
    public final TypefaceResult get$ui_text_release(@k TypefaceRequest typefaceRequest) {
        TypefaceResult typefaceResult;
        synchronized (this.lock) {
            typefaceResult = this.resultCache.get(typefaceRequest);
        }
        return typefaceResult;
    }

    @k
    public final SynchronizedObject getLock$ui_text_release() {
        return this.lock;
    }

    public final int getSize$ui_text_release() {
        int size;
        synchronized (this.lock) {
            size = this.resultCache.size();
        }
        return size;
    }

    public final void preWarmCache(@k List<TypefaceRequest> list, @k x00.l<? super TypefaceRequest, ? extends TypefaceResult> lVar) {
        TypefaceResult typefaceResult;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            TypefaceRequest typefaceRequest = list.get(i11);
            synchronized (this.lock) {
                typefaceResult = this.resultCache.get(typefaceRequest);
            }
            if (typefaceResult == null) {
                try {
                    TypefaceResult invoke = lVar.invoke(typefaceRequest);
                    if (invoke instanceof TypefaceResult.Async) {
                        continue;
                    } else {
                        synchronized (this.lock) {
                            this.resultCache.put(typefaceRequest, invoke);
                        }
                    }
                } catch (Exception e11) {
                    throw new IllegalStateException("Could not load font", e11);
                }
            }
        }
    }

    @k
    public final State<Object> runCached(@k final TypefaceRequest typefaceRequest, @k x00.l<? super x00.l<? super TypefaceResult, g2>, ? extends TypefaceResult> lVar) {
        synchronized (this.lock) {
            TypefaceResult typefaceResult = this.resultCache.get(typefaceRequest);
            if (typefaceResult != null) {
                if (typefaceResult.getCacheable()) {
                    return typefaceResult;
                }
                this.resultCache.remove(typefaceRequest);
            }
            try {
                TypefaceResult invoke = lVar.invoke(new x00.l<TypefaceResult, g2>() { // from class: androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(TypefaceResult typefaceResult2) {
                        invoke2(typefaceResult2);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TypefaceResult typefaceResult2) {
                        LruCache lruCache;
                        LruCache lruCache2;
                        SynchronizedObject lock$ui_text_release = TypefaceRequestCache.this.getLock$ui_text_release();
                        TypefaceRequestCache typefaceRequestCache = TypefaceRequestCache.this;
                        TypefaceRequest typefaceRequest2 = typefaceRequest;
                        synchronized (lock$ui_text_release) {
                            try {
                                if (typefaceResult2.getCacheable()) {
                                    lruCache2 = typefaceRequestCache.resultCache;
                                    lruCache2.put(typefaceRequest2, typefaceResult2);
                                } else {
                                    lruCache = typefaceRequestCache.resultCache;
                                    lruCache.remove(typefaceRequest2);
                                }
                                g2 g2Var = g2.f100423a;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                });
                synchronized (this.lock) {
                    try {
                        if (this.resultCache.get(typefaceRequest) == null && invoke.getCacheable()) {
                            this.resultCache.put(typefaceRequest, invoke);
                        }
                        g2 g2Var = g2.f100423a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return invoke;
            } catch (Exception e11) {
                throw new IllegalStateException("Could not load font", e11);
            }
        }
    }
}
