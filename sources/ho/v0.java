package ho;

import com.google.common.base.Preconditions;
import com.tencent.ijk.media.player.IjkMediaMeta;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class v0 {
    public static int a(CharSequence sequence) {
        int length = sequence.length();
        int i11 = 0;
        while (i11 < length && sequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 < length) {
                char charAt = sequence.charAt(i11);
                if (charAt >= 2048) {
                    i12 += b(sequence, i11);
                    break;
                }
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                break;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + IjkMediaMeta.AV_CH_WIDE_RIGHT));
    }

    public static int b(CharSequence sequence, int start) {
        int length = sequence.length();
        int i11 = 0;
        while (start < length) {
            char charAt = sequence.charAt(start);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(sequence, start) == charAt) {
                        throw new IllegalArgumentException(f(start));
                    }
                    start++;
                }
            }
            start++;
        }
        return i11;
    }

    public static boolean c(byte[] bytes) {
        return d(bytes, 0, bytes.length);
    }

    public static boolean d(byte[] bytes, int off, int len) {
        int i11 = len + off;
        Preconditions.checkPositionIndexes(off, i11, bytes.length);
        while (off < i11) {
            if (bytes[off] < 0) {
                return e(bytes, off, i11);
            }
            off++;
        }
        return true;
    }

    public static boolean e(byte[] bytes, int off, int end) {
        byte b11;
        while (off < end) {
            int i11 = off + 1;
            byte b12 = bytes[off];
            if (b12 < 0) {
                if (b12 < -32) {
                    if (i11 != end && b12 >= -62) {
                        off += 2;
                        if (bytes[i11] > -65) {
                        }
                    }
                    return false;
                }
                if (b12 < -16) {
                    int i12 = off + 2;
                    if (i12 < end && (b11 = bytes[i11]) <= -65 && ((b12 != -32 || b11 >= -96) && (b12 != -19 || -96 > b11))) {
                        off += 3;
                        if (bytes[i12] > -65) {
                        }
                    }
                    return false;
                }
                if (off + 3 >= end) {
                    return false;
                }
                int i13 = off + 2;
                byte b13 = bytes[i11];
                if (b13 <= -65 && (((b12 << 28) + (b13 + 112)) >> 30) == 0) {
                    int i14 = off + 3;
                    if (bytes[i13] <= -65) {
                        off += 4;
                        if (bytes[i14] > -65) {
                        }
                    }
                }
                return false;
            }
            off = i11;
        }
        return true;
    }

    public static String f(int i11) {
        return "Unpaired surrogate at index " + i11;
    }
}
