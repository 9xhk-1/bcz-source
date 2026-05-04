package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.CommentCircleProgressView;
import com.baicizhan.main.phrasetraining.view.PhraseGroupHeader;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class el implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final PhraseGroupHeader f54824a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54825b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final CommentCircleProgressView f54826c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54827d;

    public el(@NonNull PhraseGroupHeader rootView, @NonNull TextView phraseGroupDownload, @NonNull CommentCircleProgressView phraseGroupDownloading, @NonNull TextView phraseGroupMsg) {
        this.f54824a = rootView;
        this.f54825b = phraseGroupDownload;
        this.f54826c = phraseGroupDownloading;
        this.f54827d = phraseGroupMsg;
    }

    @NonNull
    public static el a(@NonNull View rootView) {
        int i11 = R.id.phrase_group_download;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_group_download);
        if (textView != null) {
            i11 = R.id.phrase_group_downloading;
            CommentCircleProgressView commentCircleProgressView = (CommentCircleProgressView) ViewBindings.findChildViewById(rootView, R.id.phrase_group_downloading);
            if (commentCircleProgressView != null) {
                i11 = R.id.phrase_group_msg;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_group_msg);
                if (textView2 != null) {
                    return new el((PhraseGroupHeader) rootView, textView, commentCircleProgressView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static el c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static el d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.phrase_group_header_portrait, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PhraseGroupHeader getRoot() {
        return this.f54824a;
    }
}
