package eg;

import a00.i0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
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
import eg.k;
import gs.h8;
import gs.wd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kc.e;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import sa.q;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWordFavoritesDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordFavoritesDialog.kt\ncom/baicizhan/main/dialog/WordFavoritesDialog\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n3919#2:128\n4434#2,2:129\n1563#3:131\n1634#3,3:132\n*S KotlinDebug\n*F\n+ 1 WordFavoritesDialog.kt\ncom/baicizhan/main/dialog/WordFavoritesDialog\n*L\n53#1:128\n53#1:129,2\n53#1:131\n53#1:132,3\n*E\n"})
/* loaded from: classes4.dex */
public final class k extends kc.i {

    @m80.k
    public static final b H = new b(null);
    public static final int I = 8;

    @m80.k
    public static final String J = "check_options";
    public d E;
    public FavoriteInfo[] F;

    @m80.l
    public c G;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class a extends e.a<a, kc.i> {

        /* renamed from: h, reason: collision with root package name */
        public static final int f49818h = 8;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public c f49819g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k Context context) {
            super(context);
            g0.p(context, "context");
        }

        @Override // kc.d.a
        @m80.k
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public k g() {
            k kVar = new k();
            c cVar = this.f49819g;
            if (cVar == null) {
                return kVar;
            }
            kVar.m0(cVar);
            return kVar;
        }

