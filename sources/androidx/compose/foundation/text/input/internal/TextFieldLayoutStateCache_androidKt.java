package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import androidx.compose.ui.text.style.TextDirection;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextFieldLayoutStateCache_androidKt {
    public static final int resolveTextDirectionForKeyboardTypePhone(@m80.k Locale locale) {
        byte resolve = Build.VERSION.SDK_INT >= 28 ? DigitDirectionalityApi28.INSTANCE.resolve(locale) : DigitDirectionalityApi24.INSTANCE.resolve(locale);
        return (resolve == 1 || resolve == 2) ? TextDirection.Companion.m4995getRtls_7Xco() : TextDirection.Companion.m4994getLtrs_7Xco();
    }
}
