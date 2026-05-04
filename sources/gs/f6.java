package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.CircleImageView;
import com.baicizhan.main.customview.NumberView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class f6 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54881a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final CircleImageView f54882b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f54883c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final NumberView f54884d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f54885e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f54886f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final NumberView f54887g;

    public f6(@NonNull FrameLayout rootView, @NonNull CircleImageView avatar, @NonNull ImageView background, @NonNull NumberView dakaDays, @NonNull TextView date, @NonNull TextView name, @NonNull NumberView studyWords) {
        this.f54881a = rootView;
        this.f54882b = avatar;
        this.f54883c = background;
        this.f54884d = dakaDays;
        this.f54885e = date;
        this.f54886f = name;
        this.f54887g = studyWords;
    }

    @NonNull
    public static f6 a(@NonNull View rootView) {
        int i11 = R.id.avatar;
        CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(rootView, R.id.avatar);
        if (circleImageView != null) {
            i11 = R.id.background;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.background);
            if (imageView != null) {
                i11 = R.id.daka_days;
                NumberView numberView = (NumberView) ViewBindings.findChildViewById(rootView, R.id.daka_days);
                if (numberView != null) {
                    i11 = R.id.date;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.date);
                    if (textView != null) {
                        i11 = R.id.name;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
                        if (textView2 != null) {
                            i11 = R.id.study_words;
                            NumberView numberView2 = (NumberView) ViewBindings.findChildViewById(rootView, R.id.study_words);
                            if (numberView2 != null) {
                                return new f6((FrameLayout) rootView, circleImageView, imageView, numberView, textView, textView2, numberView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static f6 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static f6 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.daka_share_thumb_process, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f54881a;
    }
}
