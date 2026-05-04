package od;

import android.text.TextUtils;
import android.widget.ImageView;
import androidx.databinding.BindingAdapter;
import com.baicizhan.client.business.widget.share.SharePanelViewV2;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class i {
    @BindingAdapter({"adImage"})
    public static void a(ImageView imageView, String url) {
        if (TextUtils.isEmpty(url)) {
            return;
        }
        hc.c.l(url).j(R.drawable.ic_ad_study_default).f(R.drawable.ic_ad_study_default).o(imageView);
    }

    @BindingAdapter({"shareEnabled"})
    public static void b(SharePanelViewV2 shareView, int status) {
        shareView.f(status == 2);
    }
}
