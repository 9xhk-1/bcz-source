package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.main.view.AspectRoundImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class qd implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56486a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Group f56487b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final AspectRoundImageView f56488c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56489d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56490e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f56491f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final Guideline f56492g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final View f56493h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f56494i;

    public qd(@NonNull ConstraintLayout rootView, @NonNull Group added, @NonNull AspectRoundImageView bookCover, @NonNull TextView bookDesc, @NonNull TextView bookName, @NonNull TextView bookWordsSum, @NonNull Guideline contentRight, @NonNull View noproguardAddedCover, @NonNull TextView noproguardAddedTag) {
        this.f56486a = rootView;
        this.f56487b = added;
        this.f56488c = bookCover;
        this.f56489d = bookDesc;
        this.f56490e = bookName;
        this.f56491f = bookWordsSum;
        this.f56492g = contentRight;
        this.f56493h = noproguardAddedCover;
        this.f56494i = noproguardAddedTag;
    }

    @NonNull
    public static qd a(@NonNull View rootView) {
        int i11 = R.id.added;
        Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.added);
        if (group != null) {
            i11 = R.id.book_cover;
            AspectRoundImageView aspectRoundImageView = (AspectRoundImageView) ViewBindings.findChildViewById(rootView, R.id.book_cover);
            if (aspectRoundImageView != null) {
                i11 = R.id.book_desc;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.book_desc);
                if (textView != null) {
                    i11 = R.id.book_name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.book_name);
                    if (textView2 != null) {
                        i11 = R.id.book_words_sum;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.book_words_sum);
                        if (textView3 != null) {
                            i11 = R.id.content_right;
                            Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.content_right);
                            if (guideline != null) {
                                i11 = R.id.noproguard_added_cover;
                                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.noproguard_added_cover);
                                if (findChildViewById != null) {
                                    i11 = R.id.noproguard_added_tag;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.noproguard_added_tag);
                                    if (textView4 != null) {
                                        return new qd((ConstraintLayout) rootView, group, aspectRoundImageView, textView, textView2, textView3, guideline, findChildViewById, textView4);
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
    public static qd c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static qd d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_book_info, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f56486a;
    }
}
