package qf;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import li.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c extends FragmentStatePagerAdapter {

    /* renamed from: g, reason: collision with root package name */
    public static final String f82082g = "WikiPagerAdapter";

    /* renamed from: a, reason: collision with root package name */
    public List<b> f82083a;

    /* renamed from: b, reason: collision with root package name */
    public f f82084b;

    /* renamed from: c, reason: collision with root package name */
    public FragmentManager f82085c;

    /* renamed from: d, reason: collision with root package name */
    public a f82086d;

    /* renamed from: e, reason: collision with root package name */
    public int f82087e;

    /* renamed from: f, reason: collision with root package name */
    public SparseArray<WeakReference<li.c>> f82088f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        li.c a(int topicId, int bookId);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f82089a;

        /* renamed from: b, reason: collision with root package name */
        public int f82090b;

        /* renamed from: c, reason: collision with root package name */
        public String f82091c;

        /* renamed from: d, reason: collision with root package name */
        public int f82092d;

        /* renamed from: e, reason: collision with root package name */
        public TopicRecord f82093e;

        public b(int bookId, int topicId, String word, int patternType, TopicRecord topicRecord) {
            this.f82089a = bookId;
            this.f82090b = topicId;
            this.f82091c = word;
            this.f82092d = patternType;
            this.f82093e = topicRecord;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(androidx.fragment.app.FragmentManager r8, li.f r9, java.util.List<qf.c.b> r10) {
        /*
            r7 = this;
            com.baicizhan.main.wikiv2.studyv2.data.v0 r0 = com.baicizhan.main.wikiv2.studyv2.data.v0.f26118a
            java.util.Objects.requireNonNull(r0)
            qf.b r4 = new qf.b
            r4.<init>()
            r6 = 1
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.c.<init>(androidx.fragment.app.FragmentManager, li.f, java.util.List):void");
    }

    public b a(int i11) {
        return this.f82083a.get(i11);
    }

    public Fragment b(int position) {
        WeakReference<li.c> weakReference = this.f82088f.get(position);
        if (weakReference != null) {
            return (Fragment) weakReference.get();
        }
        return null;
    }

    public void c() {
        li.c cVar;
        for (int i11 = 0; i11 < this.f82088f.size(); i11++) {
            WeakReference<li.c> weakReference = this.f82088f.get(i11);
            if (weakReference != null && (cVar = weakReference.get()) != null) {
                cVar.q();
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f82083a.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int position) {
        b bVar = this.f82083a.get(position);
        a aVar = this.f82086d;
        Object a11 = aVar != null ? aVar.a(bVar.f82090b, bVar.f82089a) : null;
        this.f82088f.put(position, new WeakReference<>(a11));
        return (Fragment) a11;
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup container, int position) {
        Object instantiateItem = super.instantiateItem(container, position);
        if (instantiateItem instanceof li.c) {
            ((li.c) instantiateItem).j(this.f82084b);
        }
        return instantiateItem;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(androidx.fragment.app.FragmentManager r8, li.f r9, java.util.List<qf.c.b> r10, int r11) {
        /*
            r7 = this;
            com.baicizhan.main.wikiv2.studyv2.data.v0 r0 = com.baicizhan.main.wikiv2.studyv2.data.v0.f26118a
            java.util.Objects.requireNonNull(r0)
            qf.b r4 = new qf.b
            r4.<init>()
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.c.<init>(androidx.fragment.app.FragmentManager, li.f, java.util.List, int):void");
    }

    public c(FragmentManager fm2, f listener, a factory, List<b> entries, int type) {
        super(fm2);
        this.f82083a = Collections.EMPTY_LIST;
        this.f82086d = null;
        this.f82088f = new SparseArray<>();
        this.f82084b = listener;
        this.f82085c = fm2;
        ArrayList arrayList = new ArrayList();
        this.f82083a = arrayList;
        arrayList.addAll(entries);
        this.f82086d = factory;
        this.f82087e = type;
    }
}
