package he;

import android.text.TextUtils;
import android.widget.ImageView;
import androidx.databinding.BindingAdapter;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b {
    @BindingAdapter({"avatarLocal"})
    public static void a(ImageView imageView, String path) {
        if (TextUtils.isEmpty(path)) {
            imageView.setImageResource(R.drawable.defaultavatarbig_normal_default);
        } else {
            e.e(imageView, path, true);
        }
    }

    @BindingAdapter({q9.h.f81940d})
    public static void b(ImageView imageView, String path) {
        if (TextUtils.isEmpty(path)) {
            imageView.setImageResource(R.drawable.defaultavatarbig_normal_default);
        } else {
            e.d(imageView, path);
        }
    }
}
