package en;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ContextThemeWrapper;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.google.android.material.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public static final String f50027a = "r";

    @RequiresApi(api = 30)
    public static void a(@NonNull Map<Integer, Integer> map, @NonNull TypedArray typedArray, @Nullable TypedArray typedArray2, @ColorInt int i11) {
        if (typedArray2 == null) {
            typedArray2 = typedArray;
        }
        for (int i12 = 0; i12 < typedArray.getIndexCount(); i12++) {
            int resourceId = typedArray2.getResourceId(i12, 0);
            if (resourceId != 0 && typedArray.hasValue(i12) && x.b(typedArray.getType(i12))) {
                map.put(Integer.valueOf(resourceId), Integer.valueOf(u.o(typedArray.getColor(i12, 0), i11)));
            }
        }
    }

    @NonNull
    public static void b(@NonNull Context context, @NonNull s sVar) {
        if (d()) {
            Map<Integer, Integer> c11 = c(context, sVar);
            int e11 = sVar.e(0);
            if (!x.a(context, c11) || e11 == 0) {
                return;
            }
            y.a(context, e11);
        }
    }

    @RequiresApi(api = 30)
    public static Map<Integer, Integer> c(Context context, s sVar) {
        HashMap hashMap = new HashMap();
        int c11 = u.c(context, sVar.b(), f50027a);
        for (int i11 : sVar.d()) {
            hashMap.put(Integer.valueOf(i11), Integer.valueOf(u.o(ContextCompat.getColor(context, i11), c11)));
        }
        q c12 = sVar.c();
        if (c12 != null) {
            int[] d11 = c12.d();
            if (d11.length > 0) {
                int e11 = c12.e();
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(d11);
                TypedArray obtainStyledAttributes2 = e11 != 0 ? new ContextThemeWrapper(context, e11).obtainStyledAttributes(d11) : null;
                a(hashMap, obtainStyledAttributes, obtainStyledAttributes2, c11);
                obtainStyledAttributes.recycle();
                if (obtainStyledAttributes2 != null) {
                    obtainStyledAttributes2.recycle();
                }
            }
        }
        return hashMap;
    }

    @ChecksSdkIntAtLeast(api = 30)
    public static boolean d() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @NonNull
    public static Context e(@NonNull Context context, @NonNull s sVar) {
        if (d()) {
            Map<Integer, Integer> c11 = c(context, sVar);
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, sVar.e(R.style.ThemeOverlay_Material3_HarmonizedColors_Empty));
            contextThemeWrapper.applyOverrideConfiguration(new Configuration());
            if (x.a(contextThemeWrapper, c11)) {
                return contextThemeWrapper;
            }
        }
        return context;
    }
}
