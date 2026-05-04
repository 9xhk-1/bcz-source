package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.ui.text.StringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nInputTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputTransformation.kt\nandroidx/compose/foundation/text/input/AllCapsTransformation\n+ 2 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBufferKt\n*L\n1#1,243:1\n623#2,7:244\n*S KotlinDebug\n*F\n+ 1 InputTransformation.kt\nandroidx/compose/foundation/text/input/AllCapsTransformation\n*L\n212#1:244,7\n*E\n"})
/* loaded from: classes.dex */
final class AllCapsTransformation implements InputTransformation {

    @k
    private final KeyboardOptions keyboardOptions = new KeyboardOptions(KeyboardCapitalization.Companion.m4770getCharactersIUNYP9k(), (Boolean) null, 0, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 126, (v) null);

    @k
    private final Locale locale;

    public AllCapsTransformation(@k Locale locale) {
        this.locale = locale;
    }

    private final Locale component1() {
        return this.locale;
    }

    public static /* synthetic */ AllCapsTransformation copy$default(AllCapsTransformation allCapsTransformation, Locale locale, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            locale = allCapsTransformation.locale;
        }
        return allCapsTransformation.copy(locale);
    }

    @k
    public final AllCapsTransformation copy(@k Locale locale) {
        return new AllCapsTransformation(locale);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AllCapsTransformation) && g0.g(this.locale, ((AllCapsTransformation) obj).locale);
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    @k
    public KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    public int hashCode() {
        return this.locale.hashCode();
    }

    @k
    public String toString() {
        return "InputTransformation.allCaps(locale=" + this.locale + ')';
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(@k TextFieldBuffer textFieldBuffer) {
        TextFieldBuffer.ChangeList changes = textFieldBuffer.getChanges();
        for (int i11 = 0; i11 < changes.getChangeCount(); i11++) {
            long mo1186getRangejx7JFs = changes.mo1186getRangejx7JFs(i11);
            changes.mo1185getOriginalRangejx7JFs(i11);
            if (!TextRange.m4553getCollapsedimpl(mo1186getRangejx7JFs)) {
                textFieldBuffer.replace(TextRange.m4557getMinimpl(mo1186getRangejx7JFs), TextRange.m4556getMaximpl(mo1186getRangejx7JFs), StringKt.toUpperCase(TextRangeKt.m4566substringFDrldGo(textFieldBuffer.asCharSequence(), mo1186getRangejx7JFs), this.locale));
            }
        }
    }
}
