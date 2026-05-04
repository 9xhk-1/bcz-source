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
public final class vo implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f57225a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57226b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f57227c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f57228d;

    public vo(@NonNull RelativeLayout rootView, @NonNull TextView mean, @NonNull TextView phonetic, @NonNull TextView word) {
        this.f57225a = rootView;
        this.f57226b = mean;
        this.f57227c = phonetic;
        this.f57228d = word;
    }

    @NonNull
    public static vo a(@NonNull View rootView) {
        int i11 = R.id.mean;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.mean);
        if (textView != null) {
            i11 = R.id.phonetic;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phonetic);
            if (textView2 != null) {
                i11 = R.id.word;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.word);
                if (textView3 != null) {
                    return new vo((RelativeLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static vo c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static vo d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.word_translate_window, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f57225a;
    }
}
