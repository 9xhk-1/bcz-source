package bl;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import bl.a;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.util.Map;
import kk.j;
import sk.d1;
import sk.m;
import sk.n;
import sk.o;
import sk.t;
import sk.v;
import uk.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    private static final int DISK_CACHE_STRATEGY = 4;
    private static final int ERROR_ID = 32;
    private static final int ERROR_PLACEHOLDER = 16;
    private static final int FALLBACK = 8192;
    private static final int FALLBACK_ID = 16384;
    private static final int IS_CACHEABLE = 256;
    private static final int ONLY_RETRIEVE_FROM_CACHE = 524288;
    private static final int OVERRIDE = 512;
    private static final int PLACEHOLDER = 64;
    private static final int PLACEHOLDER_ID = 128;
    private static final int PRIORITY = 8;
    private static final int RESOURCE_CLASS = 4096;
    private static final int SIGNATURE = 1024;
    private static final int SIZE_MULTIPLIER = 2;
    private static final int THEME = 32768;
    private static final int TRANSFORMATION = 2048;
    private static final int TRANSFORMATION_ALLOWED = 65536;
    private static final int TRANSFORMATION_REQUIRED = 131072;
    private static final int UNSET = -1;
    private static final int USE_ANIMATION_POOL = 1048576;
    private static final int USE_UNLIMITED_SOURCE_GENERATORS_POOL = 262144;
    private int errorId;

    @Nullable
    private Drawable errorPlaceholder;

    @Nullable
    private Drawable fallbackDrawable;
    private int fallbackId;
    private int fields;
    private boolean isAutoCloneEnabled;
    private boolean isLocked;
    private boolean isTransformationRequired;
    private boolean onlyRetrieveFromCache;

    @Nullable
    private Drawable placeholderDrawable;
    private int placeholderId;

    @Nullable
    private Resources.Theme theme;
    private boolean useAnimationPool;
    private boolean useUnlimitedSourceGeneratorsPool;
    private float sizeMultiplier = 1.0f;

    @NonNull
    private j diskCacheStrategy = j.f66725e;

    @NonNull
    private Priority priority = Priority.NORMAL;
    private boolean isCacheable = true;
    private int overrideHeight = -1;
    private int overrideWidth = -1;

    @NonNull
    private ik.b signature = el.c.c();
    private boolean isTransformationAllowed = true;

    @NonNull
    private ik.e options = new ik.e();

    @NonNull
    private Map<Class<?>, ik.h<?>> transformations = new fl.b();

    @NonNull
    private Class<?> resourceClass = Object.class;
    private boolean isScaleOnlyOrNoTransform = true;

    public static boolean b(int i11, int i12) {
        return (i11 & i12) != 0;
    }

    public final boolean a(int i11) {
        return b(this.fields, i11);
    }

    @NonNull
    @CheckResult
    public T apply(@NonNull a<?> aVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().apply(aVar);
        }
        if (b(aVar.fields, 2)) {
            this.sizeMultiplier = aVar.sizeMultiplier;
        }
        if (b(aVar.fields, 262144)) {
            this.useUnlimitedSourceGeneratorsPool = aVar.useUnlimitedSourceGeneratorsPool;
        }
        if (b(aVar.fields, 1048576)) {
            this.useAnimationPool = aVar.useAnimationPool;
        }
        if (b(aVar.fields, 4)) {
            this.diskCacheStrategy = aVar.diskCacheStrategy;
        }
        if (b(aVar.fields, 8)) {
            this.priority = aVar.priority;
        }
        if (b(aVar.fields, 16)) {
            this.errorPlaceholder = aVar.errorPlaceholder;
            this.errorId = 0;
            this.fields &= -33;
        }
        if (b(aVar.fields, 32)) {
            this.errorId = aVar.errorId;
            this.errorPlaceholder = null;
            this.fields &= -17;
        }
        if (b(aVar.fields, 64)) {
            this.placeholderDrawable = aVar.placeholderDrawable;
            this.placeholderId = 0;
            this.fields &= -129;
        }
        if (b(aVar.fields, 128)) {
            this.placeholderId = aVar.placeholderId;
            this.placeholderDrawable = null;
            this.fields &= -65;
        }
        if (b(aVar.fields, 256)) {
            this.isCacheable = aVar.isCacheable;
        }
        if (b(aVar.fields, 512)) {
            this.overrideWidth = aVar.overrideWidth;
            this.overrideHeight = aVar.overrideHeight;
        }
        if (b(aVar.fields, 1024)) {
            this.signature = aVar.signature;
        }
        if (b(aVar.fields, 4096)) {
            this.resourceClass = aVar.resourceClass;
        }
        if (b(aVar.fields, 8192)) {
            this.fallbackDrawable = aVar.fallbackDrawable;
            this.fallbackId = 0;
            this.fields &= -16385;
        }
        if (b(aVar.fields, 16384)) {
            this.fallbackId = aVar.fallbackId;
            this.fallbackDrawable = null;
            this.fields &= -8193;
        }
        if (b(aVar.fields, 32768)) {
            this.theme = aVar.theme;
        }
        if (b(aVar.fields, 65536)) {
            this.isTransformationAllowed = aVar.isTransformationAllowed;
        }
        if (b(aVar.fields, 131072)) {
            this.isTransformationRequired = aVar.isTransformationRequired;
        }
        if (b(aVar.fields, 2048)) {
            this.transformations.putAll(aVar.transformations);
            this.isScaleOnlyOrNoTransform = aVar.isScaleOnlyOrNoTransform;
        }
        if (b(aVar.fields, 524288)) {
            this.onlyRetrieveFromCache = aVar.onlyRetrieveFromCache;
        }
        if (!this.isTransformationAllowed) {
            this.transformations.clear();
            int i11 = this.fields;
            this.isTransformationRequired = false;
            this.fields = i11 & (-133121);
            this.isScaleOnlyOrNoTransform = true;
        }
        this.fields |= aVar.fields;
        this.options.d(aVar.options);
        return selfOrThrowIfLocked();
    }

    @NonNull
    public T autoClone() {
        if (this.isLocked && !this.isAutoCloneEnabled) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.isAutoCloneEnabled = true;
        return lock();
    }

    @NonNull
    public final T c(@NonNull DownsampleStrategy downsampleStrategy, @NonNull ik.h<Bitmap> hVar) {
        return e(downsampleStrategy, hVar, false);
    }

    @NonNull
    @CheckResult
    public T centerCrop() {
        return transform(DownsampleStrategy.f28811e, new m());
    }

    @NonNull
    @CheckResult
    public T centerInside() {
        return d(DownsampleStrategy.f28810d, new n());
    }

    @NonNull
    @CheckResult
    public T circleCrop() {
        return transform(DownsampleStrategy.f28810d, new o());
    }

    @NonNull
    public final T d(@NonNull DownsampleStrategy downsampleStrategy, @NonNull ik.h<Bitmap> hVar) {
        return e(downsampleStrategy, hVar, true);
    }

    @NonNull
    @CheckResult
    public T decode(@NonNull Class<?> cls) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().decode(cls);
        }
        this.resourceClass = (Class) fl.m.e(cls);
        this.fields |= 4096;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T disallowHardwareConfig() {
        return set(com.bumptech.glide.load.resource.bitmap.a.f28821k, Boolean.FALSE);
    }

    @NonNull
    @CheckResult
    public T diskCacheStrategy(@NonNull j jVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().diskCacheStrategy(jVar);
        }
        this.diskCacheStrategy = (j) fl.m.e(jVar);
        this.fields |= 4;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T dontAnimate() {
        return set(wk.i.f96470b, Boolean.TRUE);
    }

    @NonNull
    @CheckResult
    public T dontTransform() {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().dontTransform();
        }
        this.transformations.clear();
        int i11 = this.fields;
        this.isTransformationRequired = false;
        this.isTransformationAllowed = false;
        this.fields = (i11 & (-133121)) | 65536;
        this.isScaleOnlyOrNoTransform = true;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T downsample(@NonNull DownsampleStrategy downsampleStrategy) {
        return set(DownsampleStrategy.f28814h, (DownsampleStrategy) fl.m.e(downsampleStrategy));
    }

    @NonNull
    public final T e(@NonNull DownsampleStrategy downsampleStrategy, @NonNull ik.h<Bitmap> hVar, boolean z11) {
        T transform = z11 ? transform(downsampleStrategy, hVar) : optionalTransform(downsampleStrategy, hVar);
        transform.isScaleOnlyOrNoTransform = true;
        return transform;
    }

    @NonNull
    @CheckResult
    public T encodeFormat(@NonNull Bitmap.CompressFormat compressFormat) {
        return set(sk.e.f88756c, (Bitmap.CompressFormat) fl.m.e(compressFormat));
    }

    @NonNull
    @CheckResult
    public T encodeQuality(@IntRange(from = 0, to = 100) int i11) {
        return set(sk.e.f88755b, Integer.valueOf(i11));
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return isEquivalentTo((a) obj);
        }
        return false;
    }

    @NonNull
    @CheckResult
    public T error(@Nullable Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().error(drawable);
        }
        this.errorPlaceholder = drawable;
        int i11 = this.fields | 16;
        this.errorId = 0;
        this.fields = i11 & (-33);
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T fallback(@Nullable Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().fallback(drawable);
        }
        this.fallbackDrawable = drawable;
        int i11 = this.fields | 8192;
        this.fallbackId = 0;
        this.fields = i11 & (-16385);
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T fitCenter() {
        return d(DownsampleStrategy.f28809c, new v());
    }

    @NonNull
    @CheckResult
    public T format(@NonNull DecodeFormat decodeFormat) {
        fl.m.e(decodeFormat);
        return (T) set(com.bumptech.glide.load.resource.bitmap.a.f28817g, decodeFormat).set(wk.i.f96469a, decodeFormat);
    }

    @NonNull
    @CheckResult
    public T frame(@IntRange(from = 0) long j11) {
        return set(d1.f88743g, Long.valueOf(j11));
    }

    @NonNull
    public final j getDiskCacheStrategy() {
        return this.diskCacheStrategy;
    }

    public final int getErrorId() {
        return this.errorId;
    }

    @Nullable
    public final Drawable getErrorPlaceholder() {
        return this.errorPlaceholder;
    }

    @Nullable
    public final Drawable getFallbackDrawable() {
        return this.fallbackDrawable;
    }

    public final int getFallbackId() {
        return this.fallbackId;
    }

    public final boolean getOnlyRetrieveFromCache() {
        return this.onlyRetrieveFromCache;
    }

    @NonNull
    public final ik.e getOptions() {
        return this.options;
    }

    public final int getOverrideHeight() {
        return this.overrideHeight;
    }

    public final int getOverrideWidth() {
        return this.overrideWidth;
    }

    @Nullable
    public final Drawable getPlaceholderDrawable() {
        return this.placeholderDrawable;
    }

    public final int getPlaceholderId() {
        return this.placeholderId;
    }

    @NonNull
    public final Priority getPriority() {
        return this.priority;
    }

    @NonNull
    public final Class<?> getResourceClass() {
        return this.resourceClass;
    }

    @NonNull
    public final ik.b getSignature() {
        return this.signature;
    }

    public final float getSizeMultiplier() {
        return this.sizeMultiplier;
    }

    @Nullable
    public final Resources.Theme getTheme() {
        return this.theme;
    }

    @NonNull
    public final Map<Class<?>, ik.h<?>> getTransformations() {
        return this.transformations;
    }

    public final boolean getUseAnimationPool() {
        return this.useAnimationPool;
    }

    public final boolean getUseUnlimitedSourceGeneratorsPool() {
        return this.useUnlimitedSourceGeneratorsPool;
    }

    public int hashCode() {
        return fl.o.r(this.theme, fl.o.r(this.signature, fl.o.r(this.resourceClass, fl.o.r(this.transformations, fl.o.r(this.options, fl.o.r(this.priority, fl.o.r(this.diskCacheStrategy, fl.o.t(this.onlyRetrieveFromCache, fl.o.t(this.useUnlimitedSourceGeneratorsPool, fl.o.t(this.isTransformationAllowed, fl.o.t(this.isTransformationRequired, fl.o.q(this.overrideWidth, fl.o.q(this.overrideHeight, fl.o.t(this.isCacheable, fl.o.r(this.fallbackDrawable, fl.o.q(this.fallbackId, fl.o.r(this.placeholderDrawable, fl.o.q(this.placeholderId, fl.o.r(this.errorPlaceholder, fl.o.q(this.errorId, fl.o.n(this.sizeMultiplier)))))))))))))))))))));
    }

    public final boolean isAutoCloneEnabled() {
        return this.isAutoCloneEnabled;
    }

    public final boolean isDiskCacheStrategySet() {
        return a(4);
    }

    public final boolean isEquivalentTo(a<?> aVar) {
        return Float.compare(aVar.sizeMultiplier, this.sizeMultiplier) == 0 && this.errorId == aVar.errorId && fl.o.e(this.errorPlaceholder, aVar.errorPlaceholder) && this.placeholderId == aVar.placeholderId && fl.o.e(this.placeholderDrawable, aVar.placeholderDrawable) && this.fallbackId == aVar.fallbackId && fl.o.e(this.fallbackDrawable, aVar.fallbackDrawable) && this.isCacheable == aVar.isCacheable && this.overrideHeight == aVar.overrideHeight && this.overrideWidth == aVar.overrideWidth && this.isTransformationRequired == aVar.isTransformationRequired && this.isTransformationAllowed == aVar.isTransformationAllowed && this.useUnlimitedSourceGeneratorsPool == aVar.useUnlimitedSourceGeneratorsPool && this.onlyRetrieveFromCache == aVar.onlyRetrieveFromCache && this.diskCacheStrategy.equals(aVar.diskCacheStrategy) && this.priority == aVar.priority && this.options.equals(aVar.options) && this.transformations.equals(aVar.transformations) && this.resourceClass.equals(aVar.resourceClass) && fl.o.e(this.signature, aVar.signature) && fl.o.e(this.theme, aVar.theme);
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final boolean isMemoryCacheable() {
        return this.isCacheable;
    }

    public final boolean isPrioritySet() {
        return a(8);
    }

    public boolean isScaleOnlyOrNoTransform() {
        return this.isScaleOnlyOrNoTransform;
    }

    public final boolean isSkipMemoryCacheSet() {
        return a(256);
    }

    public final boolean isTransformationAllowed() {
        return this.isTransformationAllowed;
    }

    public final boolean isTransformationRequired() {
        return this.isTransformationRequired;
    }

    public final boolean isTransformationSet() {
        return a(2048);
    }

    public final boolean isValidOverride() {
        return fl.o.x(this.overrideWidth, this.overrideHeight);
    }

    @NonNull
    public T lock() {
        this.isLocked = true;
        return f();
    }

    @NonNull
    @CheckResult
    public T onlyRetrieveFromCache(boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().onlyRetrieveFromCache(z11);
        }
        this.onlyRetrieveFromCache = z11;
        this.fields |= 524288;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T optionalCenterCrop() {
        return optionalTransform(DownsampleStrategy.f28811e, new m());
    }

    @NonNull
    @CheckResult
    public T optionalCenterInside() {
        return c(DownsampleStrategy.f28810d, new n());
    }

    @NonNull
    @CheckResult
    public T optionalCircleCrop() {
        return optionalTransform(DownsampleStrategy.f28811e, new o());
    }

    @NonNull
    @CheckResult
    public T optionalFitCenter() {
        return c(DownsampleStrategy.f28809c, new v());
    }

    @NonNull
    public final T optionalTransform(@NonNull DownsampleStrategy downsampleStrategy, @NonNull ik.h<Bitmap> hVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().optionalTransform(downsampleStrategy, hVar);
        }
        downsample(downsampleStrategy);
        return transform(hVar, false);
    }

    @NonNull
    @CheckResult
    public T override(int i11, int i12) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().override(i11, i12);
        }
        this.overrideWidth = i11;
        this.overrideHeight = i12;
        this.fields |= 512;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T placeholder(@Nullable Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().placeholder(drawable);
        }
        this.placeholderDrawable = drawable;
        int i11 = this.fields | 64;
        this.placeholderId = 0;
        this.fields = i11 & (-129);
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T priority(@NonNull Priority priority) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().priority(priority);
        }
        this.priority = (Priority) fl.m.e(priority);
        this.fields |= 8;
        return selfOrThrowIfLocked();
    }

    public T removeOption(@NonNull ik.d<?> dVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().removeOption(dVar);
        }
        this.options.e(dVar);
        return selfOrThrowIfLocked();
    }

    @NonNull
    public final T selfOrThrowIfLocked() {
        if (this.isLocked) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return f();
    }

    @NonNull
    @CheckResult
    public <Y> T set(@NonNull ik.d<Y> dVar, @NonNull Y y11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().set(dVar, y11);
        }
        fl.m.e(dVar);
        fl.m.e(y11);
        this.options.f(dVar, y11);
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T signature(@NonNull ik.b bVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().signature(bVar);
        }
        this.signature = (ik.b) fl.m.e(bVar);
        this.fields |= 1024;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T sizeMultiplier(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().sizeMultiplier(f11);
        }
        if (f11 < 0.0f || f11 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.sizeMultiplier = f11;
        this.fields |= 2;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T skipMemoryCache(boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().skipMemoryCache(true);
        }
        this.isCacheable = !z11;
        this.fields |= 256;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T theme(@Nullable Resources.Theme theme) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().theme(theme);
        }
        this.theme = theme;
        if (theme != null) {
            this.fields |= 32768;
            return set(k.f92271b, theme);
        }
        this.fields &= -32769;
        return removeOption(k.f92271b);
    }

    @NonNull
    @CheckResult
    public T timeout(@IntRange(from = 0) int i11) {
        return set(qk.b.f82344b, Integer.valueOf(i11));
    }

    @NonNull
    @CheckResult
    public final T transform(@NonNull DownsampleStrategy downsampleStrategy, @NonNull ik.h<Bitmap> hVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().transform(downsampleStrategy, hVar);
        }
        downsample(downsampleStrategy);
        return transform(hVar);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public T transforms(@NonNull ik.h<Bitmap>... hVarArr) {
        return transform((ik.h<Bitmap>) new ik.c(hVarArr), true);
    }

    @NonNull
    @CheckResult
    public T useAnimationPool(boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().useAnimationPool(z11);
        }
        this.useAnimationPool = z11;
        this.fields |= 1048576;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T useUnlimitedSourceGeneratorsPool(boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().useUnlimitedSourceGeneratorsPool(z11);
        }
        this.useUnlimitedSourceGeneratorsPool = z11;
        this.fields |= 262144;
        return selfOrThrowIfLocked();
    }

    @Override // 
    @CheckResult
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public T mo5628clone() {
        try {
            T t11 = (T) super.clone();
            ik.e eVar = new ik.e();
            t11.options = eVar;
            eVar.d(this.options);
            fl.b bVar = new fl.b();
            t11.transformations = bVar;
            bVar.putAll(this.transformations);
            t11.isLocked = false;
            t11.isAutoCloneEnabled = false;
            return t11;
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }

    @NonNull
    @CheckResult
    public T optionalTransform(@NonNull ik.h<Bitmap> hVar) {
        return transform(hVar, false);
    }

    @NonNull
    @CheckResult
    public T transform(@NonNull ik.h<Bitmap> hVar) {
        return transform(hVar, true);
    }

    @NonNull
    @CheckResult
    public <Y> T optionalTransform(@NonNull Class<Y> cls, @NonNull ik.h<Y> hVar) {
        return transform(cls, hVar, false);
    }

    @NonNull
    @CheckResult
    public T transform(@NonNull ik.h<Bitmap>... hVarArr) {
        if (hVarArr.length > 1) {
            return transform((ik.h<Bitmap>) new ik.c(hVarArr), true);
        }
        if (hVarArr.length == 1) {
            return transform(hVarArr[0]);
        }
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T override(int i11) {
        return override(i11, i11);
    }

    @NonNull
    @CheckResult
    public T error(@DrawableRes int i11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().error(i11);
        }
        this.errorId = i11;
        int i12 = this.fields | 32;
        this.errorPlaceholder = null;
        this.fields = i12 & (-17);
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T fallback(@DrawableRes int i11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().fallback(i11);
        }
        this.fallbackId = i11;
        int i12 = this.fields | 16384;
        this.fallbackDrawable = null;
        this.fields = i12 & (-8193);
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T placeholder(@DrawableRes int i11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().placeholder(i11);
        }
        this.placeholderId = i11;
        int i12 = this.fields | 128;
        this.placeholderDrawable = null;
        this.fields = i12 & (-65);
        return selfOrThrowIfLocked();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public T transform(@NonNull ik.h<Bitmap> hVar, boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().transform(hVar, z11);
        }
        t tVar = new t(hVar, z11);
        transform(Bitmap.class, hVar, z11);
        transform(Drawable.class, tVar, z11);
        transform(BitmapDrawable.class, tVar.c(), z11);
        transform(wk.c.class, new wk.f(hVar), z11);
        return selfOrThrowIfLocked();
    }

    public final T f() {
        return this;
    }

    @NonNull
    public <Y> T transform(@NonNull Class<Y> cls, @NonNull ik.h<Y> hVar, boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo5628clone().transform(cls, hVar, z11);
        }
        fl.m.e(cls);
        fl.m.e(hVar);
        this.transformations.put(cls, hVar);
        int i11 = this.fields;
        this.isTransformationAllowed = true;
        this.fields = 67584 | i11;
        this.isScaleOnlyOrNoTransform = false;
        if (z11) {
            this.fields = i11 | 198656;
            this.isTransformationRequired = true;
        }
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public <Y> T transform(@NonNull Class<Y> cls, @NonNull ik.h<Y> hVar) {
        return transform(cls, hVar, true);
    }
}
