package qo;

import com.google.common.base.Preconditions;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a
@go.b
/* loaded from: classes7.dex */
public final class j extends ko.l {

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f82577e = {'+'};

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f82578f = "0123456789ABCDEF".toCharArray();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f82579c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f82580d;

    public j(String safeChars, boolean plusForSpace) {
        Preconditions.checkNotNull(safeChars);
        if (safeChars.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        String str = safeChars + "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        if (plusForSpace && str.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.f82579c = plusForSpace;
        this.f82580d = h(str);
    }

    public static boolean[] h(String safeChars) {
        char[] charArray = safeChars.toCharArray();
        int i11 = -1;
        for (char c11 : charArray) {
            i11 = Math.max((int) c11, i11);
        }
        boolean[] zArr = new boolean[i11 + 1];
        for (char c12 : charArray) {
            zArr[c12] = true;
        }
        return zArr;
    }

    @Override // ko.l, ko.h
    public String b(String s11) {
        Preconditions.checkNotNull(s11);
        int length = s11.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = s11.charAt(i11);
            boolean[] zArr = this.f82580d;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return e(s11, i11);
            }
        }
        return s11;
    }

    @Override // ko.l
    @CheckForNull
    public char[] d(int cp2) {
        boolean[] zArr = this.f82580d;
        if (cp2 < zArr.length && zArr[cp2]) {
            return null;
        }
        if (cp2 == 32 && this.f82579c) {
            return f82577e;
        }
        if (cp2 <= 127) {
            char[] cArr = f82578f;
            return new char[]{'%', cArr[cp2 >>> 4], cArr[cp2 & 15]};
        }
        if (cp2 <= 2047) {
            char[] cArr2 = f82578f;
            return new char[]{'%', cArr2[(cp2 >>> 10) | 12], cArr2[(cp2 >>> 6) & 15], '%', cArr2[((cp2 >>> 4) & 3) | 8], cArr2[cp2 & 15]};
        }
        if (cp2 <= 65535) {
            char[] cArr3 = f82578f;
            return new char[]{'%', 'E', cArr3[cp2 >>> 12], '%', cArr3[((cp2 >>> 10) & 3) | 8], cArr3[(cp2 >>> 6) & 15], '%', cArr3[((cp2 >>> 4) & 3) | 8], cArr3[cp2 & 15]};
        }
        if (cp2 <= 1114111) {
            char[] cArr4 = f82578f;
            return new char[]{'%', 'F', cArr4[(cp2 >>> 18) & 7], '%', cArr4[((cp2 >>> 16) & 3) | 8], cArr4[(cp2 >>> 12) & 15], '%', cArr4[((cp2 >>> 10) & 3) | 8], cArr4[(cp2 >>> 6) & 15], '%', cArr4[((cp2 >>> 4) & 3) | 8], cArr4[cp2 & 15]};
        }
        throw new IllegalArgumentException("Invalid unicode character value " + cp2);
    }

    @Override // ko.l
    public int g(CharSequence csq, int index, int end) {
        Preconditions.checkNotNull(csq);
        while (index < end) {
            char charAt = csq.charAt(index);
            boolean[] zArr = this.f82580d;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            index++;
        }
        return index;
    }
}
