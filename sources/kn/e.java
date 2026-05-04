package kn;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class e extends DrawableWrapperCompat {

    /* renamed from: a, reason: collision with root package name */
    public final int f66880a;

    /* renamed from: b, reason: collision with root package name */
    public final int f66881b;

    public e(@NonNull Drawable drawable, int i11, int i12) {
        super(drawable);
        this.f66880a = i11;
        this.f66881b = i12;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f66881b;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f66880a;
    }
}
