package ne;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.managers.booklist.BookListManager;
import com.baicizhan.client.wordtesting.view.BookIconView;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.List;
import xb.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends Fragment {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ne.a$a, reason: collision with other inner class name */
    public static class C0911a extends RecyclerView.Adapter<b> {

        /* renamed from: a, reason: collision with root package name */
        public List<String> f75062a;

        public C0911a(List<String> items) {
            this.f75062a = items;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(b viewHolder, int i11) {
            viewHolder.f75063a.setBookName(this.f75062a.get(i11));
            viewHolder.f75064b.setText(this.f75062a.get(i11));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(ViewGroup viewGroup, int i11) {
            Context context = viewGroup.getContext();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            BookIconView bookIconView = new BookIconView(context);
            layoutParams.topMargin = f.a(context, 26.0f);
            bookIconView.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            layoutParams2.topMargin = f.a(context, 6.0f);
            textView.setLayoutParams(layoutParams2);
            textView.setGravity(17);
            textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.T10));
            textView.setTextColor(context.getResources().getColor(R.color.C123));
            int a11 = f.a(context, 20.0f);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            linearLayout.setGravity(1);
            linearLayout.setOrientation(1);
            linearLayout.setPadding(a11, 0, a11, 0);
            linearLayout.addView(bookIconView);
            linearLayout.addView(textView);
            return new b(linearLayout);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<String> list = this.f75062a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public BookIconView f75063a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f75064b;

        public b(ViewGroup itemView) {
            super(itemView);
            this.f75063a = (BookIconView) itemView.getChildAt(0);
            this.f75064b = (TextView) itemView.getChildAt(1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_completed_schedule, container, false);
        t(inflate);
        return inflate;
    }

    public final void t(View root) {
        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.completed_schedule_grid);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        View findViewById = root.findViewById(R.id.empty);
        ArrayList arrayList = new ArrayList();
        for (BookRecord bookRecord : BookListManager.getInstance().getSelectedBooks()) {
            if (bookRecord.isFinished()) {
                arrayList.add(bookRecord.bookName);
            }
        }
        if (!arrayList.isEmpty()) {
            recyclerView.setAdapter(new C0911a(arrayList));
        } else {
            findViewById.setVisibility(0);
            recyclerView.setVisibility(8);
        }
    }
}
