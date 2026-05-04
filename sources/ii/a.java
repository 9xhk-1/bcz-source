package ii;

import android.graphics.drawable.Drawable;
import androidx.databinding.BindingAdapter;
import com.baicizhan.main.view.PreferenceView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {
    @BindingAdapter({"preferenceDesc"})
    public static void a(PreferenceView view, CharSequence desc) {
        view.setDescription(desc);
    }

    @BindingAdapter({"preferenceTitleTag"})
    public static void b(PreferenceView view, Drawable d11) {
        view.setTitleTag(d11);
    }
}
