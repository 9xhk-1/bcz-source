package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class TypefaceCompat {
    private static final LruCache<String, Typeface> sTypefaceCache;
    private static final TypefaceCompatBaseImpl sTypefaceCompatImpl;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class ResourcesCallbackAdapter extends FontsContractCompat.FontRequestCallback {

        @Nullable
        private ResourcesCompat.FontCallback mFontCallback;

        public ResourcesCallbackAdapter(@Nullable ResourcesCompat.FontCallback fontCallback) {
            this.mFontCallback = fontCallback;
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRequestFailed(int i11) {
            ResourcesCompat.FontCallback fontCallback = this.mFontCallback;
            if (fontCallback != null) {
                fontCallback.onFontRetrievalFailed(i11);
            }
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRetrieved(@NonNull Typeface typeface) {
            ResourcesCompat.FontCallback fontCallback = this.mFontCallback;
            if (fontCallback != null) {
                fontCallback.onFontRetrieved(typeface);
            }
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            sTypefaceCompatImpl = new TypefaceCompatApi29Impl();
        } else if (i11 >= 28) {
            sTypefaceCompatImpl = new TypefaceCompatApi28Impl();
        } else if (i11 >= 26) {
            sTypefaceCompatImpl = new TypefaceCompatApi26Impl();
        } else if (TypefaceCompatApi24Impl.isUsable()) {
            sTypefaceCompatImpl = new TypefaceCompatApi24Impl();
        } else {
            sTypefaceCompatImpl = new TypefaceCompatApi21Impl();
        }
        sTypefaceCache = new LruCache<>(16);
    }

    private TypefaceCompat() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @VisibleForTesting
    public static void clearCache() {
        sTypefaceCache.evictAll();
    }

    @NonNull
    public static Typeface create(@NonNull Context context, @Nullable Typeface typeface, int i11) {
        if (context != null) {
            return Typeface.create(typeface, i11);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Typeface createFromFontInfo(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fontInfoArr, int i11) {
        return sTypefaceCompatImpl.createFromFontInfo(context, cancellationSignal, fontInfoArr, i11);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface createFromResourcesFamilyXml(@NonNull Context context, @NonNull FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry, @NonNull Resources resources, int i11, @Nullable String str, int i12, int i13, @Nullable ResourcesCompat.FontCallback fontCallback, @Nullable Handler handler, boolean z11) {
        Typeface createFromFontFamilyFilesResourceEntry;
        if (familyResourceEntry instanceof FontResourcesParserCompat.ProviderResourceEntry) {
            FontResourcesParserCompat.ProviderResourceEntry providerResourceEntry = (FontResourcesParserCompat.ProviderResourceEntry) familyResourceEntry;
            Typeface systemFontFamily = getSystemFontFamily(providerResourceEntry.getSystemFontFamilyName());
            if (systemFontFamily != null) {
                if (fontCallback != null) {
                    fontCallback.callbackSuccessAsync(systemFontFamily, handler);
                }
                return systemFontFamily;
            }
            createFromFontFamilyFilesResourceEntry = FontsContractCompat.requestFont(context, providerResourceEntry.getRequest(), i13, !z11 ? fontCallback != null : providerResourceEntry.getFetchStrategy() != 0, z11 ? providerResourceEntry.getTimeout() : -1, ResourcesCompat.FontCallback.getHandler(handler), new ResourcesCallbackAdapter(fontCallback));
        } else {
            createFromFontFamilyFilesResourceEntry = sTypefaceCompatImpl.createFromFontFamilyFilesResourceEntry(context, (FontResourcesParserCompat.FontFamilyFilesResourceEntry) familyResourceEntry, resources, i13);
            if (fontCallback != null) {
                if (createFromFontFamilyFilesResourceEntry != null) {
                    fontCallback.callbackSuccessAsync(createFromFontFamilyFilesResourceEntry, handler);
                } else {
                    fontCallback.callbackFailAsync(-3, handler);
                }
            }
        }
        if (createFromFontFamilyFilesResourceEntry != null) {
            sTypefaceCache.put(createResourceUid(resources, i11, str, i12, i13), createFromFontFamilyFilesResourceEntry);
        }
        return createFromFontFamilyFilesResourceEntry;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface createFromResourcesFontFile(@NonNull Context context, @NonNull Resources resources, int i11, String str, int i12, int i13) {
        Typeface createFromResourcesFontFile = sTypefaceCompatImpl.createFromResourcesFontFile(context, resources, i11, str, i13);
        if (createFromResourcesFontFile != null) {
            sTypefaceCache.put(createResourceUid(resources, i11, str, i12, i13), createFromResourcesFontFile);
        }
        return createFromResourcesFontFile;
    }

    private static String createResourceUid(Resources resources, int i11, String str, int i12, int i13) {
        return resources.getResourcePackageName(i11) + '-' + str + '-' + i12 + '-' + i11 + '-' + i13;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface findFromCache(@NonNull Resources resources, int i11, @Nullable String str, int i12, int i13) {
        return sTypefaceCache.get(createResourceUid(resources, i11, str, i12, i13));
    }

    @Nullable
    private static Typeface getBestFontFromFamily(Context context, Typeface typeface, int i11) {
        TypefaceCompatBaseImpl typefaceCompatBaseImpl = sTypefaceCompatImpl;
        FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamily = typefaceCompatBaseImpl.getFontFamily(typeface);
        if (fontFamily == null) {
            return null;
        }
        return typefaceCompatBaseImpl.createFromFontFamilyFilesResourceEntry(context, fontFamily, context.getResources(), i11);
    }

    private static Typeface getSystemFontFamily(@Nullable String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface findFromCache(@NonNull Resources resources, int i11, int i12) {
        return findFromCache(resources, i11, null, 0, i12);
    }

    @NonNull
    public static Typeface create(@NonNull Context context, @Nullable Typeface typeface, @IntRange(from = 1, to = 1000) int i11, boolean z11) {
        if (context != null) {
            Preconditions.checkArgumentInRange(i11, 1, 1000, "weight");
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            return sTypefaceCompatImpl.createWeightStyle(context, typeface, i11, z11);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface createFromResourcesFontFile(@NonNull Context context, @NonNull Resources resources, int i11, String str, int i12) {
        return createFromResourcesFontFile(context, resources, i11, str, 0, i12);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface createFromResourcesFamilyXml(@NonNull Context context, @NonNull FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry, @NonNull Resources resources, int i11, int i12, @Nullable ResourcesCompat.FontCallback fontCallback, @Nullable Handler handler, boolean z11) {
        return createFromResourcesFamilyXml(context, familyResourceEntry, resources, i11, null, 0, i12, fontCallback, handler, z11);
    }
}
