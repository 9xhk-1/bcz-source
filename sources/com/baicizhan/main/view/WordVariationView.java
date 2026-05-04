package com.baicizhan.main.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.jiongji.andriod.card.R;
import gs.wg;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;
import w00.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWordVariationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordVariationView.kt\ncom/baicizhan/main/view/WordVariationView\n+ 2 collections_ext.kt\ncom/baicizhan/client/business/util/Collections_extKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n16#2,2:51\n18#2:55\n1869#3,2:53\n*S KotlinDebug\n*F\n+ 1 WordVariationView.kt\ncom/baicizhan/main/view/WordVariationView\n*L\n33#1:51,2\n33#1:55\n34#1:53,2\n*E\n"})
/* loaded from: classes4.dex */
public final class WordVariationView extends BranchView {

    /* renamed from: p, reason: collision with root package name */
    public static final int f25138p = 8;

    /* renamed from: n, reason: collision with root package name */
    @l
    public CharSequence f25139n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public List<? extends Pair<? extends CharSequence, ? extends CharSequence>> f25140o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public WordVariationView(@m80.k Context context) {
        this(context, null, 0, 0, 14, null);
        g0.p(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(WordVariationView wordVariationView, CharSequence charSequence, List list, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = null;
        }
        wordVariationView.c(charSequence, list);
    }

    public final void c(@m80.k CharSequence title, @l List<? extends Pair<? extends CharSequence, ? extends CharSequence>> list) {
        g0.p(title, "title");
        this.f25139n = title;
        this.f25140o = list;
        e();
    }

    public final void e() {
        if (this.f25139n == null) {
            return;
        }
        removeAllViews();
        LayoutInflater from = LayoutInflater.from(getContext());
        View inflate = from.inflate(R.layout.item_wiki_word_variation_title, (ViewGroup) null, false);
        g0.n(inflate, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) inflate).setText(this.f25139n);
        addView(inflate);
        List<? extends Pair<? extends CharSequence, ? extends CharSequence>> list = this.f25140o;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            wg c11 = wg.c(from);
            c11.f57329b.setText((CharSequence) pair.getFirst());
            c11.f57330c.setText((CharSequence) pair.getSecond());
            addView(c11.getRoot());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public WordVariationView(@m80.k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public WordVariationView(@m80.k Context context, @l AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @k
    public WordVariationView(@m80.k Context context, @l AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        g0.p(context, "context");
    }

    public /* synthetic */ WordVariationView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, v vVar) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }
}
