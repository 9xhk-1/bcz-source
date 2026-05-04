package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.badlogic.gdx.scenes.scene2d.ui.q;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class eo implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f54833a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54834b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Barrier f54835c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f54836d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final Guideline f54837e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final Guideline f54838f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f54839g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final Barrier f54840h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final Switch f54841i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f54842j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ImageView f54843k;

    public eo(@NonNull View rootView, @NonNull TextView desc, @NonNull Barrier lb2, @NonNull ImageView noproguardIcon, @NonNull Guideline noproguardLg, @NonNull Guideline noproguardRg, @NonNull ImageView noproguardStateIcon, @NonNull Barrier rb2, @NonNull Switch switchBtn, @NonNull TextView title, @NonNull ImageView titleTag) {
        this.f54833a = rootView;
        this.f54834b = desc;
        this.f54835c = lb2;
        this.f54836d = noproguardIcon;
        this.f54837e = noproguardLg;
        this.f54838f = noproguardRg;
        this.f54839g = noproguardStateIcon;
        this.f54840h = rb2;
        this.f54841i = switchBtn;
        this.f54842j = title;
        this.f54843k = titleTag;
    }

    @NonNull
    public static eo a(@NonNull View rootView) {
        int i11 = R.id.desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.desc);
        if (textView != null) {
            i11 = R.id.lb;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(rootView, R.id.lb);
            if (barrier != null) {
                i11 = R.id.noproguard_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.noproguard_icon);
                if (imageView != null) {
                    i11 = R.id.noproguard_lg;
                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.noproguard_lg);
                    if (guideline != null) {
                        i11 = R.id.noproguard_rg;
                        Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(rootView, R.id.noproguard_rg);
                        if (guideline2 != null) {
                            i11 = R.id.noproguard_state_icon;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.noproguard_state_icon);
                            if (imageView2 != null) {
                                i11 = R.id.rb;
                                Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(rootView, R.id.rb);
                                if (barrier2 != null) {
                                    i11 = R.id.switch_btn;
                                    Switch r11 = (Switch) ViewBindings.findChildViewById(rootView, R.id.switch_btn);
                                    if (r11 != null) {
                                        i11 = R.id.title;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                                        if (textView2 != null) {
                                            i11 = R.id.title_tag;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.title_tag);
                                            if (imageView3 != null) {
                                                return new eo(rootView, textView, barrier, imageView, guideline, guideline2, imageView2, barrier2, r11, textView2, imageView3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static eo b(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        if (parent == null) {
            throw new NullPointerException(q.a.f13044u);
        }
        inflater.inflate(R.layout.view_preference, parent);
        return a(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f54833a;
    }
}
