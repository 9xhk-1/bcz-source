package l50;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i0 {
    @m80.k
    public static final JsonDecodingException a(@m80.k Number value, @m80.k String key, @m80.k String output) {
        kotlin.jvm.internal.g0.p(value, "value");
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(output, "output");
        return e(-1, l(value, key, output));
    }

    @m80.k
    public static final JsonEncodingException b(@m80.k Number value, @m80.k String output) {
        kotlin.jvm.internal.g0.p(value, "value");
        kotlin.jvm.internal.g0.p(output, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) j(output, 0, 1, null)));
    }

    @m80.k
    public static final JsonEncodingException c(@m80.k Number value, @m80.k String key, @m80.k String output) {
        kotlin.jvm.internal.g0.p(value, "value");
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(output, "output");
        return new JsonEncodingException(l(value, key, output));
    }

    @m80.k
    public static final JsonEncodingException d(@m80.k h50.f keyDescriptor) {
        kotlin.jvm.internal.g0.p(keyDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + keyDescriptor.k() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    @m80.k
    public static final JsonDecodingException e(int i11, @m80.k String message) {
        kotlin.jvm.internal.g0.p(message, "message");
        if (i11 >= 0) {
            message = "Unexpected JSON token at offset " + i11 + ": " + message;
        }
        return new JsonDecodingException(message);
    }

    @m80.k
    public static final JsonDecodingException f(int i11, @m80.k String message, @m80.k CharSequence input) {
        kotlin.jvm.internal.g0.p(message, "message");
        kotlin.jvm.internal.g0.p(input, "input");
        return e(i11, message + "\nJSON input: " + ((Object) i(input, i11)));
    }

    @m80.k
    public static final Void g(@m80.k a aVar, @m80.k String entity) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(entity, "entity");
        aVar.A("Trailing comma before the end of JSON " + entity, aVar.f69912a - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void h(a aVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "object";
        }
        return g(aVar, str);
    }

    @m80.k
    public static final CharSequence i(@m80.k CharSequence charSequence, int i11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i11 != -1) {
                int i12 = i11 - 30;
                int i13 = i11 + 30;
                return (i12 <= 0 ? "" : ".....") + charSequence.subSequence(g10.u.u(i12, 0), g10.u.B(i13, charSequence.length())).toString() + (i13 >= charSequence.length() ? "" : ".....");
            }
            int length = charSequence.length() - 60;
            if (length > 0) {
                return "....." + charSequence.subSequence(length, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static /* synthetic */ CharSequence j(CharSequence charSequence, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -1;
        }
        return i(charSequence, i11);
    }

    @m80.k
    public static final Void k(@m80.k a aVar, @m80.k Number result) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(result, "result");
        a.B(aVar, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, b.f69921c, 2, null);
        throw new KotlinNothingValueException();
    }

    public static final String l(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) j(str2, 0, 1, null));
    }
}
