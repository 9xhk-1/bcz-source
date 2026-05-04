package pi;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.resource_api.WordBugType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class d extends z {

    /* renamed from: f, reason: collision with root package name */
    public static final int f80541f = 8;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final qi.b f80542e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@m80.k qi.b info) {
        super(WordBugType.BASIC, Integer.MIN_VALUE);
        kotlin.jvm.internal.g0.p(info, "info");
        this.f80542e = info;
    }

    @m80.k
    public final qi.b c() {
        return this.f80542e;
    }
}
