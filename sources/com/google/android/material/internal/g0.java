package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(18)
/* loaded from: classes7.dex */
public class g0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroupOverlay f31589a;

    public g0(@NonNull ViewGroup viewGroup) {
        this.f31589a = viewGroup.getOverlay();
    }

    @Override // com.google.android.material.internal.k0
    public void a(@NonNull Drawable drawable) {
        this.f31589a.remove(drawable);
    }

    @Override // com.google.android.material.internal.k0
    public void b(@NonNull Drawable drawable) {
        this.f31589a.add(drawable);
    }

    @Override // com.google.android.material.internal.h0
    public void c(@NonNull View view) {
        this.f31589a.add(view);
    }

    @Override // com.google.android.material.internal.h0
    public void d(@NonNull View view) {
        this.f31589a.remove(view);
    }
}
