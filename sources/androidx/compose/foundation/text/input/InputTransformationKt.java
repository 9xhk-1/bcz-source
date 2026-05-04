package androidx.compose.foundation.text.input;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.intl.Locale;
import m80.k;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class InputTransformationKt {
    @Stable
    @k
    public static final InputTransformation allCaps(@k InputTransformation inputTransformation, @k Locale locale) {
        return then(inputTransformation, new AllCapsTransformation(locale));
    }

    @Stable
    @k
    public static final InputTransformation byValue(@k InputTransformation inputTransformation, @k p<? super CharSequence, ? super CharSequence, ? extends CharSequence> pVar) {
        return then(inputTransformation, new InputTransformationByValue(pVar));
    }

    @Stable
    @k
    public static final InputTransformation maxLength(@k InputTransformation inputTransformation, int i11) {
        return then(inputTransformation, new MaxLengthFilter(i11));
    }

    @Stable
    @k
    public static final InputTransformation then(@k InputTransformation inputTransformation, @k InputTransformation inputTransformation2) {
        return new FilterChain(inputTransformation, inputTransformation2);
    }
}
