package com.baicizhan.main.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.view.WordFlowView;
import com.jiongji.andriod.card.R;
import com.wefika.flowlayout.FlowLayout;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import qi.j;
import sa.q;
import x00.p;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWordFlowView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordFlowView.kt\ncom/baicizhan/main/view/WordFlowView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1869#2,2:56\n*S KotlinDebug\n*F\n+ 1 WordFlowView.kt\ncom/baicizhan/main/view/WordFlowView\n*L\n28#1:56,2\n*E\n"})
/* loaded from: classes4.dex */
public final class WordFlowView extends FlowLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final int f25133h = 8;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c0 f25134e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public List<j.b> f25135f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public a f25136g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(@k View view, @k j.b bVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p<View, j.b, g2> f25137a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(p<? super View, ? super j.b, g2> pVar) {
            this.f25137a = pVar;
        }

        @Override // com.baicizhan.main.view.WordFlowView.a
        public void a(View v11, j.b item) {
            g0.p(v11, "v");
            g0.p(item, "item");
            this.f25137a.invoke(v11, item);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public WordFlowView(@k Context context) {
        this(context, null, 0, 6, null);
        g0.p(context, "context");
    }

    private final LayoutInflater getLayoutInflater() {
        return (LayoutInflater) this.f25134e.getValue();
    }

    public static final LayoutInflater h(Context context) {
        return LayoutInflater.from(context);
    }

    public static final g2 j(WordFlowView wordFlowView, j.b bVar, View it) {
        g0.p(it, "it");
        a aVar = wordFlowView.f25136g;
        if (aVar != null) {
            aVar.a(it, bVar);
        }
        return g2.f100423a;
    }

    public final void i() {
        removeAllViews();
        List<j.b> list = this.f25135f;
        if (list != null) {
            for (final j.b bVar : list) {
                View inflate = getLayoutInflater().inflate(R.layout.item_wiki_word_flow, (ViewGroup) this, false);
                g0.m(inflate);
                q.t(inflate, 0, new x00.l() { // from class: ii.c
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 j11;
                        j11 = WordFlowView.j(WordFlowView.this, bVar, (View) obj);
                        return j11;
                    }
                }, 1, null);
                ((TextView) inflate).setText(bVar.f());
                addView(inflate);
            }
        }
    }

    public final void setOnWordClickListener(@k p<? super View, ? super j.b, g2> l11) {
        g0.p(l11, "l");
        this.f25136g = new b(l11);
    }

    public final void setWords(@k List<j.b> words) {
        g0.p(words, "words");
        this.f25135f = words;
        i();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public WordFlowView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public WordFlowView(@k final Context context, @l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g0.p(context, "context");
        this.f25134e = e0.c(new x00.a() { // from class: ii.b
            @Override // x00.a
            public final Object invoke() {
                LayoutInflater h11;
                h11 = WordFlowView.h(context);
                return h11;
            }
        });
    }

    public /* synthetic */ WordFlowView(Context context, AttributeSet attributeSet, int i11, int i12, v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
