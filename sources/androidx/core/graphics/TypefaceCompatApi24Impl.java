package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(24)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
class TypefaceCompatApi24Impl extends TypefaceCompatBaseImpl {
    private static final String ADD_FONT_WEIGHT_STYLE_METHOD = "addFontWeightStyle";
    private static final String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
    private static final String TAG = "TypefaceCompatApi24Impl";
    private static final Method sAddFontWeightStyle;
    private static final Method sCreateFromFamiliesWithDefault;
    private static final Class<?> sFontFamily;
    private static final Constructor<?> sFontFamilyCtor;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName(FONT_FAMILY_CLASS);
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod(ADD_FONT_WEIGHT_STYLE_METHOD, ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod(CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD, Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e11) {
            Log.e(TAG, e11.getClass().getName(), e11);
            cls = null;
            method = null;
            method2 = null;
        }
        sFontFamilyCtor = constructor;
        sFontFamily = cls;
        sAddFontWeightStyle = method2;
        sCreateFromFamiliesWithDefault = method;
    }

    private static boolean addFontWeightStyle(Object obj, ByteBuffer byteBuffer, int i11, int i12, boolean z11) {
        try {
            return ((Boolean) sAddFontWeightStyle.invoke(obj, byteBuffer, Integer.valueOf(i11), null, Integer.valueOf(i12), Boolean.valueOf(z11))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface createFromFamiliesWithDefault(Object obj) {
        try {
            Object newInstance = Array.newInstance(sFontFamily, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) sCreateFromFamiliesWithDefault.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean isUsable() {
        Method method = sAddFontWeightStyle;
        if (method == null) {
            Log.w(TAG, "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object newFamily() {
        try {
            return sFontFamilyCtor.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    @Nullable
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i11) {
        Object newFamily = newFamily();
        if (newFamily == null) {
            return null;
        }
        for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.getEntries()) {
            ByteBuffer copyToDirectBuffer = TypefaceCompatUtil.copyToDirectBuffer(context, resources, fontFileResourceEntry.getResourceId());
            if (copyToDirectBuffer == null || !addFontWeightStyle(newFamily, copyToDirectBuffer, fontFileResourceEntry.getTtcIndex(), fontFileResourceEntry.getWeight(), fontFileResourceEntry.isItalic())) {
                return null;
            }
        }
        return createFromFamiliesWithDefault(newFamily);
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    @Nullable
    public Typeface createFromFontInfo(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fontInfoArr, int i11) {
        Object newFamily = newFamily();
        if (newFamily == null) {
            return null;
        }
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
        for (FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
            Uri uri = fontInfo.getUri();
            ByteBuffer byteBuffer = (ByteBuffer) simpleArrayMap.get(uri);
            if (byteBuffer == null) {
                byteBuffer = TypefaceCompatUtil.mmap(context, cancellationSignal, uri);
                simpleArrayMap.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !addFontWeightStyle(newFamily, byteBuffer, fontInfo.getTtcIndex(), fontInfo.getWeight(), fontInfo.isItalic())) {
                return null;
            }
        }
        Typeface createFromFamiliesWithDefault = createFromFamiliesWithDefault(newFamily);
        if (createFromFamiliesWithDefault == null) {
            return null;
        }
        return Typeface.create(createFromFamiliesWithDefault, i11);
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    @NonNull
    public Typeface createWeightStyle(@NonNull Context context, @NonNull Typeface typeface, int i11, boolean z11) {
        Typeface typeface2;
        try {
            typeface2 = WeightTypefaceApi21.createWeightStyle(typeface, i11, z11);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        return typeface2 == null ? super.createWeightStyle(context, typeface, i11, z11) : typeface2;
    }
}
