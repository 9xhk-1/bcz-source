package com.bumptech.glide;

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
/* loaded from: classes6.dex */
public interface h<T> {
    @NonNull
    @CheckResult
    T load(@Nullable Bitmap bitmap);

    @NonNull
    @CheckResult
    T load(@Nullable Drawable drawable);

    @NonNull
    @CheckResult
    T load(@Nullable Uri uri);

    @NonNull
    @CheckResult
    T load(@Nullable File file);

    @NonNull
    @CheckResult
    T load(@Nullable @DrawableRes @RawRes Integer num);

    @NonNull
    @CheckResult
    T load(@Nullable Object obj);

    @NonNull
    @CheckResult
    T load(@Nullable String str);

    @CheckResult
    @Deprecated
    T load(@Nullable URL url);

    @NonNull
    @CheckResult
    T load(@Nullable byte[] bArr);
}
