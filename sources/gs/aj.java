package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.baicizhan.main.view.WordFlowView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class aj implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final WordFlowView f54185a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final WordFlowView f54186b;

    public aj(@NonNull WordFlowView rootView, @NonNull WordFlowView wordFlow) {
        this.f54185a = rootView;
        this.f54186b = wordFlow;
    }

    @NonNull
    public static aj a(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        WordFlowView wordFlowView = (WordFlowView) rootView;
        return new aj(wordFlowView, wordFlowView);
    }

    @NonNull
    public static aj c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static aj d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_wiki_item_word_flow, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public WordFlowView getRoot() {
        return this.f54185a;
    }
}
