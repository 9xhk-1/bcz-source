package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class di implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54633a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54634b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f54635c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54636d;

    public di(@NonNull LinearLayout rootView, @NonNull LinearLayout guideOcrCameraTaken, @NonNull ImageView line, @NonNull TextView tip) {
        this.f54633a = rootView;
        this.f54634b = guideOcrCameraTaken;
        this.f54635c = line;
        this.f54636d = tip;
    }

    @NonNull
    public static di a(@NonNull View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        int i11 = R.id.line;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.line);
        if (imageView != null) {
            i11 = R.id.tip;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tip);
            if (textView != null) {
                return new di(linearLayout, linearLayout, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static di c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static di d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_guide_ocr_words_camera_taken, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f54633a;
    }
}
