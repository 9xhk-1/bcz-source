package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.badlogic.gdx.scenes.scene2d.ui.q;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class fj implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f54941a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f54942b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ProgressBar f54943c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f54944d;

    public fj(@NonNull View rootView, @NonNull AppCompatImageView errorIcon, @NonNull ProgressBar progress, @NonNull AppCompatTextView wordStr) {
        this.f54941a = rootView;
        this.f54942b = errorIcon;
        this.f54943c = progress;
        this.f54944d = wordStr;
    }

    @NonNull
    public static fj a(@NonNull View rootView) {
        int i11 = R.id.error_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.error_icon);
        if (appCompatImageView != null) {
            i11 = R.id.progress;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
            if (progressBar != null) {
                i11 = R.id.word_str;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.word_str);
                if (appCompatTextView != null) {
                    return new fj(rootView, appCompatImageView, progressBar, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static fj b(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        if (parent == null) {
            throw new NullPointerException(q.a.f13044u);
        }
        inflater.inflate(R.layout.layout_word_text_view, parent);
        return a(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f54941a;
    }
}
