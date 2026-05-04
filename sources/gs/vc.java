package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.CircleImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class vc implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57161a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57162b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f57163c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f57164d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f57165e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f57166f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final CircleImageView f57167g;

    public vc(@NonNull LinearLayout rootView, @NonNull TextView learned, @NonNull TextView learnedLabel, @NonNull TextView name, @NonNull TextView rankNumber, @NonNull ImageView rankTrophy, @NonNull CircleImageView thumb) {
        this.f57161a = rootView;
        this.f57162b = learned;
        this.f57163c = learnedLabel;
        this.f57164d = name;
        this.f57165e = rankNumber;
        this.f57166f = rankTrophy;
        this.f57167g = thumb;
    }

    @NonNull
    public static vc a(@NonNull View rootView) {
        int i11 = R.id.learned;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.learned);
        if (textView != null) {
            i11 = R.id.learned_label;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.learned_label);
            if (textView2 != null) {
                i11 = R.id.name;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
                if (textView3 != null) {
                    i11 = R.id.rank_number;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.rank_number);
                    if (textView4 != null) {
                        i11 = R.id.rank_trophy;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.rank_trophy);
                        if (imageView != null) {
                            i11 = R.id.thumb;
                            CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(rootView, R.id.thumb);
                            if (circleImageView != null) {
                                return new vc((LinearLayout) rootView, textView, textView2, textView3, textView4, imageView, circleImageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static vc c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static vc d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.friend_week_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f57161a;
    }
}
