package en;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.material.R;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(api = 30)
/* loaded from: classes7.dex */
public class v implements l {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final v f50054a = new v();
    }

    public static l c() {
        return b.f50054a;
    }

    @Override // en.l
    @NonNull
    public Context a(Context context, Map<Integer, Integer> map) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.ThemeOverlay_Material3_PersonalizedColors);
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        return x.a(contextThemeWrapper, map) ? contextThemeWrapper : context;
    }

    @Override // en.l
    public boolean b(Context context, Map<Integer, Integer> map) {
        if (!x.a(context, map)) {
            return false;
        }
        y.a(context, R.style.ThemeOverlay_Material3_PersonalizedColors);
        return true;
    }

    public v() {
    }
}
