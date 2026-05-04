package com.google.android.material.slider;

import androidx.annotation.NonNull;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d implements e {

    /* renamed from: e, reason: collision with root package name */
    public static final long f32125e = 1000000000000L;

    /* renamed from: f, reason: collision with root package name */
    public static final int f32126f = 1000000000;

    /* renamed from: g, reason: collision with root package name */
    public static final int f32127g = 1000000;

    /* renamed from: h, reason: collision with root package name */
    public static final int f32128h = 1000;

    @Override // com.google.android.material.slider.e
    @NonNull
    public String a(float f11) {
        return f11 >= 1.0E12f ? String.format(Locale.US, "%.1fT", Float.valueOf(f11 / 1.0E12f)) : f11 >= 1.0E9f ? String.format(Locale.US, "%.1fB", Float.valueOf(f11 / 1.0E9f)) : f11 >= 1000000.0f ? String.format(Locale.US, "%.1fM", Float.valueOf(f11 / 1000000.0f)) : f11 >= 1000.0f ? String.format(Locale.US, "%.1fK", Float.valueOf(f11 / 1000.0f)) : String.format(Locale.US, "%.0f", Float.valueOf(f11));
    }
}
