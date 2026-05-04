package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class j7 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55441a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageButton f55442b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55443c;

    public j7(@NonNull RelativeLayout rootView, @NonNull ImageButton fmEndListenMore, @NonNull TextView fmLineReview) {
        this.f55441a = rootView;
        this.f55442b = fmEndListenMore;
        this.f55443c = fmLineReview;
    }

    @NonNull
    public static j7 a(@NonNull View rootView) {
        int i11 = R.id.fm_end_listen_more;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.fm_end_listen_more);
        if (imageButton != null) {
            i11 = R.id.fm_line_review;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.fm_line_review);
            if (textView != null) {
                return new j7((RelativeLayout) rootView, imageButton, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static j7 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static j7 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fm_line_item_end, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55441a;
    }
}
