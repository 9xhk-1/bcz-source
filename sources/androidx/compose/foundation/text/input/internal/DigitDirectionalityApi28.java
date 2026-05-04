package androidx.compose.foundation.text.input.internal;

import android.icu.text.DecimalFormatSymbols;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(28)
/* loaded from: classes.dex */
final class DigitDirectionalityApi28 {

    @m80.k
    public static final DigitDirectionalityApi28 INSTANCE = new DigitDirectionalityApi28();

    private DigitDirectionalityApi28() {
    }

    public final byte resolve(@m80.k Locale locale) {
        String[] digitStrings;
        digitStrings = DecimalFormatSymbols.getInstance(locale).getDigitStrings();
        return Character.getDirectionality(CodepointHelpers_jvmKt.codePointAt(digitStrings[0], 0));
    }
}
