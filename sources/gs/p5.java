package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class p5 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56299a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f56300b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56301c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56302d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56303e;

    public p5(@NonNull ConstraintLayout rootView, @NonNull View divider, @NonNull ConstraintLayout item, @NonNull TextView name, @NonNull TextView size) {
        this.f56299a = rootView;
        this.f56300b = divider;
        this.f56301c = item;
        this.f56302d = name;
        this.f56303e = size;
    }

    @NonNull
    public static p5 a(@NonNull View rootView) {
        int i11 = R.id.divider;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
        if (findChildViewById != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
            i11 = R.id.name;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
            if (textView != null) {
                i11 = R.id.size;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.size);
                if (textView2 != null) {
                    return new p5(constraintLayout, findChildViewById, constraintLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static p5 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static p5 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.clear_item_list_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f56299a;
    }
}
