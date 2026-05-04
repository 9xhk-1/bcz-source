package uh;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTopic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Topic.kt\ncom/baicizhan/main/selftest/Topic\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,20:1\n85#2:21\n113#2,2:22\n*S KotlinDebug\n*F\n+ 1 Topic.kt\ncom/baicizhan/main/selftest/Topic\n*L\n19#1:21\n19#1:22,2\n*E\n"})
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    public static final int f92217f = 8;

    /* renamed from: a, reason: collision with root package name */
    public final int f92218a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f92219b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f92220c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f92221d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final MutableState f92222e;

    public f(int i11, @l TopicRecord topicRecord, boolean z11, boolean z12, boolean z13) {
        this.f92218a = i11;
        this.f92219b = z11;
        this.f92220c = z12;
        this.f92221d = z13;
        this.f92222e = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(topicRecord, null, 2, null);
    }

    public final int a() {
        return this.f92218a;
    }

    public final boolean b() {
        return this.f92220c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final TopicRecord c() {
        return (TopicRecord) this.f92222e.getValue();
    }

    public final boolean d() {
        return this.f92219b;
    }

    public final boolean e() {
        return this.f92221d;
    }

    public final void f(boolean z11) {
        this.f92220c = z11;
    }

    public final void g(@l TopicRecord topicRecord) {
        this.f92222e.setValue(topicRecord);
    }

    public final void h(boolean z11) {
        this.f92219b = z11;
    }

    public final void i(boolean z11) {
        this.f92221d = z11;
    }

    public /* synthetic */ f(int i11, TopicRecord topicRecord, boolean z11, boolean z12, boolean z13, int i12, v vVar) {
        this(i11, (i12 & 2) != 0 ? null : topicRecord, (i12 & 4) != 0 ? false : z11, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? false : z13);
    }
}
