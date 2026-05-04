package com.baicizhan.main.fragment;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.models.WordClozeRecord;
import com.baicizhan.client.business.debug.DebugConfig;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.customview.ChunkFillView;
import com.baicizhan.main.customview.ClozeTraditionHintView;
import com.baicizhan.main.customview.DialView;
import com.baicizhan.main.fragment.PatternChunkFragment;
import com.bumptech.glide.load.engine.GlideException;
import com.jiongji.andriod.card.R;
import com.meizu.cloud.pushsdk.notification.model.ActVideoSetting;
import com.xiaomi.mipush.sdk.Constants;
import f9.a;
import gi.m0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import q9.x;
import qb.c;
import wb0.p;
import xb.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class PatternChunkFragment extends PatternBaseFragment implements DialView.b {
    public static String B = "PatternChunkFragment";
    public boolean A;

    /* renamed from: s, reason: collision with root package name */
    public ChunkFillView f20753s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f20754t;

    /* renamed from: u, reason: collision with root package name */
    public DialView f20755u;

    /* renamed from: v, reason: collision with root package name */
    public View f20756v;

    /* renamed from: w, reason: collision with root package name */
    public ClozeTraditionHintView f20757w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f20758x;

    /* renamed from: y, reason: collision with root package name */
    public String f20759y;

    /* renamed from: z, reason: collision with root package name */
    public int f20760z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            CharSequence j11 = ((ChunkFillView) v11).j();
            if (j11 != null) {
                PatternChunkFragment.this.f20755u.c(j11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Comparator<String> {
        public b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String lhs, String rhs) {
            return rhs.length() - lhs.length();
        }
    }

    public PatternChunkFragment(Context context, int category) {
        super(context, category);
        this.A = false;
        p(LayoutInflater.from(context), this);
    }

    public final List<String> A(List<String> opts) {
        if (!this.f20759y.contains(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
            return new ArrayList();
        }
        String[][] strArr = {new String[]{"ure", "ere"}, new String[]{"or", "er", "ur", "ir"}, new String[]{"ar", "a"}, new String[]{"ea", "ee"}, new String[]{"ai", "i"}, new String[]{com.alipay.sdk.m.s.a.f11007u, "a"}, new String[]{"am", com.alipay.sdk.m.s.a.f11007u}, new String[]{"em", "en"}, new String[]{"en", "in"}, new String[]{"en", "e"}, new String[]{"ck", "k", "c"}, new String[]{ActVideoSetting.ACT_URL, "ou", "eu"}, new String[]{"oa", "ou"}, new String[]{"io", "ia"}, new String[]{"ay", "oy", "ey"}, new String[]{"ia", "ie"}, new String[]{"ph", "f"}, new String[]{"ow", "ew", "aw"}, new String[]{"a", "e"}, new String[]{"e", "i"}, new String[]{"o", "ou"}, new String[]{"u", "a"}};
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < 22; i11++) {
            Object[] objArr = strArr[i11];
            for (String str : objArr) {
                List list = (List) hashMap.get(str);
                if (list == null) {
                    list = new LinkedList();
                    hashMap.put(str, list);
                }
                for (Object obj : objArr) {
                    if (!str.equals(obj)) {
                        list.add(obj);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList, new b());
        c.b(B, "disturb keys=" + arrayList, new Object[0]);
        LinkedList linkedList = new LinkedList();
        for (String str2 : opts) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (str2.contains(str3)) {
                        linkedList.add(str2.replaceFirst(str3, (String) ((List) hashMap.get(str3)).get((int) (Math.random() * r6.size()))));
                        break;
                    }
                }
            }
        }
        return linkedList;
    }

    public final boolean B(List<String> strs, String target) {
        if (target.length() == 0) {
            return true;
        }
        for (String str : strs) {
            if (str.length() <= target.length() && target.contains(str)) {
                ArrayList arrayList = new ArrayList(strs);
                arrayList.remove(str);
                if (B(arrayList, target.replace(str, ""))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final /* synthetic */ Boolean C(List list, List list2, String str) {
        if (list.contains(str)) {
            return Boolean.TRUE;
        }
        ArrayList arrayList = new ArrayList(list2);
        arrayList.remove(str);
        if (!B(arrayList, str)) {
            return Boolean.TRUE;
        }
        c.i(B, "remove disturb %s", str);
        return Boolean.FALSE;
    }

    public final List<String> D(final List<String> opts, final List<String> ans) {
        return (List) rx.c.u2(opts).V1(new p() { // from class: hg.m
            @Override // wb0.p
            public final Object call(Object obj) {
                Boolean C;
                C = PatternChunkFragment.this.C(ans, opts, (String) obj);
                return C;
            }
        }).v6().t6().b();
    }

    public final void E() {
        int i11 = this.f20760z;
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            this.f20757w.setVisibility(8);
            this.f20758x.setVisibility(0);
            w();
            return;
        }
        this.f20754t.setVisibility(8);
        this.f20756v.setVisibility(0);
        this.f20757w.setVisibility(0);
        this.f20757w.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.business_push_up_in));
        w();
    }

    @Override // com.baicizhan.main.customview.DialView.b
    public void a(int row, int col) {
        if (this.f20755u.f(row, col)) {
            this.f20755u.b(row, col);
            this.f20753s.i(this.f20755u.d(row, col));
            return;
        }
        this.f20755u.e(row, col);
        this.f20753s.k(this.f20755u.d(row, col));
        if (this.f20753s.getHighlightText().toString().contains("_")) {
            return;
        }
        this.f20755u.setClickable(false);
        this.A = true;
        if (this.f20753s.getHighlightText().toString().replaceAll("[^a-zA-Z]", "").equals(this.f20759y.replaceAll("[^a-zA-Z]", ""))) {
            this.f20746g.x(this.f20748i.topicId);
            t(this.f20748i.topicId);
        } else {
            this.f20746g.x(this.f20748i.topicId + 1);
            t(-1);
        }
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void j(boolean retain) {
        this.f20753s.setProblem(this.f20759y);
        this.f20755u.a();
        this.f20755u.setClickable(true);
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public boolean k() {
        int i11 = this.f20760z;
        if (i11 >= 2) {
            return false;
        }
        this.f20760z = i11 + 1;
        E();
        return true;
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public View p(LayoutInflater inflater, ViewGroup container) {
        View inflate = inflater.inflate(R.layout.pattern_chunk_portrait, container, true);
        this.f20753s = (ChunkFillView) inflate.findViewById(R.id.chunk_fill);
        DialView dialView = (DialView) inflate.findViewById(R.id.dial_view);
        this.f20755u = dialView;
        dialView.setDelegate(this);
        this.f20754t = (TextView) inflate.findViewById(R.id.cnmean);
        this.f20756v = inflate.findViewById(R.id.seperator);
        this.f20757w = (ClozeTraditionHintView) inflate.findViewById(R.id.trandition_hint);
        this.f20758x = (TextView) inflate.findViewById(R.id.phonetic_hint);
        return inflate;
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void q() {
        super.q();
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void r() {
        super.r();
        this.A = false;
        TopicRecord topicRecord = this.f20748i;
        if (topicRecord != null && topicRecord.clozeData == null) {
            WordClozeRecord wordClozeRecord = x.r().I().get(Integer.valueOf(this.f20748i.topicId));
            if (wordClozeRecord != null) {
                this.f20748i.clozeData = wordClozeRecord.getFormatClozeData();
                if (this.f20748i.clozeData == null || TextUtils.isEmpty(wordClozeRecord.getClozeData())) {
                    c.d("", "local cached cloze data is null, option [%s], cloze record [%s]", this.f20748i.toString(), wordClozeRecord.toString());
                }
            } else {
                c.d("", "local cached word cloze record is null, topic id [%d]", Integer.valueOf(this.f20748i.topicId));
            }
        }
        String str = this.f20748i.clozeData.syllable;
        this.f20759y = str;
        if (str.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SERVER) < 0 && this.f20759y.length() > 9) {
            int length = this.f20759y.length() / 3;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20759y.substring(0, length));
            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            int i11 = length * 2;
            sb2.append(this.f20759y.substring(length, i11));
            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            String str2 = this.f20759y;
            sb2.append(str2.substring(i11, str2.length()));
            this.f20759y = sb2.toString();
        }
        this.f20760z = 0;
        this.f20756v.setVisibility(8);
        this.f20757w.setVisibility(8);
        this.f20758x.setVisibility(8);
        this.f20754t.setVisibility(0);
        this.f20755u.a();
        this.f20755u.setClickable(true);
        this.f20753s.setProblem(this.f20759y);
        this.f20753s.setOnClickListener(new a());
        String[] split = this.f20759y.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (split.length <= 1) {
            split = new String[this.f20759y.length()];
            char[] charArray = this.f20759y.toCharArray();
            for (int i12 = 0; i12 < charArray.length; i12++) {
                split[i12] = Character.toString(charArray[i12]);
            }
        }
        c.b(B, "syllable=" + split, new Object[0]);
        Arrays.asList(this.f20748i.clozeData.options);
        List<String> linkedList = new LinkedList<>();
        if (e.h(linkedList)) {
            LinkedList linkedList2 = new LinkedList(Arrays.asList(split));
            ArrayList<String> arrayList = new ArrayList(new HashSet(A(linkedList2)));
            Collections.shuffle(arrayList);
            for (String str3 : arrayList) {
                if (!linkedList2.contains(str3)) {
                    linkedList2.add(str3);
                }
                if (linkedList2.size() >= 9) {
                    break;
                }
            }
            linkedList = D(linkedList2, Arrays.asList(split));
            if (!DebugConfig.getsIntance().enable || !DebugConfig.getsIntance().fixOptionPosition) {
                Collections.shuffle(linkedList);
            }
        }
        this.f20755u.setText((String[]) linkedList.toArray(new String[0]));
        this.f20754t.setText(this.f20748i.wordMean.replace(GlideException.a.f28776d, "\n"));
        TopicRecord topicRecord2 = this.f20748i;
        String str4 = topicRecord2.sentence;
        String str5 = str4;
        for (a.b bVar : f9.a.h(str4, topicRecord2.word, null)) {
            str5 = str5.replaceAll(str4.substring(bVar.f51340a, bVar.f51341b), "____");
        }
        m0.s(this.f20757w.getHintView(), str5);
        this.f20758x.setText(this.f20748i.phonetic);
        TopicRecord topicRecord3 = this.f20748i;
        ZPackUtils.loadImageCompat(topicRecord3, topicRecord3.imagePath).o(this.f20757w.getImageView());
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void w() {
        IAudioPlayer iAudioPlayer = this.f20750k;
        TopicRecord topicRecord = this.f20748i;
        ZPackUtils.loadAudioCompat(iAudioPlayer, topicRecord, this.f20760z != 1 ? topicRecord.wordAudio : topicRecord.sentenceAudio);
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void x() {
    }
}
