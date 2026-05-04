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
public final class ro implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56675a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56676b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56677c;

    public ro(@NonNull LinearLayout rootView, @NonNull LinearLayout selectArea, @NonNull TextView word) {
        this.f56675a = rootView;
        this.f56676b = selectArea;
        this.f56677c = word;
    }

    @NonNull
    public static ro a(@NonNull View rootView) {
        int i11 = R.id.select_area;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.select_area);
        if (linearLayout != null) {
            i11 = R.id.word;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.word);
            if (textView != null) {
                return new ro((LinearLayout) rootView, linearLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ro c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ro d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.word_error_feedback_content, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f56675a;
    }
}
