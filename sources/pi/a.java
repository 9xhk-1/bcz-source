package pi;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.resource_api.WordBugType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public class a extends z {

    /* renamed from: g, reason: collision with root package name */
    public static final int f80519g = 0;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f80520e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f80521f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@m80.k String title, boolean z11, @m80.k WordBugType bugType, int i11) {
        super(bugType, i11);
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(bugType, "bugType");
        this.f80520e = title;
        this.f80521f = z11;
    }

    public final boolean c() {
        return this.f80521f;
    }

    @m80.k
    public final String d() {
        return this.f80520e;
    }

    public /* synthetic */ a(String str, boolean z11, WordBugType wordBugType, int i11, int i12, kotlin.jvm.internal.v vVar) {
        this(str, (i12 & 2) != 0 ? true : z11, wordBugType, (i12 & 8) != 0 ? 0 : i11);
    }
}
