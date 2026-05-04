package ep;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.w7;
import com.google.thirdparty.publicsuffix.PublicSuffixType;
import go.e;
import ho.a0;
import java.util.Deque;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f50058a = a0.p("");

    public static int a(Deque<CharSequence> stack, CharSequence encoded, int start, ImmutableMap.b<String, PublicSuffixType> builder) {
        int length = encoded.length();
        char c11 = 0;
        int i11 = start;
        while (i11 < length && (c11 = encoded.charAt(i11)) != '&' && c11 != '?' && c11 != '!' && c11 != ':' && c11 != ',') {
            i11++;
        }
        stack.push(d(encoded.subSequence(start, i11)));
        if (c11 == '!' || c11 == '?' || c11 == ':' || c11 == ',') {
            String k11 = f50058a.k(stack);
            if (k11.length() > 0) {
                builder.i(k11, PublicSuffixType.fromCode(c11));
            }
        }
        int i12 = i11 + 1;
        if (c11 != '?' && c11 != ',') {
            while (i12 < length) {
                i12 += a(stack, encoded, i12, builder);
                if (encoded.charAt(i12) == '?' || encoded.charAt(i12) == ',') {
                    i12++;
                    break;
                }
            }
        }
        stack.pop();
        return i12 - start;
    }

    @e
    public static ImmutableMap<String, PublicSuffixType> b(String encoded) {
        ImmutableMap.b builder = ImmutableMap.builder();
        int length = encoded.length();
        int i11 = 0;
        while (i11 < length) {
            i11 += a(w7.d(), encoded, i11, builder);
        }
        return builder.d();
    }

    public static ImmutableMap<String, PublicSuffixType> c(CharSequence... encodedChunks) {
        return b(f50058a.n(encodedChunks));
    }

    public static CharSequence d(CharSequence s11) {
        return new StringBuilder(s11).reverse();
    }
}
