package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class t2 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56820a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f56821b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56822c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56823d;

    public t2(@NonNull ConstraintLayout rootView, @NonNull RecyclerView identities, @NonNull TextView title, @NonNull TextView titleTip) {
        this.f56820a = rootView;
        this.f56821b = identities;
        this.f56822c = title;
        this.f56823d = titleTip;
    }

    @NonNull
    public static t2 a(@NonNull View rootView) {
        int i11 = R.id.identities;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.identities);
        if (recyclerView != null) {
            i11 = R.id.title;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
            if (textView != null) {
                i11 = R.id.title_tip;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_tip);
                if (textView2 != null) {
                    return new t2((ConstraintLayout) rootView, recyclerView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static t2 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static t2 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_user_identity, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f56820a;
    }
}
