package kc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import java.util.ArrayList;
import kc.e;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class s extends i {

    @m80.k
    public static final c H = new c(null);

    @m80.k
    public static final String I = "check_options";

    @m80.k
    public static final String J = "check_index";
    public String[] E;
    public int F = -1;

    @m80.l
    public b G;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends e.a<a, s> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k Context context) {
            super(context);
            g0.p(context, "context");
        }

        public static /* synthetic */ a S(a aVar, Integer[] numArr, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = -1;
            }
            return aVar.P(numArr, i11);
        }

        public static /* synthetic */ a T(a aVar, String[] strArr, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = -1;
            }
            return aVar.R(strArr, i11);
        }

        @Override // kc.d.a
        @m80.k
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public s g() {
            return new s();
        }

        @w00.k
        @m80.k
        public final a O(@m80.k Integer[] list) {
            g0.p(list, "list");
            return S(this, list, 0, 2, null);
        }

        @w00.k
        @m80.k
        public final a P(@m80.k Integer[] list, int i11) {
            g0.p(list, "list");
            ArrayList arrayList = new ArrayList(list.length);
            for (Integer num : list) {
                arrayList.add(i().getString(num.intValue()));
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return R((String[]) array, i11);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        @w00.k
        @m80.k
        public final a Q(@m80.k String[] list) {
            g0.p(list, "list");
            return T(this, list, 0, 2, null);
        }

        @w00.k
        @m80.k
        public final a R(@m80.k String[] list, int i11) {
            g0.p(list, "list");
            if (i11 != -1 && (i11 < 0 || i11 >= list.length)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            h().putStringArray("check_options", list);
            h().putInt(s.J, i11);
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(int i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.v vVar) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @SuppressLint({"ResourceType"})
    public final class d extends RecyclerView.Adapter<e> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s f66439a;

        public d(s this$0) {
            g0.p(this$0, "this$0");
            this.f66439a = this$0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@m80.k e holder, int i11) {
            g0.p(holder, "holder");
            TextView b11 = holder.b();
            String[] strArr = this.f66439a.E;
            if (strArr == null) {
                g0.S("options");
                strArr = null;
            }
            b11.setText(strArr[i11]);
            am.a.o(holder.a(), this.f66439a.F == i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e onCreateViewHolder(@m80.k ViewGroup parent, int i11) {
            g0.p(parent, "parent");
            s sVar = this.f66439a;
            lc.h d11 = lc.h.d(LayoutInflater.from(parent.getContext()), parent, false);
            g0.o(d11, "inflate(LayoutInflater.f….context), parent, false)");
            return new e(sVar, d11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            String[] strArr = this.f66439a.E;
            if (strArr == null) {
                g0.S("options");
                strArr = null;
            }
            return strArr.length;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class e extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final TextView f66440a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final ImageView f66441b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s f66442c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends Lambda implements x00.l<View, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ s f66443a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f66444b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(s sVar, e eVar) {
                super(1);
                this.f66443a = sVar;
                this.f66444b = eVar;
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(View view) {
                invoke2(view);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@m80.k View it) {
                g0.p(it, "it");
                b bVar = this.f66443a.G;
                if (bVar != null) {
                    bVar.a(this.f66444b.getAdapterPosition());
                }
                this.f66443a.dismiss();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@m80.k s this$0, lc.h binding) {
            super(binding.getRoot());
            g0.p(this$0, "this$0");
            g0.p(binding, "binding");
            this.f66442c = this$0;
            TextView textView = binding.f71080c;
            g0.o(textView, "binding.option");
            this.f66440a = textView;
            ImageView imageView = binding.f71079b;
            g0.o(imageView, "binding.checked");
            this.f66441b = imageView;
            FrameLayout root = binding.getRoot();
            g0.o(root, "binding.root");
            am.a.k(root, 0L, new a(this$0, this), 1, null);
        }

        @m80.k
        public final ImageView a() {
            return this.f66441b;
        }

        @m80.k
        public final TextView b() {
            return this.f66440a;
        }
    }

    @Override // kc.d
    @m80.k
    public ButtonType O() {
        return ButtonType.SINGLE_NEGATIVE;
    }

    @Override // kc.i
    @m80.l
    public View i0(@m80.k LayoutInflater inflater) {
        g0.p(inflater, "inflater");
        lc.c c11 = lc.c.c(inflater);
        c11.f71051b.setAdapter(new d(this));
        return c11.getRoot();
    }

    @m80.k
    public final s m0(@m80.k b interaction) {
        g0.p(interaction, "interaction");
        this.G = interaction;
        return this;
    }

    @Override // kc.h, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String[] stringArray = arguments == null ? null : arguments.getStringArray("check_options");
        if (stringArray == null) {
            stringArray = new String[0];
        }
        this.E = stringArray;
        Bundle arguments2 = getArguments();
        this.F = arguments2 != null ? arguments2.getInt(J, -1) : -1;
    }
}
