package bb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.fm.data.FmList;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class h extends RecyclerView.Adapter<c> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f6680d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6681e = 1;

    /* renamed from: a, reason: collision with root package name */
    public int f6682a = -1;

    /* renamed from: b, reason: collision with root package name */
    public FmList f6683b;

    /* renamed from: c, reason: collision with root package name */
    public b f6684c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f6685a;

        public a(final c val$holder) {
            this.f6685a = val$holder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            if (h.this.f6684c != null) {
                h.this.f6684c.a(this.f6685a.getAdapterPosition());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(int position);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public View f6687a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f6688b;

        public c(View itemView, int viewType) {
            super(itemView);
            this.f6687a = itemView;
            if (viewType == 0) {
                this.f6688b = (TextView) itemView.findViewById(R.id.word);
            }
        }
    }

    public boolean c(int position) {
        FmList fmList = this.f6683b;
        return (fmList == null || fmList.isEmpty() || position != this.f6683b.size()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final c holder, int position) {
        if (getItemViewType(position) == 0) {
            holder.f6688b.setText(this.f6683b.get(position).getWord());
            holder.f6688b.setTextColor(holder.f6687a.getResources().getColor(position == this.f6682a ? R.color.main_color_blue_dark : R.color.main_color_main_word));
        }
        holder.f6687a.setOnClickListener(new a(holder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup parent, int viewType) {
        return new c(LayoutInflater.from(parent.getContext()).inflate(viewType == 1 ? R.layout.fm_grid_footer_item : R.layout.fm_grid_item, parent, false), viewType);
    }

    public void g(int position) {
        this.f6682a = position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        FmList fmList = this.f6683b;
        if (fmList == null || fmList.isEmpty()) {
            return 0;
        }
        return this.f6683b.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return c(position) ? 1 : 0;
    }

    public void h(FmList fmList) {
        this.f6682a = -1;
        this.f6683b = fmList;
    }

    public void i(b listener) {
        this.f6684c = listener;
    }
}
