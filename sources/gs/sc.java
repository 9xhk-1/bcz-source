package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
public final class sc implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56741a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Button f56742b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56743c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56744d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56745e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f56746f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final CircleImageView f56747g;

    public sc(@NonNull LinearLayout rootView, @NonNull Button invite, @NonNull TextView invited, @NonNull TextView name, @NonNull TextView text1, @NonNull TextView text2, @NonNull CircleImageView thumb) {
        this.f56741a = rootView;
        this.f56742b = invite;
        this.f56743c = invited;
        this.f56744d = name;
        this.f56745e = text1;
        this.f56746f = text2;
        this.f56747g = thumb;
    }

    @NonNull
    public static sc a(@NonNull View rootView) {
        int i11 = R.id.invite;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.invite);
        if (button != null) {
            i11 = R.id.invited;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.invited);
            if (textView != null) {
                i11 = R.id.name;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
                if (textView2 != null) {
                    i11 = R.id.text1;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text1);
                    if (textView3 != null) {
                        i11 = R.id.text2;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text2);
                        if (textView4 != null) {
                            i11 = R.id.thumb;
                            CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(rootView, R.id.thumb);
                            if (circleImageView != null) {
                                return new sc((LinearLayout) rootView, button, textView, textView2, textView3, textView4, circleImageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static sc c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static sc d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.friend_suggestion_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f56741a;
    }
}
