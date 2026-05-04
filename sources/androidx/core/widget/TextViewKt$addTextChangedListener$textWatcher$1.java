package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.internal.u0;
import x00.l;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n*L\n1#1,97:1\n*E\n"})
/* loaded from: classes2.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    final /* synthetic */ l<Editable, g2> $afterTextChanged;
    final /* synthetic */ r<CharSequence, Integer, Integer, Integer, g2> $beforeTextChanged;
    final /* synthetic */ r<CharSequence, Integer, Integer, Integer, g2> $onTextChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public TextViewKt$addTextChangedListener$textWatcher$1(l<? super Editable, g2> lVar, r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, g2> rVar, r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, g2> rVar2) {
        this.$afterTextChanged = lVar;
        this.$beforeTextChanged = rVar;
        this.$onTextChanged = rVar2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@m80.l Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@m80.l CharSequence charSequence, int i11, int i12, int i13) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@m80.l CharSequence charSequence, int i11, int i12, int i13) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }
}
