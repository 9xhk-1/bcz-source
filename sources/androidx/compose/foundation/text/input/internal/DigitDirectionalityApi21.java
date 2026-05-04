package androidx.compose.foundation.text.input.internal;

import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DigitDirectionalityApi21 {

    @m80.k
    public static final DigitDirectionalityApi21 INSTANCE = new DigitDirectionalityApi21();

    private DigitDirectionalityApi21() {
    }

    public final byte resolve(@m80.k Locale locale) {
        return Character.getDirectionality(DecimalFormatSymbols.getInstance(locale).getZeroDigit());
    }
}
