package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class ab implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54163a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54164b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54165c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54166d;

    public ab(@NonNull RelativeLayout rootView, @NonNull TextView accent, @NonNull TextView cnmean, @NonNull TextView word) {
        this.f54163a = rootView;
        this.f54164b = accent;
        this.f54165c = cnmean;
        this.f54166d = word;
    }

    @NonNull
    public static ab a(@NonNull View rootView) {
        int i11 = R.id.accent;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.accent);
        if (textView != null) {
            i11 = R.id.cnmean;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.cnmean);
            if (textView2 != null) {
                i11 = R.id.word;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.word);
                if (textView3 != null) {
                    return new ab((RelativeLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ab c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ab d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_three_part_wiki, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f54163a;
    }
}
