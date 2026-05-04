package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
@SuppressLint({"SoonBlockedPrivateApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
final class WeightTypefaceApi21 {
    private static final String NATIVE_CREATE_FROM_TYPEFACE_METHOD = "nativeCreateFromTypeface";
    private static final String NATIVE_CREATE_WEIGHT_ALIAS_METHOD = "nativeCreateWeightAlias";
    private static final String NATIVE_INSTANCE_FIELD = "native_instance";
    private static final String TAG = "WeightTypeface";
    private static final Constructor<Typeface> sConstructor;
    private static final Method sNativeCreateFromTypeface;
    private static final Method sNativeCreateWeightAlias;
    private static final Field sNativeInstance;
    private static final Object sWeightCacheLock;

    @GuardedBy("sWeightCacheLock")
    private static final LongSparseArray<SparseArray<Typeface>> sWeightTypefaceCache;

    static {
        Field field;
        Constructor<Typeface> constructor;
        Method method;
        Method method2;
        try {
            field = Typeface.class.getDeclaredField(NATIVE_INSTANCE_FIELD);
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            method = Typeface.class.getDeclaredMethod(NATIVE_CREATE_FROM_TYPEFACE_METHOD, cls, cls2);
            method.setAccessible(true);
            method2 = Typeface.class.getDeclaredMethod(NATIVE_CREATE_WEIGHT_ALIAS_METHOD, cls, cls2);
            method2.setAccessible(true);
            constructor = Typeface.class.getDeclaredConstructor(cls);
            constructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e11) {
            Log.e(TAG, e11.getClass().getName(), e11);
            field = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        sNativeInstance = field;
        sNativeCreateFromTypeface = method;
        sNativeCreateWeightAlias = method2;
        sConstructor = constructor;
        sWeightTypefaceCache = new LongSparseArray<>(3);
        sWeightCacheLock = new Object();
    }

    private WeightTypefaceApi21() {
    }

    @Nullable
    private static Typeface create(long j11) {
        try {
            return sConstructor.newInstance(Long.valueOf(j11));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Nullable
    public static Typeface createWeightStyle(@NonNull Typeface typeface, int i11, boolean z11) {
        if (!isPrivateApiAvailable()) {
            return null;
        }
        int i12 = (i11 << 1) | (z11 ? 1 : 0);
        synchronized (sWeightCacheLock) {
            try {
                long nativeInstance = getNativeInstance(typeface);
                LongSparseArray<SparseArray<Typeface>> longSparseArray = sWeightTypefaceCache;
                SparseArray<Typeface> sparseArray = longSparseArray.get(nativeInstance);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>(4);
                    longSparseArray.put(nativeInstance, sparseArray);
                } else {
                    Typeface typeface2 = sparseArray.get(i12);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                Typeface create = z11 == typeface.isItalic() ? create(nativeCreateWeightAlias(nativeInstance, i11)) : create(nativeCreateFromTypefaceWithExactStyle(nativeInstance, i11, z11));
                sparseArray.put(i12, create);
                return create;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static long getNativeInstance(@NonNull Typeface typeface) {
        try {
            return sNativeInstance.getLong(typeface);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(e11);
        }
    }

    private static boolean isPrivateApiAvailable() {
        return sNativeInstance != null;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static long nativeCreateFromTypefaceWithExactStyle(long j11, int i11, boolean z11) {
        try {
            Long l11 = (Long) sNativeCreateFromTypeface.invoke(null, Long.valueOf(j11), Integer.valueOf(z11 ? 2 : 0));
            l11.longValue();
            return ((Long) sNativeCreateWeightAlias.invoke(null, l11, Integer.valueOf(i11))).longValue();
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static long nativeCreateWeightAlias(long j11, int i11) {
        try {
            return ((Long) sNativeCreateWeightAlias.invoke(null, Long.valueOf(j11), Integer.valueOf(i11))).longValue();
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }
}
