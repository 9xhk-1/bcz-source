package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.RecycleableImageView;
import com.jiongji.andriod.card.R;
import me.grantland.widget.AutofitTextView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class tl implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56909a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56910b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f56911c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecyclerView f56912d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final RecycleableImageView f56913e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final Button f56914f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final AutofitTextView f56915g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56916h;

    public tl(@NonNull RelativeLayout rootView, @NonNull TextView plusreviewMatchWikiCnmean, @NonNull Button plusreviewMatchWikiContinue, @NonNull RecyclerView plusreviewMatchWikiExams, @NonNull RecycleableImageView plusreviewMatchWikiImage, @NonNull Button plusreviewMatchWikiNotifyErr, @NonNull AutofitTextView plusreviewMatchWikiWord, @NonNull LinearLayout plusreviewMatchWikiWordInfos) {
        this.f56909a = rootView;
        this.f56910b = plusreviewMatchWikiCnmean;
        this.f56911c = plusreviewMatchWikiContinue;
        this.f56912d = plusreviewMatchWikiExams;
        this.f56913e = plusreviewMatchWikiImage;
        this.f56914f = plusreviewMatchWikiNotifyErr;
        this.f56915g = plusreviewMatchWikiWord;
        this.f56916h = plusreviewMatchWikiWordInfos;
    }

    @NonNull
    public static tl a(@NonNull View rootView) {
        int i11 = R.id.plusreview_match_wiki_cnmean;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_wiki_cnmean);
        if (textView != null) {
            i11 = R.id.plusreview_match_wiki_continue;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_wiki_continue);
            if (button != null) {
                i11 = R.id.plusreview_match_wiki_exams;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_wiki_exams);
                if (recyclerView != null) {
                    i11 = R.id.plusreview_match_wiki_image;
                    RecycleableImageView recycleableImageView = (RecycleableImageView) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_wiki_image);
                    if (recycleableImageView != null) {
                        i11 = R.id.plusreview_match_wiki_notify_err;
                        Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_wiki_notify_err);
                        if (button2 != null) {
                            i11 = R.id.plusreview_match_wiki_word;
                            AutofitTextView autofitTextView = (AutofitTextView) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_wiki_word);
                            if (autofitTextView != null) {
                                i11 = R.id.plusreview_match_wiki_word_infos;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_wiki_word_infos);
                                if (linearLayout != null) {
                                    return new tl((RelativeLayout) rootView, textView, button, recyclerView, recycleableImageView, button2, autofitTextView, linearLayout);
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
    public static tl c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static tl d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.plusreview_fragment_match_wiki, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f56909a;
    }
}
