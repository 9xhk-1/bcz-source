package androidx.compose.ui.text.font;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RequiresApi(28)
/* loaded from: classes2.dex */
public final class TypefaceHelperMethodsApi28 {
    public static final int $stable = 0;

    @k
    public static final TypefaceHelperMethodsApi28 INSTANCE = new TypefaceHelperMethodsApi28();

    private TypefaceHelperMethodsApi28() {
    }

    @RequiresApi(28)
    @k
    public final android.graphics.Typeface create(@k android.graphics.Typeface typeface, int i11, boolean z11) {
        android.graphics.Typeface create;
        create = android.graphics.Typeface.create(typeface, i11, z11);
        return create;
    }
}
