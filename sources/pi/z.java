package pi;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.resource_api.WordBugType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public abstract class z extends w {

    /* renamed from: d, reason: collision with root package name */
    public static final int f80650d = 0;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final WordBugType f80651c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(@m80.k WordBugType bugType, int i11) {
        super(i11);
        kotlin.jvm.internal.g0.p(bugType, "bugType");
        this.f80651c = bugType;
    }

    @m80.k
    public final WordBugType b() {
        return this.f80651c;
    }
}
