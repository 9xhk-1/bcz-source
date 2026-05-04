package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class bl implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54307a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54308b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54309c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54310d;

    public bl(@NonNull LinearLayout rootView, @NonNull TextView cancel, @NonNull TextView pick, @NonNull TextView take) {
        this.f54307a = rootView;
        this.f54308b = cancel;
        this.f54309c = pick;
        this.f54310d = take;
    }

    @NonNull
    public static bl a(@NonNull View rootView) {
        int i11 = R.id.cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.cancel);
        if (textView != null) {
            i11 = R.id.pick;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.pick);
            if (textView2 != null) {
                i11 = R.id.take;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.take);
                if (textView3 != null) {
                    return new bl((LinearLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static bl c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static bl d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.photo_option_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f54307a;
    }
}
