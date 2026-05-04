package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class g5 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54990a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54991b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54992c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54993d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f54994e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f54995f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f54996g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f54997h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54998i;

    public g5(@NonNull LinearLayout rootView, @NonNull TextView weekTitle1, @NonNull TextView weekTitle2, @NonNull TextView weekTitle3, @NonNull TextView weekTitle4, @NonNull TextView weekTitle5, @NonNull TextView weekTitle6, @NonNull TextView weekTitle7, @NonNull LinearLayout weeksTitle) {
        this.f54990a = rootView;
        this.f54991b = weekTitle1;
        this.f54992c = weekTitle2;
        this.f54993d = weekTitle3;
        this.f54994e = weekTitle4;
        this.f54995f = weekTitle5;
        this.f54996g = weekTitle6;
        this.f54997h = weekTitle7;
        this.f54998i = weeksTitle;
    }

    @NonNull
    public static g5 a(@NonNull View rootView) {
        int i11 = R.id.week_title_1;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.week_title_1);
        if (textView != null) {
            i11 = R.id.week_title_2;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.week_title_2);
            if (textView2 != null) {
                i11 = R.id.week_title_3;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.week_title_3);
                if (textView3 != null) {
                    i11 = R.id.week_title_4;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.week_title_4);
                    if (textView4 != null) {
                        i11 = R.id.week_title_5;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.week_title_5);
                        if (textView5 != null) {
                            i11 = R.id.week_title_6;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.week_title_6);
                            if (textView6 != null) {
                                i11 = R.id.week_title_7;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.week_title_7);
                                if (textView7 != null) {
                                    LinearLayout linearLayout = (LinearLayout) rootView;
                                    return new g5(linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, linearLayout);
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
    public static g5 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static g5 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.calendar_weeks_title, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f54990a;
    }
}
