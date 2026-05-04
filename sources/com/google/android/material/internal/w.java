package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class w implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f31671a;

    public w(@NonNull TimeInterpolator timeInterpolator) {
        this.f31671a = timeInterpolator;
    }

    @NonNull
    public static TimeInterpolator a(boolean z11, @NonNull TimeInterpolator timeInterpolator) {
        return z11 ? timeInterpolator : new w(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        return 1.0f - this.f31671a.getInterpolation(f11);
    }
}
