package com.baicizhan.main.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.baicizhan.base.BaseActivity;
import com.baicizhan.client.business.dataset.models.RoadmapRecord;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.lookup.Word;
import com.baicizhan.client.business.util.RoadmapUtils;
import com.jiongji.andriod.card.R;
import i9.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import q9.x;
import qb.c;
import th.s;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class DebugActivity extends BaseActivity implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final String f17867b = "DebugActivity";

    /* renamed from: a, reason: collision with root package name */
    public EditText f17868a;

    public final void I0() {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : this.f17868a.getText().toString().split("[, ]+")) {
                arrayList.add(Integer.valueOf(str));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (arrayList.size() == 0) {
            g.i("请输入单词id列表，以逗号或者空格分隔", 0);
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(x.r().z());
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Integer num = (Integer) arrayList.get(size);
            num.intValue();
            int indexOf = linkedList.indexOf(num);
            if (indexOf >= 0) {
                linkedList.remove(indexOf);
                linkedList.add(0, num);
            }
        }
        x.r().x0(linkedList);
        ArrayList arrayList2 = new ArrayList(linkedList.size());
        Map<Integer, RoadmapRecord> n11 = x.r().n();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Integer num2 = (Integer) it.next();
            num2.intValue();
            arrayList2.add(n11.get(num2));
        }
        RoadmapUtils.saveRoadmap(x.r().l(), arrayList2);
        g.i("修改成功", 0);
    }

    public final void J0() {
        int intValue;
        c.b(f17867b, "showWiki", new Object[0]);
        String trim = this.f17868a.getText().toString().trim();
        try {
            intValue = Integer.valueOf(trim).intValue();
        } catch (Exception unused) {
            List<Word> g11 = i.g(this, 0, trim, 1);
            intValue = (g11 == null || g11.isEmpty()) ? -1 : Integer.valueOf(g11.get(0).getId()).intValue();
        }
        if (!x.r().n().containsKey(Integer.valueOf(intValue))) {
            g.i("输入正确的单词或者单词id", 0);
            return;
        }
        g.i("单词id: " + intValue, 1);
        s.f(this, x.r().l(), intValue).r5(new a());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.modify_roadmap) {
            I0();
        } else {
            if (id2 != R.id.show_wiki) {
                return;
            }
            J0();
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);
        this.f17868a = (EditText) findViewById(R.id.inbox);
        findViewById(R.id.show_wiki).setOnClickListener(this);
        findViewById(R.id.modify_roadmap).setOnClickListener(this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<TopicRecord> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            g.i("下载失败噜~~~", 0);
        }

        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(TopicRecord topicRecord) {
        }
    }
}
