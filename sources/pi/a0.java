package pi;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.resource_api.WordBugType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class a0 extends a {

    /* renamed from: i, reason: collision with root package name */
    public static final int f80522i = 8;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final qi.c f80523h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(@m80.k String title, @m80.k qi.c info, boolean z11, int i11) {
        super(title, z11, WordBugType.SENTENCE, i11);
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(info, "info");
        this.f80523h = info;
    }

    @m80.k
    public final qi.c e() {
        return this.f80523h;
    }

    public /* synthetic */ a0(String str, qi.c cVar, boolean z11, int i11, int i12, kotlin.jvm.internal.v vVar) {
        this(str, cVar, (i12 & 4) != 0 ? true : z11, (i12 & 8) != 0 ? 0 : i11);
    }
}
