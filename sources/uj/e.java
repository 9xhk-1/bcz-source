package uj;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.main.wordlistv2.e1;
import com.baicizhan.main.wordlistv2.repo.OrderType;
import com.baicizhan.main.wordlistv2.repo.WordListType;
import com.baicizhan.main.wordlistv2.w0;
import com.jiongji.andriod.card.R;
import gs.z6;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import sa.q;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class e extends com.google.android.material.bottomsheet.b {

    /* renamed from: e, reason: collision with root package name */
    public static final int f92246e = 8;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w0 f92247b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<OrderType, g2> f92248c;

    /* renamed from: d, reason: collision with root package name */
    public z6 f92249d;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k w0 vm2, @k l<? super OrderType, g2> onSelected) {
        g0.p(vm2, "vm");
        g0.p(onSelected, "onSelected");
        this.f92247b = vm2;
        this.f92248c = onSelected;
    }

    private final void B() {
        MutableLiveData<OrderType> c11;
        z6 z6Var = this.f92249d;
        OrderType orderType = null;
        if (z6Var == null) {
            g0.S("mBinding");
            z6Var = null;
        }
        z6Var.f57738a.setLayoutManager(new LinearLayoutManager(requireContext()));
        WordListType value = this.f92247b.j().getValue();
        if (value != null) {
            e1 p11 = this.f92247b.p();
            if (p11 != null && (c11 = p11.c()) != null) {
                orderType = c11.getValue();
            }
            List<OrderType> orderOptionList = value.getOrderOptionList();
            RecyclerView recyclerView = z6Var.f57738a;
            if (orderType == null) {
                orderType = orderOptionList.get(0);
            }
            recyclerView.setAdapter(new c(orderOptionList, orderType, new l() { // from class: uj.d
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 C;
                    C = e.C(e.this, (OrderType) obj);
                    return C;
                }
            }));
            if (this.f92247b.j().getValue() == WordListType.TODAY) {
                TextView tvTitle = z6Var.f57739b;
                g0.o(tvTitle, "tvTitle");
                q.z(tvTitle, false);
            } else {
                TextView tvTitle2 = z6Var.f57739b;
                g0.o(tvTitle2, "tvTitle");
                q.z(tvTitle2, true);
                z6Var.f57739b.setText("展示顺序");
            }
        }
    }

    public static final g2 C(e eVar, OrderType it) {
        MutableLiveData<OrderType> c11;
        g0.p(it, "it");
        e1 p11 = eVar.f92247b.p();
        if (p11 != null && (c11 = p11.c()) != null) {
            c11.setValue(it);
        }
        eVar.f92248c.invoke(it);
        eVar.dismiss();
        return g2.f100423a;
    }

    @k
    public final w0 A() {
        return this.f92247b;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.BottomSheetDialog);
    }

    @Override // androidx.fragment.app.Fragment
    @m80.l
    public View onCreateView(@k LayoutInflater inflater, @m80.l ViewGroup viewGroup, @m80.l Bundle bundle) {
        g0.p(inflater, "inflater");
        z6 e11 = z6.e(inflater, viewGroup, false);
        g0.m(e11);
        this.f92249d = e11;
        B();
        return e11.getRoot();
    }

    @k
    public final l<OrderType, g2> z() {
        return this.f92248c;
    }
}
