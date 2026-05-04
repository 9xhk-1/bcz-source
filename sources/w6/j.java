package w6;

import a00.h0;
import a00.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.text.Regex;
import oa0.r;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {d.class})
@u0({"SMAP\nIUrlChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IUrlChecker.kt\ncom/baicizhan/app/biz/h5/UrlChecker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n1#2:121\n1563#3:122\n1634#3,3:123\n1563#3:126\n1634#3,3:127\n*S KotlinDebug\n*F\n+ 1 IUrlChecker.kt\ncom/baicizhan/app/biz/h5/UrlChecker\n*L\n34#1:122\n34#1:123,3\n17#1:126\n17#1:127,3\n*E\n"})
/* loaded from: classes3.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c0 f95417a = e0.c(new x00.a() { // from class: w6.i
        @Override // x00.a
        public final Object invoke() {
            List b11;
            b11 = j.b();
            return b11;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public List<Regex> f95418b = h0.J();

    public static final List b() {
        List list;
        list = e.f95403a;
        List list2 = list;
        ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new Regex((String) it.next()));
        }
        return arrayList;
    }

    public final List<Regex> c() {
        return (List) this.f95417a.getValue();
    }

    public final List<Regex> d() {
        List<Regex> list = this.f95418b;
        if (list.isEmpty()) {
            list = null;
        }
        return list == null ? c() : list;
    }

    public final void e(@m80.k List<String> list) {
        g0.p(list, "list");
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new Regex((String) it.next()));
        }
        this.f95418b = arrayList;
    }

    @Override // w6.d
    public boolean i(@m80.k String url) {
        g0.p(url, "url");
        Iterator<Regex> it = d().iterator();
        while (it.hasNext()) {
            if (it.next().containsMatchIn(url)) {
                return true;
            }
        }
        return false;
    }
}
