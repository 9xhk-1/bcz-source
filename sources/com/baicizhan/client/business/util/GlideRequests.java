package com.baicizhan.client.business.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import java.io.File;
import java.net.URL;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class GlideRequests extends com.bumptech.glide.k {
    public GlideRequests(@NonNull com.bumptech.glide.c glide, @NonNull yk.j lifecycle, @NonNull yk.q treeNode, @NonNull Context context) {
        super(glide, lifecycle, treeNode, context);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    public /* bridge */ /* synthetic */ com.bumptech.glide.k addDefaultRequestListener(bl.f listener) {
        return addDefaultRequestListener((bl.f<Object>) listener);
    }

    @Override // com.bumptech.glide.k
    public void setRequestOptions(@NonNull bl.g toSet) {
        if (toSet instanceof GlideOptions) {
            super.setRequestOptions(toSet);
        } else {
            super.setRequestOptions(new GlideOptions().apply2((bl.a<?>) toSet));
        }
    }

    @Override // com.bumptech.glide.k
    @NonNull
    public GlideRequests addDefaultRequestListener(bl.f<Object> listener) {
        return (GlideRequests) super.addDefaultRequestListener(listener);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    public synchronized GlideRequests applyDefaultRequestOptions(@NonNull bl.g options) {
        return (GlideRequests) super.applyDefaultRequestOptions(options);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    @CheckResult
    public <ResourceType> GlideRequest<ResourceType> as(@NonNull Class<ResourceType> resourceClass) {
        return new GlideRequest<>(this.glide, this, resourceClass, this.context);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    @CheckResult
    public GlideRequest<Bitmap> asBitmap() {
        return (GlideRequest) super.asBitmap();
    }

    @Override // com.bumptech.glide.k
    @NonNull
    @CheckResult
    public GlideRequest<Drawable> asDrawable() {
        return (GlideRequest) super.asDrawable();
    }

    @Override // com.bumptech.glide.k
    @NonNull
    @CheckResult
    public GlideRequest<File> asFile() {
        return (GlideRequest) super.asFile();
    }

    @Override // com.bumptech.glide.k
    @NonNull
    @CheckResult
    public GlideRequest<wk.c> asGif() {
        return (GlideRequest) super.asGif();
    }

    @Override // com.bumptech.glide.k
    @NonNull
    public synchronized GlideRequests clearOnStop() {
        return (GlideRequests) super.clearOnStop();
    }

    @Override // com.bumptech.glide.k
    @NonNull
    @CheckResult
    public GlideRequest<File> download(@Nullable Object o11) {
        return (GlideRequest) super.download(o11);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    @CheckResult
    public GlideRequest<File> downloadOnly() {
        return (GlideRequest) super.downloadOnly();
    }

    @Override // com.bumptech.glide.k
    @NonNull
    public synchronized GlideRequests setDefaultRequestOptions(@NonNull bl.g options) {
        return (GlideRequests) super.setDefaultRequestOptions(options);
    }

    @Override // com.bumptech.glide.k, com.bumptech.glide.h
    @NonNull
    @CheckResult
    public GlideRequest<Drawable> load(@Nullable Bitmap bitmap) {
        return (GlideRequest) super.load(bitmap);
    }

    @Override // com.bumptech.glide.k, com.bumptech.glide.h
    @NonNull
    @CheckResult
    public GlideRequest<Drawable> load(@Nullable Drawable drawable) {
        return (GlideRequest) super.load(drawable);
    }

    @Override // com.bumptech.glide.k, com.bumptech.glide.h
    @NonNull
    @CheckResult
    public GlideRequest<Drawable> load(@Nullable String string) {
        return (GlideRequest) super.load(string);
    }

    @Override // com.bumptech.glide.k, com.bumptech.glide.h
    @NonNull
    @CheckResult
    public GlideRequest<Drawable> load(@Nullable Uri uri) {
        return (GlideRequest) super.load(uri);
    }

    @Override // com.bumptech.glide.k, com.bumptech.glide.h
    @NonNull
    @CheckResult
    public GlideRequest<Drawable> load(@Nullable File file) {
        return (GlideRequest) super.load(file);
    }

    @Override // com.bumptech.glide.k, com.bumptech.glide.h
    @NonNull
    @CheckResult
    public GlideRequest<Drawable> load(@Nullable @DrawableRes @RawRes Integer id2) {
        return (GlideRequest) super.load(id2);
    }

    @Override // com.bumptech.glide.k, com.bumptech.glide.h
    @CheckResult
    @Deprecated
    public GlideRequest<Drawable> load(@Nullable URL url) {
        return (GlideRequest) super.load(url);
    }

    @Override // com.bumptech.glide.k, com.bumptech.glide.h
    @NonNull
    @CheckResult
    public GlideRequest<Drawable> load(@Nullable byte[] bytes) {
        return (GlideRequest) super.load(bytes);
    }

    @Override // com.bumptech.glide.k, com.bumptech.glide.h
    @NonNull
    @CheckResult
    public GlideRequest<Drawable> load(@Nullable Object o11) {
        return (GlideRequest) super.load(o11);
    }
}
