package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.main.customview.SkillTrainingMainItemView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class tm implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final SkillTrainingMainItemView f56917a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56918b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56919c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56920d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f56921e;

    public tm(@NonNull SkillTrainingMainItemView rootView, @NonNull TextView category, @NonNull TextView progressText, @NonNull TextView title, @NonNull ImageView typeImg) {
        this.f56917a = rootView;
        this.f56918b = category;
        this.f56919c = progressText;
        this.f56920d = title;
        this.f56921e = typeImg;
    }

    @NonNull
    public static tm a(@NonNull View rootView) {
        int i11 = R.id.category;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.category);
        if (textView != null) {
            i11 = R.id.progress_text;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.progress_text);
            if (textView2 != null) {
                i11 = R.id.title;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                if (textView3 != null) {
                    i11 = R.id.type_img;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.type_img);
                    if (imageView != null) {
                        return new tm((SkillTrainingMainItemView) rootView, textView, textView2, textView3, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static tm c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static tm d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.skill_training_main_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SkillTrainingMainItemView getRoot() {
        return this.f56917a;
    }
}
