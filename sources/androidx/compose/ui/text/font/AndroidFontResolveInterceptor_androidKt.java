package androidx.compose.ui.text.font;

import android.content.Context;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class AndroidFontResolveInterceptor_androidKt {
    @k
    public static final AndroidFontResolveInterceptor AndroidFontResolveInterceptor(@k Context context) {
        return new AndroidFontResolveInterceptor(FontWeightAdjustmentHelper.INSTANCE.getFontWeightAdjustment(context));
    }
}
