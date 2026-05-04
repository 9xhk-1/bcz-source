package va;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.online.notify.Notify;
import com.jiongji.andriod.card.R;
import gs.l4;
import ma.u;
import ma.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f93731a = "BczImgDialog";

    /* renamed from: b, reason: collision with root package name */
    public static float f93732b;

    /* renamed from: c, reason: collision with root package name */
    public static float f93733c;

    /* renamed from: d, reason: collision with root package name */
    public static float f93734d;

    /* renamed from: e, reason: collision with root package name */
    public static float f93735e;

    /* renamed from: f, reason: collision with root package name */
    public static Size f93736f = new Size(0, 0);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l4 f93737a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Notify f93738b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DialogInterface.OnClickListener f93739c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Dialog f93740d;

        public a(final l4 val$binding, final Notify val$notify, final DialogInterface.OnClickListener val$listener, final Dialog val$dialog) {
            this.f93737a = val$binding;
            this.f93738b = val$notify;
            this.f93739c = val$listener;
            this.f93740d = val$dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            if (e.j(this.f93737a)) {
                e.l(this.f93737a, false);
                e.k(this.f93738b, true);
            } else {
                this.f93739c.onClick(this.f93740d, -2);
                this.f93740d.dismiss();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                e.f93732b = motionEvent.getX();
                e.f93733c = motionEvent.getY();
            }
            if (motionEvent.getAction() != 1) {
                return false;
            }
            e.f93734d = motionEvent.getX();
            e.f93735e = motionEvent.getY();
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l4 f93741a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Notify f93742b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DialogInterface.OnClickListener f93743c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Dialog f93744d;

        public c(final l4 val$binding, final Notify val$notify, final DialogInterface.OnClickListener val$listener, final Dialog val$dialog) {
            this.f93741a = val$binding;
            this.f93742b = val$notify;
            this.f93743c = val$listener;
            this.f93744d = val$dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            if (!e.j(this.f93741a)) {
                this.f93743c.onClick(this.f93744d, -1);
            } else {
                e.l(this.f93741a, false);
                e.k(this.f93742b, true);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends RecyclerView.Adapter<C1261e> {

        /* renamed from: a, reason: collision with root package name */
        public final Dialog f93745a;

        /* renamed from: b, reason: collision with root package name */
        public final Notify f93746b;

        /* renamed from: c, reason: collision with root package name */
        public final ea.a f93747c;

        /* renamed from: d, reason: collision with root package name */
        public final l4 f93748d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends sa.c {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1261e f93749a;

            public a(final C1261e val$holder) {
                this.f93749a = val$holder;
            }

            @Override // sa.c, android.view.View.OnClickListener
            public void onClick(View v11) {
                super.onClick(v11);
                e.l(d.this.f93748d, false);
                if (!TextUtils.isEmpty(d.this.f93747c.f())) {
                    g.i(d.this.f93747c.f(), 0);
                }
                d.this.f93745a.dismiss();
                String[] strArr = {"adv_id", ma.b.A1, ma.b.B1};
                String str = d.this.f93746b == null ? "" : d.this.f93746b.aid;
                ma.l.b("notify-popup", ma.a.f72706a0, u.b(strArr, new String[]{str, d.this.f93747c.e().get(this.f93749a.getAdapterPosition()).d(), this.f93749a.getAdapterPosition() + ""}));
            }
        }

        public d(Dialog dialog, Notify notify, ea.a feedback, l4 binding) {
            this.f93745a = dialog;
            this.f93746b = notify;
            this.f93747c = feedback;
            this.f93748d = binding;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull C1261e holder, int position) {
            ea.a aVar = this.f93747c;
            if (aVar == null || aVar.e() == null) {
                return;
            }
            holder.f93751a.setText(this.f93747c.e().get(position).d());
            holder.f93751a.setOnClickListener(new a(holder));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            ea.a aVar = this.f93747c;
            if (aVar == null || aVar.e() == null) {
                return 0;
            }
            return this.f93747c.e().size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C1261e onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new C1261e(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dialog_feedback, parent, false));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: va.e$e, reason: collision with other inner class name */
    public static class C1261e extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f93751a;

        public C1261e(@NonNull View itemView) {
            super(itemView);
            this.f93751a = (TextView) itemView;
        }
    }

    public static /* synthetic */ boolean a(l4 l4Var, Notify notify, View view, MotionEvent motionEvent) {
        if (!j(l4Var)) {
            return false;
        }
        l(l4Var, false);
        k(notify, true);
        return true;
    }

    public static /* synthetic */ void b(Notify notify, l4 l4Var, Context context, Dialog dialog, ea.a aVar, View view) {
        k(notify, j(l4Var));
        m(context, dialog, notify, l4Var, aVar);
    }

    public static Dialog f(Context context, int res, final DialogInterface.OnClickListener listener) {
        return g(context, null, res, null, null, listener);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public static Dialog g(Context context, Bitmap img, int res, Notify notify, final ea.a feedbacks, final DialogInterface.OnClickListener listener) {
        final Context context2;
        final Notify notify2;
        final Dialog dialog = new Dialog(context, R.style.bczDialogStyle);
        final l4 d11 = l4.d(LayoutInflater.from(context));
        if (img != null) {
            d11.f55710e.setImageBitmap(img);
        } else if (res != 0) {
            d11.f55710e.setImageResource(res);
        }
        if (feedbacks == null || feedbacks.e() == null || feedbacks.e().isEmpty()) {
            context2 = context;
            notify2 = notify;
        } else {
            d11.f55708c.setVisibility(0);
            context2 = context;
            notify2 = notify;
            d11.f55708c.setOnClickListener(new View.OnClickListener() { // from class: va.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.b(Notify.this, d11, context2, dialog, feedbacks, view);
                }
            });
            d11.f55712g.setOnClickListener(new sa.c());
            dialog.getWindow().getDecorView().setOnTouchListener(new View.OnTouchListener() { // from class: va.d
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return e.a(l4.this, notify2, view, motionEvent);
                }
            });
        }
        if (listener != null) {
            d11.f55706a.setOnClickListener(new a(d11, notify2, listener, dialog));
            d11.f55710e.setOnTouchListener(new b());
            d11.f55710e.setOnClickListener(new c(d11, notify2, listener, dialog));
        }
        ViewGroup.LayoutParams layoutParams = d11.f55710e.getLayoutParams();
        int min = Math.min(xb.f.i(context2) - xb.f.a(context2, 72.0f), xb.f.a(context2, 288.0f));
        layoutParams.width = min;
        layoutParams.height = (min * 4) / 3;
        f93736f = new Size(layoutParams.width, layoutParams.height);
        ViewGroup.LayoutParams layoutParams2 = d11.f55707b.getLayoutParams();
        layoutParams2.width = xb.f.i(context2);
        layoutParams2.height = xb.f.f(context2);
        d11.f55707b.setLayoutParams(layoutParams2);
        dialog.setContentView(d11.getRoot());
        return dialog;
    }

    public static Dialog h(Context context, Bitmap img, final DialogInterface.OnClickListener listener) {
        return g(context, img, 0, null, null, listener);
    }

    public static Dialog i(Context context, Bitmap img, Notify notify, ea.a feedbacks, final DialogInterface.OnClickListener listener) {
        return g(context, img, 0, notify, feedbacks, listener);
    }

    public static boolean j(l4 binding) {
        return binding.f55709d.getVisibility() == 0;
    }

    public static void k(Notify notify, boolean currentVisible) {
        ma.l.b("notify-popup", ma.a.Z, u.b(new String[]{"adv_id", "status"}, new String[]{notify == null ? "" : notify.aid, currentVisible ? v.f73051v : v.f73050u}));
    }

    public static void l(l4 binding, boolean visible) {
        binding.f55709d.setVisibility(visible ? 0 : 8);
        binding.f55710e.setColorFilter(Color.parseColor(visible ? "#66000000" : "#00000000"));
    }

    public static void m(Context context, Dialog dialog, Notify notify, l4 binding, ea.a feedbacks) {
        if (binding.f55712g.getTag() == null) {
            xl.b bVar = new xl.b(context, 1);
            bVar.setDrawable(context.getDrawable(R.drawable.divider_transparent_12dp));
            binding.f55712g.addItemDecoration(bVar);
            binding.f55712g.setAdapter(new d(dialog, notify, feedbacks, binding));
            binding.f55712g.setTag(feedbacks);
        }
        l(binding, !j(binding));
    }
}
