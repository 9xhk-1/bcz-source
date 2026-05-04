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
public final class m7 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55857a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f55858b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55859c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55860d;

    public m7(@NonNull RelativeLayout rootView, @NonNull View fmStartDivider, @NonNull TextView fmStartTipCount, @NonNull TextView fmStartTipTime) {
        this.f55857a = rootView;
        this.f55858b = fmStartDivider;
        this.f55859c = fmStartTipCount;
        this.f55860d = fmStartTipTime;
    }

    @NonNull
    public static m7 a(@NonNull View rootView) {
        int i11 = R.id.fm_start_divider;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.fm_start_divider);
        if (findChildViewById != null) {
            i11 = R.id.fm_start_tip_count;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.fm_start_tip_count);
            if (textView != null) {
                i11 = R.id.fm_start_tip_time;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.fm_start_tip_time);
                if (textView2 != null) {
                    return new m7((RelativeLayout) rootView, findChildViewById, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static m7 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static m7 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fm_line_item_start, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55857a;
    }
}
