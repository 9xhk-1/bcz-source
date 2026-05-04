package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class v implements TypeEvaluator<Rect> {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f31670a;

    public v(@NonNull Rect rect) {
        this.f31670a = rect;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f11, @NonNull Rect rect, @NonNull Rect rect2) {
        this.f31670a.set(rect.left + ((int) ((rect2.left - r0) * f11)), rect.top + ((int) ((rect2.top - r1) * f11)), rect.right + ((int) ((rect2.right - r2) * f11)), rect.bottom + ((int) ((rect2.bottom - r6) * f11)));
        return this.f31670a;
    }
}
