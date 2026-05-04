package com.baicizhan.main.wordlist.activity;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.baicizhan.client.business.dataset.models.UniverseTopicId;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.widget.PinnedSectionListView;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kc.r;
import kc.u;
import q9.x;
import tj.u;
import va.f;
import xb.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class WordListFragment extends Fragment implements AbsListView.OnScrollListener, View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public static final String f27764o = "WordListFragment";

    /* renamed from: p, reason: collision with root package name */
    public static final String f27765p = "config";

    /* renamed from: q, reason: collision with root package name */
    public static final String f27766q = "word_list_type";

    /* renamed from: a, reason: collision with root package name */
    public View f27767a;

    /* renamed from: b, reason: collision with root package name */
    public PinnedSectionListView f27768b;

    /* renamed from: c, reason: collision with root package name */
    public View f27769c;

    /* renamed from: d, reason: collision with root package name */
    public u f27770d;

    /* renamed from: e, reason: collision with root package name */
    public int f27771e;

    /* renamed from: f, reason: collision with root package name */
    public List<WordListItem> f27772f = Collections.EMPTY_LIST;

    /* renamed from: g, reason: collision with root package name */
    public Config f27773g;

    /* renamed from: h, reason: collision with root package name */
    public View f27774h;

    /* renamed from: i, reason: collision with root package name */
    public int f27775i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f27776j;

    /* renamed from: k, reason: collision with root package name */
    public View f27777k;

    /* renamed from: l, reason: collision with root package name */
    public View f27778l;

    /* renamed from: m, reason: collision with root package name */
    public int f27779m;

    /* renamed from: n, reason: collision with root package name */
    public c f27780n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Config implements Parcelable {
        public static final Parcelable.Creator<Config> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f27781a;

        /* renamed from: b, reason: collision with root package name */
        public int f27782b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f27783c;

        /* renamed from: d, reason: collision with root package name */
        public int f27784d;

        /* renamed from: e, reason: collision with root package name */
        public String f27785e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f27786f;

        /* renamed from: g, reason: collision with root package name */
        public int f27787g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.Creator<Config> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Config createFromParcel(Parcel in2) {
                return new Config(in2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Config[] newArray(int size) {
                return new Config[size];
            }
        }

        public Config() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f27781a);
            parcel.writeInt(this.f27782b);
            parcel.writeByte(this.f27783c ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f27784d);
            parcel.writeString(this.f27785e);
            parcel.writeByte(this.f27786f ? (byte) 1 : (byte) 0);
        }

        public Config(Parcel in2) {
            this.f27781a = in2.readInt();
            this.f27782b = in2.readInt();
            this.f27783c = in2.readByte() != 0;
            this.f27784d = in2.readInt();
            this.f27785e = in2.readString();
            this.f27786f = in2.readByte() != 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends r {
        public a() {
        }

        @Override // kc.r, kc.q
        public void onDialogPositiveClick(@NonNull View v11) {
            WordListFragment.this.E();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f27789a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f27790b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f27790b.dismiss();
                WordListFragment.this.f27772f.clear();
                WordListFragment.this.f27770d.notifyDataSetChanged();
                WordListFragment.this.f27768b.removeFooterView(WordListFragment.this.f27769c);
                WordListFragment.this.f27767a.setVisibility(0);
                WordListFragment.this.M(false);
                if (WordListFragment.this.f27780n != null) {
                    WordListFragment.this.f27780n.m0(0);
                }
                x.r().a(4);
                WordListFragment.this.f27776j.setEnabled(false);
            }
        }

        public b(final List val$topicIds, final f val$loadingDialog) {
            this.f27789a = val$topicIds;
            this.f27790b = val$loadingDialog;
        }

        @Override // java.lang.Runnable
        public void run() {
            LearnRecordManager.A().m(this.f27789a);
            if (WordListFragment.this.getActivity() != null) {
                WordListFragment.this.getActivity().runOnUiThread(new a());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void j0(List<WordListItem> datas, boolean showMean);

        void m0(int count);
    }

    public static WordListFragment H(ArrayList<WordListItem> items, Config config, int type) {
        WordListFragment wordListFragment = new WordListFragment();
        Bundle bundle = new Bundle();
        switch (config.f27782b) {
            case 1:
                config.f27783c = false;
                break;
            case 2:
                Collections.sort(items, Collections.reverseOrder(WordListItem.i()));
                break;
            case 3:
                Collections.sort(items, WordListItem.i());
                break;
            case 4:
                Collections.sort(items, Collections.reverseOrder(WordListItem.g()));
                break;
            case 5:
                Collections.sort(items, WordListItem.g());
                break;
            case 6:
                config.f27783c = false;
                Collections.sort(items, WordListItem.h());
                break;
            case 7:
                config.f27783c = false;
                Collections.sort(items, Collections.reverseOrder(WordListItem.h()));
                break;
        }
        wordListFragment.N(items);
        bundle.putParcelable("config", config);
        bundle.putInt(f27766q, type);
        wordListFragment.setArguments(bundle);
        return wordListFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D() {
        mc.a.k(this, ((kc.u) new u.a(requireContext()).V("确定要将所有已斩单词撤销斩么？").d()).f0(new a()));
    }

    public final void E() {
        qb.c.i(f27764o, "cancelKillAll", new Object[0]);
        ArrayList arrayList = new ArrayList(this.f27772f.size());
        Iterator<WordListItem> it = this.f27772f.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(UniverseTopicId.getTopicId(it.next().n())));
        }
        f fVar = new f(getContext());
        fVar.setCancelable(false);
        fVar.show();
        new Thread(new b(arrayList, fVar)).start();
    }

    public void F(boolean editable) {
        tj.u uVar = this.f27770d;
        if (uVar != null) {
            uVar.b(editable);
        }
        if (e.h(this.f27772f)) {
            this.f27774h.setTranslationY(this.f27775i);
        } else {
            M(editable);
        }
    }

    public int G() {
        return this.f27771e;
    }

    public final void I() {
        Iterator<WordListItem> it = this.f27772f.iterator();
        while (it.hasNext()) {
            it.next().s(1);
        }
        this.f27770d.notifyDataSetChanged();
        this.f27777k.setEnabled(false);
        this.f27778l.setEnabled(true);
    }

    public void J(int topicId, boolean killed) {
        WordListItem wordListItem = null;
        if (this.f27773g.f27786f) {
            boolean z11 = false;
            for (WordListItem wordListItem2 : this.f27772f) {
                int topicId2 = UniverseTopicId.getTopicId(wordListItem2.n());
                if (!killed && topicId == topicId2) {
                    wordListItem = wordListItem2;
                } else if (LearnRecordManager.A().R(topicId2)) {
                    z11 = true;
                }
            }
            this.f27776j.setEnabled(z11);
        } else if (killed) {
            Iterator<WordListItem> it = this.f27772f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WordListItem next = it.next();
                if (topicId == UniverseTopicId.getTopicId(next.n())) {
                    wordListItem = next;
                    break;
                }
            }
        }
        if (wordListItem != null) {
            this.f27770d.p(wordListItem);
            this.f27767a.setVisibility(e.h(this.f27772f) ? 0 : 8);
            if (this.f27772f.isEmpty()) {
                this.f27768b.removeFooterView(this.f27769c);
                M(false);
            }
            c cVar = this.f27780n;
            if (cVar != null) {
                cVar.m0(this.f27772f.size());
            }
        }
    }

    public void K(WordListItem data, boolean showMean) {
        Iterator<WordListItem> it = this.f27772f.iterator();
        boolean z11 = false;
        boolean z12 = false;
        while (it.hasNext()) {
            if ((it.next().l() & 1) == 0) {
                this.f27778l.setEnabled(true);
                z12 = true;
            } else {
                this.f27777k.setEnabled(true);
                z11 = true;
            }
        }
        if (!z11) {
            this.f27777k.setEnabled(false);
        }
        if (!z12) {
            this.f27778l.setEnabled(false);
        }
        c cVar = this.f27780n;
        if (cVar != null) {
            cVar.j0(Collections.singletonList(data), showMean);
        }
    }

    public void L(List<WordListItem> items) {
        if (items != null) {
            HashMap hashMap = new HashMap(this.f27772f.size());
            for (WordListItem wordListItem : this.f27772f) {
                hashMap.put(Long.valueOf(wordListItem.n()), wordListItem);
            }
            for (WordListItem wordListItem2 : items) {
                WordListItem wordListItem3 = (WordListItem) hashMap.get(Long.valueOf(wordListItem2.n()));
                if (wordListItem3 != null) {
                    wordListItem2.a(wordListItem3.l());
                }
            }
            this.f27772f = items;
        } else {
            this.f27772f = Collections.EMPTY_LIST;
        }
        tj.u uVar = this.f27770d;
        if (uVar != null) {
            uVar.q(this.f27772f);
            View view = this.f27767a;
            if (view != null) {
                view.setVisibility(e.h(this.f27772f) ? 0 : 8);
            }
        }
    }

    public final void M(boolean editable) {
        View view = this.f27774h;
        if (view == null) {
            return;
        }
        view.setTranslationY(editable ? this.f27775i : 0.0f);
        this.f27774h.animate().translationY(editable ? 0.0f : this.f27775i).setInterpolator(new DecelerateInterpolator(1.6f)).setDuration(300L).start();
    }

    public void N(List<WordListItem> items) {
        if (items == null) {
            this.f27772f = Collections.EMPTY_LIST;
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.f27772f = arrayList;
        arrayList.addAll(items);
    }

    public final void O() {
        Iterator<WordListItem> it = this.f27772f.iterator();
        while (it.hasNext()) {
            it.next().a(1);
        }
        this.f27770d.notifyDataSetChanged();
        this.f27778l.setEnabled(false);
        this.f27777k.setEnabled(true);
        c cVar = this.f27780n;
        if (cVar != null) {
            cVar.j0(this.f27772f, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f27780n = (c) context;
        } catch (ClassCastException unused) {
            qb.c.d("", "WordListFragment's activity does not implement OnInteractionListener...", new Object[0]);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        int id2 = v11.getId();
        if (id2 == R.id.cancel_kill_all) {
            D();
        } else if (id2 == R.id.hide_mean_all) {
            I();
        } else {
            if (id2 != R.id.show_mean_all) {
                return;
            }
            O();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FrameLayout frameLayout = (FrameLayout) inflater.inflate(R.layout.wordlist_fragment_normal, container, false);
        this.f27767a = frameLayout.findViewById(R.id.empty);
        PinnedSectionListView pinnedSectionListView = (PinnedSectionListView) frameLayout.findViewById(R.id.list_view);
        this.f27768b = pinnedSectionListView;
        pinnedSectionListView.g(false);
        View view = new View(getContext());
        this.f27769c = view;
        view.setEnabled(false);
        this.f27769c.setLayoutParams(new AbsListView.LayoutParams(-1, xb.f.a(getContext(), 50.0f)));
        this.f27768b.addFooterView(this.f27769c);
        Bundle arguments = getArguments();
        this.f27773g = (Config) arguments.getParcelable("config");
        this.f27779m = arguments.getInt(f27766q);
        Config config = this.f27773g;
        if (config == null) {
            throw new IllegalArgumentException("null config.");
        }
        this.f27771e = config.f27784d;
        ((TextView) frameLayout.findViewById(R.id.empty_title)).setText(this.f27773g.f27785e);
        ((ImageView) frameLayout.findViewById(R.id.empty_image)).setImageResource(this.f27773g.f27787g);
        List<WordListItem> list = this.f27772f;
        Config config2 = this.f27773g;
        tj.u uVar = new tj.u(this, list, config2.f27781a, config2.f27782b, config2.f27783c, this.f27779m);
        this.f27770d = uVar;
        this.f27768b.setAdapter((ListAdapter) uVar);
        this.f27768b.setSelection(this.f27771e);
        this.f27768b.setOnScrollListener(this);
        this.f27775i = xb.f.a(getContext(), 50.0f);
        View findViewById = frameLayout.findViewById(R.id.batch_layout);
        this.f27774h = findViewById;
        findViewById.setTranslationY(this.f27775i);
        TextView textView = (TextView) frameLayout.findViewById(R.id.cancel_kill_all);
        this.f27776j = textView;
        if (this.f27773g.f27786f) {
            textView.setOnClickListener(this);
        } else {
            textView.setText((CharSequence) null);
            this.f27776j.setBackgroundColor(0);
        }
        View findViewById2 = frameLayout.findViewById(R.id.hide_mean_all);
        this.f27777k = findViewById2;
        findViewById2.setOnClickListener(this);
        this.f27777k.setEnabled(false);
        View findViewById3 = frameLayout.findViewById(R.id.show_mean_all);
        this.f27778l = findViewById3;
        findViewById3.setOnClickListener(this);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f27770d.notifyDataSetChanged();
        this.f27767a.setVisibility(e.h(this.f27772f) ? 0 : 8);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int status) {
        if (status == 0) {
            this.f27771e = absListView.getFirstVisiblePosition();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i11, int i12, int i22) {
    }
}
