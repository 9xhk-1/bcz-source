package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAndroidShader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,199:1\n65#2:200\n69#2:203\n65#2:206\n69#2:209\n65#2:212\n69#2:215\n65#2:218\n69#2:221\n60#3:201\n70#3:204\n60#3:207\n70#3:210\n60#3:213\n70#3:216\n60#3:219\n70#3:222\n22#4:202\n22#4:205\n22#4:208\n22#4:211\n22#4:214\n22#4:217\n22#4:220\n22#4:223\n70#5,6:224\n*S KotlinDebug\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n*L\n40#1:200\n41#1:203\n42#1:206\n43#1:209\n60#1:212\n61#1:215\n77#1:218\n78#1:221\n40#1:201\n41#1:204\n42#1:207\n43#1:210\n60#1:213\n61#1:216\n77#1:219\n78#1:222\n40#1:202\n41#1:205\n42#1:208\n43#1:211\n60#1:214\n61#1:217\n77#1:220\n78#1:223\n136#1:224,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidShader_androidKt {
    @m80.k
    /* renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m2409ActualImageShaderF49vj9s(@m80.k ImageBitmap imageBitmap, int i11, int i12) {
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), AndroidTileMode_androidKt.m2414toAndroidTileMode0vamqd0(i11), AndroidTileMode_androidKt.m2414toAndroidTileMode0vamqd0(i12));
    }

    @m80.k
    /* renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m2410ActualLinearGradientShaderVjE6UOU(long j11, long j12, @m80.k List<Color> list, @m80.l List<Float> list2, int i11) {
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new android.graphics.LinearGradient(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors), AndroidTileMode_androidKt.m2414toAndroidTileMode0vamqd0(i11));
    }

    @m80.k
    /* renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m2411ActualRadialGradientShader8uybcMk(long j11, float f11, @m80.k List<Color> list, @m80.l List<Float> list2, int i11) {
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new android.graphics.RadialGradient(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), f11, makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors), AndroidTileMode_androidKt.m2414toAndroidTileMode0vamqd0(i11));
    }

    @m80.k
    /* renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m2412ActualSweepGradientShader9KIMszo(long j11, @m80.k List<Color> list, @m80.l List<Float> list2) {
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new android.graphics.SweepGradient(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors));
    }

    @VisibleForTesting
    public static final int countTransparentColors(@m80.k List<Color> list) {
        int i11 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int L = a00.h0.L(list);
        for (int i12 = 1; i12 < L; i12++) {
            if (Color.m2511getAlphaimpl(list.get(i12).m2519unboximpl()) == 0.0f) {
                i11++;
            }
        }
        return i11;
    }

    @VisibleForTesting
    @m80.k
    public static final int[] makeTransparentColors(@m80.k List<Color> list, int i11) {
        int i12;
        int i13 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i13 < size) {
                iArr[i13] = ColorKt.m2563toArgb8_81llA(list.get(i13).m2519unboximpl());
                i13++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i11];
        int L = a00.h0.L(list);
        int size2 = list.size();
        int i14 = 0;
        while (i13 < size2) {
            long m2519unboximpl = list.get(i13).m2519unboximpl();
            if (Color.m2511getAlphaimpl(m2519unboximpl) == 0.0f) {
                if (i13 == 0) {
                    i12 = i14 + 1;
                    iArr2[i14] = ColorKt.m2563toArgb8_81llA(Color.m2508copywmQWz5c$default(list.get(1).m2519unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i13 == L) {
                    i12 = i14 + 1;
                    iArr2[i14] = ColorKt.m2563toArgb8_81llA(Color.m2508copywmQWz5c$default(list.get(i13 - 1).m2519unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i15 = i14 + 1;
                    iArr2[i14] = ColorKt.m2563toArgb8_81llA(Color.m2508copywmQWz5c$default(list.get(i13 - 1).m2519unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i14 += 2;
                    iArr2[i15] = ColorKt.m2563toArgb8_81llA(Color.m2508copywmQWz5c$default(list.get(i13 + 1).m2519unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i14 = i12;
            } else {
                iArr2[i14] = ColorKt.m2563toArgb8_81llA(m2519unboximpl);
                i14++;
            }
            i13++;
        }
        return iArr2;
    }

    @m80.l
    @VisibleForTesting
    public static final float[] makeTransparentStops(@m80.l List<Float> list, @m80.k List<Color> list2, int i11) {
        if (i11 == 0) {
            if (list != null) {
                return a00.r0.X5(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i11];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int L = a00.h0.L(list2);
        int i12 = 1;
        for (int i13 = 1; i13 < L; i13++) {
            long m2519unboximpl = list2.get(i13).m2519unboximpl();
            float floatValue = list != null ? list.get(i13).floatValue() : i13 / a00.h0.L(list2);
            int i14 = i12 + 1;
            fArr[i12] = floatValue;
            if (Color.m2511getAlphaimpl(m2519unboximpl) == 0.0f) {
                i12 += 2;
                fArr[i14] = floatValue;
            } else {
                i12 = i14;
            }
        }
        fArr[i12] = list != null ? list.get(a00.h0.L(list2)).floatValue() : 1.0f;
        return fArr;
    }

    private static final void validateColorStops(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
