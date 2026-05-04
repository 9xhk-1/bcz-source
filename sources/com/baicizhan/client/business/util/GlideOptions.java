package com.baicizhan.client.business.util;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class GlideOptions extends bl.g implements Cloneable {
    private static GlideOptions centerCropTransform2;
    private static GlideOptions centerInsideTransform1;
    private static GlideOptions circleCropTransform3;
    private static GlideOptions fitCenterTransform0;
    private static GlideOptions noAnimation5;
    private static GlideOptions noTransformation4;

    @NonNull
    @CheckResult
    public static GlideOptions bitmapTransform(@NonNull ik.h<Bitmap> transformation) {
        return new GlideOptions().transform2(transformation);
    }

    @NonNull
    @CheckResult
    public static GlideOptions centerCropTransform() {
        if (centerCropTransform2 == null) {
            centerCropTransform2 = new GlideOptions().centerCrop().autoClone();
        }
        return centerCropTransform2;
    }

    @NonNull
    @CheckResult
    public static GlideOptions centerInsideTransform() {
        if (centerInsideTransform1 == null) {
            centerInsideTransform1 = new GlideOptions().centerInside().autoClone();
        }
        return centerInsideTransform1;
    }

    @NonNull
    @CheckResult
    public static GlideOptions circleCropTransform() {
        if (circleCropTransform3 == null) {
            circleCropTransform3 = new GlideOptions().circleCrop().autoClone();
        }
        return circleCropTransform3;
    }

    @NonNull
    @CheckResult
    public static GlideOptions decodeTypeOf(@NonNull Class<?> clazz) {
        return new GlideOptions().decode2(clazz);
    }

    @NonNull
    @CheckResult
    public static GlideOptions diskCacheStrategyOf(@NonNull kk.j strategy) {
        return new GlideOptions().diskCacheStrategy(strategy);
    }

    @NonNull
    @CheckResult
    public static GlideOptions downsampleOf(@NonNull DownsampleStrategy strategy) {
        return new GlideOptions().downsample(strategy);
    }

    @NonNull
    @CheckResult
    public static GlideOptions encodeFormatOf(@NonNull Bitmap.CompressFormat format) {
        return new GlideOptions().encodeFormat(format);
    }

    @NonNull
    @CheckResult
    public static GlideOptions encodeQualityOf(@IntRange(from = 0, to = 100) int value) {
        return new GlideOptions().encodeQuality(value);
    }

    @NonNull
    @CheckResult
    public static GlideOptions errorOf(@Nullable Drawable drawable) {
        return new GlideOptions().error(drawable);
    }

    @NonNull
    @CheckResult
    public static GlideOptions fitCenterTransform() {
        if (fitCenterTransform0 == null) {
            fitCenterTransform0 = new GlideOptions().fitCenter().autoClone();
        }
        return fitCenterTransform0;
    }

    @NonNull
    @CheckResult
    public static GlideOptions formatOf(@NonNull DecodeFormat format) {
        return new GlideOptions().format(format);
    }

    @NonNull
    @CheckResult
    public static GlideOptions frameOf(@IntRange(from = 0) long value) {
        return new GlideOptions().frame(value);
    }

    @NonNull
    @CheckResult
    public static GlideOptions noAnimation() {
        if (noAnimation5 == null) {
            noAnimation5 = new GlideOptions().dontAnimate().autoClone();
        }
        return noAnimation5;
    }

    @NonNull
    @CheckResult
    public static GlideOptions noTransformation() {
        if (noTransformation4 == null) {
            noTransformation4 = new GlideOptions().dontTransform().autoClone();
        }
        return noTransformation4;
    }

    @NonNull
    @CheckResult
    public static <T> GlideOptions option(@NonNull ik.d<T> option, @NonNull T t11) {
        return new GlideOptions().set2((ik.d<ik.d<T>>) option, (ik.d<T>) t11);
    }

    @NonNull
    @CheckResult
    public static GlideOptions overrideOf(int width, int height) {
        return new GlideOptions().override(width, height);
    }

    @NonNull
    @CheckResult
    public static GlideOptions placeholderOf(@Nullable Drawable drawable) {
        return new GlideOptions().placeholder(drawable);
    }

    @NonNull
    @CheckResult
    public static GlideOptions priorityOf(@NonNull Priority priority) {
        return new GlideOptions().priority(priority);
    }

    @NonNull
    @CheckResult
    public static GlideOptions signatureOf(@NonNull ik.b key) {
        return new GlideOptions().signature(key);
    }

    @NonNull
    @CheckResult
    public static GlideOptions sizeMultiplierOf(@FloatRange(from = 0.0d, to = 1.0d) float value) {
        return new GlideOptions().sizeMultiplier(value);
    }

    @NonNull
    @CheckResult
    public static GlideOptions skipMemoryCacheOf(boolean skipMemoryCache) {
        return new GlideOptions().skipMemoryCache(skipMemoryCache);
    }

    @NonNull
    @CheckResult
    public static GlideOptions timeoutOf(@IntRange(from = 0) int value) {
        return new GlideOptions().timeout(value);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ bl.g apply(@NonNull bl.a options) {
        return apply2((bl.a<?>) options);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ bl.g decode(@NonNull Class clazz) {
        return decode2((Class<?>) clazz);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ bl.g optionalTransform(@NonNull ik.h transformation) {
        return optionalTransform2((ik.h<Bitmap>) transformation);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ bl.g set(@NonNull ik.d option, @NonNull Object y11) {
        return set2((ik.d<ik.d>) option, (ik.d) y11);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ bl.g transform(@NonNull ik.h transformation) {
        return transform2((ik.h<Bitmap>) transformation);
    }

    @Override // bl.a
    @NonNull
    @Deprecated
    @SafeVarargs
    @CheckResult
    public /* bridge */ /* synthetic */ bl.g transforms(@NonNull ik.h[] transformations) {
        return transforms2((ik.h<Bitmap>[]) transformations);
    }

    @NonNull
    @CheckResult
    public static GlideOptions errorOf(@DrawableRes int id2) {
        return new GlideOptions().error(id2);
    }

    @NonNull
    @CheckResult
    public static GlideOptions overrideOf(int size) {
        return new GlideOptions().override(size);
    }

    @NonNull
    @CheckResult
    public static GlideOptions placeholderOf(@DrawableRes int id2) {
        return new GlideOptions().placeholder(id2);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public bl.g apply2(@NonNull bl.a<?> options) {
        return (GlideOptions) super.apply(options);
    }

    @Override // bl.a
    @NonNull
    public bl.g autoClone() {
        return (GlideOptions) super.autoClone();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g centerCrop() {
        return (GlideOptions) super.centerCrop();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g centerInside() {
        return (GlideOptions) super.centerInside();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g circleCrop() {
        return (GlideOptions) super.circleCrop();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    /* renamed from: decode, reason: avoid collision after fix types in other method */
    public bl.g decode2(@NonNull Class<?> clazz) {
        return (GlideOptions) super.decode(clazz);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g disallowHardwareConfig() {
        return (GlideOptions) super.disallowHardwareConfig();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g diskCacheStrategy(@NonNull kk.j strategy) {
        return (GlideOptions) super.diskCacheStrategy(strategy);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g dontAnimate() {
        return (GlideOptions) super.dontAnimate();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g dontTransform() {
        return (GlideOptions) super.dontTransform();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g downsample(@NonNull DownsampleStrategy strategy) {
        return (GlideOptions) super.downsample(strategy);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g encodeFormat(@NonNull Bitmap.CompressFormat format) {
        return (GlideOptions) super.encodeFormat(format);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g encodeQuality(@IntRange(from = 0, to = 100) int value) {
        return (GlideOptions) super.encodeQuality(value);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g fitCenter() {
        return (GlideOptions) super.fitCenter();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g format(@NonNull DecodeFormat format) {
        return (GlideOptions) super.format(format);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g frame(@IntRange(from = 0) long value) {
        return (GlideOptions) super.frame(value);
    }

    @Override // bl.a
    @NonNull
    public bl.g lock() {
        return (GlideOptions) super.lock();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g onlyRetrieveFromCache(boolean flag) {
        return (GlideOptions) super.onlyRetrieveFromCache(flag);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g optionalCenterCrop() {
        return (GlideOptions) super.optionalCenterCrop();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g optionalCenterInside() {
        return (GlideOptions) super.optionalCenterInside();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g optionalCircleCrop() {
        return (GlideOptions) super.optionalCircleCrop();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g optionalFitCenter() {
        return (GlideOptions) super.optionalFitCenter();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g priority(@NonNull Priority priority) {
        return (GlideOptions) super.priority(priority);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    /* renamed from: set, reason: avoid collision after fix types in other method */
    public <Y> bl.g set2(@NonNull ik.d<Y> option, @NonNull Y y11) {
        return (GlideOptions) super.set((ik.d<ik.d<Y>>) option, (ik.d<Y>) y11);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g signature(@NonNull ik.b key) {
        return (GlideOptions) super.signature(key);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g sizeMultiplier(@FloatRange(from = 0.0d, to = 1.0d) float value) {
        return (GlideOptions) super.sizeMultiplier(value);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g skipMemoryCache(boolean skip) {
        return (GlideOptions) super.skipMemoryCache(skip);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g theme(@Nullable Resources.Theme theme) {
        return (GlideOptions) super.theme(theme);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g timeout(@IntRange(from = 0) int value) {
        return (GlideOptions) super.timeout(value);
    }

    @Override // bl.a
    @NonNull
    @Deprecated
    @SafeVarargs
    @CheckResult
    /* renamed from: transforms, reason: avoid collision after fix types in other method */
    public final bl.g transforms2(@NonNull ik.h<Bitmap>... transformations) {
        return (GlideOptions) super.transforms(transformations);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g useAnimationPool(boolean flag) {
        return (GlideOptions) super.useAnimationPool(flag);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g useUnlimitedSourceGeneratorsPool(boolean flag) {
        return (GlideOptions) super.useUnlimitedSourceGeneratorsPool(flag);
    }

    @Override // bl.a
    @CheckResult
    /* renamed from: clone, reason: avoid collision after fix types in other method */
    public bl.g mo5628clone() {
        return (GlideOptions) super.mo5628clone();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g error(@Nullable Drawable drawable) {
        return (GlideOptions) super.error(drawable);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g fallback(@Nullable Drawable drawable) {
        return (GlideOptions) super.fallback(drawable);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    /* renamed from: optionalTransform, reason: avoid collision after fix types in other method */
    public bl.g optionalTransform2(@NonNull ik.h<Bitmap> transformation) {
        return (GlideOptions) super.optionalTransform(transformation);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g override(int width, int height) {
        return (GlideOptions) super.override(width, height);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g placeholder(@Nullable Drawable drawable) {
        return (GlideOptions) super.placeholder(drawable);
    }

    @Override // bl.a
    @NonNull
    @SafeVarargs
    @CheckResult
    public /* bridge */ /* synthetic */ bl.g transform(@NonNull ik.h[] transformations) {
        return transform2((ik.h<Bitmap>[]) transformations);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g error(@DrawableRes int id2) {
        return (GlideOptions) super.error(id2);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g fallback(@DrawableRes int id2) {
        return (GlideOptions) super.fallback(id2);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public <Y> bl.g optionalTransform(@NonNull Class<Y> clazz, @NonNull ik.h<Y> transformation) {
        return (GlideOptions) super.optionalTransform((Class) clazz, (ik.h) transformation);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g override(int size) {
        return (GlideOptions) super.override(size);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public bl.g placeholder(@DrawableRes int id2) {
        return (GlideOptions) super.placeholder(id2);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    /* renamed from: transform, reason: avoid collision after fix types in other method */
    public bl.g transform2(@NonNull ik.h<Bitmap> transformation) {
        return (GlideOptions) super.transform(transformation);
    }

    @Override // bl.a
    @NonNull
    @SafeVarargs
    @CheckResult
    /* renamed from: transform, reason: avoid collision after fix types in other method */
    public final bl.g transform2(@NonNull ik.h<Bitmap>... transformations) {
        return (GlideOptions) super.transform(transformations);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public <Y> bl.g transform(@NonNull Class<Y> clazz, @NonNull ik.h<Y> transformation) {
        return (GlideOptions) super.transform((Class) clazz, (ik.h) transformation);
    }
}
