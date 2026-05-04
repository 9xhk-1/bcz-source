package lt;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class c extends Dialog {
    public c(@NonNull Context context) {
        super(context);
    }

    @Nullable
    public abstract View a();

    @NonNull
    public abstract List<String> b();

    @NonNull
    public abstract View c();

    public c(@NonNull Context context, int i11) {
        super(context, i11);
    }

    public c(@NonNull Context context, boolean z11, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        super(context, z11, onCancelListener);
    }
}
