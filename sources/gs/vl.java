package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.RecycleableImageView;
import com.baicizhan.main.plusreview.view.QuizHollowAnswerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class vl implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57209a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f57210b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final CardView f57211c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57212d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f57213e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f57214f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final RecycleableImageView f57215g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ui f57216h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final QuizHollowAnswerView f57217i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f57218j;

    public vl(@NonNull ConstraintLayout rootView, @NonNull ImageView hint, @NonNull CardView imageCard, @NonNull LinearLayout plusreviewTips, @NonNull TextView plusreviewWriteAccent, @NonNull TextView plusreviewWriteCnmean, @NonNull RecycleableImageView plusreviewWriteImage, @NonNull ui plusreviewWriteKeyboard, @NonNull QuizHollowAnswerView plusreviewWriteQuiz, @NonNull ImageView slash) {
        this.f57209a = rootView;
        this.f57210b = hint;
        this.f57211c = imageCard;
        this.f57212d = plusreviewTips;
        this.f57213e = plusreviewWriteAccent;
        this.f57214f = plusreviewWriteCnmean;
        this.f57215g = plusreviewWriteImage;
        this.f57216h = plusreviewWriteKeyboard;
        this.f57217i = plusreviewWriteQuiz;
        this.f57218j = slash;
    }

    @NonNull
    public static vl a(@NonNull View rootView) {
        int i11 = R.id.hint;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.hint);
        if (imageView != null) {
            i11 = R.id.image_card;
            CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.image_card);
            if (cardView != null) {
                i11 = R.id.plusreview_tips;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.plusreview_tips);
                if (linearLayout != null) {
                    i11 = R.id.plusreview_write_accent;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.plusreview_write_accent);
                    if (textView != null) {
                        i11 = R.id.plusreview_write_cnmean;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.plusreview_write_cnmean);
                        if (textView2 != null) {
                            i11 = R.id.plusreview_write_image;
                            RecycleableImageView recycleableImageView = (RecycleableImageView) ViewBindings.findChildViewById(rootView, R.id.plusreview_write_image);
                            if (recycleableImageView != null) {
                                i11 = R.id.plusreview_write_keyboard;
                                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.plusreview_write_keyboard);
                                if (findChildViewById != null) {
                                    ui a11 = ui.a(findChildViewById);
                                    i11 = R.id.plusreview_write_quiz;
                                    QuizHollowAnswerView quizHollowAnswerView = (QuizHollowAnswerView) ViewBindings.findChildViewById(rootView, R.id.plusreview_write_quiz);
                                    if (quizHollowAnswerView != null) {
                                        i11 = R.id.slash;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.slash);
                                        if (imageView2 != null) {
                                            return new vl((ConstraintLayout) rootView, imageView, cardView, linearLayout, textView, textView2, recycleableImageView, a11, quizHollowAnswerView, imageView2);
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
    public static vl c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static vl d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.plusreview_fragment_write_portrait, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f57209a;
    }
}
