package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,97:1\n65#1:98\n77#1,4:99\n93#1,3:103\n65#1,16:106\n93#1,3:122\n65#1,16:125\n93#1,3:141\n*S KotlinDebug\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n35#1:98\n35#1:99,4\n35#1:103,3\n49#1:106,16\n49#1:122,3\n58#1:125,16\n58#1:141,3\n*E\n"})
/* loaded from: classes2.dex */
public final class TextViewKt {
    @k
    public static final TextWatcher addTextChangedListener(@k TextView textView, @k r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, g2> rVar, @k r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, g2> rVar2, @k l<? super Editable, g2> lVar) {
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(lVar, rVar, rVar2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static /* synthetic */ TextWatcher addTextChangedListener$default(TextView textView, r rVar, r rVar2, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            rVar = new r<CharSequence, Integer, Integer, Integer, g2>() { // from class: androidx.core.widget.TextViewKt$addTextChangedListener$1
                public final void invoke(@m80.l CharSequence charSequence, int i12, int i13, int i14) {
                }

                @Override // x00.r
                public /* bridge */ /* synthetic */ g2 invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return g2.f100423a;
                }
            };
        }
        if ((i11 & 2) != 0) {
            rVar2 = new r<CharSequence, Integer, Integer, Integer, g2>() { // from class: androidx.core.widget.TextViewKt$addTextChangedListener$2
                public final void invoke(@m80.l CharSequence charSequence, int i12, int i13, int i14) {
                }

                @Override // x00.r
                public /* bridge */ /* synthetic */ g2 invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return g2.f100423a;
                }
            };
        }
        if ((i11 & 4) != 0) {
            lVar = new l<Editable, g2>() { // from class: androidx.core.widget.TextViewKt$addTextChangedListener$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@m80.l Editable editable) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Editable editable) {
                    invoke2(editable);
                    return g2.f100423a;
                }
            };
        }
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(lVar, rVar, rVar2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    @k
    public static final TextWatcher doAfterTextChanged(@k TextView textView, @k final l<? super Editable, g2> lVar) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@m80.l Editable editable) {
                l.this.invoke(editable);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@m80.l CharSequence charSequence, int i11, int i12, int i13) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@m80.l CharSequence charSequence, int i11, int i12, int i13) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    @k
    public static final TextWatcher doBeforeTextChanged(@k TextView textView, @k final r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, g2> rVar) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(@m80.l CharSequence charSequence, int i11, int i12, int i13) {
                r.this.invoke(charSequence, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(@m80.l Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@m80.l CharSequence charSequence, int i11, int i12, int i13) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    @k
    public static final TextWatcher doOnTextChanged(@k TextView textView, @k final r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, g2> rVar) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void onTextChanged(@m80.l CharSequence charSequence, int i11, int i12, int i13) {
                r.this.invoke(charSequence, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(@m80.l Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@m80.l CharSequence charSequence, int i11, int i12, int i13) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }
}
