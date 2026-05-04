package f90;

import java.lang.annotation.Annotation;
import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f51360a = ",";

    /* renamed from: b, reason: collision with root package name */
    public static final String f51361b = "\n";

    /* renamed from: c, reason: collision with root package name */
    public static final char f51362c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f51363d = true;

    public static /* synthetic */ String a(int i11) {
        return "maxCharsPerColumn must be a positive number or -1: " + i11;
    }

    public static /* synthetic */ String b(Annotation annotation) {
        return "The delimiter and delimiterString attributes cannot be set simultaneously in " + annotation;
    }

    public static s90.d c(String delimiter, String lineSeparator, char quote, String emptyValue, int maxCharsPerColumn, boolean commentProcessingEnabled, boolean headerExtractionEnabled, boolean ignoreLeadingAndTrailingWhitespace) {
        return new s90.d(f(delimiter, lineSeparator, quote, emptyValue, maxCharsPerColumn, commentProcessingEnabled, headerExtractionEnabled, ignoreLeadingAndTrailingWhitespace));
    }

    public static s90.d d(a0 annotation) {
        return c(g(annotation, annotation.delimiter(), annotation.delimiterString()), annotation.lineSeparator(), annotation.quoteCharacter(), annotation.emptyValue(), annotation.maxCharsPerColumn(), true, annotation.useHeadersInDisplayName(), annotation.ignoreLeadingAndTrailingWhitespace());
    }

    public static s90.d e(f0 annotation) {
        return c(g(annotation, annotation.delimiter(), annotation.delimiterString()), "\n", annotation.quoteCharacter(), annotation.emptyValue(), annotation.maxCharsPerColumn(), !annotation.textBlock().isEmpty(), annotation.useHeadersInDisplayName(), annotation.ignoreLeadingAndTrailingWhitespace());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static s90.e f(String delimiter, String lineSeparator, char quote, String emptyValue, final int maxCharsPerColumn, boolean commentProcessingEnabled, boolean headerExtractionEnabled, boolean ignoreLeadingAndTrailingWhitespace) {
        s90.e eVar = new s90.e();
        eVar.N0(headerExtractionEnabled);
        ((s90.b) eVar.o()).F(delimiter);
        ((s90.b) eVar.o()).m(lineSeparator);
        ((s90.b) eVar.o()).G(quote);
        ((s90.b) eVar.o()).J(quote);
        eVar.s1(emptyValue);
        eVar.M0(commentProcessingEnabled);
        eVar.M(false);
        eVar.T(ignoreLeadingAndTrailingWhitespace);
        eVar.W(ignoreLeadingAndTrailingWhitespace);
        ba0.c2.f(maxCharsPerColumn > 0 || maxCharsPerColumn == -1, new Supplier() { // from class: f90.c0
            @Override // java.util.function.Supplier
            public final Object get() {
                return e0.a(maxCharsPerColumn);
            }
        });
        eVar.X(maxCharsPerColumn);
        return eVar;
    }

    public static String g(final Annotation annotation, char delimiter, String delimiterString) {
        ba0.c2.f(delimiter == 0 || delimiterString.isEmpty(), new Supplier() { // from class: f90.d0
            @Override // java.util.function.Supplier
            public final Object get() {
                return e0.b(annotation);
            }
        });
        return delimiter != 0 ? String.valueOf(delimiter) : !delimiterString.isEmpty() ? delimiterString : ",";
    }
}
