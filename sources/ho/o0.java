package ho;

import com.google.common.base.Preconditions;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.b
/* loaded from: classes7.dex */
public final class o0 {
    public static String a(CharSequence a11, CharSequence b11) {
        Preconditions.checkNotNull(a11);
        Preconditions.checkNotNull(b11);
        int min = Math.min(a11.length(), b11.length());
        int i11 = 0;
        while (i11 < min && a11.charAt(i11) == b11.charAt(i11)) {
            i11++;
        }
        int i12 = i11 - 1;
        if (k(a11, i12) || k(b11, i12)) {
            i11--;
        }
        return a11.subSequence(0, i11).toString();
    }

    public static String b(CharSequence a11, CharSequence b11) {
        Preconditions.checkNotNull(a11);
        Preconditions.checkNotNull(b11);
        int min = Math.min(a11.length(), b11.length());
        int i11 = 0;
        while (i11 < min && a11.charAt((a11.length() - i11) - 1) == b11.charAt((b11.length() - i11) - 1)) {
            i11++;
        }
        if (k(a11, (a11.length() - i11) - 1) || k(b11, (b11.length() - i11) - 1)) {
            i11--;
        }
        return a11.subSequence(a11.length() - i11, a11.length()).toString();
    }

    @CheckForNull
    public static String c(@CheckForNull String string) {
        return h0.b(string);
    }

    public static boolean d(@CheckForNull String string) {
        return h0.i(string);
    }

    public static String e(@CheckForNull String template, @CheckForNull Object... args) {
        int indexOf;
        String valueOf = String.valueOf(template);
        int i11 = 0;
        if (args == null) {
            args = new Object[]{"(Object[])null"};
        } else {
            for (int i12 = 0; i12 < args.length; i12++) {
                args[i12] = f(args[i12]);
            }
        }
        StringBuilder sb2 = new StringBuilder(valueOf.length() + (args.length * 16));
        int i13 = 0;
        while (i11 < args.length && (indexOf = valueOf.indexOf("%s", i13)) != -1) {
            sb2.append((CharSequence) valueOf, i13, indexOf);
            sb2.append(args[i11]);
            i13 = indexOf + 2;
            i11++;
        }
        sb2.append((CharSequence) valueOf, i13, valueOf.length());
        if (i11 < args.length) {
            sb2.append(" [");
            sb2.append(args[i11]);
            for (int i14 = i11 + 1; i14 < args.length; i14++) {
                sb2.append(j2.O);
                sb2.append(args[i14]);
            }
            sb2.append(l50.b.f69930l);
        }
        return sb2.toString();
    }

    public static String f(@CheckForNull Object o11) {
        if (o11 == null) {
            return "null";
        }
        try {
            return o11.toString();
        } catch (Exception e11) {
            String str = o11.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(o11));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e11);
            return "<" + str + " threw " + e11.getClass().getName() + ">";
        }
    }

    public static String g(@CheckForNull String string) {
        return h0.f(string);
    }

    public static String h(String string, int minLength, char padChar) {
        Preconditions.checkNotNull(string);
        if (string.length() >= minLength) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder(minLength);
        sb2.append(string);
        for (int length = string.length(); length < minLength; length++) {
            sb2.append(padChar);
        }
        return sb2.toString();
    }

    public static String i(String string, int minLength, char padChar) {
        Preconditions.checkNotNull(string);
        if (string.length() >= minLength) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder(minLength);
        for (int length = string.length(); length < minLength; length++) {
            sb2.append(padChar);
        }
        sb2.append(string);
        return sb2.toString();
    }

    public static String j(String string, int count) {
        Preconditions.checkNotNull(string);
        if (count <= 1) {
            Preconditions.checkArgument(count >= 0, "invalid count: %s", count);
            return count == 0 ? "" : string;
        }
        int length = string.length();
        long j11 = length * count;
        int i11 = (int) j11;
        if (i11 != j11) {
            throw new ArrayIndexOutOfBoundsException("Required array size too large: " + j11);
        }
        char[] cArr = new char[i11];
        string.getChars(0, length, cArr, 0);
        while (true) {
            int i12 = i11 - length;
            if (length >= i12) {
                System.arraycopy(cArr, 0, cArr, length, i12);
                return new String(cArr);
            }
            System.arraycopy(cArr, 0, cArr, length, length);
            length <<= 1;
        }
    }

    @go.e
    public static boolean k(CharSequence string, int index) {
        return index >= 0 && index <= string.length() + (-2) && Character.isHighSurrogate(string.charAt(index)) && Character.isLowSurrogate(string.charAt(index + 1));
    }
}
