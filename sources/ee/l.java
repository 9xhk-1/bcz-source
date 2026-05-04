package ee;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.jiongji.andriod.card.R;
import gs.cf;
import gs.ef;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nGradleAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GradleAdapter.kt\ncom/baicizhan/main/activity/idenity/GradleAdapter\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n35#2:87\n35#2:88\n1#3:89\n*S KotlinDebug\n*F\n+ 1 GradleAdapter.kt\ncom/baicizhan/main/activity/idenity/GradleAdapter\n*L\n25#1:87\n26#1:88\n*E\n"})
/* loaded from: classes4.dex */
public final class l extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f49697e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f49698f = 8;

    /* renamed from: g, reason: collision with root package name */
    public static final int f49699g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f49700h = 2;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Context f49701a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<ee.a, g2> f49702b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Object> f49703c;

    /* renamed from: d, reason: collision with root package name */
    public int f49704d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final cf f49705a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f49706b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k l lVar, cf binding) {
            super(binding.getRoot());
            kotlin.jvm.internal.g0.p(binding, "binding");
            this.f49706b = lVar;
            this.f49705a = binding;
        }

        @m80.k
        public final cf a() {
            return this.f49705a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final ef f49707a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f49708b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k l lVar, ef binding) {
            super(binding.getRoot());
            kotlin.jvm.internal.g0.p(binding, "binding");
            this.f49708b = lVar;
            this.f49707a = binding;
        }

        @m80.k
        public final ef a() {
            return this.f49707a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@m80.k Context context, @m80.k x00.l<? super ee.a, g2> itemClick) {
        kotlin.jvm.internal.g0.p(context, "context");
        kotlin.jvm.internal.g0.p(itemClick, "itemClick");
        this.f49701a = context;
        this.f49702b = itemClick;
        this.f49703c = new ArrayList();
        this.f49704d = -1;
    }

    public static final void f(l lVar, int i11, View view) {
        x00.l<ee.a, g2> lVar2 = lVar.f49702b;
        Object obj = lVar.f49703c.get(i11);
        kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type com.baicizhan.main.activity.idenity.Grade");
        lVar2.invoke((ee.a) obj);
    }

    @m80.k
    public final Context c() {
        return this.f49701a;
    }

    @m80.k
    public final x00.l<ee.a, g2> d() {
        return this.f49702b;
    }

    public final void g(@m80.k List<? extends Object> items, int i11) {
        UserRecord p11;
        UserRecord.Role role;
        kotlin.jvm.internal.g0.p(items, "items");
        this.f49703c.clear();
        this.f49703c.addAll(items);
        if ((i11 == 2 || i11 == 3) && (p11 = q9.x.r().p()) != null && (role = p11.getRole()) != null) {
            this.f49704d = role.grade;
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f49703c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i11) {
        return this.f49703c.get(i11) instanceof ee.a ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@m80.k RecyclerView.ViewHolder holder, final int i11) {
        kotlin.jvm.internal.g0.p(holder, "holder");
        if (!(holder instanceof b)) {
            if (holder instanceof c) {
                TextView textView = ((c) holder).a().f54785a;
                Object obj = this.f49703c.get(i11);
                kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type kotlin.String");
                textView.setText((String) obj);
                return;
            }
            return;
        }
        b bVar = (b) holder;
        TextView textView2 = bVar.a().f54453a;
        Object obj2 = this.f49703c.get(i11);
        ee.a aVar = obj2 instanceof ee.a ? (ee.a) obj2 : null;
        textView2.setText(aVar != null ? aVar.f() : null);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: ee.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.f(l.this, i11, view);
            }
        });
        Object obj3 = this.f49703c.get(i11);
        ee.a aVar2 = obj3 instanceof ee.a ? (ee.a) obj3 : null;
        if (aVar2 == null || aVar2.e() != this.f49704d) {
            holder.itemView.setSelected(false);
            bVar.a().f54454b.setVisibility(8);
            bVar.a().f54453a.setTextColor(this.f49701a.getColor(R.color.main_color_word_822));
        } else {
            holder.itemView.setSelected(true);
            bVar.a().f54454b.setVisibility(0);
            bVar.a().f54453a.setTextColor(Color.parseColor("#124EE6"));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @m80.k
    public RecyclerView.ViewHolder onCreateViewHolder(@m80.k ViewGroup parent, int i11) {
        kotlin.jvm.internal.g0.p(parent, "parent");
        if (i11 == 2) {
            cf d11 = cf.d(LayoutInflater.from(parent.getContext()));
            kotlin.jvm.internal.g0.o(d11, "inflate(...)");
            return new b(this, d11);
        }
        ef d12 = ef.d(LayoutInflater.from(parent.getContext()));
        kotlin.jvm.internal.g0.o(d12, "inflate(...)");
        return new c(this, d12);
    }
}
