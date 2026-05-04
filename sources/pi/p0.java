package pi;

import android.view.LayoutInflater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.main.view.WordVariationView;
import com.baicizhan.main.wikiv2.study.model.ExtendedWordInfo;
import gs.cj;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nWordVariationsBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordVariationsBinder.kt\ncom/baicizhan/main/wikiv2/lookup/binder/WordVariationsBinder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1563#2:33\n1634#2,3:34\n*S KotlinDebug\n*F\n+ 1 WordVariationsBinder.kt\ncom/baicizhan/main/wikiv2/lookup/binder/WordVariationsBinder\n*L\n25#1:33\n25#1:34,3\n*E\n"})
/* loaded from: classes3.dex */
public final class p0 extends c<o0, cj> {

    /* renamed from: k, reason: collision with root package name */
    public static final int f80610k = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(@m80.k oi.b0 model, @m80.k LifecycleOwner owner) {
        super(model, owner);
        kotlin.jvm.internal.g0.p(model, "model");
        kotlin.jvm.internal.g0.p(owner, "owner");
    }

    @Override // pi.c
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k c<o0, cj>.a holder, @m80.k o0 item) {
        kotlin.jvm.internal.g0.p(holder, "holder");
        kotlin.jvm.internal.g0.p(item, "item");
        int size = item.e().d().size();
        cj c11 = holder.c();
        if (c11 == null) {
            return;
        }
        if (size != c11.f54478b.getChildCount() - 1) {
            WordVariationView wordVariationView = c11.f54478b;
            String word = item.e().f82243a;
            kotlin.jvm.internal.g0.o(word, "word");
            List<ExtendedWordInfo.WordDeform> d11 = item.e().d();
            kotlin.jvm.internal.g0.o(d11, "getWordDeforms(...)");
            List<ExtendedWordInfo.WordDeform> list = d11;
            ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
            for (ExtendedWordInfo.WordDeform wordDeform : list) {
                arrayList.add(new Pair(wordDeform.f25874a, wordDeform.f25875b));
            }
            wordVariationView.c(word, arrayList);
        } else {
            c11.f54478b.invalidate();
        }
        super.g(holder, item);
    }

    @Override // pi.c
    @m80.l
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public cj z(@m80.k LayoutInflater inflater) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        return cj.c(inflater);
    }
}
