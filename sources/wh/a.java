package wh;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import java.util.ArrayList;
import java.util.List;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends FragmentStatePagerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public List<TopicRecord> f96360a;

    public a(FragmentManager manager) {
        super(manager);
        this.f96360a = new ArrayList();
    }

    public void a(TopicRecord record) {
        this.f96360a.add(record);
    }

    public TopicRecord b(int position) {
        if (position < 0 || position >= this.f96360a.size()) {
            return null;
        }
        return this.f96360a.get(position);
    }

    public List<TopicRecord> c() {
        return this.f96360a;
    }

    public void d(int indexToRemove) {
        this.f96360a.remove(indexToRemove);
    }

    public void e(TopicRecord record) {
        c.b("wsgfz", "before:" + this.f96360a, new Object[0]);
        if (record != null) {
            this.f96360a.remove(record);
        }
        c.b("wsgfz", TtmlNode.ANNOTATION_POSITION_AFTER + this.f96360a, new Object[0]);
    }

    public void f(List<TopicRecord> list) {
        this.f96360a.clear();
        this.f96360a.addAll(list);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f96360a.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int position) {
        return xh.a.t(this.f96360a.get(position));
    }
}
