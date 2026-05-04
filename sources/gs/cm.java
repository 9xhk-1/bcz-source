package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class cm extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f54502a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54503b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54504c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54505d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f54506e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f54507f;

    public cm(Object _bindingComponent, View _root, int _localFieldCount, TextView addWord, TextView changeVoice, TextView editBook, TextView pdfHistory, TextView showHideChinese, TextView showHideEnglish) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54502a = addWord;
        this.f54503b = changeVoice;
        this.f54504c = editBook;
        this.f54505d = pdfHistory;
        this.f54506e = showHideChinese;
        this.f54507f = showHideEnglish;
    }

    public static cm b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static cm c(@NonNull View view, @Nullable Object component) {
        return (cm) ViewDataBinding.bind(component, view, R.layout.popup_word_book_detail_menu);
    }

    @NonNull
    public static cm d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static cm e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static cm g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (cm) ViewDataBinding.inflateInternal(inflater, R.layout.popup_word_book_detail_menu, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static cm h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (cm) ViewDataBinding.inflateInternal(inflater, R.layout.popup_word_book_detail_menu, null, false, component);
    }
}
