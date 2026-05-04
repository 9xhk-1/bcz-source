package com.google.android.material.internal;

import androidx.annotation.FloatRange;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final float f31605a = 0.5f;

    public static void a(@FloatRange(from = 0.0d, to = 1.0d) float f11, float[] fArr) {
        if (f11 <= 0.5f) {
            fArr[0] = 1.0f - (f11 * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f11 * 2.0f) - 1.0f;
        }
    }
}
