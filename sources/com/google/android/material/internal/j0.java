package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(18)
/* loaded from: classes7.dex */
public class j0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewOverlay f31604a;

    public j0(@NonNull View view) {
        this.f31604a = view.getOverlay();
    }

    @Override // com.google.android.material.internal.k0
    public void a(@NonNull Drawable drawable) {
        this.f31604a.remove(drawable);
    }

    @Override // com.google.android.material.internal.k0
    public void b(@NonNull Drawable drawable) {
        this.f31604a.add(drawable);
    }
}
