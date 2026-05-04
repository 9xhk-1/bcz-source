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
public final class jm implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55545a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55546b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55547c;

    public jm(@NonNull RelativeLayout rootView, @NonNull TextView accent, @NonNull TextView selftestWord) {
        this.f55545a = rootView;
        this.f55546b = accent;
        this.f55547c = selftestWord;
    }

    @NonNull
    public static jm a(@NonNull View rootView) {
        int i11 = R.id.accent;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.accent);
        if (textView != null) {
            i11 = R.id.selftest_word;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.selftest_word);
            if (textView2 != null) {
                return new jm((RelativeLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static jm c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static jm d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.selftest_word_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55545a;
    }
}
