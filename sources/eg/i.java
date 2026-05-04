package eg;

import a00.i0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.word_book.data.FavoriteInfo;
import com.jiongji.andriod.card.R;
import eg.i;
import gs.h8;
import gs.wd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kc.e;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import sa.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWordFavoritesCheckedDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordFavoritesCheckedDialog.kt\ncom/baicizhan/main/dialog/WordFavoritesCheckedDialog\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,137:1\n11561#2:138\n11896#2,3:139\n774#3:142\n865#3,2:143\n1563#3:145\n1634#3,3:146\n1761#3,3:149\n*S KotlinDebug\n*F\n+ 1 WordFavoritesCheckedDialog.kt\ncom/baicizhan/main/dialog/WordFavoritesCheckedDialog\n*L\n39#1:138\n39#1:139,3\n61#1:142\n61#1:143,2\n61#1:145\n61#1:146,3\n69#1:149,3\n*E\n"})
/* loaded from: classes4.dex */
public final class i extends kc.i {

    @m80.k
    public static final b I = new b(null);
    public static final int J = 8;

    @m80.k
    public static final String K = "check_options";
    public e E;
    public List<c> F;

    @m80.l
    public d G;
    public TextView H;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class a extends e.a<a, kc.i> {

        /* renamed from: h, reason: collision with root package name */
        public static final int f49807h = 8;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public d f49808g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k Context context) {
            super(context);
            g0.p(context, "context");
        }

        @Override // kc.d.a
        @m80.k
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public i g() {
            i iVar = new i();
            d dVar = this.f49808g;
            if (dVar == null) {
                return iVar;
            }
            iVar.o0(dVar);
            return iVar;
        }

        @m80.k
        public final a O(@m80.k d interaction) {
            g0.p(interaction, "interaction");
            this.f49808g = interaction;
            return this;
        }

        @w00.k
        @m80.k
        public final a P(@m80.k FavoriteInfo[] list) {
            g0.p(list, "list");
            h().putParcelableArray("check_options", list);
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f49809a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final FavoriteInfo f49810b;

        public c(boolean z11, @m80.k FavoriteInfo info) {
            g0.p(info, "info");
            this.f49809a = z11;
            this.f49810b = info;
        }

        public static /* synthetic */ c d(c cVar, boolean z11, FavoriteInfo favoriteInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = cVar.f49809a;
            }
            if ((i11 & 2) != 0) {
                favoriteInfo = cVar.f49810b;
            }
            return cVar.c(z11, favoriteInfo);
        }

        public final boolean a() {
            return this.f49809a;
        }

        @m80.k
        public final FavoriteInfo b() {
            return this.f49810b;
        }

        @m80.k
        public final c c(boolean z11, @m80.k FavoriteInfo info) {
            g0.p(info, "info");
            return new c(z11, info);
        }

        public final boolean e() {
            return this.f49809a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f49809a == cVar.f49809a && g0.g(this.f49810b, cVar.f49810b);
        }

        @m80.k
        public final FavoriteInfo f() {
            return this.f49810b;
        }

