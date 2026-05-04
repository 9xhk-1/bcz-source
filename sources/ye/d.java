package ye;

import android.content.Context;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.managers.booklist.BookListManager;
import com.baicizhan.client.business.util.CollectionUtils;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.main.activity.setting.offlineclear.ClearItem;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f99926a = "ClearItemManager";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Callable<List<ClearItem>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f99927a;

        public a(final Context val$context) {
            this.f99927a = val$context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<ClearItem> call() throws Exception {
            ArrayList arrayList = new ArrayList(6);
            arrayList.add(d.l(this.f99927a));
            qb.c.i(d.f99926a, "loadTopicRecordItem finish", new Object[0]);
            arrayList.add(d.i());
            qb.c.i(d.f99926a, "loadFmItem finish", new Object[0]);
            arrayList.add(d.k());
            qb.c.i(d.f99926a, "loadReadPlanItem finish", new Object[0]);
            arrayList.add(d.j());
            qb.c.i(d.f99926a, "loadPastExamItem finish", new Object[0]);
            return arrayList;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Callable<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ClearItem f99928a;

        public b(final ClearItem val$item) {
            this.f99928a = val$item;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            ClearItem clearItem = this.f99928a;
            return Boolean.valueOf(clearItem == null || clearItem.clear());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Callable<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f99929a;

        public c(final List val$items) {
            this.f99929a = val$items;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            List list = this.f99929a;
            if (list == null || list.isEmpty()) {
                return Boolean.TRUE;
            }
            Iterator it = this.f99929a.iterator();
            boolean z11 = true;
            while (it.hasNext()) {
                z11 &= ((ClearItem) it.next()).clear();
            }
            return Boolean.valueOf(z11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ye.d$d, reason: collision with other inner class name */
    public class C1364d implements p<ClearItem, ClearItem> {
        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ClearItem call(ClearItem clearItem) {
            clearItem.computeSize();
            return clearItem;
        }
    }

    public static rx.c<Boolean> e(final ClearItem item) {
        return rx.c.z2(new b(item)).w5(bc0.c.e());
    }

    public static rx.c<Boolean> f(final List<ClearItem> items) {
        return rx.c.z2(new c(items)).w5(bc0.c.e());
    }

    public static rx.c<List<ClearItem>> g(final List<ClearItem> items) {
        return CollectionUtils.isEmpty(items) ? rx.c.M2(null) : rx.c.u2(items).c3(new C1364d()).v6().w5(bc0.c.e());
    }

    public static rx.c<List<ClearItem>> h(final Context context) {
        return rx.c.z2(new a(context)).w5(bc0.c.e());
    }

    public static ClearItem i() {
        ClearItem clearItem = new ClearItem();
        clearItem.name = "单词电台";
        clearItem.path = gb.d.f53558c;
        return clearItem;
    }

    public static ClearItem j() {
        ClearItem clearItem = new ClearItem();
        clearItem.name = "真题音频";
        clearItem.path = za.a.f102437e;
        return clearItem;
    }

    public static ClearItem k() {
        ClearItem clearItem = new ClearItem();
        clearItem.name = "阅读计划音频";
        clearItem.path = za.b.f102458e;
        return clearItem;
    }

    public static ClearItem l(Context context) {
        String str;
        qb.c.i(f99926a, "loadTopicRecordItem begin", new Object[0]);
        try {
            BookListManager.getInstance().load(context).t6().t();
        } catch (Exception e11) {
            qb.c.h(f99926a, "", e11);
        }
        qb.c.i(f99926a, "loadTopicRecordItem BookListManager ready", new Object[0]);
        ClearItem clearItem = new ClearItem();
        clearItem.name = "词书";
        clearItem.path = ZPackUtils.ZPK_ROOT;
        File baicizhanFile = PathUtil.getBaicizhanFile(ZPackUtils.ZPK_ROOT);
        if (baicizhanFile == null || !baicizhanFile.exists()) {
            qb.c.i(f99926a, "loadTopicRecordItem rootDir empty", new Object[0]);
            return clearItem;
        }
        File[] listFiles = baicizhanFile.listFiles();
        clearItem.size = 0L;
        if (listFiles == null || listFiles.length == 0) {
            qb.c.i(f99926a, "loadTopicRecordItem children empty", new Object[0]);
            return clearItem;
        }
        clearItem.childItems = new ArrayList(listFiles.length);
        int i11 = 1;
        for (File file : baicizhanFile.listFiles()) {
            int intValue = Integer.valueOf(file.getName()).intValue();
            BookRecord g11 = i9.a.g(context, intValue);
            ClearItem clearItem2 = new ClearItem();
            if (g11 != null) {
                str = g11.bookName;
            } else {
                str = "未命名计划" + String.valueOf(i11);
                i11++;
            }
            clearItem2.name = str;
            String str2 = "zpack/" + intValue;
            clearItem2.path = str2;
            qb.c.i(f99926a, "loadTopicRecordItem computesize %s", str2);
            clearItem2.computeSize();
            long j11 = clearItem2.size;
            if (j11 > 0) {
                long j12 = clearItem.size + j11;
                clearItem.size = j12;
                qb.c.i(f99926a, "loadTopicRecordItem size %d", Long.valueOf(j12));
                clearItem.childItems.add(clearItem2);
            }
        }
        return clearItem;
    }
}
