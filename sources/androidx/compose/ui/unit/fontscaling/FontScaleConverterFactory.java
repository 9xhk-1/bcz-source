package androidx.compose.ui.unit.fontscaling;

import androidx.annotation.AnyThread;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.SparseArrayCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.InlineClassHelperKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@u0({"SMAP\nFontScaleConverterFactory.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScaleConverterFactory.android.kt\nandroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,228:1\n52#2,5:229\n*S KotlinDebug\n*F\n+ 1 FontScaleConverterFactory.android.kt\nandroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory\n*L\n99#1:229,5\n*E\n"})
/* loaded from: classes2.dex */
public final class FontScaleConverterFactory {
    public static final int $stable;

    @k
    private static final float[] CommonFontSizes;

    @k
    public static final FontScaleConverterFactory INSTANCE;

    @k
    private static final Object[] LookupTablesWriteLock;
    private static final float MinScaleForNonLinear = 1.03f;
    private static final float ScaleKeyMultiplier = 100.0f;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    private static volatile SparseArrayCompat<FontScaleConverter> sLookupTables;

    static {
        FontScaleConverterFactory fontScaleConverterFactory = new FontScaleConverterFactory();
        INSTANCE = fontScaleConverterFactory;
        CommonFontSizes = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        sLookupTables = new SparseArrayCompat<>(0, 1, null);
        Object[] objArr = new Object[0];
        LookupTablesWriteLock = objArr;
        synchronized (objArr) {
            fontScaleConverterFactory.putInto(sLookupTables, 1.15f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.3f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.5f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.8f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            fontScaleConverterFactory.putInto(sLookupTables, 2.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            g2 g2Var = g2.f100423a;
        }
        if (!(fontScaleConverterFactory.getScaleFromKey(sLookupTables.keyAt(0)) - 0.01f > 1.03f)) {
            InlineClassHelperKt.throwIllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
        $stable = 8;
    }

    private FontScaleConverterFactory() {
    }

    private final FontScaleConverter createInterpolatedTableBetween(FontScaleConverter fontScaleConverter, FontScaleConverter fontScaleConverter2, float f11) {
        float[] fArr = CommonFontSizes;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            float f12 = CommonFontSizes[i11];
            fArr2[i11] = MathUtils.INSTANCE.lerp(fontScaleConverter.convertSpToDp(f12), fontScaleConverter2.convertSpToDp(f12), f11);
        }
        return new FontScaleConverterTable(CommonFontSizes, fArr2);
    }

    private final FontScaleConverter get(float f11) {
        return sLookupTables.get(getKey(f11));
    }

    private final int getKey(float f11) {
        return (int) (f11 * 100.0f);
    }

    private final float getScaleFromKey(int i11) {
        return i11 / 100.0f;
    }

    private final void put(float f11, FontScaleConverter fontScaleConverter) {
        synchronized (LookupTablesWriteLock) {
            SparseArrayCompat<FontScaleConverter> m27clone = sLookupTables.m27clone();
            INSTANCE.putInto(m27clone, f11, fontScaleConverter);
            sLookupTables = m27clone;
            g2 g2Var = g2.f100423a;
        }
    }

    private final void putInto(SparseArrayCompat<FontScaleConverter> sparseArrayCompat, float f11, FontScaleConverter fontScaleConverter) {
        sparseArrayCompat.put(getKey(f11), fontScaleConverter);
    }

    @l
    @AnyThread
    public final FontScaleConverter forScale(float f11) {
        FontScaleConverter valueAt;
        if (!isNonLinearFontScalingActive(f11)) {
            return null;
        }
        FontScaleConverter fontScaleConverter = INSTANCE.get(f11);
        if (fontScaleConverter != null) {
            return fontScaleConverter;
        }
        int indexOfKey = sLookupTables.indexOfKey(getKey(f11));
        if (indexOfKey >= 0) {
            return sLookupTables.valueAt(indexOfKey);
        }
        int i11 = -(indexOfKey + 1);
        int i12 = i11 - 1;
        float f12 = 1.0f;
        if (i11 >= sLookupTables.size()) {
            FontScaleConverterTable fontScaleConverterTable = new FontScaleConverterTable(new float[]{1.0f}, new float[]{f11});
            put(f11, fontScaleConverterTable);
            return fontScaleConverterTable;
        }
        if (i12 < 0) {
            float[] fArr = CommonFontSizes;
            valueAt = new FontScaleConverterTable(fArr, fArr);
        } else {
            f12 = getScaleFromKey(sLookupTables.keyAt(i12));
            valueAt = sLookupTables.valueAt(i12);
        }
        FontScaleConverter createInterpolatedTableBetween = createInterpolatedTableBetween(valueAt, sLookupTables.valueAt(i11), MathUtils.INSTANCE.constrainedMap(0.0f, 1.0f, f12, getScaleFromKey(sLookupTables.keyAt(i11)), f11));
        put(f11, createInterpolatedTableBetween);
        return createInterpolatedTableBetween;
    }

    @k
    public final SparseArrayCompat<FontScaleConverter> getSLookupTables() {
        return sLookupTables;
    }

    @AnyThread
    public final boolean isNonLinearFontScalingActive(float f11) {
        return f11 >= 1.03f;
    }

    public final void setSLookupTables(@k SparseArrayCompat<FontScaleConverter> sparseArrayCompat) {
        sLookupTables = sparseArrayCompat;
    }

    @VisibleForTesting
    public static /* synthetic */ void getSLookupTables$annotations() {
    }
}