        public final void g(boolean z11) {
            this.f49809a = z11;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f49809a) * 31) + this.f49810b.hashCode();
        }

        @m80.k
        public String toString() {
            return "FavoriteInfoExtended(checked=" + this.f49809a + ", info=" + this.f49810b + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        void a(@m80.k List<Long> list);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @SuppressLint({"ResourceType"})
    public final class e extends RecyclerView.Adapter<f> {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@m80.k f holder, int i11) {
            g0.p(holder, "holder");
            ImageView d11 = holder.d();
            List list = i.this.F;
            List list2 = null;
            if (list == null) {
                g0.S("options");
                list = null;
            }
            d11.setImageResource(((c) list.get(i11)).f().i() == 0 ? R.drawable.ic_dialog_word_book_default : R.drawable.ic_dialog_word_book_custom);
            TextView e11 = holder.e();
            List list3 = i.this.F;
            if (list3 == null) {
                g0.S("options");
                list3 = null;
            }
            e11.setText(((c) list3.get(i11)).f().l());
            ImageView c11 = holder.c();
            List list4 = i.this.F;
            if (list4 == null) {
                g0.S("options");
            } else {
                list2 = list4;
            }
            c11.setImageResource(((c) list2.get(i11)).e() ? R.drawable.ic_primary_checked : R.drawable.ic_primary_unchecked);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public f onCreateViewHolder(@m80.k ViewGroup parent, int i11) {
            g0.p(parent, "parent");
            i iVar = i.this;
            wd e11 = wd.e(LayoutInflater.from(parent.getContext()), parent, false);
            g0.o(e11, "inflate(...)");
            return new f(iVar, e11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List list = i.this.F;
            if (list == null) {
                g0.S("options");
                list = null;
            }
            return list.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class f extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final ImageView f49812a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final TextView f49813b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final ImageView f49814c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f49815d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@m80.k final i iVar, wd binding) {
            super(binding.getRoot());
            g0.p(binding, "binding");
            this.f49815d = iVar;
            ImageView icon = binding.f57318b;
            g0.o(icon, "icon");
            this.f49812a = icon;
            TextView option = binding.f57319c;
            g0.o(option, "option");
            this.f49813b = option;
            ImageView checked = binding.f57317a;
            g0.o(checked, "checked");
            this.f49814c = checked;
            View root = binding.getRoot();
            g0.o(root, "getRoot(...)");
            q.t(root, 0, new x00.l() { // from class: eg.j
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 b11;
                    b11 = i.f.b(i.this, this, (View) obj);
                    return b11;
                }
            }, 1, null);
        }

        public static final g2 b(i iVar, f fVar, View it) {
            g0.p(it, "it");
            List list = iVar.F;
            e eVar = null;
            if (list == null) {
                g0.S("options");
                list = null;
            }
            c cVar = (c) list.get(fVar.getAdapterPosition());
            List list2 = iVar.F;
            if (list2 == null) {
                g0.S("options");
                list2 = null;
            }
            cVar.g(!((c) list2.get(fVar.getAdapterPosition())).e());
            e eVar2 = iVar.E;
            if (eVar2 == null) {
                g0.S("adapter");
            } else {
                eVar = eVar2;
            }
            eVar.notifyItemChanged(fVar.getAdapterPosition());
            iVar.n0();
            return g2.f100423a;
        }

        @m80.k
        public final ImageView c() {
            return this.f49814c;
        }

        @m80.k
        public final ImageView d() {
            return this.f49812a;
        }

        @m80.k
        public final TextView e() {
            return this.f49813b;
        }
    }

    @Override // kc.d
    @m80.k
    public ButtonType O() {
        return ButtonType.DOUBLE;
    }

    @Override // kc.d
    public void T(@m80.k TextView v11) {
        g0.p(v11, "v");
        super.T(v11);
        this.H = v11;
        n0();
    }

    @Override // kc.d
    public void d0(@m80.k TextView v11) {
        g0.p(v11, "v");
        super.d0(v11);
        d dVar = this.G;
        if (dVar != null) {
            List<c> list = this.F;
            if (list == null) {
                g0.S("options");
                list = null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((c) obj).e()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(i0.d0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(((c) it.next()).f().i()));
            }
            dVar.a(arrayList2);
        }
    }

    @Override // kc.i
    @m80.k
    public View i0(@m80.k LayoutInflater inflater) {
        g0.p(inflater, "inflater");
        h8 d11 = h8.d(inflater);
        RecyclerView recyclerView = d11.f55146a;
        e eVar = new e();
        this.E = eVar;
        recyclerView.setAdapter(eVar);
        View root = d11.getRoot();
        g0.o(root, "getRoot(...)");
        return root;
    }

    public final void n0() {
        TextView textView = this.H;
        List<c> list = null;
        if (textView == null) {
            g0.S("positiveButton");
            textView = null;
        }
        List<c> list2 = this.F;
        if (list2 == null) {
            g0.S("options");
        } else {
            list = list2;
        }
        List<c> list3 = list;
        boolean z11 = false;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((c) it.next()).e()) {
                    z11 = true;
                    break;
                }
            }
        }
        textView.setEnabled(z11);
    }

    public final void o0(d dVar) {
        this.G = dVar;
    }

    @Override // kc.h, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@m80.l Bundle bundle) {
        Parcelable[] parcelableArr;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (parcelableArr = arguments.getParcelableArray("check_options")) == null) {
            parcelableArr = new Parcelable[0];
        }
        FavoriteInfo[] favoriteInfoArr = (FavoriteInfo[]) parcelableArr;
        ArrayList arrayList = new ArrayList(favoriteInfoArr.length);
        for (FavoriteInfo favoriteInfo : favoriteInfoArr) {
            arrayList.add(new c(false, favoriteInfo));
        }
        this.F = arrayList;
        setCancelable(false);
    }

    @Override // kc.i, kc.h
    public int z() {
        return R.style.DialogOptionsWordFavorite;
    }
}
