package com.baicizhan.client.business.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class GlideApp {
    private GlideApp() {
    }

    @SuppressLint({"VisibleForTests"})
    @VisibleForTesting
    public static void enableHardwareBitmaps() {
        com.bumptech.glide.c.d();
    }

    @NonNull
    public static com.bumptech.glide.c get(@NonNull Context context) {
        return com.bumptech.glide.c.e(context);
    }

    @Nullable
    public static File getPhotoCacheDir(@NonNull Context context) {
        return com.bumptech.glide.c.l(context);
    }

    @SuppressLint({"VisibleForTests"})
    @VisibleForTesting
    @Deprecated
    public static void init(com.bumptech.glide.c glide) {
        com.bumptech.glide.c.r(glide);
    }

    @SuppressLint({"VisibleForTests"})
    @VisibleForTesting
    public static void isInitialized() {
        com.bumptech.glide.c.u();
    }

    @SuppressLint({"VisibleForTests"})
    @VisibleForTesting
    public static void tearDown() {
        com.bumptech.glide.c.z();
    }

    @NonNull
    public static GlideRequests with(@NonNull Context context) {
        return (GlideRequests) com.bumptech.glide.c.F(context);
    }

    @Nullable
    public static File getPhotoCacheDir(@NonNull Context context, @NonNull String string) {
        return com.bumptech.glide.c.m(context, string);
    }

    @SuppressLint({"VisibleForTests"})
    @VisibleForTesting
    public static void init(@NonNull Context context, @NonNull com.bumptech.glide.d builder) {
        com.bumptech.glide.c.q(context, builder);
    }

    @NonNull
    @Deprecated
    public static GlideRequests with(@NonNull Activity activity) {
        return (GlideRequests) com.bumptech.glide.c.D(activity);
    }

    @NonNull
    public static GlideRequests with(@NonNull FragmentActivity activity) {
        return (GlideRequests) com.bumptech.glide.c.I(activity);
    }

    @NonNull
    public static GlideRequests with(@NonNull Fragment fragment) {
        return (GlideRequests) com.bumptech.glide.c.H(fragment);
    }

    @NonNull
    @Deprecated
    public static GlideRequests with(@NonNull android.app.Fragment fragment) {
        return (GlideRequests) com.bumptech.glide.c.E(fragment);
    }

    @NonNull
    public static GlideRequests with(@NonNull View view) {
        return (GlideRequests) com.bumptech.glide.c.G(view);
    }
}
