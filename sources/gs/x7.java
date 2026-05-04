package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class x7 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57411a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final GridView f57412b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f57413c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57414d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ProgressBar f57415e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57416f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f57417g;

    public x7(@NonNull LinearLayout rootView, @NonNull GridView bookGrid, @NonNull TextView errMsg, @NonNull FrameLayout help, @NonNull ProgressBar loadProgress, @NonNull LinearLayout man, @NonNull TextView store) {
        this.f57411a = rootView;
        this.f57412b = bookGrid;
        this.f57413c = errMsg;
        this.f57414d = help;
        this.f57415e = loadProgress;
        this.f57416f = man;
        this.f57417g = store;
    }

    @NonNull
    public static x7 a(@NonNull View rootView) {
        int i11 = R.id.book_grid;
        GridView gridView = (GridView) ViewBindings.findChildViewById(rootView, R.id.book_grid);
        if (gridView != null) {
            i11 = R.id.err_msg;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.err_msg);
            if (textView != null) {
                i11 = R.id.help;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.help);
                if (frameLayout != null) {
                    i11 = R.id.load_progress;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.load_progress);
                    if (progressBar != null) {
                        i11 = R.id.man;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.man);
                        if (linearLayout != null) {
                            i11 = R.id.store;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.store);
                            if (textView2 != null) {
                                return new x7((LinearLayout) rootView, gridView, textView, frameLayout, progressBar, linearLayout, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static x7 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static x7 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_book_list, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f57411a;
    }
}
