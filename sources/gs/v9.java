package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class v9 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57143a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final EditText f57144b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f57145c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Button f57146d;

    public v9(@NonNull FrameLayout rootView, @NonNull EditText edit, @NonNull View mask, @NonNull Button ok2) {
        this.f57143a = rootView;
        this.f57144b = edit;
        this.f57145c = mask;
        this.f57146d = ok2;
    }

    @NonNull
    public static v9 a(@NonNull View rootView) {
        int i11 = R.id.edit;
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.edit);
        if (editText != null) {
            i11 = R.id.mask;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.mask);
            if (findChildViewById != null) {
                i11 = R.id.ok;
                Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.ok);
                if (button != null) {
                    return new v9((FrameLayout) rootView, editText, findChildViewById, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static v9 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static v9 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_other_error_feedback, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f57143a;
    }
}
