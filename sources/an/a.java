package an;

import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: an.a$a, reason: collision with other inner class name */
    public interface InterfaceC0022a {
        void a(@NonNull Canvas canvas);
    }

    public static int a(@NonNull Canvas canvas, float f11, float f12, float f13, float f14, int i11) {
        return canvas.saveLayerAlpha(f11, f12, f13, f14, i11);
    }

    public static int b(@NonNull Canvas canvas, @Nullable RectF rectF, int i11) {
        return canvas.saveLayerAlpha(rectF, i11);
    }
}
