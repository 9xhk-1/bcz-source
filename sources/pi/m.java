package pi;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.resource_api.WordBugType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class m extends a {

    /* renamed from: j, reason: collision with root package name */
    public static final int f80586j = 8;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final qi.e f80587h;

    /* renamed from: i, reason: collision with root package name */
    public final int f80588i;

    public /* synthetic */ m(String str, qi.e eVar, boolean z11, int i11, int i12, int i13, kotlin.jvm.internal.v vVar) {
        this(str, eVar, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) != 0 ? 0 : i12);
    }

    @m80.k
    public final qi.e e() {
        return this.f80587h;
    }

    public final int f() {
        return this.f80588i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@m80.k String title, @m80.k qi.e info, boolean z11, int i11, int i12) {
        super(title, z11, i12 == 0 ? WordBugType.SENTENCE : WordBugType.EN_MEAN, i11);
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(info, "info");
        this.f80587h = info;
        this.f80588i = i12;
    }
}
