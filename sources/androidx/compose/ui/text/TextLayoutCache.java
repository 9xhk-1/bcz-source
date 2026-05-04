package androidx.compose.ui.text;

import androidx.collection.LruCache;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TextLayoutCache {
    public static final int $stable = 8;

    @l
    private final LruCache<CacheTextLayoutInput, TextLayoutResult> cache;

    @l
    private CacheTextLayoutInput singleSizeCacheInput;

    @l
    private TextLayoutResult singleSizeCacheResult;

    public TextLayoutCache() {
        this(0, 1, null);
    }

    @l
    public final TextLayoutResult get(@k TextLayoutInput textLayoutInput) {
        TextLayoutResult textLayoutResult;
        CacheTextLayoutInput cacheTextLayoutInput = new CacheTextLayoutInput(textLayoutInput);
        LruCache<CacheTextLayoutInput, TextLayoutResult> lruCache = this.cache;
        if (lruCache != null) {
            textLayoutResult = lruCache.get(cacheTextLayoutInput);
        } else {
            if (!g0.g(this.singleSizeCacheInput, cacheTextLayoutInput)) {
                return null;
            }
            textLayoutResult = this.singleSizeCacheResult;
        }
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
            return null;
        }
        return textLayoutResult;
    }

    public final void put(@k TextLayoutInput textLayoutInput, @k TextLayoutResult textLayoutResult) {
        LruCache<CacheTextLayoutInput, TextLayoutResult> lruCache = this.cache;
        if (lruCache != null) {
            lruCache.put(new CacheTextLayoutInput(textLayoutInput), textLayoutResult);
        } else {
            this.singleSizeCacheInput = new CacheTextLayoutInput(textLayoutInput);
            this.singleSizeCacheResult = textLayoutResult;
        }
    }

    public TextLayoutCache(int i11) {
        this.cache = i11 != 1 ? new LruCache<>(i11) : null;
    }

    public /* synthetic */ TextLayoutCache(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 8 : i11);
    }
}
