package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.baicizhan.main.customview.FixedGridLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class zk implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FixedGridLayout f57798a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FixedGridLayout f57799b;

    public zk(@NonNull FixedGridLayout rootView, @NonNull FixedGridLayout optionContainer) {
        this.f57798a = rootView;
        this.f57799b = optionContainer;
    }

    @NonNull
    public static zk a(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        FixedGridLayout fixedGridLayout = (FixedGridLayout) rootView;
        return new zk(fixedGridLayout, fixedGridLayout);
    }

    @NonNull
    public static zk c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static zk d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.pattern_word_to_pic_options, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FixedGridLayout getRoot() {
        return this.f57798a;
    }
}
