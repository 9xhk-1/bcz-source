package lc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.aigestudio.wheelpicker.WheelPicker;
import com.baicizhan.framework.common.magicdialog.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f71074a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final WheelPicker f71075b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final WheelPicker f71076c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final WheelPicker f71077d;

    public g(@NonNull LinearLayout linearLayout, @NonNull WheelPicker wheelPicker, @NonNull WheelPicker wheelPicker2, @NonNull WheelPicker wheelPicker3) {
        this.f71074a = linearLayout;
        this.f71075b = wheelPicker;
        this.f71076c = wheelPicker2;
        this.f71077d = wheelPicker3;
    }

    @NonNull
    public static g a(@NonNull View view) {
        int i11 = R.id.center;
        WheelPicker wheelPicker = (WheelPicker) view.findViewById(i11);
        if (wheelPicker != null) {
            i11 = R.id.left;
            WheelPicker wheelPicker2 = (WheelPicker) view.findViewById(i11);
            if (wheelPicker2 != null) {
                i11 = R.id.right;
                WheelPicker wheelPicker3 = (WheelPicker) view.findViewById(i11);
                if (wheelPicker3 != null) {
                    return new g((LinearLayout) view, wheelPicker, wheelPicker2, wheelPicker3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static g c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static g d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.fragment_dialog_wheel_picker, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f71074a;
    }
}