        @m80.k
        public final a O(@m80.k c interaction) {
            g0.p(interaction, "interaction");
            this.f49819g = interaction;
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
    public interface c {
        void a(@m80.k List<Long> list);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @SuppressLint({"ResourceType"})
    public final class d extends RecyclerView.Adapter<e> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final c0 f49820a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final c0 f49821b;

        public d() {
            this.f49820a = e0.c(new x00.a() { // from class: eg.l
                @Override // x00.a
                public final Object invoke() {
                    int f11;
                    f11 = k.d.f(k.this);
                    return Integer.valueOf(f11);
                }
            });
            this.f49821b = e0.c(new x00.a() { // from class: eg.m
                @Override // x00.a
                public final Object invoke() {
                    int d11;
                    d11 = k.d.d(k.this);
                    return Integer.valueOf(d11);
                }
            });
        }

        public static final int d(k kVar) {
            return kVar.getResources().getColor(R.color.main_color_word_hint);
        }

        public static final int f(k kVar) {
            return kVar.getResources().getColor(R.color.main_blue);
        }

        public final int g() {
            return ((Number) this.f49821b.getValue()).intValue();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            FavoriteInfo[] favoriteInfoArr = k.this.F;
            if (favoriteInfoArr == null) {
                g0.S("options");
                favoriteInfoArr = null;
            }
            return favoriteInfoArr.length;
        }

        public final int h() {
            return ((Number) this.f49820a.getValue()).intValue();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@m80.k e holder, int i11) {
            g0.p(holder, "holder");
            ImageView d11 = holder.d();
            FavoriteInfo[] favoriteInfoArr = k.this.F;
            FavoriteInfo[] favoriteInfoArr2 = null;
            if (favoriteInfoArr == null) {
                g0.S("options");
                favoriteInfoArr = null;
            }
            d11.setImageResource(favoriteInfoArr[i11].i() == 0 ? R.drawable.ic_dialog_word_book_default : R.drawable.ic_dialog_word_book_custom);
            TextView e11 = holder.e();
            FavoriteInfo[] favoriteInfoArr3 = k.this.F;
            if (favoriteInfoArr3 == null) {
                g0.S("options");
                favoriteInfoArr3 = null;
            }
            e11.setText(favoriteInfoArr3[i11].l());
            ImageView c11 = holder.c();
            FavoriteInfo[] favoriteInfoArr4 = k.this.F;
            if (favoriteInfoArr4 == null) {
                g0.S("options");
            } else {
                favoriteInfoArr2 = favoriteInfoArr4;
            }
            c11.setImageTintList(ColorStateList.valueOf(favoriteInfoArr2[i11].k() ? h() : g()));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @m80.k
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public e onCreateViewHolder(@m80.k ViewGroup parent, int i11) {
            g0.p(parent, "parent");
            k kVar = k.this;
            wd e11 = wd.e(LayoutInflater.from(parent.getContext()), parent, false);
            g0.o(e11, "inflate(...)");
            return new e(kVar, e11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class e extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final ImageView f49823a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final TextView f49824b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final ImageView f49825c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f49826d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@m80.k final k kVar, wd binding) {
            super(binding.getRoot());
            g0.p(binding, "binding");
            this.f49826d = kVar;
            ImageView icon = binding.f57318b;
            g0.o(icon, "icon");
            this.f49823a = icon;
            TextView option = binding.f57319c;
            g0.o(option, "option");
            this.f49824b = option;
            ImageView checked = binding.f57317a;
            g0.o(checked, "checked");
            this.f49825c = checked;
            View root = binding.getRoot();
            g0.o(root, "getRoot(...)");
            q.t(root, 0, new x00.l() { // from class: eg.n
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 b11;
                    b11 = k.e.b(k.this, this, (View) obj);
                    return b11;
                }
            }, 1, null);
        }

        public static final g2 b(k kVar, e eVar, View it) {
            g0.p(it, "it");
            FavoriteInfo[] favoriteInfoArr = kVar.F;
            d dVar = null;
            if (favoriteInfoArr == null) {
                g0.S("options");
                favoriteInfoArr = null;
            }
            FavoriteInfo favoriteInfo = favoriteInfoArr[eVar.getAdapterPosition()];
            FavoriteInfo[] favoriteInfoArr2 = kVar.F;
            if (favoriteInfoArr2 == null) {
                g0.S("options");
                favoriteInfoArr2 = null;
            }
            favoriteInfo.n(!favoriteInfoArr2[eVar.getAdapterPosition()].k());
            d dVar2 = kVar.E;
            if (dVar2 == null) {
                g0.S("adapter");
            } else {
                dVar = dVar2;
            }
            dVar.notifyItemChanged(eVar.getAdapterPosition());
            return g2.f100423a;
        }

        @m80.k
        public final ImageView c() {
            return this.f49825c;
        }

        @m80.k
        public final ImageView d() {
            return this.f49823a;
        }

        @m80.k
        public final TextView e() {
            return this.f49824b;
        }
    }

    @Override // kc.d
    @m80.k
    public ButtonType O() {
        return ButtonType.DOUBLE;
    }

    @Override // kc.d
    public void d0(@m80.k TextView v11) {
        g0.p(v11, "v");
        super.d0(v11);
        c cVar = this.G;
        if (cVar != null) {
            FavoriteInfo[] favoriteInfoArr = this.F;
            if (favoriteInfoArr == null) {
                g0.S("options");
                favoriteInfoArr = null;
            }
            ArrayList arrayList = new ArrayList();
            for (FavoriteInfo favoriteInfo : favoriteInfoArr) {
                if (favoriteInfo.k()) {
                    arrayList.add(favoriteInfo);
                }
            }
            ArrayList arrayList2 = new ArrayList(i0.d0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(((FavoriteInfo) it.next()).i()));
            }
            cVar.a(arrayList2);
        }
    }

    @Override // kc.i
    @m80.k
    public View i0(@m80.k LayoutInflater inflater) {
        g0.p(inflater, "inflater");
        h8 d11 = h8.d(inflater);
        RecyclerView recyclerView = d11.f55146a;
        d dVar = new d();
        this.E = dVar;
        recyclerView.setAdapter(dVar);
        View root = d11.getRoot();
        g0.o(root, "getRoot(...)");
        return root;
    }

    public final void m0(c cVar) {
        this.G = cVar;
    }

    @Override // kc.h, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@m80.l Bundle bundle) {
        Parcelable[] parcelableArr;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (parcelableArr = arguments.getParcelableArray("check_options")) == null) {
            parcelableArr = new Parcelable[0];
        }
        this.F = (FavoriteInfo[]) parcelableArr;
        setCancelable(false);
    }

    @Override // kc.i, kc.h
    public int z() {
        return R.style.DialogOptionsWordFavorite;
    }
}
