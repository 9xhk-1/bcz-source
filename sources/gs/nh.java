package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class nh implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56070a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f56071b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56072c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final uo f56073d;

    public nh(@NonNull FrameLayout rootView, @NonNull View bg2, @NonNull FrameLayout planContainer, @NonNull uo wordPlan) {
        this.f56070a = rootView;
        this.f56071b = bg2;
        this.f56072c = planContainer;
        this.f56073d = wordPlan;
    }

    @NonNull
    public static nh a(@NonNull View rootView) {
        int i11 = R.id.bg;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg);
        if (findChildViewById != null) {
            FrameLayout frameLayout = (FrameLayout) rootView;
            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.word_plan);
            if (findChildViewById2 != null) {
                return new nh(frameLayout, findChildViewById, frameLayout, uo.a(findChildViewById2));
            }
            i11 = R.id.word_plan;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static nh c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static nh d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_word_plan, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f56070a;
    }
}
