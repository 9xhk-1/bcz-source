package com.baicizhan.main.phrasetraining.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.base.BaseActivity;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.baicizhan.main.global.AppPageStatus;
import com.baicizhan.main.phrasetraining.activity.PhraseGroupActivity;
import com.baicizhan.main.phrasetraining.data.bean.PhraseGroup;
import com.baicizhan.main.phrasetraining.view.PhraseGroupHeader;
import com.google.android.material.timepicker.TimeModel;
import com.jiongji.andriod.card.R;
import gs.q1;
import ih.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class PhraseGroupActivity extends BaseActivity implements g.c {

    /* renamed from: a, reason: collision with root package name */
    public View f24430a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f24431b;

    /* renamed from: c, reason: collision with root package name */
    public c f24432c;

    /* renamed from: d, reason: collision with root package name */
    public ImageView f24433d;

    /* renamed from: e, reason: collision with root package name */
    public b f24434e;

    /* renamed from: f, reason: collision with root package name */
    public Handler f24435f = new Handler();

    /* renamed from: g, reason: collision with root package name */
    public ih.g f24436g;

    /* renamed from: h, reason: collision with root package name */
    public List<PhraseGroup> f24437h;

    /* renamed from: i, reason: collision with root package name */
    public SparseArray<Boolean> f24438i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList<Integer> f24439j;

    /* renamed from: k, reason: collision with root package name */
    public WeakReference<hh.a> f24440k;

    /* renamed from: l, reason: collision with root package name */
    public q1 f24441l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends GridLayoutManager.SpanSizeLookup {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ GridLayoutManager f24442a;

        public a(final GridLayoutManager val$manager) {
            this.f24442a = val$manager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int position) {
            if (PhraseGroupActivity.this.f24432c.b(position)) {
                return this.f24442a.getSpanCount();
            }
            return 1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<PhraseGroupActivity> f24444a;

        public b(PhraseGroupActivity activity) {
            this.f24444a = new WeakReference<>(activity);
        }

        @Override // java.lang.Runnable
        public void run() {
            PhraseGroupActivity phraseGroupActivity = this.f24444a.get();
            if (phraseGroupActivity == null) {
                return;
            }
            phraseGroupActivity.f24433d.setVisibility(0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends RecyclerView.Adapter<d> {

        /* renamed from: b, reason: collision with root package name */
        public static final int f24445b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f24446c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f24447d = 2;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f24449a;

            public a(final int val$position) {
                this.f24449a = val$position;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PhraseGroupActivity phraseGroupActivity = PhraseGroupActivity.this;
                PhraseTrainingActivity.O0(phraseGroupActivity, phraseGroupActivity.f24439j, this.f24449a - 1);
            }
        }

        public boolean b(int position) {
            return position == 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(d holder, final int position) {
            if (b(position)) {
                return;
            }
            holder.f24453b.setText(PhraseGroupActivity.this.getString(R.string.phrase_group_course, String.format(TimeModel.f32587h, Integer.valueOf(position))));
            int i11 = position - 1;
            Iterator<PhraseGroup.Phrase> it = ((PhraseGroup) PhraseGroupActivity.this.f24437h.get(i11)).getPhrases().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                holder.f24454c[i12].setText(it.next().getWord());
                i12++;
            }
            while (i12 < holder.f24454c.length) {
                holder.f24454c[i12].setText("");
                i12++;
            }
            holder.f24452a.setOnClickListener(new a(position));
            if (((Boolean) PhraseGroupActivity.this.f24438i.get(((PhraseGroup) PhraseGroupActivity.this.f24437h.get(i11)).getGroupId())).booleanValue()) {
                holder.f24455d.setVisibility(0);
            } else {
                holder.f24455d.setVisibility(8);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public d onCreateViewHolder(ViewGroup parent, int viewType) {
            if (viewType != 0) {
                if (1 == viewType) {
                    return PhraseGroupActivity.this.new d(LayoutInflater.from(parent.getContext()).inflate(R.layout.phrase_group_card_left, parent, false));
                }
                return PhraseGroupActivity.this.new d(LayoutInflater.from(parent.getContext()).inflate(R.layout.phrase_group_card_right, parent, false));
            }
            ArrayList arrayList = new ArrayList(PhraseGroupActivity.this.f24437h.size());
            Iterator it = PhraseGroupActivity.this.f24437h.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((PhraseGroup) it.next()).getGroupId()));
            }
            PhraseGroupHeader phraseGroupHeader = (PhraseGroupHeader) LayoutInflater.from(parent.getContext()).inflate(R.layout.phrase_group_header_portrait, parent, false);
            phraseGroupHeader.j(arrayList);
            PhraseGroupActivity.this.f24440k = new WeakReference(phraseGroupHeader);
            return PhraseGroupActivity.this.new d(phraseGroupHeader);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return PhraseGroupActivity.this.f24437h.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            if (b(position)) {
                return 0;
            }
            return position % 2 == 0 ? 2 : 1;
        }

        public c() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends RecyclerView.ViewHolder {

        /* renamed from: f, reason: collision with root package name */
        public static final int f24451f = 8;

        /* renamed from: a, reason: collision with root package name */
        public View f24452a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f24453b;

        /* renamed from: c, reason: collision with root package name */
        public TextView[] f24454c;

        /* renamed from: d, reason: collision with root package name */
        public View f24455d;

        public d(View view) {
            super(view);
            if (view instanceof PhraseGroupHeader) {
                return;
            }
            this.f24452a = view.findViewById(R.id.phrase_group_card);
            ThemeResUtil.setCardBg(view.getContext(), this.f24452a);
            this.f24453b = (TextView) view.findViewById(R.id.phrase_group_index);
            ThemeResUtil.setProgress(view.getContext(), this.f24453b);
            this.f24454c = new TextView[8];
            for (int i11 = 0; i11 < 8; i11++) {
                this.f24454c[i11] = (TextView) view.findViewById(PhraseGroupActivity.this.getResources().getIdentifier("phrase_group_phrase_" + i11, "id", fs.b.f52352b));
            }
            this.f24455d = view.findViewById(R.id.phrase_group_learnt);
        }
    }

    public static void R0(Context context) {
        context.startActivity(new Intent(context, (Class<?>) PhraseGroupActivity.class));
    }

    public final void P0() {
        this.f24441l.f56430a.D(new View.OnClickListener() { // from class: gh.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhraseGroupActivity.this.Q0(view);
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.phrase_group_grid);
        this.f24431b = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.f24431b.setLayoutManager(new GridLayoutManager(this, 2));
        this.f24431b.setVisibility(8);
        this.f24433d = (ImageView) findViewById(R.id.phrase_group_load_progress);
        b bVar = new b(this);
        this.f24434e = bVar;
        this.f24435f.postDelayed(bVar, 500L);
        this.f24436g = new g.a().b(getAssets()).c(this).a();
    }

    public final /* synthetic */ void Q0(View view) {
        finish();
    }

    @Override // ih.g.c
    public void h0(boolean success, List<PhraseGroup> datas, SparseArray<Boolean> studyTags) {
        this.f24435f.removeCallbacks(this.f24434e);
        if (this.f24433d.getVisibility() == 0) {
            this.f24433d.setVisibility(8);
            this.f24433d.startAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));
        }
        if (this.f24431b.getVisibility() != 0) {
            this.f24431b.setVisibility(0);
            this.f24431b.startAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        }
        if (!success) {
            va.g.g(R.string.phrase_training_load_failed, 0);
            return;
        }
        this.f24437h = datas;
        this.f24438i = studyTags;
        this.f24439j = new ArrayList<>(this.f24437h.size());
        Iterator<PhraseGroup> it = this.f24437h.iterator();
        while (it.hasNext()) {
            this.f24439j.add(Integer.valueOf(it.next().getGroupId()));
        }
        c cVar = this.f24432c;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
            return;
        }
        this.f24432c = new c();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        gridLayoutManager.setSpanSizeLookup(new a(gridLayoutManager));
        this.f24431b.setLayoutManager(gridLayoutManager);
        this.f24431b.setAdapter(this.f24432c);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(1);
        this.f24441l = (q1) DataBindingUtil.setContentView(this, R.layout.activity_phrase_training_group_portrait);
        P0();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        hh.a aVar;
        super.onDestroy();
        WeakReference<hh.a> weakReference = this.f24440k;
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            aVar.cancel();
        }
        ig.b.f60539a.b();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ig.b.f60539a.c(AppPageStatus.STUDY_REINFORCE);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f24436g.f();
    }
}
