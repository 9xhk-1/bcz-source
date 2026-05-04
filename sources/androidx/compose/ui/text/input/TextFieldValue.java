package androidx.compose.ui.text.input;

import a00.h0;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.NonNullValueClassSaver;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class TextFieldValue {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Saver<TextFieldValue, Object> Saver = SaverKt.Saver(new p<SaverScope, TextFieldValue, Object>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$1
        @Override // x00.p
        public final Object invoke(SaverScope saverScope, TextFieldValue textFieldValue) {
            return h0.t(SaversKt.save(textFieldValue.getAnnotatedString(), SaversKt.getAnnotatedStringSaver(), saverScope), SaversKt.save(TextRange.m4547boximpl(textFieldValue.m4807getSelectiond9O1mEE()), SaversKt.getSaver(TextRange.Companion), saverScope));
        }
    }, new l<Object, TextFieldValue>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.l
        public final TextFieldValue invoke(Object obj) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Saver<AnnotatedString, Object> annotatedStringSaver = SaversKt.getAnnotatedStringSaver();
            Boolean bool = Boolean.FALSE;
            TextRange textRange = null;
            AnnotatedString restore = ((!g0.g(obj2, bool) || (annotatedStringSaver instanceof NonNullValueClassSaver)) && obj2 != null) ? annotatedStringSaver.restore(obj2) : null;
            g0.m(restore);
            Object obj3 = list.get(1);
            Saver<TextRange, Object> saver = SaversKt.getSaver(TextRange.Companion);
            if ((!g0.g(obj3, bool) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) {
                textRange = saver.restore(obj3);
            }
            g0.m(textRange);
            return new TextFieldValue(restore, textRange.m4563unboximpl(), (TextRange) null, 4, (v) null);
        }
    });

    @k
    private final AnnotatedString annotatedString;

    @m80.l
    private final TextRange composition;
    private final long selection;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Saver<TextFieldValue, Object> getSaver() {
            return TextFieldValue.Saver;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j11, TextRange textRange, v vVar) {
        this(annotatedString, j11, textRange);
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m4802copy3r_uNRQ$default(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j11, TextRange textRange, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            annotatedString = textFieldValue.annotatedString;
        }
        if ((i11 & 2) != 0) {
            j11 = textFieldValue.selection;
        }
        if ((i11 & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m4804copy3r_uNRQ(annotatedString, j11, textRange);
    }

    @k
    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m4804copy3r_uNRQ(@k AnnotatedString annotatedString, long j11, @m80.l TextRange textRange) {
        return new TextFieldValue(annotatedString, j11, textRange, (v) null);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        return TextRange.m4552equalsimpl0(this.selection, textFieldValue.selection) && g0.g(this.composition, textFieldValue.composition) && g0.g(this.annotatedString, textFieldValue.annotatedString);
    }

    @k
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    @m80.l
    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m4806getCompositionMzsxiRA() {
        return this.composition;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m4807getSelectiond9O1mEE() {
        return this.selection;
    }

    @k
    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        int hashCode = ((this.annotatedString.hashCode() * 31) + TextRange.m4560hashCodeimpl(this.selection)) * 31;
        TextRange textRange = this.composition;
        return hashCode + (textRange != null ? TextRange.m4560hashCodeimpl(textRange.m4563unboximpl()) : 0);
    }

    @k
    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.annotatedString) + "', selection=" + ((Object) TextRange.m4562toStringimpl(this.selection)) + ", composition=" + this.composition + ')';
    }

    public /* synthetic */ TextFieldValue(String str, long j11, TextRange textRange, v vVar) {
        this(str, j11, textRange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m4805copy3r_uNRQ(@k String str, long j11, @m80.l TextRange textRange) {
        return new TextFieldValue(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j11, textRange, (v) null);
    }

    private TextFieldValue(AnnotatedString annotatedString, long j11, TextRange textRange) {
        this.annotatedString = annotatedString;
        this.selection = TextRangeKt.m4565coerceIn8ffj60Q(j11, 0, getText().length());
        this.composition = textRange != null ? TextRange.m4547boximpl(TextRangeKt.m4565coerceIn8ffj60Q(textRange.m4563unboximpl(), 0, getText().length())) : null;
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m4803copy3r_uNRQ$default(TextFieldValue textFieldValue, String str, long j11, TextRange textRange, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = textFieldValue.selection;
        }
        if ((i11 & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m4805copy3r_uNRQ(str, j11, textRange);
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j11, TextRange textRange, int i11, v vVar) {
        this(annotatedString, (i11 & 2) != 0 ? TextRange.Companion.m4564getZerod9O1mEE() : j11, (i11 & 4) != 0 ? null : textRange, (v) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j11, TextRange textRange, int i11, v vVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? TextRange.Companion.m4564getZerod9O1mEE() : j11, (i11 & 4) != 0 ? null : textRange, (v) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldValue(String str, long j11, TextRange textRange) {
        this(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j11, textRange, (v) null);
    }
}
