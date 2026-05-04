package qp;

import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final int f82601c = 301;

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f82599a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};

    /* renamed from: b, reason: collision with root package name */
    public static final int[][] f82600b = {new int[]{R.styleable.Theme_drawable_syncview_error, 48, 15, 111, 62}, new int[]{23, 68, 144, 134, 240, 92, 254}, new int[]{28, 24, 185, 166, R.styleable.Theme_drawable_sound1, R.styleable.Theme_drawable_walk_sound4, 116, 255, 110, 61}, new int[]{175, 138, 205, 12, 194, 168, 39, R.styleable.Theme_drawable_walk_sound1, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, 142, R.styleable.Theme_drawable_reset_plan, 97, 178, 100, R.styleable.Theme_drawable_time}, new int[]{156, 97, 192, R.styleable.Theme_drawable_wiki_sound1, 95, 9, 157, 119, 138, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, R.styleable.Theme_drawable_test_nodate, R.styleable.Theme_drawable_reset_plan, 109, 129, 94, 254, 225, 48, 90, 188}, new int[]{15, 195, 244, 9, R.styleable.Theme_drawable_tab_lecture, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, 205, 109, 39, 176, 21, 155, 197, R.styleable.Theme_drawable_wiki_sound, R.styleable.Theme_drawable_sound1, 155, 21, 5, 172, 254, 124, 12, 181, 184, 96, 50, 193}, new int[]{211, R.styleable.Theme_drawable_tab_friends_new, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, 121, 17, 138, 110, R.styleable.Theme_drawable_reset_plan, 141, 136, 120, 151, R.styleable.Theme_drawable_tab_lecture, 168, 93, 255}, new int[]{R.styleable.Theme_drawable_walk_sound1, 127, R.styleable.Theme_drawable_time, 218, 130, 250, 162, 181, 102, 120, 84, 179, R.styleable.Theme_drawable_share, R.styleable.Theme_drawable_wiki_sound, 80, 182, R.styleable.Theme_drawable_syncview_update, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, 175, 184, 59, 25, 225, 98, 81, 112}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, R.styleable.Theme_drawable_walk_sound3, 105, 122, 2, R.styleable.Theme_drawable_walk_sound1, 133, R.styleable.Theme_drawable_time, 8, 175, 95, 100, 9, 167, 105, R.styleable.Theme_drawable_review_sound, 111, 57, 121, 21, 1, 253, 57, 54, 101, R.styleable.Theme_drawable_walk_sound4, 202, 69, 50, 150, 177, 226, 5, 9, 5}, new int[]{R.styleable.Theme_drawable_walk_sound1, 132, 172, R.styleable.Theme_drawable_sound1, 96, 32, 117, 22, R.styleable.Theme_drawable_tab_review, 133, R.styleable.Theme_drawable_tab_review, R.styleable.Theme_drawable_tab_friends_new, 205, 188, R.styleable.Theme_drawable_tab_mall_new, 87, 191, 106, 16, 147, 118, 23, 37, 90, 170, 205, 131, 88, 120, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, R.styleable.Theme_drawable_reset_plan, 92, 253, 225, 19}, new int[]{175, 9, R.styleable.Theme_drawable_sound1, R.styleable.Theme_drawable_tab_review, 12, 17, R.styleable.Theme_drawable_share, 208, 100, 29, 175, 170, R.styleable.Theme_drawable_tab_friends, 192, R.styleable.Theme_drawable_revocation, R.styleable.Theme_drawable_tab_mall, 150, 159, 36, R.styleable.Theme_drawable_sound1, 38, 200, 132, 54, R.styleable.Theme_drawable_syncview_error, 146, 218, R.styleable.Theme_drawable_tab_lecture_new, 117, 203, 29, R.styleable.Theme_drawable_tab_home, 144, R.styleable.Theme_drawable_tab_review, 22, 150, 201, 117, 62, 207, 164, 13, 137, R.styleable.Theme_drawable_walk_sound1, 127, 67, R.styleable.Theme_drawable_walk_sound3, 28, 155, 43, 203, 107, R.styleable.Theme_drawable_tab_lecture, 53, 143, 46}, new int[]{R.styleable.Theme_drawable_time, 93, 169, 50, 144, 210, 39, 118, 202, 188, 201, 189, 143, 108, 196, 37, 185, 112, 134, R.styleable.Theme_drawable_tab_friends, R.styleable.Theme_drawable_walk_sound1, 63, 197, 190, 250, 106, 185, R.styleable.Theme_drawable_share_close, 175, 64, 114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, 107, R.styleable.Theme_drawable_tab_home, 7, 94, 166, 224, 124, 86, 47, 11, 204}, new int[]{R.styleable.Theme_drawable_share, R.styleable.Theme_drawable_syncview_error, 173, 89, R.styleable.Theme_drawable_wiki_sound, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, R.styleable.Theme_drawable_reset_plan, 136, R.styleable.Theme_drawable_walk_sound4, 180, R.styleable.Theme_drawable_tab_lecture_new, 197, 158, 177, 68, 122, 93, R.styleable.Theme_drawable_reset_plan, 15, 160, R.styleable.Theme_drawable_syncview, R.styleable.Theme_drawable_tab_mall_1111, 66, 139, 153, 185, 202, 167, 179, 25, R.styleable.Theme_drawable_share, R.styleable.Theme_drawable_tab_home, 96, 210, R.styleable.Theme_drawable_tab_friends_new, 136, R.styleable.Theme_drawable_sound1, R.styleable.Theme_drawable_tab_surrounding, 181, R.styleable.Theme_drawable_test_nodate, 59, 52, 172, 25, 49, R.styleable.Theme_drawable_tab_home, 211, 189, 64, 54, 108, 153, 132, 63, 96, 103, 82, 186}};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f82602d = new int[256];

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f82603e = new int[255];

    static {
        int i11 = 1;
        for (int i12 = 0; i12 < 255; i12++) {
            f82603e[i12] = i11;
            f82602d[i11] = i12;
            i11 <<= 1;
            if (i11 >= 256) {
                i11 ^= 301;
            }
        }
    }

    public static String a(CharSequence charSequence, int i11) {
        return b(charSequence, 0, charSequence.length(), i11);
    }

    public static String b(CharSequence charSequence, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = 0;
        while (true) {
            int[] iArr = f82599a;
            if (i16 >= iArr.length) {
                i16 = -1;
                break;
            }
            if (iArr[i16] == i13) {
                break;
            }
            i16++;
        }
        if (i16 < 0) {
            throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i13)));
        }
        int[] iArr2 = f82600b[i16];
        char[] cArr = new char[i13];
        for (int i17 = 0; i17 < i13; i17++) {
            cArr[i17] = 0;
        }
        for (int i18 = i11; i18 < i11 + i12; i18++) {
            int i19 = i13 - 1;
            int charAt = cArr[i19] ^ charSequence.charAt(i18);
            while (i19 > 0) {
                if (charAt == 0 || (i15 = iArr2[i19]) == 0) {
                    cArr[i19] = cArr[i19 - 1];
                } else {
                    char c11 = cArr[i19 - 1];
                    int[] iArr3 = f82603e;
                    int[] iArr4 = f82602d;
                    cArr[i19] = (char) (iArr3[(iArr4[charAt] + iArr4[i15]) % 255] ^ c11);
                }
                i19--;
            }
            if (charAt == 0 || (i14 = iArr2[0]) == 0) {
                cArr[0] = 0;
            } else {
                int[] iArr5 = f82603e;
                int[] iArr6 = f82602d;
                cArr[0] = (char) iArr5[(iArr6[charAt] + iArr6[i14]) % 255];
            }
        }
        char[] cArr2 = new char[i13];
        for (int i21 = 0; i21 < i13; i21++) {
            cArr2[i21] = cArr[(i13 - i21) - 1];
        }
        return String.valueOf(cArr2);
    }

    public static String c(String str, k kVar) {
        if (str.length() != kVar.b()) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder sb2 = new StringBuilder(kVar.b() + kVar.d());
        sb2.append(str);
        int g11 = kVar.g();
        if (g11 == 1) {
            sb2.append(a(str, kVar.d()));
        } else {
            sb2.setLength(sb2.capacity());
            int[] iArr = new int[g11];
            int[] iArr2 = new int[g11];
            int[] iArr3 = new int[g11];
            int i11 = 0;
            while (i11 < g11) {
                int i12 = i11 + 1;
                iArr[i11] = kVar.c(i12);
                iArr2[i11] = kVar.e(i12);
                iArr3[i11] = 0;
                if (i11 > 0) {
                    iArr3[i11] = iArr3[i11 - 1] + iArr[i11];
                }
                i11 = i12;
            }
            for (int i13 = 0; i13 < g11; i13++) {
                StringBuilder sb3 = new StringBuilder(iArr[i13]);
                for (int i14 = i13; i14 < kVar.b(); i14 += g11) {
                    sb3.append(str.charAt(i14));
                }
                String a11 = a(sb3.toString(), iArr2[i13]);
                int i15 = i13;
                int i16 = 0;
                while (i15 < iArr2[i13] * g11) {
                    sb2.setCharAt(kVar.b() + i15, a11.charAt(i16));
                    i15 += g11;
                    i16++;
                }
            }
        }
        return sb2.toString();
    }
}
