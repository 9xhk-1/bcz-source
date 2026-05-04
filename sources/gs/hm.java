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
import com.aigestudio.wheelpicker.WheelPicker;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class hm implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55229a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55230b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f55231c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55232d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final WheelPicker f55233e;

    public hm(@NonNull RelativeLayout rootView, @NonNull TextView cancel, @NonNull View divider, @NonNull TextView ok2, @NonNull WheelPicker wheel) {
        this.f55229a = rootView;
        this.f55230b = cancel;
        this.f55231c = divider;
        this.f55232d = ok2;
        this.f55233e = wheel;
    }

    @NonNull
    public static hm a(@NonNull View rootView) {
        int i11 = R.id.cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.cancel);
        if (textView != null) {
            i11 = R.id.divider;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
            if (findChildViewById != null) {
                i11 = R.id.ok;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ok);
                if (textView2 != null) {
                    i11 = R.id.wheel;
                    WheelPicker wheelPicker = (WheelPicker) ViewBindings.findChildViewById(rootView, R.id.wheel);
                    if (wheelPicker != null) {
                        return new hm((RelativeLayout) rootView, textView, findChildViewById, textView2, wheelPicker);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static hm c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static hm d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.publisher_selection_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55229a;
    }
}
