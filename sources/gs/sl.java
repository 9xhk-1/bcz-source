package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.RecycleableImageView;
import com.jiongji.andriod.card.R;
import me.grantland.widget.AutofitTextView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class sl implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56770a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56771b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56772c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56773d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56774e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f56775f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final RecycleableImageView f56776g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56777h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56778i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final AutofitTextView f56779j;

    public sl(@NonNull RelativeLayout rootView, @NonNull TextView plusreviewMatchCnexam0, @NonNull TextView plusreviewMatchCnexam1, @NonNull TextView plusreviewMatchCnmean, @NonNull TextView plusreviewMatchExam0, @NonNull TextView plusreviewMatchExam1, @NonNull RecycleableImageView plusreviewMatchImage, @NonNull LinearLayout plusreviewMatchLeft, @NonNull LinearLayout plusreviewMatchRight, @NonNull AutofitTextView plusreviewMatchWord) {
        this.f56770a = rootView;
        this.f56771b = plusreviewMatchCnexam0;
        this.f56772c = plusreviewMatchCnexam1;
        this.f56773d = plusreviewMatchCnmean;
        this.f56774e = plusreviewMatchExam0;
        this.f56775f = plusreviewMatchExam1;
        this.f56776g = plusreviewMatchImage;
        this.f56777h = plusreviewMatchLeft;
        this.f56778i = plusreviewMatchRight;
        this.f56779j = plusreviewMatchWord;
    }

    @NonNull
    public static sl a(@NonNull View rootView) {
        int i11 = R.id.plusreview_match_cnexam_0;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_cnexam_0);
        if (textView != null) {
            i11 = R.id.plusreview_match_cnexam_1;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_cnexam_1);
            if (textView2 != null) {
                i11 = R.id.plusreview_match_cnmean;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_cnmean);
                if (textView3 != null) {
                    i11 = R.id.plusreview_match_exam_0;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_exam_0);
                    if (textView4 != null) {
                        i11 = R.id.plusreview_match_exam_1;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_exam_1);
                        if (textView5 != null) {
                            i11 = R.id.plusreview_match_image;
                            RecycleableImageView recycleableImageView = (RecycleableImageView) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_image);
                            if (recycleableImageView != null) {
                                i11 = R.id.plusreview_match_left;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_left);
                                if (linearLayout != null) {
                                    i11 = R.id.plusreview_match_right;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_right);
                                    if (linearLayout2 != null) {
                                        i11 = R.id.plusreview_match_word;
                                        AutofitTextView autofitTextView = (AutofitTextView) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_word);
                                        if (autofitTextView != null) {
                                            return new sl((RelativeLayout) rootView, textView, textView2, textView3, textView4, textView5, recycleableImageView, linearLayout, linearLayout2, autofitTextView);
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
    public static sl c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static sl d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.plusreview_fragment_match, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f56770a;
    }
}
