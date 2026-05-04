package en;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import androidx.annotation.RequiresApi;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(api = 30)
/* loaded from: classes7.dex */
public final class x {
    public static boolean a(Context context, Map<Integer, Integer> map) {
        ResourcesLoader a11 = k.a(context, map);
        if (a11 == null) {
            return false;
        }
        context.getResources().addLoaders(a11);
        return true;
    }

    public static boolean b(int i11) {
        return 28 <= i11 && i11 <= 31;
    }
}
