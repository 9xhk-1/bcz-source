package com.baicizhan.main.activity.setting.privatessetting.debug;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.baicizhan.client.business.util.PathUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nAdCacheDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdCacheDetailActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/AdCacheViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n11561#2:299\n11896#2,3:300\n13805#2,2:305\n1068#3:303\n1#4:304\n*S KotlinDebug\n*F\n+ 1 AdCacheDetailActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/AdCacheViewModel\n*L\n77#1:299\n77#1:300,3\n100#1:305,2\n86#1:303\n*E\n"})
/* loaded from: classes4.dex */
public final class q extends ViewModel {

    /* renamed from: h, reason: collision with root package name */
    public static final int f19800h = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f19801a = r9.p.f83789x;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final MutableState<List<p>> f19802b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final State<List<p>> f19803c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final MutableState<Boolean> f19804d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final State<Boolean> f19805e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final MutableState<Long> f19806f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final State<Long> f19807g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 AdCacheDetailActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/AdCacheViewModel\n*L\n1#1,328:1\n86#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Long.valueOf(((p) t12).g()), Long.valueOf(((p) t11).g()));
        }
    }

    public q() {
        MutableState<List<p>> mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(a00.h0.J(), null, 2, null);
        this.f19802b = mutableStateOf$default;
        this.f19803c = mutableStateOf$default;
        MutableState<Boolean> mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f19804d = mutableStateOf$default2;
        this.f19805e = mutableStateOf$default2;
        MutableState<Long> mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
        this.f19806f = mutableStateOf$default3;
        this.f19807g = mutableStateOf$default3;
    }

    public final void a() {
        File file = new File(PathUtil.getBaicizhanAppRoot(), this.f19801a);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
            g();
        }
    }

    public final void b(@m80.k String filePath) {
        kotlin.jvm.internal.g0.p(filePath, "filePath");
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
            g();
        }
    }

    @m80.k
    public final State<List<p>> c() {
        return this.f19803c;
    }

    @m80.k
    public final State<Long> d() {
        return this.f19807g;
    }

    @m80.k
    public final State<Boolean> f() {
        return this.f19805e;
    }

    public final void g() {
        Collection J;
        this.f19804d.setValue(Boolean.TRUE);
        File file = new File(PathUtil.getBaicizhanAppRoot(), this.f19801a);
        long j11 = 0;
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                J = new ArrayList(listFiles.length);
                for (File file2 : listFiles) {
                    String name = file2.getName();
                    kotlin.jvm.internal.g0.o(name, "getName(...)");
                    long length = file2.length();
                    long lastModified = file2.lastModified();
                    String absolutePath = file2.getAbsolutePath();
                    kotlin.jvm.internal.g0.o(absolutePath, "getAbsolutePath(...)");
                    J.add(new p(name, length, lastModified, absolutePath));
                }
            } else {
                J = a00.h0.J();
            }
            Collection collection = J;
            this.f19802b.setValue(a00.r0.z5(collection, new a()));
            MutableState<Long> mutableState = this.f19806f;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                j11 += ((p) it.next()).j();
            }
            mutableState.setValue(Long.valueOf(j11));
        } else {
            this.f19802b.setValue(a00.h0.J());
            this.f19806f.setValue(0L);
        }
        this.f19804d.setValue(Boolean.FALSE);
    }
}
