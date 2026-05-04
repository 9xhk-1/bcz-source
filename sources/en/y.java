package en;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class y {
    public static void a(@NonNull Context context, @StyleRes int i11) {
        Resources.Theme b11;
        context.getTheme().applyStyle(i11, true);
        if (!(context instanceof Activity) || (b11 = b((Activity) context)) == null) {
            return;
        }
        b11.applyStyle(i11, true);
    }

    @Nullable
    public static Resources.Theme b(@NonNull Activity activity) {
        View peekDecorView;
        Context context;
        Window window = activity.getWindow();
        if (window == null || (peekDecorView = window.peekDecorView()) == null || (context = peekDecorView.getContext()) == null) {
            return null;
        }
        return context.getTheme();
    }
}
