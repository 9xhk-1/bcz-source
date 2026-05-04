package ye;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.CollectionUtils;
import com.baicizhan.main.activity.SingleFragmentActivity;
import com.baicizhan.main.activity.setting.offlineclear.ClearItem;
import com.jiongji.andriod.card.R;
import java.util.List;
import qb0.g;
import qb0.h;
import va.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends Fragment {

    /* renamed from: d, reason: collision with root package name */
    public static final String f99878d = "ClearCategoryFragment";

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f99879a;

    /* renamed from: b, reason: collision with root package name */
    public h f99880b;

    /* renamed from: c, reason: collision with root package name */
    public f f99881c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ye.a$a, reason: collision with other inner class name */
    public class C1359a extends g<List<ClearItem>> {
        public C1359a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.d(a.f99878d, "loadClearCatetory failed. " + e11, new Object[0]);
            if (a.this.getActivity() == null || a.this.getActivity().isFinishing()) {
                return;
            }
            if (a.this.f99881c != null) {
                a.this.f99881c.dismiss();
            }
            va.g.g(R.string.base_toast_failed, 0);
        }

        @Override // qb0.g
        public void onStart() {
            if (a.this.f99881c != null) {
                a.this.f99881c.show();
            }
        }

        @Override // qb0.c
        public void onNext(List<ClearItem> items) {
            if (a.this.getActivity() == null || a.this.getActivity().isFinishing()) {
                return;
            }
            if (a.this.f99881c != null) {
                a.this.f99881c.dismiss();
            }
            a.this.f99879a.setAdapter(a.this.new b(items));
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends RecyclerView.Adapter<C1361b> {

        /* renamed from: a, reason: collision with root package name */
        public final List<ClearItem> f99883a;

        /* renamed from: b, reason: collision with root package name */
        public long f99884b = 0;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: ye.a$b$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC1360a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ClearItem f99886a;

            public ViewOnClickListenerC1360a(final ClearItem val$item) {
                this.f99886a = val$item;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v11) {
                if (SystemClock.elapsedRealtime() - b.this.f99884b < 1000) {
                    return;
                }
                b.this.f99884b = SystemClock.elapsedRealtime();
                a.this.y(this.f99886a);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: ye.a$b$b, reason: collision with other inner class name */
        public class C1361b extends RecyclerView.ViewHolder {

            /* renamed from: a, reason: collision with root package name */
            public TextView f99888a;

            /* renamed from: b, reason: collision with root package name */
            public View f99889b;

            public C1361b(View itemView) {
                super(itemView);
                this.f99888a = (TextView) itemView.findViewById(R.id.category);
                this.f99889b = itemView.findViewById(R.id.divider);
            }
        }

        public b(List<ClearItem> items) {
            this.f99883a = items;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C1361b holder, int position) {
            ClearItem clearItem = this.f99883a.get(position);
            holder.f99888a.setText(clearItem.name);
            holder.f99888a.setOnClickListener(new ViewOnClickListenerC1360a(clearItem));
            if (CollectionUtils.isEmpty(this.f99883a)) {
                return;
            }
            holder.f99889b.setVisibility(position == this.f99883a.size() + (-1) ? 8 : 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C1361b onCreateViewHolder(ViewGroup parent, int viewType) {
            return new C1361b(LayoutInflater.from(parent.getContext()).inflate(R.layout.clear_category_item, parent, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<ClearItem> list = this.f99883a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_clear_category, container, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.category_list);
        this.f99879a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f99881c = new f(requireContext());
        x();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        h hVar = this.f99880b;
        if (hVar == null || hVar.isUnsubscribed()) {
            return;
        }
        this.f99880b.unsubscribe();
    }

    public final void x() {
        h hVar = this.f99880b;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f99880b.unsubscribe();
        }
        this.f99880b = d.h(getActivity()).I3(tb0.a.a()).r5(new C1359a());
    }

    public final void y(ClearItem clearItem) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(ye.b.f99892l, clearItem);
        SingleFragmentActivity.J0(getContext(), ye.b.class, bundle, clearItem.name, false, false);
    }
}
