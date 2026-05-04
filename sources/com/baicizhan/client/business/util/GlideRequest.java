package com.baicizhan.client.business.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.io.File;
import java.net.URL;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class GlideRequest<TranscodeType> extends com.bumptech.glide.j<TranscodeType> implements Cloneable {
    public GlideRequest(@NonNull Class<TranscodeType> transcodeClass, @NonNull com.bumptech.glide.j<?> other) {
        super(transcodeClass, other);
    }

    @Override // com.bumptech.glide.j, bl.a
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ bl.a apply(@NonNull bl.a options) {
        return apply((bl.a<?>) options);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ bl.a decode(@NonNull Class clazz) {
        return decode((Class<?>) clazz);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ bl.a optionalTransform(@NonNull ik.h transformation) {
        return optionalTransform((ik.h<Bitmap>) transformation);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ bl.a set(@NonNull ik.d option, @NonNull Object y11) {
        return set((ik.d<ik.d>) option, (ik.d) y11);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ bl.a transform(@NonNull ik.h transformation) {
        return transform((ik.h<Bitmap>) transformation);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    @Deprecated
    public /* bridge */ /* synthetic */ bl.a transforms(@NonNull ik.h[] transformations) {
        return transforms((ik.h<Bitmap>[]) transformations);
    }

    public GlideRequest(@NonNull com.bumptech.glide.c glide, @NonNull com.bumptech.glide.k requestManager, @NonNull Class<TranscodeType> transcodeClass, @NonNull Context context) {
        super(glide, requestManager, transcodeClass, context);
    }

    @Override // com.bumptech.glide.j
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> addListener(@Nullable bl.f<TranscodeType> listener) {
        return (GlideRequest) super.addListener((bl.f) listener);
    }

    @Override // com.bumptech.glide.j, bl.a
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.j apply(@NonNull bl.a options) {
        return apply((bl.a<?>) options);
    }

    @Override // bl.a
    @NonNull
    public GlideRequest<TranscodeType> autoClone() {
        return (GlideRequest) super.autoClone();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> centerCrop() {
        return (GlideRequest) super.centerCrop();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> centerInside() {
        return (GlideRequest) super.centerInside();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> circleCrop() {
        return (GlideRequest) super.circleCrop();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> decode(@NonNull Class<?> clazz) {
        return (GlideRequest) super.decode(clazz);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> disallowHardwareConfig() {
        return (GlideRequest) super.disallowHardwareConfig();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> diskCacheStrategy(@NonNull kk.j strategy) {
        return (GlideRequest) super.diskCacheStrategy(strategy);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> dontAnimate() {
        return (GlideRequest) super.dontAnimate();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> dontTransform() {
        return (GlideRequest) super.dontTransform();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> downsample(@NonNull DownsampleStrategy strategy) {
        return (GlideRequest) super.downsample(strategy);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> encodeFormat(@NonNull Bitmap.CompressFormat format) {
        return (GlideRequest) super.encodeFormat(format);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> encodeQuality(@IntRange(from = 0, to = 100) int value) {
        return (GlideRequest) super.encodeQuality(value);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> fitCenter() {
        return (GlideRequest) super.fitCenter();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> format(@NonNull DecodeFormat format) {
        return (GlideRequest) super.format(format);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> frame(@IntRange(from = 0) long value) {
        return (GlideRequest) super.frame(value);
    }

    @Override // com.bumptech.glide.j
    @NonNull
    @CheckResult
    public GlideRequest<File> getDownloadOnlyRequest() {
        return new GlideRequest(File.class, this).apply((bl.a<?>) com.bumptech.glide.j.DOWNLOAD_ONLY_OPTIONS);
    }

    @Override // com.bumptech.glide.j
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> listener(@Nullable bl.f<TranscodeType> listener) {
        return (GlideRequest) super.listener((bl.f) listener);
    }

    @Override // bl.a
    @NonNull
    public GlideRequest<TranscodeType> lock() {
        return (GlideRequest) super.lock();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> onlyRetrieveFromCache(boolean flag) {
        return (GlideRequest) super.onlyRetrieveFromCache(flag);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> optionalCenterCrop() {
        return (GlideRequest) super.optionalCenterCrop();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> optionalCenterInside() {
        return (GlideRequest) super.optionalCenterInside();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> optionalCircleCrop() {
        return (GlideRequest) super.optionalCircleCrop();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> optionalFitCenter() {
        return (GlideRequest) super.optionalFitCenter();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> priority(@NonNull Priority priority) {
        return (GlideRequest) super.priority(priority);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public <Y> GlideRequest<TranscodeType> set(@NonNull ik.d<Y> option, @NonNull Y y11) {
        return (GlideRequest) super.set((ik.d<ik.d<Y>>) option, (ik.d<Y>) y11);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> signature(@NonNull ik.b key) {
        return (GlideRequest) super.signature(key);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> sizeMultiplier(@FloatRange(from = 0.0d, to = 1.0d) float value) {
        return (GlideRequest) super.sizeMultiplier(value);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> skipMemoryCache(boolean skip) {
        return (GlideRequest) super.skipMemoryCache(skip);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> theme(@Nullable Resources.Theme theme) {
        return (GlideRequest) super.theme(theme);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> timeout(@IntRange(from = 0) int value) {
        return (GlideRequest) super.timeout(value);
    }

    @Override // bl.a
    @NonNull
    @Deprecated
    @CheckResult
    public GlideRequest<TranscodeType> transforms(@NonNull ik.h<Bitmap>... transformations) {
        return (GlideRequest) super.transforms(transformations);
    }

    @Override // com.bumptech.glide.j
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> transition(@NonNull com.bumptech.glide.l<?, ? super TranscodeType> options) {
        return (GlideRequest) super.transition((com.bumptech.glide.l) options);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> useAnimationPool(boolean flag) {
        return (GlideRequest) super.useAnimationPool(flag);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> useUnlimitedSourceGeneratorsPool(boolean flag) {
        return (GlideRequest) super.useUnlimitedSourceGeneratorsPool(flag);
    }

    @Override // com.bumptech.glide.j, bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> apply(@NonNull bl.a<?> options) {
        return (GlideRequest) super.apply(options);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> fallback(@Nullable Drawable drawable) {
        return (GlideRequest) super.fallback(drawable);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> optionalTransform(@NonNull ik.h<Bitmap> transformation) {
        return (GlideRequest) super.optionalTransform(transformation);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> override(int width, int height) {
        return (GlideRequest) super.override(width, height);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> placeholder(@Nullable Drawable drawable) {
        return (GlideRequest) super.placeholder(drawable);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ bl.a transform(@NonNull ik.h[] transformations) {
        return transform((ik.h<Bitmap>[]) transformations);
    }

    @Override // com.bumptech.glide.j, bl.a
    @CheckResult
    /* renamed from: clone */
    public GlideRequest<TranscodeType> mo5628clone() {
        return (GlideRequest) super.mo5628clone();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> fallback(@DrawableRes int id2) {
        return (GlideRequest) super.fallback(id2);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public <Y> GlideRequest<TranscodeType> optionalTransform(@NonNull Class<Y> clazz, @NonNull ik.h<Y> transformation) {
        return (GlideRequest) super.optionalTransform((Class) clazz, (ik.h) transformation);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> override(int size) {
        return (GlideRequest) super.override(size);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> placeholder(@DrawableRes int id2) {
        return (GlideRequest) super.placeholder(id2);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> transform(@NonNull ik.h<Bitmap> transformation) {
        return (GlideRequest) super.transform(transformation);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> error(@Nullable Drawable drawable) {
        return (GlideRequest) super.error(drawable);
    }

    @Override // com.bumptech.glide.j
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> thumbnail(@Nullable com.bumptech.glide.j<TranscodeType> builder) {
        return (GlideRequest) super.thumbnail((com.bumptech.glide.j) builder);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> transform(@NonNull ik.h<Bitmap>... transformations) {
        return (GlideRequest) super.transform(transformations);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> error(@DrawableRes int id2) {
        return (GlideRequest) super.error(id2);
    }

    @Override // com.bumptech.glide.j
    @NonNull
    @SafeVarargs
    @CheckResult
    public final GlideRequest<TranscodeType> thumbnail(@Nullable com.bumptech.glide.j<TranscodeType>... builders) {
        return (GlideRequest) super.thumbnail((com.bumptech.glide.j[]) builders);
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public <Y> GlideRequest<TranscodeType> transform(@NonNull Class<Y> clazz, @NonNull ik.h<Y> transformation) {
        return (GlideRequest) super.transform((Class) clazz, (ik.h) transformation);
    }

    @Override // com.bumptech.glide.j
    @NonNull
    public GlideRequest<TranscodeType> error(@Nullable com.bumptech.glide.j<TranscodeType> builder) {
        return (GlideRequest) super.error((com.bumptech.glide.j) builder);
    }

    @Override // com.bumptech.glide.j
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> thumbnail(@Nullable List<com.bumptech.glide.j<TranscodeType>> list) {
        return (GlideRequest) super.thumbnail((List) list);
    }

    @Override // com.bumptech.glide.j
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> error(Object o11) {
        return (GlideRequest) super.error(o11);
    }

    @Override // com.bumptech.glide.j
    @NonNull
    @Deprecated
    @CheckResult
    public GlideRequest<TranscodeType> thumbnail(float sizeMultiplier) {
        return (GlideRequest) super.thumbnail(sizeMultiplier);
    }

    @Override // com.bumptech.glide.j, com.bumptech.glide.h
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> load(@Nullable Object o11) {
        return (GlideRequest) super.load(o11);
    }

    @Override // com.bumptech.glide.j, com.bumptech.glide.h
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> load(@Nullable Bitmap bitmap) {
        return (GlideRequest) super.load(bitmap);
    }

    @Override // com.bumptech.glide.j, com.bumptech.glide.h
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> load(@Nullable Drawable drawable) {
        return (GlideRequest) super.load(drawable);
    }

    @Override // com.bumptech.glide.j, com.bumptech.glide.h
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> load(@Nullable String string) {
        return (GlideRequest) super.load(string);
    }

    @Override // com.bumptech.glide.j, com.bumptech.glide.h
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> load(@Nullable Uri uri) {
        return (GlideRequest) super.load(uri);
    }

    @Override // com.bumptech.glide.j, com.bumptech.glide.h
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> load(@Nullable File file) {
        return (GlideRequest) super.load(file);
    }

    @Override // com.bumptech.glide.j, com.bumptech.glide.h
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> load(@Nullable @DrawableRes @RawRes Integer id2) {
        return (GlideRequest) super.load(id2);
    }

    @Override // com.bumptech.glide.j, com.bumptech.glide.h
    @CheckResult
    @Deprecated
    public GlideRequest<TranscodeType> load(@Nullable URL url) {
        return (GlideRequest) super.load(url);
    }

    @Override // com.bumptech.glide.j, com.bumptech.glide.h
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> load(@Nullable byte[] bytes) {
        return (GlideRequest) super.load(bytes);
    }
}
