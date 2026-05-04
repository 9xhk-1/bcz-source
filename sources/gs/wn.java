package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.badlogic.gdx.scenes.scene2d.ui.q;
import com.baicizhan.client.business.widget.AspectImageView;
import com.jiongji.andriod.card.R;
import me.grantland.widget.AutofitTextView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class wn implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f57369a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final AspectImageView f57370b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final AutofitTextView f57371c;

    public wn(@NonNull View rootView, @NonNull AspectImageView snapshot, @NonNull AutofitTextView topicWord) {
        this.f57369a = rootView;
        this.f57370b = snapshot;
        this.f57371c = topicWord;
    }

    @NonNull
    public static wn a(@NonNull View rootView) {
        int i11 = R.id.snapshot;
        AspectImageView aspectImageView = (AspectImageView) ViewBindings.findChildViewById(rootView, R.id.snapshot);
        if (aspectImageView != null) {
            i11 = R.id.topic_word;
            AutofitTextView autofitTextView = (AutofitTextView) ViewBindings.findChildViewById(rootView, R.id.topic_word);
            if (autofitTextView != null) {
                return new wn(rootView, aspectImageView, autofitTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static wn b(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        if (parent == null) {
            throw new NullPointerException(q.a.f13044u);
        }
        inflater.inflate(R.layout.tv_item_view, parent);
        return a(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f57369a;
    }
}
